public class Funcionario {

    protected String nome;
    protected int matricula;
    protected Data dataContratacao;
    protected boolean estrangeiro;

    // Construtor default
    public Funcionario() {
    }

    // Construtor completo
    public Funcionario(String nome, int matricula, int dia, int mes, int ano, boolean estrangeiro) {
        this.setNome(nome);
        this.setMatricula(matricula);
        this.dataContratacao = new Data(dia, mes, ano);
        this.setEstrangeiro(estrangeiro);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getDataCOntrataçao() {
        return "[" + this.dataContratacao.getDia() + " / " + this.dataContratacao.getMes() + " / "
                + this.dataContratacao.getAno() + "]";
    }

    public void setEstrangeiro(boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public boolean getEstrangeiro() {
        return this.estrangeiro;
    }

    @Override
    public String toString() {
        String aux;
        if (this.estrangeiro)
            aux = "Sim";
        else
            aux = "Não";
        return "nome: " + this.getNome() + "\nmatricula: " + this.getMatricula() + "\ndata de contratação: "
                + this.dataContratacao.imprimir() + "\nestrangeiro: " + aux;
    }

    public float calcularSalario() {
        return 0;
    }
}
