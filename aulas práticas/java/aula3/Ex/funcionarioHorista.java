public class funcionarioHorista extends Funcionario {

    protected float valorHora;
    protected int horasTrabalhadas;

    // Construtor default
    public funcionarioHorista() {
    }

    // Construtor completo
    public funcionarioHorista(String nome, int matricula, int dia, int mes, int ano, boolean estrangeiro,
            float valorHora, int horasTrabalhadas) {
        super(nome, matricula, dia, mes, ano, estrangeiro);
        this.setValorHora(valorHora);
        this.setHorasTrabalhadas(horasTrabalhadas);
    }

    // Construtor sem horasTrabalhadas
    public funcionarioHorista(String nome, int matricula, int dia, int mes, int ano, boolean estrangeiro,
            float valorHora) {
        this(nome, matricula, dia, mes, ano, estrangeiro, valorHora, 0);
    }

    // Construtor sem valorHoras
    public funcionarioHorista(String nome, int matricula, int dia, int mes, int ano, boolean estrangeiro,
            int horasTrabalhadas) {
        this(nome, matricula, dia, mes, ano, estrangeiro, 0, horasTrabalhadas);
    }

    public void setValorHora(float valor) {
        this.valorHora = valor;
    }

    public float getValorHora() {
        return this.valorHora;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    @Override
    public String toString() {
        String aux;
        if (this.estrangeiro)
            aux = "Sim";
        else
            aux = "Não";
        return "nome: " + this.getNome() + "\nmatricula: " + this.getMatricula() + "\ndata de contratação: "
                + this.dataContratacao.imprimir() + "\nestrangeiro: " + aux + "\nvalor por hora: " + this.getValorHora()
                + "\nhoras trabalhadas:" + this.getHorasTrabalhadas();
    }

    @Override
    public float calcularSalario() {
        return this.valorHora * this.horasTrabalhadas;
    }
}
