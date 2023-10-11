import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.main.Pessoa;

import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void deveRetornarSeEhMaiorIdade() {
        Pessoa joao = new Pessoa("Joãozinho", LocalDateTime.of(2020,1,1,15,0));
        Assertions.assertFalse(joao.ehMaiorDeIdade());

        Pessoa gabriel = new Pessoa("Gabriel", LocalDateTime.of(2000,11,20,19,30));
        Assertions.assertTrue(gabriel.ehMaiorDeIdade());
    }

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa gabriel = new Pessoa("Gabriel", LocalDateTime.of(2000,11,20,19,30));
        Assertions.assertEquals(22, gabriel.getIdade());
    }
}
