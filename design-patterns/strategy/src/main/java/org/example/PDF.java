package org.example;

/**
 * Concrete strategy for saving files in PDF format.
 * This class implements the Extensao interface to provide PDF-specific
 * file saving functionality.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public class PDF implements Extensao {
    
    /**
     * Saves a file in PDF format.
     * 
     * @param nome the name of the file to save
     * @return a confirmation message indicating the PDF file was saved
     */
    @Override
    public String salvar(String nome) {
        return "Extensão *.PDF salva!";
    }
}