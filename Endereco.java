package br.org.serratec.ex01;

public class Endereco {

    protected String rua;
    protected String bairro;
    protected String cep;
    protected Cidade cidade;

    public Endereco(String rua, String bairro, String cep, Cidade cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return  rua+" " +bairro + " " + cep + " " + cidade.toString();
    }
    

}
