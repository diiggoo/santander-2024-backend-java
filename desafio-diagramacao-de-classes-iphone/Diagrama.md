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
