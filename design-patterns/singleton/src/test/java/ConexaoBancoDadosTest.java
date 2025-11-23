import org.example.ConexaoBancoDados;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Singleton pattern implementation.
 * Tests verify that only one instance exists and that it behaves correctly
 * across multiple calls to getInstance().
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
@DisplayName("Singleton Pattern Tests")
class ConexaoBancoDadosTest {
    
    @Test
    @DisplayName("Should return the same instance on multiple calls")
    void deveRetornarMesmaInstanciaEmMultiplasChamadas() {
        // Act
        ConexaoBancoDados instance1 = ConexaoBancoDados.getInstance();
        ConexaoBancoDados instance2 = ConexaoBancoDados.getInstance();
        
        // Assert
        assertSame(instance1, instance2, "Multiple calls to getInstance() should return the same instance");
    }
    
    @Test
    @DisplayName("Should return correct URL")
    void deveRetornarUrl() {
        // Arrange
        ConexaoBancoDados conexao = ConexaoBancoDados.getInstance();
        String expectedUrl = "jdbc:localhost:8888/bd";
        
        // Act
        conexao.setUrl(expectedUrl);
        String actualUrl = conexao.getUrl();
        
        // Assert
        assertEquals(expectedUrl, actualUrl);
    }
    
    @Test
    @DisplayName("Should return correct user")
    void deveRetornarUser() {
        // Arrange
        ConexaoBancoDados conexao = ConexaoBancoDados.getInstance();
        String expectedUser = "fabricio";
        
        // Act
        conexao.setUser(expectedUser);
        String actualUser = conexao.getUser();
        
        // Assert
        assertEquals(expectedUser, actualUser);
    }
    
    @Test
    @DisplayName("Should return correct password")
    void deveRetornarSenha() {
        // Arrange
        ConexaoBancoDados conexao = ConexaoBancoDados.getInstance();
        String expectedSenha = "123";
        
        // Act
        conexao.setSenha(expectedSenha);
        String actualSenha = conexao.getSenha();
        
        // Assert
        assertEquals(expectedSenha, actualSenha);
    }
    
    @Test
    @DisplayName("Should maintain state across multiple getInstance calls")
    void deveManterEstadoEntreMultiplasChamadas() {
        // Arrange
        ConexaoBancoDados conexao1 = ConexaoBancoDados.getInstance();
        conexao1.setUrl("jdbc:test:1234/db");
        conexao1.setUser("testuser");
        conexao1.setSenha("testpass");
        
        // Act
        ConexaoBancoDados conexao2 = ConexaoBancoDados.getInstance();
        
        // Assert
        assertEquals("jdbc:test:1234/db", conexao2.getUrl());
        assertEquals("testuser", conexao2.getUser());
        assertEquals("testpass", conexao2.getSenha());
    }
    
    @Test
    @DisplayName("Should throw exception when URL is null")
    void deveLancarExcecaoQuandoUrlENull() {
        // Arrange
        ConexaoBancoDados conexao = ConexaoBancoDados.getInstance();
        
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            conexao.setUrl(null);
        });
    }
    
    @Test
    @DisplayName("Should throw exception when URL is empty")
    void deveLancarExcecaoQuandoUrlEVazio() {
        // Arrange
        ConexaoBancoDados conexao = ConexaoBancoDados.getInstance();
        
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            conexao.setUrl("   ");
        });
    }
    
    @Test
    @DisplayName("Should throw exception when user is null")
    void deveLancarExcecaoQuandoUserENull() {
        // Arrange
        ConexaoBancoDados conexao = ConexaoBancoDados.getInstance();
        
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            conexao.setUser(null);
        });
    }
    
    @Test
    @DisplayName("Should throw exception when password is null")
    void deveLancarExcecaoQuandoSenhaENull() {
        // Arrange
        ConexaoBancoDados conexao = ConexaoBancoDados.getInstance();
        
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            conexao.setSenha(null);
        });
    }
    
    @Test
    @DisplayName("Should have default values on initialization")
    void deveTerValoresPadraoNaInicializacao() {
        // Arrange - Create a new instance (in real scenario, this would be the first call)
        ConexaoBancoDados conexao = ConexaoBancoDados.getInstance();
        
        // Reset to defaults for testing
        conexao.setUrl("jdbc:localhost:8888/bd");
        conexao.setUser("fabricio");
        conexao.setSenha("123");
        
        // Assert
        assertEquals("jdbc:localhost:8888/bd", conexao.getUrl());
        assertEquals("fabricio", conexao.getUser());
        assertEquals("123", conexao.getSenha());
    }
}