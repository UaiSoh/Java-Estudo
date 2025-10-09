package objetos;

public abstract class Relogio_HerancaEx03 {
    private int hora; // 0-23
    private int minuto; // 0-59
    private int segundo; // 0-59

    public Relogio_HerancaEx03(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0) {
            this.hora = 0;
        } else if (hora > 23) {
            this.hora = hora % 24;
        } else {
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0) {
            this.minuto = 0;
        } else if (minuto > 59) {
            this.minuto = minuto % 60;
        } else {
            this.minuto = minuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo < 0) {
            this.segundo = 0;
        } else if (segundo > 59) {
            this.segundo = segundo % 60;
        } else {
            this.segundo = segundo;
        }
    }

    public String formatHora() {
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
    }

    /**
     * Método abstrato: sincroniza este relógio a partir de outro relógio.
     * A implementação concreta define como os campos serão interpretados.
     */
    public abstract void sincronizarDe(Relogio_HerancaEx03 outro);
}
