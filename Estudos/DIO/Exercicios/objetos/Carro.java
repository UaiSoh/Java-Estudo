package objetos;

public class Carro {

    Integer velocidade;
    Boolean status;
    Integer marcha;

    public Carro(Integer velocidade, Boolean status, String marcha) {
        this.velocidade = 0;
        this.status = false;
        this.marcha = 0;
    }

    public void ligar(){
        if(!status){
            status = true;
            System.out.println("Carro ligado.");
        }else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar(){
        if(status && velocidade == 0 && velocidade == 0){
            status = false;
            System.out.println("Carro desligado.");
        }else if(!status){
            System.out.println("O carro ja está desligado.");
        }else{
            System.out.println("Não é possível desligar o carro. Certifique-se de que eles esteja parado e em ponto morto.");
        }
    }

    public void acelerar(){
        if(status){
            if(marcha == 0){
                System.out.println("Não é possível acelerar em ponto morto");
            }else if(velocidade < 120){
                velocidade++;
                verificarMarchaVelocidade(marcha);
                System.out.println("Velocidade atual: " + velocidade + " km/h.");
            }else{
                System.out.println("Velocidade máxima atingida.");
            }
        }else{
            System.out.println("O carro está desligado.");
        }
    }

    public void diminuirVelocidade(){
        if(status){
            if(velocidade > 0){
                System.out.println("Não é possível acelerar em ponto morto");
            }else if(velocidade < 120){
                velocidade--;
                verificarMarchaVelocidade(marcha);
                System.out.println("Velocidade atual: " + velocidade + " km/h.");
            }else{
                System.out.println("O carro já está parado.");
            }
        }else{
            System.out.println("O carro está desligado.");
        }
    }

    public void virar (String direcao){
        if(status){
            if(velocidade >= 1 && velocidade <= 40){
                System.out.println("Virando para " + direcao + ".");
            }else{
                System.out.println("Não é possível virar. Velocidade fora do recomendado.");
            }
        }else{
            System.out.println("O carro está desligado.");
        }
    }

    public void trocarMarcha(int novaMarcha){
        if(status){
            if(novaMarcha == marcha + 1 || novaMarcha == marcha - 1){
                if(verificarMarchaVelocidade(novaMarcha)){
                    marcha = novaMarcha;
                    System.out.println("Marcha atual: " + marcha);
                }else{
                    System.out.println("Velocidade imcopatível com a marcha.");
                }
            }else{
                System.out.println("Não é possível pular marchas.");
            }
        }else{
            System.out.println("O carro está desligado.");
        }
    }


    private boolean verificarMarchaVelocidade(int novaMarcha){
        switch (novaMarcha) {
            case 0: return velocidade == 0;
            case 1: return velocidade >= 0 && velocidade <= 20;
            case 2: return velocidade >= 21 && velocidade <= 40;
            case 3: return velocidade >= 41 && velocidade <= 60;
            case 4: return velocidade >= 61 && velocidade <= 80;
            case 5: return velocidade >= 81 && velocidade <= 100;
            case 6: return velocidade >= 101 && velocidade <= 120;
            default: return false;
        }
    }

    private void verificarMarchaVelocidade(){
        if(!verificarMarchaVelocidade(marcha)){
            System.out.println("Atenção: Velocidade incompatível com a marcha atual.");
        }
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public Boolean getStatus() {
        return status;
    }

    public Integer getMarcha() {
        return marcha;
    }

    



    
    

    

    
}
