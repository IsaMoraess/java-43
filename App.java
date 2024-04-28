import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
// calculadora de idade
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira o ano atual: ");
    int anoAtual = sc.nextInt();

    System.out.println("Insira o ano do seu nascimento: ");
    int anoNascimento = sc.nextInt();

    int idade;

    idade =  anoAtual - anoNascimento;

    System.out.println("Voce tem " + idade + " anos");
    }
}

