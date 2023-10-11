
import org.junit.jupiter.api.Test;
import org.main.Pessoa;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void validarLancamentos() {

        int[] primeiroLancamento = {10, 20, 30, 40};
        int[] segundoLancamento = {10, 20, 30, 40};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarObjetoNulo() {
        Pessoa p = null;

        assertNull(p);

        p = new Pessoa("Luciano", LocalDateTime.now());

        assertNotNull(p);
    }
}
