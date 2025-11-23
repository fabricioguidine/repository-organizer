import junit.framework.TestCase;
import org.example.ConexaoBancoDados;
import org.junit.Test;

public class ConexaoBancoDadosTest extends TestCase{
    @Test
    public void testDeveRetornarUrl(){
        ConexaoBancoDados.getInstance().setUrl("jdbc:localhost:8888/bd");
        assertEquals("jdbc:localhost:8888/bd", ConexaoBancoDados.getInstance().getUrl());
    }
    @Test
    public void testDeveRetornarUser() {
        ConexaoBancoDados.getInstance().setUser("fabricio");
        assertEquals("fabricio", ConexaoBancoDados.getInstance().getUser());
    }

    @Test
    public void testDeveRetornarSenha() {
        ConexaoBancoDados.getInstance().setSenha("123");
        assertEquals("123", ConexaoBancoDados.getInstance().getSenha());
    }
}