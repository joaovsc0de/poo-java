package br.org.serratec.ex01;

public class Cidade {

    protected String nomeCidade;
    protected Estado estado;

    public Cidade(String nomeCidade, Estado estado) {
        this.nomeCidade = nomeCidade;
        this.estado = estado;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public Estado getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return nomeCidade +" " + estado.toString();
    }

    
}
