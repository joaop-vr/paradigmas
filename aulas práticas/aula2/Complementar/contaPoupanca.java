public class contaPoupanca extends contaBancaria {
    private int diaDoRendimento;

    // Construtor padrão
    public contaPoupanca() {}

    // Construtor completo
    public contaPoupanca(String nome, int numConta, float saldo, int dia) {
        super(nome, numConta, saldo);
        this.setDia(dia);
    }

    public void setDia(int dia) {
        if ((1 <= dia) && (dia <= 31)) {
            this.diaDoRendimento = dia;
        } else {
            throw new IllegalArgumentException("Dia inválido");
        }
    }

    public int getDia() {
        return this.diaDoRendimento;
    }

    public void calcularNovoSaldo(float taxa) {
        float novoSaldo = getSaldo() + getSaldo()*(taxa / 100); // Calcula o novo saldo com base na taxa de juros em porcentagem
        setsaldo(novoSaldo);
    }
}
