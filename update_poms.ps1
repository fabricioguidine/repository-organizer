# Script to update all POM files to use parent dependency management
$patterns = @(
    "adapter", "bridge", "builder", "chainOfResponsability", "command",
    "composite", "decorator", "facade", "factoryMethod", "flyweight",
    "interpreter", "iterator", "mediator", "memento", "observer",
    "prototype", "proxy", "state", "templateMethod", "visitor"
)

$template = @"
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    
    <parent>
        <groupId>com.designpatterns</groupId>
        <artifactId>design-patterns-collection</artifactId>
        <version>1.0.0</version>
        <relativePath>../../pom.xml</relativePath>
    </parent>
    
    <artifactId>{0}</artifactId>
    <name>{1}</name>
    <description>{2}</description>
    
    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
    
    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
"@

$patternNames = @{
    "adapter" = "Adapter Pattern"
    "bridge" = "Bridge Pattern"
    "builder" = "Builder Pattern"
    "chainOfResponsability" = "Chain of Responsibility Pattern"
    "command" = "Command Pattern"
    "composite" = "Composite Pattern"
    "decorator" = "Decorator Pattern"
    "facade" = "Facade Pattern"
    "factoryMethod" = "Factory Method Pattern"
    "flyweight" = "Flyweight Pattern"
    "interpreter" = "Interpreter Pattern"
    "iterator" = "Iterator Pattern"
    "mediator" = "Mediator Pattern"
    "memento" = "Memento Pattern"
    "observer" = "Observer Pattern"
    "prototype" = "Prototype Pattern"
    "proxy" = "Proxy Pattern"
    "state" = "State Pattern"
    "templateMethod" = "Template Method Pattern"
    "visitor" = "Visitor Pattern"
}

$descriptions = @{
    "adapter" = "Adapter pattern implementation - Allows incompatible interfaces to work together"
    "bridge" = "Bridge pattern implementation - Separates abstraction from implementation"
    "builder" = "Builder pattern implementation - Constructs complex objects step by step"
    "chainOfResponsability" = "Chain of Responsibility pattern implementation - Passes requests along a chain of handlers"
    "command" = "Command pattern implementation - Encapsulates requests as objects"
    "composite" = "Composite pattern implementation - Composes objects into tree structures"
    "decorator" = "Decorator pattern implementation - Adds behavior to objects dynamically"
    "facade" = "Facade pattern implementation - Provides a simplified interface to a complex subsystem"
    "factoryMethod" = "Factory Method pattern implementation - Creates objects without specifying the exact class"
    "flyweight" = "Flyweight pattern implementation - Shares state to support large numbers of fine-grained objects"
    "interpreter" = "Interpreter pattern implementation - Defines a representation for grammar and an interpreter"
    "iterator" = "Iterator pattern implementation - Provides a way to access elements of a collection"
    "mediator" = "Mediator pattern implementation - Defines how objects interact with each other"
    "memento" = "Memento pattern implementation - Captures and restores an object's internal state"
    "observer" = "Observer pattern implementation - Notifies multiple objects about state changes"
    "prototype" = "Prototype pattern implementation - Creates objects by cloning existing instances"
    "proxy" = "Proxy pattern implementation - Provides a placeholder for another object"
    "state" = "State pattern implementation - Allows an object to alter its behavior when its internal state changes"
    "templateMethod" = "Template Method pattern implementation - Defines the skeleton of an algorithm"
    "visitor" = "Visitor pattern implementation - Separates algorithms from the objects they operate on"
}

foreach ($pattern in $patterns) {
    $artifactId = $pattern -replace "([A-Z])", "-`$1" -replace "^\-", "" -replace "([a-z])([A-Z])", "`$1-`$2"
    $artifactId = $artifactId.ToLower()
    $name = $patternNames[$pattern]
    $description = $descriptions[$pattern]
    
    $content = $template -f $artifactId, $name, $description
    $filePath = "design-patterns\$pattern\pom.xml"
    
    Write-Host "Updating $filePath..."
    Set-Content -Path $filePath -Value $content -Encoding UTF8
}

Write-Host "All POM files updated!"

