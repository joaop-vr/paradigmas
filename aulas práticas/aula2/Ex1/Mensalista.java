class Mensalista extends Funcionario {

    private int salario;

    // Construtor padrão
    public Mensalista() {}

    // Construtor completo
    public Mensalista(String nome, int matricula, int dia, int mes, int ano, boolean estrangeiro, int valor) {
        super(nome, matricula, dia, mes, ano, estrangeiro);
        this.setSalario(salario);
    }

    // Construtor apenas com salário
    public Mensalista(int valor) {
        this('', 0, 0, 0, 0, false, valor);
    }

    public void setSalario(int valor) {
        if (valor > 0) {
            this.salario = valor;
        }
    }
    public int getSalario() {
        return this.salario;
    }
}