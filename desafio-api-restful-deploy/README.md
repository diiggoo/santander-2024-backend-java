# Entrega do desafio desenvolvendo API RestFUL com Spring Boot, JPA, Swagger e Deploy no Railway

## Tecnologias Utilizadas

- **Spring Boot**: Framework para criação de aplicações Java baseadas em microserviços.
- **Spring Data JPA**: Implementação da camada de persistência baseada em JPA (Java Persistence API).
- **Swagger**: Ferramenta para documentação de APIs RESTful.
- **Railway**: Plataforma para deploy de aplicações web.

## Diagrama de classe

```mermaid
classDiagram

    class Property {
        +String address
        +String type
        +float value
    }

    class Client {
        +String name
        +String ssn
        +String address
        +float income
    }

    class Contract {
        +String contractNumber
        +Date startDate
        +float amount
        +int term
        +float interestRate
    }

  Client "1" *-- "N" Contract 
    Property "1" *-- "1" Contract
    
```
