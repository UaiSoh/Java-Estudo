import java.time.LocalDate;
import java.util.Scanner;

public class Nome_AnoNasc {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        var anoAtual = LocalDate.now().getYear();

        int idade = anoAtual - anoNascimento;

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        scanner.close();
        

        
    }

}
