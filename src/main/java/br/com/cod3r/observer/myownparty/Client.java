package br.com.cod3r.observer.myownparty;

import br.com.cod3r.observer.myownparty.observer.Sindico;
import br.com.cod3r.observer.myownparty.observer.Wife;
import br.com.cod3r.observer.myownparty.subject.Porteiro;

public class Client {

    public static void main(String[] args) {

        Sindico sindico = new Sindico();
        Wife wife = new Wife();
        Porteiro porteiro = new Porteiro();

        porteiro.addInterecados(sindico);
        porteiro.addInterecados(wife);

        porteiro.setStatus(false);
        porteiro.setStatus(false);
        porteiro.setStatus(true);

    }



}
