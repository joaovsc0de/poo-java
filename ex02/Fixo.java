package br.org.serratec.ex02;

public class Fixo extends Vendedor {
    private Double salarioBase;
    private Double comissao;
    private Double salarioBruto;

    public Fixo(String nome, String cpf, Double salarioBase, Double comissao, Double salarioBruto) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public Double getComissao() {
        return comissao;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void calcularSalario(Double venda){
        this.salarioBruto += venda*comissao;
    }

    public void salarioVendedor(){
        System.out.println("Nome:"+this.nome+"\nSalário Bruto:"+ this.salarioBruto);
    }
}
