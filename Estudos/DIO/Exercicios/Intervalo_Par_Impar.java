
import java.util.Scanner;

public class Intervalo_Par_Impar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        var number1 = scanner.nextInt();
        System.out.println("Digite um segundo número inteiro: ");
        var number2 = scanner.nextInt();
        while(number1 >= number2){
            System.out.println("O segundo número deve ser maior que o primeiro.");
            number2 = scanner.nextInt();
        }    

        System.out.println("Deseja exibir números pares ou ímpares? (P/I)");
        var option = scanner.next().toUpperCase();

        while(!option.equals("P") && !option.equals("I")){
            System.out.println("Opção inválida. Por favor, escolha 'P' para pares ou 'I' para ímpares.");
            option = scanner.next().toUpperCase();
        }

        switch (option) {
            case "P"-> {
                System.out.println("Números pares entre " + number1 + " e " + number2 + ":");
                for (var i = number1; i <= number2; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
            }
            case "I"-> {
                System.out.println("Números pares entre " + number1 + " e " + number2 + ":");
                for (var i = number1; i <= number2; i++) {
                    if (i % 2 == 1) {
                        System.out.print(i + " ");
                    }
                }    
            }
         }
                           
    }
       
}
