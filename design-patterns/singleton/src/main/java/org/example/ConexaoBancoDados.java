package org.example;

/**
 * Singleton pattern implementation for database connection.
 * Ensures that only one instance of the database connection exists throughout
 * the application lifecycle. This is useful for managing shared resources like
 * database connections, configuration objects, or logging services.
 * 
 * <p>This implementation uses eager initialization, where the instance is created
 * when the class is loaded. For thread-safe lazy initialization, consider using
 * double-checked locking or the Initialization-on-demand holder idiom.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public class ConexaoBancoDados {
    
    // Database connection parameters
    private String url;
    private String user;
    private String senha;
    
    // Singleton instance - eagerly initialized
    private static final ConexaoBancoDados instance = new ConexaoBancoDados();
    
    /**
     * Private constructor to prevent instantiation from outside the class.
     * Initializes default connection parameters.
     */
    private ConexaoBancoDados() {
        this.url = "jdbc:localhost:8888/bd";
        this.user = "fabricio";
        this.senha = "123";
    }
    
    /**
     * Returns the singleton instance of ConexaoBancoDados.
     * This method provides global access to the single instance.
     * 
     * @return the singleton instance of ConexaoBancoDados
     */
    public static ConexaoBancoDados getInstance() {
        return instance;
    }
    
    /**
     * Gets the database URL.
     * 
     * @return the database URL
     */
    public String getUrl() {
        return url;
    }
    
    /**
     * Sets the database URL.
     * 
     * @param url the database URL to set
     * @throws IllegalArgumentException if url is null or empty
     */
    public void setUrl(String url) {
        if (url == null || url.trim().isEmpty()) {
            throw new IllegalArgumentException("URL cannot be null or empty");
        }
        this.url = url;
    }
    
    /**
     * Gets the database user.
     * 
     * @return the database user
     */
    public String getUser() {
        return user;
    }
    
    /**
     * Sets the database user.
     * 
     * @param user the database user to set
     * @throws IllegalArgumentException if user is null or empty
     */
    public void setUser(String user) {
        if (user == null || user.trim().isEmpty()) {
            throw new IllegalArgumentException("User cannot be null or empty");
        }
        this.user = user;
    }
    
    /**
     * Gets the database password.
     * 
     * @return the database password
     */
    public String getSenha() {
        return senha;
    }
    
    /**
     * Sets the database password.
     * 
     * @param senha the database password to set
     * @throws IllegalArgumentException if senha is null
     */
    public void setSenha(String senha) {
        if (senha == null) {
            throw new IllegalArgumentException("Password cannot be null");
        }
        this.senha = senha;
    }
    
    /**
     * Returns a string representation of the connection information
     * (without exposing sensitive data like password).
     * 
     * @return a string representation of the connection
     */
    @Override
    public String toString() {
        return "ConexaoBancoDados{" +
                "url='" + url + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}

