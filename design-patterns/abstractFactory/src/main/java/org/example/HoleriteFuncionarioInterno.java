package org.example;

/**
 * Concrete implementation of Holerite for internal employees.
 * This class provides payroll information specific to internal employees.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public class HoleriteFuncionarioInterno implements Holerite {
    
    /**
     * Generates and returns the payroll information for internal employees.
     * 
     * @return a string containing the payroll information for internal employees
     */
    @Override
    public String emitir() {
        return "Holerite do Funcionário: Interno.";
    }
}
