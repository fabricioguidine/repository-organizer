package org.example;

/**
 * Employee class that uses the Abstract Factory pattern to create related objects.
 * This class demonstrates how the Abstract Factory pattern allows creating families
 * of related objects (Holerite and Relatorio) without knowing their concrete classes.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public class Funcionario {
    
    private final Holerite holerite;
    private final Relatorio relatorio;
    
    /**
     * Constructs a new Funcionario using the provided factory to create
     * related objects (payroll and report).
     * 
     * @param fabrica the abstract factory to use for creating objects
     * @throws IllegalArgumentException if fabrica is null
     */
    public Funcionario(FabricaAbstrata fabrica) {
        if (fabrica == null) {
            throw new IllegalArgumentException("Factory cannot be null");
        }
        this.holerite = fabrica.createHolerite();
        this.relatorio = fabrica.createRelatorio();
    }
    
    /**
     * Generates and returns the payroll information.
     * 
     * @return a string containing the payroll information
     */
    public String emitirHolerite() {
        return this.holerite.emitir();
    }
    
    /**
     * Generates and returns the report information.
     * 
     * @return a string containing the report information
     */
    public String emitirRelatorio() {
        return this.relatorio.emitir();
    }
}