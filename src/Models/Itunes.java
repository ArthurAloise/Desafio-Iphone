package Models;

import Interfaces.ReprodutorMusical;

import java.util.Date;

public class Itunes extends Telefone implements ReprodutorMusical {

    public Itunes(String nome, String modelo, Date dataDeFabricacao) {
        super(nome, modelo, dataDeFabricacao);
    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void reproduzirMusica(String musica) {

    }
}
