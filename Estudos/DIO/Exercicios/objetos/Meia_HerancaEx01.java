package objetos;

public class Meia_HerancaEx01 extends Ingresso_HerancaEx01{

    public Meia_HerancaEx01(Boolean dublado, String nomeFilme, Double valorIngresso) {
        super(dublado, nomeFilme, valorIngresso);
    }

    public Double ingressoMeia() {
        double meia = getValorIngresso() / 2;
        return meia;
    }


}
