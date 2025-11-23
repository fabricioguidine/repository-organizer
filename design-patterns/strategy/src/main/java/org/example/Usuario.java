package org.example;

/**
 * User class that demonstrates the Strategy pattern.
 * This class uses different file saving strategies (HTML, PDF, TXT, XML)
 * without being tightly coupled to specific implementations.
 * 
 * <p>The Strategy pattern defines a family of algorithms, encapsulates each one,
 * and makes them interchangeable. This allows the algorithm to vary independently
 * from clients that use it.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public class Usuario {
    
    /**
     * Saves a file in HTML format.
     * 
     * @param nome the name of the file to save
     * @return a confirmation message
     * @throws IllegalArgumentException if nome is null or empty
     */
    public String salvarHTML(String nome) {
        return Gerenciador.salvar(new HTML(), nome);
    }
    
    /**
     * Saves a file in PDF format.
     * 
     * @param nome the name of the file to save
     * @return a confirmation message
     * @throws IllegalArgumentException if nome is null or empty
     */
    public String salvarPDF(String nome) {
        return Gerenciador.salvar(new PDF(), nome);
    }
    
    /**
     * Saves a file in TXT format.
     * 
     * @param nome the name of the file to save
     * @return a confirmation message
     * @throws IllegalArgumentException if nome is null or empty
     */
    public String salvarTXT(String nome) {
        return Gerenciador.salvar(new TXT(), nome);
    }
    
    /**
     * Saves a file in XML format.
     * 
     * @param nome the name of the file to save
     * @return a confirmation message
     * @throws IllegalArgumentException if nome is null or empty
     */
    public String salvarXML(String nome) {
        return Gerenciador.salvar(new XML(), nome);
    }
}
