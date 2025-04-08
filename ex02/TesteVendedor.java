package br.org.serratec.ex02;

import java.util.*;

public class TesteVendedor {
    public static void main(String[] args) {
        int vendedor;
        double valor = 0;
        String op = "";
        double total = 0;

        Scanner sc = new Scanner(System.in);

        Fixo[] vendedores = {
            new Fixo("João", "17748592705", 2000., 0.03, 2000.),
            new Fixo("Lara", "17748592706", 2000., 0.03, 2000.)
        };

        do {
            System.out.println("----------Sistema de Vendas----------");
            System.out.println("Vendedores:");
            for (int i = 0; i < vendedores.length; i++) {
                System.out.printf("%d - %s%n", i + 1, vendedores[i].getNome());
            }

            System.out.print("Escolha um vendedor: ");
            vendedor = sc.nextInt();

            if (vendedor >= 1 && vendedor <= vendedores.length) {
                System.out.print("Digite o valor da venda: ");
                valor = sc.nextDouble();
                vendedores[vendedor - 1].calcularSalario(valor);
                total += valor;
            } else {
                System.out.println("Opção inválida.");
            }

            System.out.print("Deseja encerrar o programa? (S/N): ");
            op = sc.next();

        } while (!op.equalsIgnoreCase("S"));

        System.out.println("----------Salário dos Vendedores----------");
        for (Fixo vend : vendedores) {
            vend.salarioVendedor();
        }

        System.out.println("-------------Total Vendido:-------------");
        System.out.printf("Total: %.2f%n", total);

        sc.close();
    }
}
