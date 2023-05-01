package br.com.cod3r.observer.myownparty.subject;

import br.com.cod3r.observer.myownparty.observer.Observer;

public class Porteiro extends Subject{

    private boolean status = false;

    public boolean isStatus() {
        return status;
    }

    public void addInterecados(Observer observer) {
        addObservers(observer);
    }

    public void setStatus(boolean novoStatus) {

         this.status = novoStatus;
         notifyObservers(novoStatus);

    }
}
