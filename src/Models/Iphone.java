package Models;

import Interfaces.AparelhoTelefonico;

import java.util.Date;

public class Iphone extends Telefone implements AparelhoTelefonico {

    public Iphone(String nome, String modelo, Date dataDeFabricacao) {
        super(nome, modelo, dataDeFabricacao);
    }

    @Override
    public void ligar() {

    }

    @Override
    public void atender() {

    }
}
