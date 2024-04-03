package lista3;

public class Pessoa {
	
    public String nome;
    public long cpf;
    public String datadenascimento;  
}
public class PessoaMainA {
	 public static void main(String[] args) {

    Pessoa pessoa1 = new Pessoa();
    Pessoa pessoa2 = new Pessoa();
    Pessoa pessoa3 = new Pessoa();

    pessoa1.nome = "Davi Aguiar";
    pessoa1.cpf = "13884880942";
    pessoa1.datadenascimento = "10/10/2004";

    pessoa2.nome = "Sophia silva";
    pessoa2.cpf = "11122233344";
    pessoa2.datadenascimento = "25/02/2015";

    pessoa3.nome = "Maria lima";
    pessoa3.cpf = "99988877766";
    pessoa3.datadenascimento = "29/09/2022";

    System.out.println("Dados da Pessoa 1:");
    System.out.println("Nome: " + pessoa1.nome);
    System.out.println("CPF: " + pessoa1.cpf);
    System.out.println("Data de Nascimento: " + pessoa1.datadenascimento);

    System.out.println("Dados da Pessoa 2:");
    System.out.println("Nome: " + pessoa2.nome);
    System.out.println("CPF: " + pessoa2.cpf);
    System.out.println("Data de Nascimento: " + pessoa2.datadenascimento);

    System.out.println("Dados da Pessoa 3:");
    System.out.println("Nome: " + pessoa3.nome);
    System.out.println("CPF: " + pessoa3.cpf);
    System.out.println("Data de Nascimento: " + pessoa3.datadenascimento);
  }
}   
