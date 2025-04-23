# Dev Week 2025
 - Java RESTful API criada para entrega de projeto.

## Diagrama de Classes

````mermaid
classDiagram
    class User {
        name: String
        account: String
        agency: String
        balance: float
        limit: float
    }
    class Account{
      -String number
      -String agency
      -Number balance
      -Number limit
    }

    class Feature {
        icon: URL
        description: String
    }
    class Card {
        number: String
        limit: float
    }
    class News {
        icon: URL
        description: String
    }
    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "1" Card
    User "1" *-- "N" News
```
