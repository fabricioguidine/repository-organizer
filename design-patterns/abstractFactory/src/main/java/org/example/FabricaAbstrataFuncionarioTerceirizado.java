package org.example;

/**
 * Concrete factory implementation for creating objects related to outsourced employees.
 * This factory creates a family of products (Holerite and Relatorio) specifically
 * designed for outsourced employees.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public class FabricaAbstrataFuncionarioTerceirizado implements FabricaAbstrata {
    
    /**
     * Creates a payroll document for outsourced employees.
     * 
     * @return a new HoleriteFuncionarioTerceirizado instance
     */
    @Override
    public Holerite createHolerite() {
        return new HoleriteFuncionarioTerceirizado();
    }
    
    /**
     * Creates a report document for outsourced employees.
     * 
     * @return a new RelatorioFuncionarioTerceirizado instance
     */
    @Override
    public Relatorio createRelatorio() {
        return new RelatorioFuncionarioTerceirizado();
    }
}
