package org.example;

/**
 * Concrete implementation of Relatorio for internal employees.
 * This class provides report information specific to internal employees.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public class RelatorioFuncionarioInterno implements Relatorio {
    
    /**
     * Generates and returns the report information for internal employees.
     * 
     * @return a string containing the report information for internal employees
     */
    @Override
    public String emitir() {
        return "Relatório do Funcionário: Interno.";
    }
}
