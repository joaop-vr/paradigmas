package Ex1;

public class lampadaFluorescente extends Lampada {

    private float comprimento;

    public lampadaFluorescente(char estado, float comp) {
        super(estado);
        this.setComprimento(comp);
    }

    public void setComprimento(float comp) {
        this.comprimento = comp;
    }

    public float getComprimento() {
        return this.comprimento;
    }
}
