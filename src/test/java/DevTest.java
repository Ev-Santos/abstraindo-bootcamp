import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class DevTest {

    private final Dev obj = new Dev();

    @Test
    void testInscreverBootcamp(){

        Bootcamp bc = new Bootcamp();
        Set<Conteudo> ctd = new HashSet<Conteudo>();
        Curso cs = new Curso();
        Mentoria mr = new Mentoria();
        ctd.add(cs);
        ctd.add(mr);
        bc.setConteudos(ctd);
        obj.inscreverBootcamp(bc);

        Assertions.assertTrue(obj.getConteudosInscritos().contains(cs));
        Assertions.assertTrue(obj.getConteudosInscritos().contains(mr));
        Assertions.assertTrue(bc.getDevsInscritos().contains(obj));

    }

    @Test
    void testProgredirDevVazio(){
        Dev d = new Dev();
        d.progredir();

        Assertions.assertEquals(0, d.getConteudosInscritos().size());
        Assertions.assertEquals(0, d.getConteudosConcluidos().size());
    }

    @Test
    void testProgredir(){

        Bootcamp bc = new Bootcamp();
        Set<Conteudo> ctd = new HashSet<Conteudo>();
        Curso cs = new Curso();
        Mentoria mr = new Mentoria();
        ctd.add(cs);
        ctd.add(mr);
        bc.setConteudos(ctd);
        obj.inscreverBootcamp(bc);

        int ctInscritos = obj.getConteudosInscritos().size();
        int ctConcluidos = obj.getConteudosConcluidos().size();

        obj.progredir();

        Assertions.assertEquals(ctInscritos - 1, obj.getConteudosInscritos().size());
        Assertions.assertEquals(ctConcluidos + 1, obj.getConteudosConcluidos().size());

    }

    @Test
    void testCalcularTotalXpDevVazio(){
        Dev dev= new Dev();
        Assertions.assertEquals( 0.0, dev.calcularTotalXp() );
    }


    @Test
    void testCalcularTotalXp(){
        Dev dev= new Dev();

        Bootcamp bc = new Bootcamp();
        Set<Conteudo> ctd = new HashSet<Conteudo>();
        Curso cs = new Curso();
        cs.setCargaHoraria(8);
        Mentoria mr = new Mentoria();
        ctd.add(cs);
        ctd.add(mr);
        bc.setConteudos(ctd);
        dev.inscreverBootcamp(bc);

        dev.progredir();
        dev.progredir();

        Assertions.assertEquals( 110.0, dev.calcularTotalXp() );
    }

    @Test
    void testNome(){
        String example = "Teste";
        obj.setNome(example);
        Assertions.assertEquals( example, obj.getNome());
    }

    @Test
    void testConteudosInscritos(){
        Set<Conteudo> example = new HashSet<>();
        obj.setConteudosInscritos(example);
        Assertions.assertEquals( example, obj.getConteudosInscritos());
    }

    @Test
    void testConteudosConcluidos(){
        Set<Conteudo> example = new HashSet<>();
        obj.setConteudosConcluidos(example);
        Assertions.assertEquals( example, obj.getConteudosConcluidos());
    }

    @Test
    void testEquals(){
        //Objetos recém-criados se equivalem.
        Assertions.assertTrue(new Dev().equals(new Dev()));
        //Objeto se equivale.
        Assertions.assertTrue(obj.equals(obj));
    }

    @Test
    void testHashCode(){
        //Objetos recém-criados têm códigos hash equivalentes.
        Assertions.assertEquals(new Dev().hashCode(),new Dev().hashCode());
        //Código hash do mesmo objeto não muda a cada chamada.
        Assertions.assertEquals(obj.hashCode(), obj.hashCode());
    }
}
