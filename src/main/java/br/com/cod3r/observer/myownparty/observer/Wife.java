package br.com.cod3r.observer.myownparty.observer;

public class Wife implements Observer {

    private void lestParty() {
        System.out.println("his come let's party");
    }

    private void watingForit() {
        System.out.println("his not come iet lets wait");
    }

    @Override
    public void update(boolean status) {
        if (status) {
            lestParty();
        } else {
            watingForit();
        }
    }
}
