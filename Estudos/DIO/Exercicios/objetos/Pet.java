package objetos;

public class Pet {

    boolean ocupada;
    Integer agua;
    Integer shampoo;
    boolean petLimpo;
    boolean maquinaLimpa;

    public Pet(boolean ocupada, Integer agua, Integer shampoo, boolean petLimpo) {
        this.ocupada = false;
        this.agua = 30;
        this.shampoo = 10;
        this.petLimpo = false;
        this.maquinaLimpa= true;
    }

    public void banhoPet(){
        if(ocupada == false){
        System.out.println("Máquina não ocupada, insira um pet.");    
        }else{ if(petLimpo == true){
            System.out.println("Pet já está limpo, retire o pet da máquina.");
            }else{
                if(agua < 10 || shampoo < 2){
                    System.out.println("Verifique se a água ou o shampoo atendem o minímo nescessario (Água = 10, Shampoo = 2)");
                }else{
                    if(maquinaLimpa == false){
                        System.out.println("A máquina está suja, limpe-a antes do banho.");
                    }else{
                        agua -= 10;
                        shampoo -= 2;
                        petLimpo = true;
                        System.out.println("Banho dado com sucesso, retire o pet.");
                    }
                }
            }
        }


    }

    public void colocarPet(){
        if(ocupada == false && maquinaLimpa == true){
        ocupada = true;
        System.out.println("Pet inserido.");
        petLimpo = false;
        }else {
            System.out.println("Máquina já está ocupada por um pet ou suja. ");
        }
    }

    public void retirarPet(){
        if(ocupada == true){
        ocupada = false;
        if(petLimpo == false){
            maquinaLimpa = false;
        }
        System.out.println("Pet retirado.");
        }else {
            System.out.println("Máquina não está ocupada por um pet.");
        }
    }

    public void nivelShampoo(){
        System.out.println("Shampoo: " + getShampoo() + "/10");
    }

    public void nivelAgua(){
        System.out.println("Shampoo: " + getAgua() + "/30");
    }

    public void recargaShampoo(){
        if(getShampoo() == 10){
            System.out.println("Máquina já está cheia com shampoo.");
        }else if(getShampoo()<10){
            shampoo += 2;
            if(shampoo > 10){
                shampoo = 10;
            }
        }
    }

    public void recargaAgua(){
        if(getAgua() == 30){
            System.out.println("Máquina já está cheia com água.");
        }else if(getAgua()<30){
            agua += 2;
            if(agua > 30){
                agua = 30;
            }
        }
    }

    public void limparMaquina(){
        if(maquinaLimpa == true){
            System.out.println("Maquina limpa, não nescessita de limpeza.");
        }else{
            if(agua < 3 && shampoo < 1){
                System.out.println("Verifique se a água ou o shampoo atendem o minímo nescessario (Água = 3, Shampoo = 1)");
            }else{
                agua -= 3;
                shampoo -= 1;
                maquinaLimpa = true;
                System.out.println("Máquina limpa com sucesso");
            }
        }
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public Integer getAgua() {
        return agua;
    }

    public Integer getShampoo() {
        return shampoo;
    }

    public boolean ispetLimpo() {
        return petLimpo;
    }   
}
