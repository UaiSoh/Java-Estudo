import java.util.Scanner;

public class Resto_Zero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        var number = scanner.nextInt();

        var keepVerify = true;

        while(keepVerify){
            System.out.println("Digite outro número para verificação: ");
            var toVerify = scanner.nextInt();
            if(toVerify < number){
                System.out.println("Número inválido. Digite um número maior que " + number);
                continue;
            }

            var result = toVerify % number;
            keepVerify = result == 0;
            System.out.printf("%s %% %s = %s \n", toVerify, number, result);

        }
       
    }    
}
