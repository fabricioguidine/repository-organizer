package org.example;

/**
 * Concrete strategy for saving files in TXT format.
 * This class implements the Extensao interface to provide TXT-specific
 * file saving functionality.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public class TXT implements Extensao {
    
    /**
     * Saves a file in TXT format.
     * 
     * @param nome the name of the file to save
     * @return a confirmation message indicating the TXT file was saved
     */
    @Override
    public String salvar(String nome) {
        return "Extensão *.TXT salva!";
    }
}