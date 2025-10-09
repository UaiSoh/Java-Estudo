package objetos;

public class Gerente_HerancaEx02 extends Usuario_HerancaEx02{

    public Gerente_HerancaEx02(String nome, String email, String senha, boolean administrador) {
        super(nome, email, senha, true);
    }

    public void gerarRelatorio(){
        System.out.println(getNome() + ": Gerando relatório financeiro...");
    }

    /* Consulta as vendas de um vendedor específico */
    public void consultarVendas(Vendedor_HerancaEx02 vendedor){
        if (vendedor == null) {
            System.out.println(getNome() + ": Nenhum vendedor informado para consulta.");
            return;
        }
        System.out.println(getNome() + ": Consultando vendas do vendedor " + vendedor.getNome() + ": " + vendedor.getQuantidadeVendas());
    }

}
