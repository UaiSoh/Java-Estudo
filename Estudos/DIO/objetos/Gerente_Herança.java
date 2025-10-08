package objetos;

public class Gerente_Herança extends Colaborador_Herança {

    protected  String login;
    protected  String password;
    protected  Double commission;

    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public String getCode(){
        super.getCode();
        return "GR" + super.getCode() ;
    }


    
}
