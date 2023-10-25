class funcionarioMensalista extends Funcionario {

    private float salario;

    // Construtor padrão
    public funcionarioMensalista() {}

    // Construtor completo
    public funcionarioMensalista(String nome, int matricula, int dia, int mes, int ano, boolean estrangeiro, float valor) {
        super(nome, matricula, dia, mes, ano, estrangeiro);
        this.setSalario(valor);
    }

    // Construtor apenas com salário
    public funcionarioMensalista(float valor) {
        this(null, 0, 0, 0, 0, false, valor);
    }

    public void setSalario(float valor) {
        if (valor > 0) {
            this.salario = valor;
        }
    }
    public float getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        return
            aux + 
            "Salário: " + getSalario() + "\n";
    }

    @Override
    public float calcularSalarioFinal() {
        return getSalario();
    }

    public final float salarioAnual() {
        float a = getSalario();
        return (12*a);
    }
}