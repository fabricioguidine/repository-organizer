package org.example;

/**
 * Interface representing a report document (Relatorio).
 * Different implementations provide report information for different employee types.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public interface Relatorio {
    
    /**
     * Generates and returns the report information as a string.
     * 
     * @return a string representation of the report information
     */
    String emitir();
}
