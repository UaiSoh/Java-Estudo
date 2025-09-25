
import java.util.Scanner;

import objetos.Carro;

public class Controle_Carro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro(null, null, null);

        int opcao;
        
        do{
            System.out.println("\nControle do Veículo");
            System.out.println("1. Ligar o carro");
            System.out.println("2. Desligar o carro");
            System.out.println("3. Acelerar");
            System.out.println("4. Diminuiur velocidade");
            System.out.println("5. Virar para a esquerda");
            System.out.println("6. Virar para a direita");
            System.out.println("7. Trocar marcha");
            System.out.println("8. Verificar status do carro");
            System.out.println("9. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.diminuirVelocidade();
                    break;
                case 5:
                    carro.virar("esquerda");
                    break;
                case 6:
                    carro.virar("direita");
                    break;
                case 7:
                    System.out.print("Digite a marcha desejada (0 a 6):");
                    int marcha = scanner.nextInt();
                    carro.trocarMarcha(marcha);
                    break;
                case 8:
                    System.out.println("Status do carro:");
                    System.out.println("Ligado: " + carro.getStatus());
                    System.out.println("Velocidade: " + carro.getVelocidade() + " km/h");
                    System.out.println("Marcha: " + carro.getMarcha());
                    break;
                case 9:
                    System.out.println("Saindo do programa...");
                    return;    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }




        }while(opcao != 9);
    }  
}
