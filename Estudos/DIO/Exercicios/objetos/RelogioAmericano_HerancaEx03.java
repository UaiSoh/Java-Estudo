package objetos;

public class RelogioAmericano_HerancaEx03 extends Relogio_HerancaEx03 {

    public RelogioAmericano_HerancaEx03(int hora, int minuto, int segundo) {
        
        super(normalizarHora(hora), minuto, segundo);
    }

    private static int normalizarHora(int hora) {
        if (hora < 0) return 0;
        if (hora >= 13 && hora <= 23) {
            return hora - 12;
        }
        
        return hora;
    }

    @Override
    public void sincronizarDe(Relogio_HerancaEx03 outro) {
        if (outro == null) return;
        
        int horaOutra = outro.getHora();
        int horaConvertida = normalizarHora(horaOutra);
        this.setHora(horaConvertida);
        this.setMinuto(outro.getMinuto());
        this.setSegundo(outro.getSegundo());
    }
}
