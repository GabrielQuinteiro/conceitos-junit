import jdk.jfr.Enabled;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

public class CondicionaisTest {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarSomenteWindows() {
        assertEquals(10, 5  + 5);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "Username", matches = "quint")
    void validarAlgoSomenteNoUsuarioQuint() {
        assertEquals(10, 5 + 5);
    }
}
