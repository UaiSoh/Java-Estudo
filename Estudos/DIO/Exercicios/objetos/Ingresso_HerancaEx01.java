package objetos;

public class Ingresso_HerancaEx01 {

    private String nomeFilme;
    private Double valorIngresso;
    private Boolean dublado;

    public Ingresso_HerancaEx01(Boolean dublado, String nomeFilme, Double valorIngresso) {
        this.dublado = dublado;
        this.nomeFilme = nomeFilme;
        this.valorIngresso = valorIngresso;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public Double getValorIngresso() {
        return valorIngresso;
    }

    public Boolean getDublado() {
        return dublado;
    }

}
