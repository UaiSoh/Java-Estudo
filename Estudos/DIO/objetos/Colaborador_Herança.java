package objetos;

public class Colaborador_Herança{

    protected String code;
    protected String name;
    protected String adress;
    protected String age;
    protected Double salary;

    public Colaborador_Herança(String adress, String age, String code, String name, Double salary) {
        this.adress = adress;
        this.age = age;
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    public Colaborador_Herança() {
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    
    
}
