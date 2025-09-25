import java.util.Scanner;
import objetos.Conta_Bancaria;

public class Menu_Conta_Bancaria {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
    

        System.out.println("Bem-vindo ao Sistema Bancário!");
        System.out.println();

        System.out.println("Criando nova conta bancária...");
        var conta = new Conta_Bancaria();
        System.out.print("Realize o depósito inicial: ");
        Double depositoInicial = scanner.nextDouble();
        conta.Inicial(depositoInicial);
        System.out.println("Deposito inicial de R$" + depositoInicial + " realizado com sucesso.");
        System.out.println("Seus limite de cheque especial é de R$" + conta.getLimiteChequeEspecial());
        System.out.println("Conta criada com sucesso!");
        System.out.println();
        
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Exibir saldo");
            System.out.println("2. Exibir limite do cheque especial");
            System.out.println("3. Realizar depósito");
            System.out.println("4. Realizar Saque");
            System.out.println("5. Pagar boleto");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    // Verificar Saldo
                    System.out.println("Seu saldo atual é: R$" + conta.getSaldo());
                    
                    break;
                case 2:
                    // Verificar cheque especial
                    System.out.println("Seu limite de cheque especial é: R$" + conta.getLimiteChequeEspecial());
                    System.out.println("Seu saldo no cheque especial é: R$" + conta.getSaldoChequeEspecial());
                    break;
                case 3:
                    // Depósito
                    System.out.print("Digite o valor do depósito: ");
                    Double valorDeposito = scanner.nextDouble();
                    while (valorDeposito <= 0) {
                        System.out.print("Valor inválido. Digite um valor positivo para o depósito: ");
                        valorDeposito = scanner.nextDouble();
                    }
                    conta.deposito(valorDeposito);
                    System.out.println("Depósito realizado com sucesso. Novo saldo Real: R$" + conta.getSaldo());
                    break;
                case 4:
                    // Saque
                    System.out.print("Digite o valor do saque: ");
                    Double valorSaque = scanner.nextDouble();
                    while (valorSaque <= 0) {
                        System.out.print("Valor inválido. Digite um valor positivo para o saque: ");
                        valorSaque = scanner.nextDouble();
                    }
                    conta.saque(valorSaque);
                    System.out.println("Saque realizado com sucesso. Saldo Real: R$" + conta.getSaldo() + " | Cheque Especial: R$" + conta.getSaldoChequeEspecial());
                    break;
                case 5:
                    // Pagar Boleto
                    System.out.print("Digite o valor do boleto: ");
                    Double valorBoleto = scanner.nextDouble();
                    while (valorBoleto <= 0) {
                        System.out.print("Valor inválido. Digite um valor positivo para o boleto: ");
                        valorBoleto = scanner.nextDouble();
                    }
                    conta.pagarBoleto(valorBoleto);
                    break;
                case 6:
                    // Sair
                    System.out.println("Saindo do sistema. Obrigado por usar nosso serviço!");
                    break;
            }
            System.out.println();
        } while (opcao != 6);
       
    
    
    }
}