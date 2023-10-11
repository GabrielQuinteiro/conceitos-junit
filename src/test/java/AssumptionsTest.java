import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssumptionsTest {

    @Test
    void validarAlgoSomenteNoUsuarioQuint() {
        Assumptions.assumeTrue("quint".equals(System.getenv("Username")));
        assertEquals(10, 5 + 5);
    }
}
