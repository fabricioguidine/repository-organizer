package org.example;

/**
 * Concrete implementation of Holerite for outsourced employees.
 * This class provides payroll information specific to outsourced employees.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public class HoleriteFuncionarioTerceirizado implements Holerite {
    
    /**
     * Generates and returns the payroll information for outsourced employees.
     * 
     * @return a string containing the payroll information for outsourced employees
     */
    @Override
    public String emitir() {
        return "Holerite do Funcionário: Terceirizado.";
    }
}
