package br.com.cod3r.observer.myownparty.subject;

import br.com.cod3r.observer.myownparty.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observerList = new ArrayList<>();

    protected void addObservers(Observer observer) {
        observerList.add(observer);
    }

    protected void notifyObservers(boolean isHere) {
        observerList.forEach(o -> o.update(isHere));
    }


}
