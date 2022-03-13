import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Dev;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class ConteudoTest {

    private final Conteudo obj = new Conteudo(){
        @Override
        public double calcularXp() {
            return 0;
        }
    };
    @Test
    void testTitulo(){
        String example = "Teste";
        obj.setTitulo(example);
        Assertions.assertEquals( example, obj.getTitulo());
    }

    @Test
    void testDescricao(){
        String example = "Teste";
        obj.setDescricao(example);
        Assertions.assertEquals( example, obj.getDescricao());
    }
}
