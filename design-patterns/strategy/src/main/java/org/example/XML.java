package org.example;

/**
 * Concrete strategy for saving files in XML format.
 * This class implements the Extensao interface to provide XML-specific
 * file saving functionality.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public class XML implements Extensao {
    
    /**
     * Saves a file in XML format.
     * 
     * @param nome the name of the file to save
     * @return a confirmation message indicating the XML file was saved
     */
    @Override
    public String salvar(String nome) {
        return "Extensão *.XML salva!";
    }
}