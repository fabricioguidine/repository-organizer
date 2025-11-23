package org.example;

/**
 * Concrete factory implementation for creating objects related to internal employees.
 * This factory creates a family of products (Holerite and Relatorio) specifically
 * designed for internal employees.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public class FabricaAbstrataFuncionarioInterno implements FabricaAbstrata {
    
    /**
     * Creates a payroll document for internal employees.
     * 
     * @return a new HoleriteFuncionarioInterno instance
     */
    @Override
    public Holerite createHolerite() {
        return new HoleriteFuncionarioInterno();
    }
    
    /**
     * Creates a report document for internal employees.
     * 
     * @return a new RelatorioFuncionarioInterno instance
     */
    @Override
    public Relatorio createRelatorio() {
        return new RelatorioFuncionarioInterno();
    }
}
