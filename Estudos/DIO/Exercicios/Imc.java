
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso em kg: ");
        var peso = scanner.nextDouble();
        System.out.print("Digite sua altura em metros: ");
        var altura = scanner.nextDouble();

        var imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.printf("Seu IMC é %.2f e você está abaixo do peso.%n", imc);
        } else if(imc >= 18.5 && imc < 25){
            System.out.printf("Seu IMC é %.2f e você está com o peso ideal.%n", imc);
        } else if(imc >= 25 && imc < 30){
            System.out.printf("Seu IMC é %.2f e você está com levemente acima do peso.%n", imc);
        } else if(imc >= 30 && imc < 35){
            System.out.printf("Seu IMC é %.2f e você está com obesidade grau I.%n", imc);
        } else if(imc >= 35 && imc < 40){
            System.out.printf("Seu IMC é %.2f e você está com obesidade grau II (Severa).%n", imc);
        } else {
            System.out.printf("Seu IMC é %.2f e você está com obesidade grau III (Mórbida).%n", imc);
        }





    }
}
