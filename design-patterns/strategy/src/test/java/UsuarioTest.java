import org.example.Gerenciador;
import org.example.HTML;
import org.example.PDF;
import org.example.TXT;
import org.example.Usuario;
import org.example.XML;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Strategy pattern implementation.
 * Tests verify that different file saving strategies work correctly
 * and can be used interchangeably.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
@DisplayName("Strategy Pattern Tests")
class UsuarioTest {
    
    private Usuario usuario;
    private String nomeExtensao;
    
    @BeforeEach
    void setUp() {
        usuario = new Usuario();
        nomeExtensao = "extensao";
    }
    
    @Test
    @DisplayName("Should save file in HTML format")
    void deveSalvarHTML() {
        // Act
        String resultado = usuario.salvarHTML(nomeExtensao);
        
        // Assert
        assertEquals("Extensão *.HTML salva!", resultado);
    }
    
    @Test
    @DisplayName("Should save file in PDF format")
    void deveSalvarPDF() {
        // Act
        String resultado = usuario.salvarPDF(nomeExtensao);
        
        // Assert
        assertEquals("Extensão *.PDF salva!", resultado);
    }
    
    @Test
    @DisplayName("Should save file in TXT format")
    void deveSalvarTXT() {
        // Act
        String resultado = usuario.salvarTXT(nomeExtensao);
        
        // Assert
        assertEquals("Extensão *.TXT salva!", resultado);
    }
    
    @Test
    @DisplayName("Should save file in XML format")
    void deveSalvarXML() {
        // Act
        String resultado = usuario.salvarXML(nomeExtensao);
        
        // Assert
        assertEquals("Extensão *.XML salva!", resultado);
    }
    
    @Test
    @DisplayName("Should use different strategies interchangeably")
    void deveUsarDiferentesEstrategiasIntercambiavelmente() {
        // Act
        String htmlResult = Gerenciador.salvar(new HTML(), nomeExtensao);
        String pdfResult = Gerenciador.salvar(new PDF(), nomeExtensao);
        String txtResult = Gerenciador.salvar(new TXT(), nomeExtensao);
        String xmlResult = Gerenciador.salvar(new XML(), nomeExtensao);
        
        // Assert
        assertTrue(htmlResult.contains("HTML"));
        assertTrue(pdfResult.contains("PDF"));
        assertTrue(txtResult.contains("TXT"));
        assertTrue(xmlResult.contains("XML"));
    }
    
    @Test
    @DisplayName("Should throw exception when strategy is null")
    void deveLancarExcecaoQuandoEstrategiaENull() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            Gerenciador.salvar(null, nomeExtensao);
        });
    }
    
    @Test
    @DisplayName("Should throw exception when file name is null")
    void deveLancarExcecaoQuandoNomeArquivoENull() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            Gerenciador.salvar(new PDF(), null);
        });
    }
    
    @Test
    @DisplayName("Should throw exception when file name is empty")
    void deveLancarExcecaoQuandoNomeArquivoEVazio() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            Gerenciador.salvar(new PDF(), "   ");
        });
    }
}