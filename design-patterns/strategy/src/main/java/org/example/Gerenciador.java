package org.example;

/**
 * Context class that uses a Strategy to perform file saving operations.
 * This class delegates the actual saving logic to the strategy object,
 * allowing different algorithms to be used interchangeably.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public class Gerenciador {
    
    /**
     * Saves a file using the provided strategy.
     * 
     * @param extensao the strategy to use for saving the file
     * @param nome the name of the file to save
     * @return a confirmation message from the strategy
     * @throws IllegalArgumentException if extensao is null or nome is null/empty
     */
    public static String salvar(Extensao extensao, String nome) {
        if (extensao == null) {
            throw new IllegalArgumentException("Extension strategy cannot be null");
        }
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("File name cannot be null or empty");
        }
        return extensao.salvar(nome);
    }
}
