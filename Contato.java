package br.org.serratec.ex01;

import java.util.*;
public class Contato {

    protected String nome;
    protected Telefone telefones[];
    protected Endereco endereco;
    Scanner sc;
    Telefone telefone;


    public Contato(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

    public void mostrarTelefones(){
        for(Telefone telefone : telefones){
            System.out.println("Telefone:"+telefone.numero);
        }
    }

    public void adicionarTelefone(){
        String numero;
        sc = new Scanner(System.in);
        this.telefones = new Telefone[2];
        for(int i = 0; i < 2; i++){
            System.out.println("Digite o número de telefone:");  
            numero = sc.next();     
            this.telefones[i] = telefone = new Telefone(numero);
        }

    }

    @Override
    public String toString() {
        return "Nome=" + nome + "\n" +  endereco.toString();
               
    }
    
}
