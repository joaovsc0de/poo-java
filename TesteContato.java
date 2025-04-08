package br.org.serratec.ex01;

public class TesteContato {
    public static void main(String[] args) {
        Estado estado = new Estado("Rio de Janeiro", "RJ");
        Cidade cidade = new Cidade("Petrópolis", estado);
        Endereco endereco = new Endereco("Rua Fonseca Ramos", "Centro", "25648180", cidade);
        Contato contato = new Contato("Roni", endereco);

        contato.adicionarTelefone();
       System.out.println(contato.toString());
       contato.mostrarTelefones();
        
    }
}
