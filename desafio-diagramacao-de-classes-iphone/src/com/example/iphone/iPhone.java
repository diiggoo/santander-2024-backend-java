package com.example.iphone;

public class iPhone implements MusicPlayer, Phone, InternetBrowser {
    public void playMusic(){
        System.out.println("Tocando música...");
    }
    public void pauseMusic() {
        System.out.println("Pausando música...");
    }
    public void stopMusic() {
        System.out.println("Parando música...");
    }

    public void makeCall(String phoneNumber) {
        System.out.println("Chamando " + phoneNumber + "...");
    }

    public void endCall() {
        System.out.println("Encerrando chamada...");
    }

    public void openWebsite(String url) {
        System.out.println("Abrindo site: " + url);
    }

    public void refreshPage() {
        System.out.println("Atualizando página...");
    }

    public static void main(String[] args) {
        iPhone myPhone = new iPhone();

        //testando funcionalidades
        myPhone.playMusic();
        myPhone.pauseMusic();
        myPhone.stopMusic();

        myPhone.makeCall("123-456-7890");
        myPhone.endCall();

        myPhone.openWebsite("https://www.example.com");
        myPhone.refreshPage();
    }

}
