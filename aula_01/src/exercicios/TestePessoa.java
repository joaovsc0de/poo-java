package exercicios;

import java.util.*;

public class TestePessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p = new Pessoa();

		System.out.printf("Digite sua altura: ");
		p.setAltura(sc.nextDouble());

		System.out.printf("Digite seu peso: ");
		p.setPeso(sc.nextDouble());

		sc.nextLine();

		System.out.printf("Digite seu nome: ");
		p.setNome(sc.nextLine());

		System.out.println(p.getNome() + " está " + p.resultado() + "\n");

	}

}
