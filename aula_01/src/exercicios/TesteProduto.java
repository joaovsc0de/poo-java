package exercicios;

public class TesteProduto {

	public static void main(String[] args) {
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		
		produto1.setDescricao("TV");
		produto1.setValor(1500);

	System.out.println(produto1.getDescricao() + "-" + produto1.getValor());
	}

}
