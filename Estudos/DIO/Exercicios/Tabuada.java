import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        var numero = scanner.nextInt();

        System.out.println( "---------------------");
        System.out.println("Tabuada do " + numero + ":");
        System.out.println( "---------------------");

        for (var i = 1; i <= 10; i++) {
            var resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        System.out.println( "---------------------");

        scanner.close();
    }

    
    
}
