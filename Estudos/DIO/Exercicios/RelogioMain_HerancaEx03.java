import objetos.RelogioAmericano_HerancaEx03;
import objetos.RelogioBrasileiro_HerancaEx03;

public class RelogioMain_HerancaEx03 {
    public static void main(String[] args) {
        RelogioBrasileiro_HerancaEx03 rb = new RelogioBrasileiro_HerancaEx03(23, 59, 50);
        RelogioAmericano_HerancaEx03 ra = new RelogioAmericano_HerancaEx03(11, 30, 0);

        System.out.println("Antes sincronizar:");
        System.out.println("Brasileiro: " + rb.formatHora());
        System.out.println("Americano:  " + ra.formatHora());

        
        ra.sincronizarDe(rb);

        System.out.println("\nDepois de sincronizar americano a partir do brasileiro:");
        System.out.println("Brasileiro: " + rb.formatHora());
        System.out.println("Americano:  " + ra.formatHora());

       
        rb.sincronizarDe(ra);
        System.out.println("\nDepois de sincronizar brasileiro a partir do americano:");
        System.out.println("Brasileiro: " + rb.formatHora());
        System.out.println("Americano:  " + ra.formatHora());
    }
}
