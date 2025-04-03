package exercicios;

public class Funcionario {
	
	private String nome;
	private double salario;
	private static int  contador=0;
	
	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public Funcionario(String nome, double salario) {
		
		this.nome = nome;
		this.salario = salario;
		this.contador++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
