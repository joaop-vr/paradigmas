public class Time {

    int hora;
    int minuto;

    // Construtor padrão
    public Time() {
        this.hora = 0;
        this.minuto = 0;
    }

    // Construtor com parâmetros
    public Time(int hora, int minuto) {
        this.setHora(hora);
        this.setMinuto(minuto);
    }

    // Construtor com hora fornecida
    public Time(int hora) {
        this.setHora(hora);
        this.setMinuto(0);
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getMinuto() {
        return minuto;
    }

    public boolean anterior(int h, int m) {
        if ((h < this.hora) || (h == this.hora) && (m < this.minuto))
            return true;
        return false;
    }

    public boolean posterior(int h, int m) {
        if ((h > this.hora) || (h == this.hora) && (m > this.minuto))
            return true;
        return false;
    }

    public boolean equals(int h, int m) {
        if ((h == this.hora) && (m == this.minuto))
            return true;
        return false;
    }

    public String toString() {
        return String.format("%2d:%2d", getHora(), getMinuto());
    }
}
