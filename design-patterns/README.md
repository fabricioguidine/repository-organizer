# Design Patterns

This repository contains implementations of various design patterns in Java.

## Patterns Included

- **Abstract Factory** - Provides an interface for creating families of related objects
- **Adapter** - Allows incompatible interfaces to work together
- **Bridge** - Separates abstraction from implementation
- **Builder** - Constructs complex objects step by step
- **Chain of Responsibility** - Passes requests along a chain of handlers
- **Command** - Encapsulates requests as objects
- **Composite** - Composes objects into tree structures
- **Decorator** - Adds behavior to objects dynamically
- **Facade** - Provides a simplified interface to a complex subsystem
- **Factory Method** - Creates objects without specifying the exact class
- **Flyweight** - Shares state to support large numbers of fine-grained objects
- **Interpreter** - Defines a representation for grammar and an interpreter
- **Iterator** - Provides a way to access elements of a collection
- **Mediator** - Defines how objects interact with each other
- **Memento** - Captures and restores an object's internal state
- **Observer** - Notifies multiple objects about state changes
- **Prototype** - Creates objects by cloning existing instances
- **Proxy** - Provides a placeholder for another object
- **Singleton** - Ensures a class has only one instance
- **State** - Allows an object to alter its behavior when its internal state changes
- **Strategy** - Defines a family of algorithms and makes them interchangeable
- **Template Method** - Defines the skeleton of an algorithm
- **Visitor** - Separates algorithms from the objects they operate on

## Structure

Each pattern is organized in its own directory with:
- `pom.xml` - Maven project configuration
- `src/main/java/` - Source code
- `src/test/java/` - Test code

## Building

Each pattern can be built independently using Maven:

```bash
cd <pattern-name>
mvn clean install
```

## License

MIT License

