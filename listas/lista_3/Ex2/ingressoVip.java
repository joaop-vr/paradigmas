public class ingressoVip extends Ingresso {

    private float valorAdicionar;

    public ingressoVip() {
    }

    public ingressoVip(float valor, float adicional) {
        super(valor);
        this.setValorAdicional(adicional);
    }

    public void setValorAdicional(float adicional) {
        this.valorAdicionar = adicional;
    }

    public float getValorAdicional() {
        return this.valorAdicionar;
    }

    @Override
    public void imprimir() {
        float valorTotal = this.getValor() + this.getValorAdicional();
        System.out.printf("Valor:" + valorTotal + "(adicional incluso).\n");
    }
}
