
//import java.lang.classfile.ClassFile;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        var  scanner = new Scanner(System.in);

        var name = "";
        while(!name.equals("exit")){
            System.out.println("Digite seu nome (ou 'exit' para sair): ");
            name = scanner.next();
            System.out.println(name);
        } 
        // while é usado quando não sabemos o número exato de repetições.
        // do while é usado quando queremos que o bloco de código seja executado pelo menos uma vez. A condição é verificada após a execução do bloco.



       /* for(var i=0; i<5 ; i++ ){
            System.out.println("Digite um número: ");
            var number = scanner.nextInt();
            if(number % 2 == 0){
                System.out.println("O número " + number + " é par.");
            }else{
                System.out.println("O número " + number + " é ímpar.");
            
            }
        }

        //For é usado para repetir um bloco de código um número específico de vezes.
        //;; no For, repete infinitamente até que seja interrompido manualmente.
        */



       /* var value1 = -12;
        var binary1 = Integer.toBinaryString(value1);

        System.out.printf("Primeiro número da operação %s (Representação binária %s)\n", value1, binary1);

        var value2 = 2;
        var binary2 = Integer.toBinaryString(value2);

        System.out.printf("Segundo número da operação %s (Representação binária %s)\n", value2, binary2);

        var result = value1 >>> value2;
        var binaryResult = Integer.toBinaryString(result);

        System.out.printf("%s << %s = %s (Representação binária %s)\n",value1, value2, result, binaryResult);
        

        // O segundo número representa a quantidade de bits que serão deslocados para a esquerda, nesse caso 2 bits. 
        // adicionando 2 '0' a direita do número original.
        */



        /*System.out.print("Informe um número de 1 até 7: ");
        var option = scanner.nextInt();

        var menssage = switch (option) {
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana uhuull!!!", day);
                // yield é usado para retornar um valor em um bloco de código maior.
            }        
            case 2 -> "Segunda-feira";               
            case 3 -> "Terça-feira";               
            case 4 -> "Quarta-feira";               
            case 5 -> "Quinta-feira";  
            case 6 -> "Sexta-feira";
            default -> "Opção inválida";
        };

        System.out.println(menssage);
        */
        
        

       /*  System.out.println("Digite seu nome:");
        var name = scanner.next();

        System.out.println("Informe sua idade:");
        var age = scanner.nextInt();

        System.out.println("Você é emancipado ? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");
      

        if(age >= 18){
            System.out.println("Olá, " + name + "! Você pode dirigir.");
        } else if (age >= 16 && isEmancipated) {
            System.out.println("Olá, " + name + "! Apesar de ter " + age + ",você pode dirigir.");
            
        }else {
            System.out.println("Olá, " + name + "! Você não pode dirigir.");
        }
        */



        /*System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        System.out.println("Quanto é 2 + 2 ? ");
        var resposta = scanner.nextInt();
        var isRight = resposta == 4;
        System.out.println("Resposta correta? " + isRight);
        */
    }
}

// Comentário de linha

/* Comentário de bloco  
   que pode ter várias linhas */