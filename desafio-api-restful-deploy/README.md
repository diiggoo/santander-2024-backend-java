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
