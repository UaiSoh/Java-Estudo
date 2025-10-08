import com.sun.jdi.VMDisconnectedException;
import objetos.Colaborador_Herança;
import objetos.Gerente_Herança;
import objetos.Vendedor_Herança;

public class Herança {

    public static void main(String[] args) {
        
        Colaborador_Herança colaborador = new Colaborador_Herança();
        Vendedor_Herança vendedor = new Vendedor_Herança();
        Gerente_Herança gerente = new Gerente_Herança();

        System.out.println(vendedor instanceof  Colaborador_Herança);
        
    
    
    }
}
