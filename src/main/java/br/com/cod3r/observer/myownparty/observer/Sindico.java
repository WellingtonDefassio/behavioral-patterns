package br.com.cod3r.observer.myownparty.observer;

public class Sindico implements Observer {

    private void toDeboas() {
        System.out.println("to de boas...");
    }

    private void goDeMulta() {
        System.out.println("partiu multa!!...");
    }

    @Override
    public void update(boolean status) {
        if (status) {
            goDeMulta();
        } else {
            toDeboas();
        }

    }
}
