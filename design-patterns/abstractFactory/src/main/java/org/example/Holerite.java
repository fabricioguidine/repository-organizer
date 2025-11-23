package org.example;

/**
 * Interface representing a payroll document (Holerite).
 * Different implementations provide payroll information for different employee types.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public interface Holerite {
    
    /**
     * Generates and returns the payroll information as a string.
     * 
     * @return a string representation of the payroll information
     */
    String emitir();
}