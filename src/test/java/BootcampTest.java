import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Dev;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class BootcampTest {

    private final Bootcamp bc = new Bootcamp();
    @Test
    void testNome(){
        String example = "Teste";
        bc.setNome(example);
        Assertions.assertEquals( example, bc.getNome());
    }

    @Test
    void testDescricao(){
        String example = "Teste";
        bc.setDescricao(example);
        Assertions.assertEquals( example, bc.getDescricao());
    }

    @Test
    void testDatas(){
        Assertions.assertEquals( bc.getDataFinal(), bc.getDataInicial().plusDays(45));
    }

    @Test
    void testDevsInscritos(){
        Set<Dev> devs = new HashSet<>();
        bc.setDevsInscritos(devs);
        Assertions.assertEquals(devs, bc.getDevsInscritos());
    }

    @Test
    void testConteudos(){
        Set<Conteudo> conteudos = new HashSet<>();
        bc.setConteudos(conteudos);
        Assertions.assertEquals(conteudos, bc.getConteudos());
    }

    @Test
    void testEquals(){
        //Objetos recém-criados se equivalem.
        Assertions.assertTrue(new Bootcamp().equals(new Bootcamp()));
        //Objeto se equivale.
        Assertions.assertTrue(bc.equals(bc));
    }

    @Test
    void testHashCode(){
        //Objetos recém-criados têm códigos hash equivalentes.
        Assertions.assertEquals(new Bootcamp().hashCode(),new Bootcamp().hashCode());
        //Código hash do mesmo objeto não muda a cada chamada.
        Assertions.assertEquals(bc.hashCode(), bc.hashCode());
    }
}
