import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CursoTest {

    private final Curso obj = new Curso();

    @Test
    void testCalcularXP(){
        obj.setCargaHoraria(80);
        Assertions.assertEquals( 800, obj.calcularXp());
    }

    @Test
    void testCargaHoraria(){
        int example = 50;
        obj.setCargaHoraria(example);
        Assertions.assertEquals( example, obj.getCargaHoraria());
    }

    @Test
    void testToString(){
        obj.setTitulo("Titulo Curso");
        obj.setDescricao("Descrição Curso");
        obj.setCargaHoraria(40);

        Assertions.assertEquals( "Curso{" +
                "titulo='" + "Titulo Curso" + '\'' +
                ", descricao='" + "Descrição Curso" + '\'' +
                ", cargaHoraria=" + "40" +
                '}', obj.toString());
    }
}
