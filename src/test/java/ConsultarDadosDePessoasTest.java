import org.junit.jupiter.api.*;
import org.main.BancoDeDados;
import org.main.Pessoa;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ConsultarDadosDePessoasTest {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("Gabriel", LocalDateTime.of(2000, 11, 20, 19, 0)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("Gabriel", LocalDateTime.of(2000, 11, 20, 19, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        assertNull(null);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
}
