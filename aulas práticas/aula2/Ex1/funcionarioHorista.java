class funcionarioHorista extends Funcionario {

    private int valorHora;
    private int numHoras;

    // Construtor padrão 
    public funcionarioHorista() {}

    // Construtor completo
    public funcionarioHorista(String nome, int matricula, int dia, int mes, int ano, boolean estrangeiro, int valorHora, int numHoras) {
        super(nome, matricula, dia, mes, ano, estrangeiro);
        this.setValorHora(valorHora);
        this.setNumHoras(numHoras);
    }

    // Construtor apenas com valorHora e numHoras
    public funcionarioHorista(int valorHora, int numHoras) {
        this(null, 0, 0, 0, 0, false, valorHora, numHoras);
    }

    public void setValorHora(int valor) {
        if (valor > 0) {
            this.valorHora = valor;
        }
    }

    public int getValorHora() {
        return this.valorHora;
    }

    public void setNumHoras(int valor) {
        if (valor > 0) {
            this.numHoras = valor;
        }
    }

    public int getNumHoras() {
        return this.numHoras;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        return
            aux + 
            "Valor por hora: " + getValorHora() + "\n" +
            "Horas trabalhadas: " + getNumHoras() + "\n";
    }

    public float calcularSalarioFinal() {
        int a,b;
        a = getValorHora();
        b = getNumHoras();
        return (a*b);
    }
}