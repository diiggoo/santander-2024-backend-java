# iPhone Functionalities UML Diagram

Este diagrama de classes UML representa as funcionalidades do iPhone como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet, conforme apresentado no vídeo de lançamento do primeiro iPhone por Steve Jobs em 2007.

```mermaid
classDiagram
    direction LR

    class MusicPlayer {
        <<interface>>
        +playMusic()
        +pauseMusic()
        +stopMusic()
    }

    class Phone {
        <<interface>>
        +makeCall(String phoneNumber)
        +endCall()
    }

    class InternetBrowser {
        <<interface>>
        +openWebsite(String url)
        +refreshPage()
    }

    class iPhone {
        +playMusic()
        +pauseMusic()
        +stopMusic()
        +makeCall(String phoneNumber)
        +endCall()
        +openWebsite(String url)
        +refreshPage()
    }

    iPhone ..|> MusicPlayer
    iPhone ..|> Phone
    iPhone ..|> InternetBrowser


```
### Explicação

- **MusicPlayer**: Interface que define métodos para tocar, pausar e parar música.
- **Phone**: Interface que define métodos para fazer e encerrar chamadas.
- **InternetBrowser**: Interface que define métodos para abrir um site e atualizar a página.
- **iPhone**: Classe que implementa todas as três interfaces, provendo funcionalidades de reprodutor musical, aparelho telefônico e navegador na internet.


