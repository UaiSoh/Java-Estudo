package objetos;

public class IngressoFamilia_HerancaEx01 extends Ingresso_HerancaEx01{

    private Integer qtdPessoas;

    public IngressoFamilia_HerancaEx01(Integer qtdPessoas, Boolean dublado, String nomeFilme, Double valorIngresso) {
        super(dublado, nomeFilme, valorIngresso);
        this.qtdPessoas = qtdPessoas;
    }

    public Double ingressoFamilia() {
        double valorTotal = getValorIngresso() * qtdPessoas;
        if (qtdPessoas > 3) {
            valorTotal *= 0.95; // Aplica desconto de 5%
        }
        return valorTotal;
    }

}
