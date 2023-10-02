public class ingressoCamarote extends ingressoVip {

    private float valorAdicionar2;

    public ingressoCamarote() {
    }

    public ingressoCamarote(float valor, float adicional1, float adicional2) {
        super(valor, adicional1);
        this.setValorAdicional2(adicional2);
    }

    public void setValorAdicional2(float adicional) {
        this.valorAdicionar2 = adicional;
    }

    public float getValorAdicional2() {
        return this.valorAdicionar2;
    }

    @Override
    public void imprimir() {
        float valorTotal = this.getValor() + this.getValorAdicional() + this.getValorAdicional2();
        System.out.printf("Valor:" + valorTotal + "(adicional duplo incluso).\n");
    }
}
