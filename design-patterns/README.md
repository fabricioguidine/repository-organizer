# Design Patterns Implementation

This directory contains implementations of all 23 classic GoF (Gang of Four) design patterns in Java.

## 📚 Pattern Categories

### Creational Patterns (5)
These patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

- **[Abstract Factory](abstractFactory/)** - Provides an interface for creating families of related objects
- **[Builder](builder/)** - Constructs complex objects step by step
- **[Factory Method](factoryMethod/)** - Creates objects without specifying the exact class
- **[Prototype](prototype/)** - Creates objects by cloning existing instances
- **[Singleton](singleton/)** - Ensures a class has only one instance

### Structural Patterns (7)
These patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.

- **[Adapter](adapter/)** - Allows incompatible interfaces to work together
- **[Bridge](bridge/)** - Separates abstraction from implementation
- **[Composite](composite/)** - Composes objects into tree structures
- **[Decorator](decorator/)** - Adds behavior to objects dynamically
- **[Facade](facade/)** - Provides a simplified interface to a complex subsystem
- **[Flyweight](flyweight/)** - Shares state to support large numbers of fine-grained objects
- **[Proxy](proxy/)** - Provides a placeholder for another object

### Behavioral Patterns (11)
These patterns are concerned with algorithms and the assignment of responsibilities between objects.

- **[Chain of Responsibility](chainOfResponsability/)** - Passes requests along a chain of handlers
- **[Command](command/)** - Encapsulates requests as objects
- **[Interpreter](interpreter/)** - Defines a representation for grammar and an interpreter
- **[Iterator](iterator/)** - Provides a way to access elements of a collection
- **[Mediator](mediator/)** - Defines how objects interact with each other
- **[Memento](memento/)** - Captures and restores an object's internal state
- **[Observer](observer/)** - Notifies multiple objects about state changes
- **[State](state/)** - Allows an object to alter its behavior when its internal state changes
- **[Strategy](strategy/)** - Defines a family of algorithms and makes them interchangeable
- **[Template Method](templateMethod/)** - Defines the skeleton of an algorithm
- **[Visitor](visitor/)** - Separates algorithms from the objects they operate on

## 🏗️ Structure

Each pattern follows a standard Maven project structure:

```
<pattern-name>/
├── pom.xml                    # Maven project configuration
├── src/
│   ├── main/java/org/example/ # Source code with JavaDoc
│   └── test/java/             # Comprehensive unit tests
└── .gitignore                 # Pattern-specific ignores
```

## 🔨 Building Individual Patterns

Each pattern can be built and tested independently:

```bash
# Navigate to a specific pattern
cd design-patterns/abstractFactory

# Build the pattern
mvn clean install

# Run tests
mvn test
```

## ✨ Features

- ✅ **Clean Code**: Well-structured, readable implementations following Java best practices
- ✅ **JavaDoc**: Comprehensive documentation for all classes and methods
- ✅ **Tests**: Complete unit test coverage using JUnit 5
- ✅ **Real Examples**: Practical, real-world use cases for each pattern
- ✅ **Maven Ready**: Each pattern is a standalone Maven project

## 📖 Usage

Each pattern includes:
- Clear JavaDoc comments explaining the pattern's purpose
- Example implementations demonstrating practical usage
- Unit tests showing how the pattern works
- README or inline documentation

## 🔗 Related

For more information about design patterns, see:
- [Main README](../README.md) - Project overview and getting started guide
- [Gang of Four Book](https://en.wikipedia.org/wiki/Design_Patterns) - Original design patterns reference

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](../LICENSE) file for details.

