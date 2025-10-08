package objetos;

public class Vendedor_Herança extends Colaborador_Herança{

    protected  Double percentPerSold;

    public Vendedor_Herança(String adress, String age, String code, String name, Double salary) {
        super(adress, age, code, name, salary);
    }

    public Double getPercentPerSold() {
        return percentPerSold;
    }

    public Vendedor_Herança() {
    }

    public void setPercentPerSold(Double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
    
    public String getCode(){
        super.getCode();
        return "VD" + super.getCode() ;
    }


    
}
