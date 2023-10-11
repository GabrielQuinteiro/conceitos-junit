import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OrdenandoTest {

    @Order(3)
    @Test
    void valdidaFluxoA() {
        Assertions.assertTrue(true);
    }

    @Order(4)
    @Test
    void valdidaFluxoB() {
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void valdidaFluxoC() {
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void valdidaFluxoD() {
        Assertions.assertTrue(true);
    }
}
