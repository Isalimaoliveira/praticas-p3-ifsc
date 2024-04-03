package lista3;

import java.util.Scanner;

public class Pessoa2 {
    public String nome;
    public Long cpf;
    public String datadenascimento;
}
public class Pesso2aMainB {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Pessoa[] pessoas = new Pessoa[3];

    for (int i = 0; i < pessoas.length; i++) {
    Pessoa pessoa = new Pessoa();
    System.out.println("Digite o nome da pessoa " + (i+1) + ":");
    pessoa.nome = scanner.nextLine();
    System.out.println("Digite o CPF da pessoa " + (i+1) + ":");
    pessoa.cpf = scanner.nextLong();
    scanner.nextLine(); 
    System.out.println("Digite a data de nascimento da pessoa " + (i+1) + ":");
    pessoa.dataNascimento = scanner.nextLine();

    pessoas[i] = pessoa;
}

    for (int i = 0; i < pessoas.length; i++) {
    System.out.println("\nDados da Pessoa " + (i+1) + ":");
    System.out.println("Nome: " + pessoas[i].nome);
    System.out.println("CPF: " + pessoas[i].cpf);
    System.out.println("Data de Nascimento: " + pessoas[i].dataNascimento);
      }
     scanner.close();
   }
}