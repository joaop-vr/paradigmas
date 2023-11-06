public class Ingresso {

    private float valor;

    public Ingresso() {
    }

    public Ingresso(float valor) {
        this.setValor(valor);
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return this.valor;
    }

    public void imprimir() {
        System.out.printf("Valor: " + this.getValor());
    }
}
