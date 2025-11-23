package org.example;

/**
 * Concrete strategy for saving files in HTML format.
 * This class implements the Extensao interface to provide HTML-specific
 * file saving functionality.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public class HTML implements Extensao {
    
    /**
     * Saves a file in HTML format.
     * 
     * @param nome the name of the file to save
     * @return a confirmation message indicating the HTML file was saved
     */
    @Override
    public String salvar(String nome) {
        return "Extensão *.HTML salva!";
    }
}