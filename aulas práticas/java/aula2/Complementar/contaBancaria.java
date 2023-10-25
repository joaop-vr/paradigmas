public class contaBancaria {
    
    private String nome;
    private int numConta;
    private float saldo;

    // Construtor padrão
    public contaBancaria() {}

    // Construtor completo
    public contaBancaria(String nome, int numConta, float saldo) {
        this.setNome(nome);
        this.setNumConta(numConta);
        this.setsaldo(saldo);
    }

    public void setNome(String nome) {
        if (!(nome.isEmpty()))
            this.nome = nome;
        else 
            throw new IllegalArgumentException("Nome não pode estar vazio");

    }

    public String getNome() {
        return this.nome;
    }

    public void setNumConta(int num) {
        if (num > 0)
            this.numConta = num;
        else 
            throw new IllegalArgumentException("Conta inválida");
    }

    public int getNumconta() {
        return this.numConta;
    }

    public void setsaldo(float valor) {
        if (valor >= 0)
            this.saldo = valor;
        else
        throw new IllegalArgumentException("Saldo deve ser maior que zero");
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void sacar(float valor) {
        if ((this.saldo - valor) >= 0)
            this.saldo -= valor;
        else
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero");
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }
}
