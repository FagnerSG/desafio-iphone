DESAFIO IPHONE

# Diagrama UML

    +------------------------------------------------+
    | <<interface>>                                  |
    | MusicPlayer                                    |
    +------------------------------------------------+
    | + play(): void                                 |
    | + pause(): void                                |
    | + stop(): void                                 |
    | + next(): void                                 |
    | + previous(): void                             |
    +------------------------------------------------+
    +------------------------------------------------+
    | <<interface>>                                  |
    | Phone                                          |
    +------------------------------------------------+
    | + call(number:String): void                    |
    | + answer(): void                               |
    | + hangUp(): void                               |
    +------------------------------------------------+
    +------------------------------------------------+
    | <<interface>>                                  |
    | Browser                                        |
    +------------------------------------------------+
    | + openURL(url:String): void                    |
    | + refresh(): void                              |
    | + close(): void                                |
    +------------------------------------------------+
                     IMPLEMENTS
    +------------------------------------------------+
    | IPhone                                         |
    +------------------------------------------------+
    | - currentSong: String                          |
    | - currentNumber: String                        |
    | - currentURL: String                           |
    +------------------------------------------------+
    | + play(): void                                 |
    | + pause(): void                                |
    | + stop(): void                                 |
    | + next(): void                                 |
    | + previous(): void                             |
    | + call(number:String): void                    |
    | + answer(): void                               |
    | + hangUp(): void                               |
    | + openURL(url:String): void                    |
    | + refresh(): void                              |
    | + close(): void                                |
    +------------------------------------------------+
------------------------------------------------------------------------

# Relacionamento UML

