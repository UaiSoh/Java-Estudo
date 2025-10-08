
import objetos.Ingresso_HerancaEx01;
import objetos.Meia_HerancaEx01;
import objetos.IngressoFamilia_HerancaEx01;

public class Heranca_Ex01 {

    public static void main(String[] args) {

        // Exemplos de criação dos ingressos
        Ingresso_HerancaEx01 ingressoNormal = new Ingresso_HerancaEx01(true, "Pokemon", 15.0);
        Meia_HerancaEx01 ingressoMeia = new Meia_HerancaEx01(true, "Pokemon", 15.0);
        IngressoFamilia_HerancaEx01 ingressoFamilia = new IngressoFamilia_HerancaEx01(4, true, "Pokemon", 15.0);

        int tipo = 2; // Altere para 1, 2 ou 3 para testar cada tipo

        switch (tipo) {
            case 1:
                System.out.println("Ingresso Normal: \nFilme: " + ingressoNormal.getNomeFilme() + "\nDublado ? " + ingressoNormal.getDublado() + "\nValor: " + ingressoNormal.getValorIngresso());
                break;
            case 2:
                System.out.println("Meia Entrada: \nFilme: " + ingressoMeia.getNomeFilme() + "\nDublado ? " + ingressoMeia.getDublado() + "\nValor: " + ingressoMeia.ingressoMeia());
                break;
            case 3:
                System.out.println("Ingresso Família: \nFilme: " + ingressoFamilia.getNomeFilme() + "\nDublado ? " + ingressoFamilia.getDublado() + "\nValor: " + ingressoFamilia.ingressoFamilia());
                break;
            default:
                System.out.println("Tipo de ingresso inválido.");
        }
    }

}
