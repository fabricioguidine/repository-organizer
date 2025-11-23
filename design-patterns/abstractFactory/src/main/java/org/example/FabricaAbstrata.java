package org.example;

/**
 * Abstract Factory interface for creating families of related objects.
 * This pattern provides an interface for creating families of related or dependent
 * objects without specifying their concrete classes.
 * 
 * @author Design Patterns Implementation
 * @version 1.0
 */
public interface FabricaAbstrata {
    
    /**
     * Creates a payroll (Holerite) object.
     * 
     * @return a new Holerite instance
     */
    Holerite createHolerite();
    
    /**
     * Creates a report (Relatorio) object.
     * 
     * @return a new Relatorio instance
     */
    Relatorio createRelatorio();
}
