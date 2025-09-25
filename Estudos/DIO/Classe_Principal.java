import objetos.Pessoa;

public class Classe_Principal {
    public static void main(String[] args) {

        var pessoa  = new Pessoa("Pedro", 21);

        System.out.println(pessoa);
        System.out.println(pessoa.nome());
        System.out.println(pessoa.idade());
        System.out.println(pessoa.getInfo());


        /* 
        var male = new Pessoa( 21, "João");
        var female = new Pessoa( 6, "Maria");
 
        System.out.println(male.getNome() + " tem " + male.getIdade() + " anos.");
        System.out.println(female.getNome() + " tem " + female.getIdade() + " anos.");
        */


    }
}
