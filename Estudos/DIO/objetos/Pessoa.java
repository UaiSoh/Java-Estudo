package objetos;

public record Pessoa(String nome, int idade) {

    public Pessoa{
        
        System.out.println(nome);
        System.out.println(idade);
    }

    public String getInfo(){
        return "Nome: " + nome + ", Idade: " + idade;
    }

    public Pessoa(String nome){
        this(nome, 0);
    }


    
    /* 
    private String nome;
    private int idade;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    */
    
}
