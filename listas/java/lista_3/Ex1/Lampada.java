package Ex1;

public class Lampada {

    private char estado;

    public Lampada() {
    }

    public Lampada(char estado) {
        this.setEstado(estado);
    }

    public void setEstado(char a) {
        if ((a == 'l') || (a == 'L'))
            this.estado = 'L';
        else
            this.estado = 'D';
    }

    public String getEstado() {
        if ((this.estado == 'l') || (this.estado == 'L'))
            return "ligada";
        else
            return "desligada";
    }

    public void desligar() {
        this.estado = 'D';
    }

    public void ligar() {
        this.estado = 'L';
    }
}
