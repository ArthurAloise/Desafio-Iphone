package Models;

import Interfaces.NavegadorDeInternet;

import java.util.Date;

public class Safari extends Telefone implements NavegadorDeInternet {

    public Safari(String nome, String modelo, Date dataDeFabricacao) {
        super(nome, modelo, dataDeFabricacao);
    }

    @Override
    public void exibirPagina(String url) {

    }

    @Override
    public void adicionarNovaAba(String url) {

    }

    @Override
    public void atualizarPagina() {

    }
}
