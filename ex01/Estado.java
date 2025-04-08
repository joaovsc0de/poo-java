package br.org.serratec.ex01;

public class Estado {

    protected String nomeEstado;
    protected String sigla;

    public Estado(String nomeEstado, String sigla) {
        this.nomeEstado = nomeEstado;
        this.sigla = sigla;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public String getSigla() {
        return sigla;
    }

    @Override
    public String toString() {
        return  nomeEstado + " " + sigla;
    }

}
