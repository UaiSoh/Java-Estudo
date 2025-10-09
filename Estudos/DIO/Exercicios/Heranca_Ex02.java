
import objetos.Atendente_HerancaEx02;
import objetos.Gerente_HerancaEx02;
import objetos.Vendedor_HerancaEx02;


 
public class Heranca_Ex02 {

    public static void main(String[] args) {
    
        
    Gerente_HerancaEx02 gerente = new Gerente_HerancaEx02("Ana Silva", "ana@empresa.com", "senha123", true);
    Vendedor_HerancaEx02 vendedor = new Vendedor_HerancaEx02("Carlos Souza", "carlos@empresa.com", "vend@123", false);
    Atendente_HerancaEx02 atendente = new Atendente_HerancaEx02("Mariana Lima", "mariana@empresa.com", "atend@123", 100.0, false);


        gerente.realizarLogin("senha123");
        gerente.gerarRelatorio();
        System.out.println();

        vendedor.realizarLogin("vend@123");
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        System.out.println();

        atendente.realizarLogin("atend@123");
        atendente.receberPagamento(50.5);
        atendente.receberPagamento(25.0);
        atendente.fecharCaixa();
        System.out.println();

        gerente.consultarVendas(vendedor);
        System.out.println();

        vendedor.realizarLogoff();
        atendente.realizarLogoff();
        gerente.realizarLogoff();
    }

}
