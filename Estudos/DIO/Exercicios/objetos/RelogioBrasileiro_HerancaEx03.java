package objetos;

public class RelogioBrasileiro_HerancaEx03 extends Relogio_HerancaEx03 {

    public RelogioBrasileiro_HerancaEx03(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public void sincronizarDe(Relogio_HerancaEx03 outro) {
        if (outro == null) return;
        
        this.setHora(outro.getHora());
        this.setMinuto(outro.getMinuto());
        this.setSegundo(outro.getSegundo());
    }
}
