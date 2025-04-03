package exercicios;

public class Pessoa {
	private int id;
	private String nome;
	private double peso, altura;

	public double calcularIMC() {
		return getPeso() / (getAltura() * getAltura());
	}

	public String resultado() {
		if (calcularIMC() < 18.5) {
			return "abaixo do peso.";
		} else if (calcularIMC() <= 24.9) {
			return "no peso ideal.";
		} else
			return "acima do peso.";

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
			this.peso = peso;	
	}

	public double getAltura() {
		return altura;
	}

	protected void setAltura(double altura) {
		this.altura = altura;
	}
}
