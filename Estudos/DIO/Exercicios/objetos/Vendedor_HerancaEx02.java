package objetos;

public class Vendedor_HerancaEx02 extends Usuario_HerancaEx02{
    
    private Integer quantidadeVendas;

    public Vendedor_HerancaEx02(String nome, String email, String senha, boolean administrador) {
        super(nome, email, senha, false);
        this.quantidadeVendas = 0;
    }

    public Integer getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void realizarVenda(){
        this.quantidadeVendas++;
        System.out.println(getNome()+" realizou uma venda. Total: "+getQuantidadeVendas()+".");
    }

    public void consultarVendas(){
        System.out.println(getNome()+" realizou um total de "+getQuantidadeVendas()+" vendas.");
    }

}
