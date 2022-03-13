import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class MentoriaTest {

    private final Mentoria obj = new Mentoria();

    @Test
    void testCalcularXP(){
        Assertions.assertEquals( 30, obj.calcularXp());
    }

    @Test
    void testData(){
        LocalDate example = LocalDate.now();
        obj.setData(example);
        Assertions.assertEquals( example, obj.getData());
    }

    @Test
    void testToString(){
        obj.setTitulo("Titulo Curso");
        obj.setDescricao("Descrição Curso");
        LocalDate example = LocalDate.now();
        obj.setData(example);

        Assertions.assertEquals( "Mentoria{" +
                "titulo='" + "Titulo Curso" + '\'' +
                ", descricao='" + "Descrição Curso" + '\'' +
                ", data=" + obj.getData() +
                '}', obj.toString());
    }
}
