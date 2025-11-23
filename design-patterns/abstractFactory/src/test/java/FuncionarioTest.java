import org.example.FabricaAbstrata;
import org.example.FabricaAbstrataFuncionarioInterno;
import org.example.FabricaAbstrataFuncionarioTerceirizado;
import org.example.Funcionario;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Abstract Factory pattern implementation.
 * Tests verify that the factory correctly creates families of related objects
 * for different employee types (internal and outsourced).
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
@DisplayName("Abstract Factory Pattern Tests")
class FuncionarioTest {
    
    @Test
    @DisplayName("Should create payroll for internal employee")
    void deveEmitirHoleriteFuncionarioInterno() {
        // Arrange
        FabricaAbstrata fabrica = new FabricaAbstrataFuncionarioInterno();
        Funcionario funcionario = new Funcionario(fabrica);
        
        // Act
        String resultado = funcionario.emitirHolerite();
        
        // Assert
        assertEquals("Holerite do Funcionário: Interno.", resultado);
    }
    
    @Test
    @DisplayName("Should create payroll for outsourced employee")
    void deveEmitirHoleriteFuncionarioTerceirizado() {
        // Arrange
        FabricaAbstrata fabrica = new FabricaAbstrataFuncionarioTerceirizado();
        Funcionario funcionario = new Funcionario(fabrica);
        
        // Act
        String resultado = funcionario.emitirHolerite();
        
        // Assert
        assertEquals("Holerite do Funcionário: Terceirizado.", resultado);
    }
    
    @Test
    @DisplayName("Should create report for internal employee")
    void deveEmitirRelatorioFuncionarioInterno() {
        // Arrange
        FabricaAbstrata fabrica = new FabricaAbstrataFuncionarioInterno();
        Funcionario funcionario = new Funcionario(fabrica);
        
        // Act
        String resultado = funcionario.emitirRelatorio();
        
        // Assert
        assertEquals("Relatório do Funcionário: Interno.", resultado);
    }
    
    @Test
    @DisplayName("Should create report for outsourced employee")
    void deveEmitirRelatorioFuncionarioTerceirizado() {
        // Arrange
        FabricaAbstrata fabrica = new FabricaAbstrataFuncionarioTerceirizado();
        Funcionario funcionario = new Funcionario(fabrica);
        
        // Act
        String resultado = funcionario.emitirRelatorio();
        
        // Assert
        assertEquals("Relatório do Funcionário: Terceirizado.", resultado);
    }
    
    @Test
    @DisplayName("Should throw exception when factory is null")
    void deveLancarExcecaoQuandoFabricaENull() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Funcionario(null);
        });
    }
    
    @Test
    @DisplayName("Should ensure factory creates compatible product families")
    void deveGarantirQueFabricaCriaFamiliasCompativeis() {
        // Arrange
        FabricaAbstrata fabricaInterno = new FabricaAbstrataFuncionarioInterno();
        FabricaAbstrata fabricaTerceirizado = new FabricaAbstrataFuncionarioTerceirizado();
        
        Funcionario funcionarioInterno = new Funcionario(fabricaInterno);
        Funcionario funcionarioTerceirizado = new Funcionario(fabricaTerceirizado);
        
        // Act & Assert - Verify that each factory creates a consistent family
        assertTrue(funcionarioInterno.emitirHolerite().contains("Interno"));
        assertTrue(funcionarioInterno.emitirRelatorio().contains("Interno"));
        
        assertTrue(funcionarioTerceirizado.emitirHolerite().contains("Terceirizado"));
        assertTrue(funcionarioTerceirizado.emitirRelatorio().contains("Terceirizado"));
    }
}
