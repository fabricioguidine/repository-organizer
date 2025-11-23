package org.example;
public class ConexaoBancoDados {
    private String url = "jdbc:localhost:8888/bd";
    private String user = "fabricio";
    private String senha = "123";
    private ConexaoBancoDados() {};
    private static ConexaoBancoDados instance = new ConexaoBancoDados();
    public static ConexaoBancoDados getInstance() {
        return instance;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public static void setInstance(ConexaoBancoDados instance) {
        ConexaoBancoDados.instance = instance;
    }
}

