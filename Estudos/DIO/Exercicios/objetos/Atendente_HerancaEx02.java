package objetos;

public class Atendente_HerancaEx02 extends Usuario_HerancaEx02{

    private Double valorEmCaixa = 0.0;

    public Atendente_HerancaEx02(String nome, String email, String senha, Double valorInicial, boolean administrador) {
        super(nome, email, senha, false);
        this.valorEmCaixa = valorInicial;
    }

    public Double getValorEmCaixa() {
        return valorEmCaixa;
    }
    
    public void setValorEmCaixa(Double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa != null ? valorEmCaixa : this.valorEmCaixa;
    }
    
    public void receberPagamento( Double valor){
        if(valor == null || valor <= 0){
            System.out.println("Valor inválido para recebimento.");
            return;
        }
        this.valorEmCaixa += valor;
        System.out.println(getNome()+" recebeu o pagamento de R$ "+valor+". Caixa: "+getValorEmCaixa());

    }

    public Double fecharCaixa(){
        Double fechado = this.valorEmCaixa;
        this.valorEmCaixa = 0.0;
        System.out.println(getNome()+" fechou o caixa. Valor: R$ "+fechado);
        return fechado;
    }

}
