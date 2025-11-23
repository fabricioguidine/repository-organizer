package org.example;

/**
 * Concrete implementation of Relatorio for outsourced employees.
 * This class provides report information specific to outsourced employees.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public class RelatorioFuncionarioTerceirizado implements Relatorio {
    
    /**
     * Generates and returns the report information for outsourced employees.
     * 
     * @return a string containing the report information for outsourced employees
     */
    @Override
    public String emitir() {
        return "Relatório do Funcionário: Terceirizado.";
    }
}
