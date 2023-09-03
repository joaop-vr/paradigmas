public class contaEspecial extends contaBancaria{
    
    private float limite;

    // Construtor padrão
    public contaEspecial() {}

    // Construtor completo
    public contaEspecial(String nome, int numConta, float saldo, float limite) {
        super(nome, numConta, saldo);
        this.setLimite(limite);
    }

    public void setLimite(float limite) {
        if (limite > 0 ) {
            this.limite = limite;
        } else {
            throw new IllegalArgumentException("Limite deve ser superior a zero");
        }
    }

    public float getLimite() {
        return this.limite;
    }

    @Override
    public void sacar(float valor) {
        if (valor <= this.limite) {
            float aux = super.getSaldo();
            aux -= valor;
            super.setsaldo(aux);
        }
    }
}
