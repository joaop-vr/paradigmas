public class funcionarioMensalista extends Funcionario {

    protected float salarioMensal;

    // Construtor default
    public funcionarioMensalista() {
    }

    // Construtor completo
    public funcionarioMensalista(String nome, int matricula, int dia, int mes, int ano, boolean estrangeiro,
            float salarioMensal) {
        super(nome, matricula, dia, mes, ano, estrangeiro);
        this.setSalarioMensal(salarioMensal);
    }

    // Construtor sem salarioMensal
    public funcionarioMensalista(String nome, int matricula, int dia, int mes, int ano, boolean estrangeiro) {
        this(nome, matricula, dia, mes, ano, estrangeiro, 0);
    }

    public void setSalarioMensal(float salario) {
        this.salarioMensal = salario;
    }

    public float getSalarioMensal() {
        return this.salarioMensal;
    }

    @Override
    public String toString() {
        String aux;
        if (this.estrangeiro)
            aux = "Sim";
        else
            aux = "Não";
        return "\nnome: " + this.getNome() + "\nmatricula: " + this.getMatricula() + "\ndata de contratação: "
                + this.dataContratacao.imprimir() + "\nestrangeiro: " + aux;
    }

    @Override
    public float calcularSalario() {
        return this.salarioMensal;
    }

    public final float calcularSalarioAnual() {
        return 12 * this.salarioMensal;
    }
}
