package exercicios;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Funcionario f1 = new Funcionario("Joao", 5000);
			Funcionario f2 = new Funcionario("Aiaco", 6000);
			Funcionario f3 = new Funcionario("Jonso", 7000);
			
			System.out.println(f1.getNome());
			System.out.println(f2.getNome());
			System.out.println(f3.getNome());
		
			System.out.println("Total Geral de funcionarios:"+f3.getContador());
	}

}
