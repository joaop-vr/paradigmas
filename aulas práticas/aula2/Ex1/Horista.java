class Horista extends Funcionario {

    private int valorHora;
    private int numHoras;

    // Construtor padrão 
    public Horista() {}

    // Construtor completo
    public Horista(String nome, int matricula, int dia, int mes, int ano, boolean estrangeiro, int valorHora, int numHoras) {
        super(nome, matricula, dia, mes, ano, estrangeiro);
        this.setValorHora(valorHora);
        this.setNumHoras(numHoras);
    }

    // Construtor apenas com valorHora e numHoras
    public Horista(int valorHora, int numHoras) {
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
}