package objetos;

public class Conta_Bancaria {

    private Double saldo;
    private Double limiteChequeEspecial;
    private Double saldoChequeEspecial;
    private Double diferencaSL;

    
    
    public Conta_Bancaria() {
        this.saldo = 0.0;
        this.limiteChequeEspecial = 0.0;
        this.saldoChequeEspecial = 0.0;
        this.diferencaSL = 0.0;
    }

    //Conta iniciada, limites setados 

    public Double Inicial(Double depositoInicial) {
            this.saldo = depositoInicial;
        if(depositoInicial <= 500){
            this.limiteChequeEspecial = 50.0;
            this.saldoChequeEspecial = limiteChequeEspecial;  
        }else{
            this.limiteChequeEspecial = 0.5 * depositoInicial;
            this.saldoChequeEspecial = limiteChequeEspecial;
        }
        return null;
    }

    // Classe de saque

    public Double saque(Double valorBoleto) {
        if (valorBoleto > 0) {
            if (valorBoleto <= this.saldo + this.saldoChequeEspecial) {
                if (valorBoleto <= this.saldo) {
                    this.saldo -= valorBoleto;
                } else {
                    double valorRestante = valorBoleto - this.saldo;
                    this.saldo = 0.0;
                    this.saldoChequeEspecial -= valorRestante;
                    diferencaSL = limiteChequeEspecial - saldoChequeEspecial;
                }
                System.out.println("Saque de R$" + valorBoleto + " realizado com sucesso.");
                System.out.println();
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
                System.out.println();
            }
        } else {
            System.out.println("Valor de saque inválido.");
            System.out.println();
        }
        return this.saldo;
    } 

    public Double pagarBoleto(Double valorBoleto) {
        if (valorBoleto > 0) {
            if (valorBoleto <= this.saldo + this.saldoChequeEspecial) {
                if (valorBoleto <= this.saldo) {
                    this.saldo -= valorBoleto;
                } else {
                    double valorRestante = valorBoleto - this.saldo;
                    this.saldo = 0.0;
                    this.saldoChequeEspecial -= valorRestante;
                    diferencaSL = limiteChequeEspecial - saldoChequeEspecial;
                }
                System.out.println("Boleto de R$" + valorBoleto + " pago com sucesso.");
                System.out.println();
            } else {
                System.out.println("Saldo insuficiente para realizar o pagamento.");
                System.out.println();
            }
        } else {
            System.out.println("Valor do boleto inválido.");
            System.out.println();
        }
        return this.saldo;
    }

    public Double deposito(Double valorDeposito){
        if(saldoChequeEspecial < limiteChequeEspecial){
            valorDeposito -= (diferencaSL * 0.2);

            if(diferencaSL <= valorDeposito){
                saldoChequeEspecial += diferencaSL;
                valorDeposito -= diferencaSL;
                this.saldo +=valorDeposito;
            }else{
                this.saldo += valorDeposito;
            }

        }else{
            this.saldo += valorDeposito;
        }

        return this.saldo;
    }




    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public Double getSaldoChequeEspecial() {
        return saldoChequeEspecial;
    }

    public Double getDiferencaSL() {
        return diferencaSL;
    }
    
    

     
    
    
    
}
