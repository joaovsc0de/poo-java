package br.org.serratec.ex02;

public class FreeLancer extends Vendedor {
    private Integer diasTrabalhados;
    private Double valorDia;

    public FreeLancer(String nome, String cpf, Integer diasTrabalhados, Double valorDia) {
        super(nome, cpf);
        this.diasTrabalhados = diasTrabalhados;
        this.valorDia = valorDia;
    }

    public Integer getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public Double getValorDia() {
        return valorDia;
    }

    public void setDiasTrabalhados(Integer diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public void setValorDia(Double valorDia) {
        this.valorDia = valorDia;
    }
}
