package objetos;

public class Usuario_HerancaEx02 {

    private String nome;
    private String email;
    private String senha;
    private boolean administrador;
    private boolean logado = false;

    public Usuario_HerancaEx02(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /* Senha protegida */
    protected  String getSenhaProtegida() {
        return senha;
    }

    public boolean isAdministrador() {
        return administrador;
    }
    
    public boolean realizarLogin(String senha){
        if (this.senha != null && this.email != null) {
            this.logado = true;
            System.out.println(nome + ", login realizado com sucesso.");
            return true;
        }
        System.out.println(nome + ", falha no login.");
        return false;
    }

    public void realizarLogoff(){
        this.logado = false;
        System.out.println(nome + ", deslogado com sucesso.");
    }

    public void alterarDados(String novoNome, String novoEmail){
        this.nome = novoNome != null ? novoNome : this.nome;
        this.email = novoEmail != null ? novoEmail : this.email;
        System.out.println("Dados atualizados para: Nome: "+nome+", Email: "+email);
    }

    public boolean alterarSenha(String senhaAtual, String senhaNova){
        if (this.senha != null && this.senha.equals(senhaAtual)) {
            this.senha = senhaNova;
            System.out.println(nome+", senha alterada com sucerro.");
            return true;
        }
        System.out.println(nome+", falha ao alterar senha, tente novamente.");
        return false;
    }

    public boolean isLogado() {
        return logado;
    }

}
