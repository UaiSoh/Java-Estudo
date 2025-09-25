import java.util.Scanner;

public class Diferença_Idade {
    
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome da primeira pessoa:");
        String nome1 = scanner.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();

        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Informe o nome da segunda pessoa:");
        String nome2 = scanner.nextLine();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        int diferenca = Math.abs(idade1 - idade2);

        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferenca + " anos.");

        scanner.close();


        
        
    }

}