package Models;

import java.util.Date;

public class Telefone {
    private String nome;
    private String modelo;
    private Date dataDeFabricacao;

    public Telefone() {

    }

    public static void main(String[] args) {
        System.out.println("Lançamento do Classes.Telefone!");
    }

    public Telefone(String nome, String modelo, Date dataDeFabricacao) {
        this.nome = nome;
        this.modelo = modelo;
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }
}
