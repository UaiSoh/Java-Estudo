
import java.util.Scanner;
import objetos.Pet;

public class Cuidado_Pet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pet pet = new Pet(false, null, null, false);

        int opcao;

        do{
            System.out.println("\nControle da Maquina de Banho");
            System.out.println("1. Dar banho no pet");
            System.out.println("2. Abastecer com água");
            System.out.println("3. Abastecer com shampoo");
            System.out.println("4. Verificar nivel da água");
            System.out.println("5. Verificar nivel de shampoo");
            System.out.println("6. Verificar se tem pet no banho");
            System.out.println("7. Colocar pet na maquina");
            System.out.println("8. Retirar pet da máquina");
            System.out.println("9. Limpar maquina");
            System.out.println("10. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    pet.banhoPet();
                    break;
                case 2:
                    pet.recargaAgua();
                    break;
                case 3:
                    pet.recargaShampoo();
                    break;
                case 4:
                    pet.nivelAgua();
                    break;
                case 5:
                    pet.nivelShampoo();
                    break;
                case 6:
                    if(pet.isOcupada() == true){
                        System.out.println("Máquina ocupada.");
                    }else{
                        System.out.println("Máquina vazia.");
                    }
                    break;
                case 7:
                    pet.colocarPet();
                    break;
                case 8:
                    pet.retirarPet();
                    break;
                case 9:
                    pet.limparMaquina();
                    break;
                case 10:
                    System.out.println("Saindo do programa...");   
                    return;    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }while(opcao != 10);       
    }
}
