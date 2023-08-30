class Funcionario {

    private String nome;
    private int matricula;
    private Data contratacao;
    private boolean estrangeiro;

    public Funcionario() {}

    public Funcionario (String nome, int matricula, int dia, int mes, int ano, boolean estrangeiro) {
        this.setNome(nome);
        this.setMatricula(matricula);
        this.contratacao = new Data(dia, mes, ano);
        this.setEstrangeiro(estrangeiro);
    }

    public void setNome(String nome) {
        if (!(nome.isEmpty())) {
            this.nome = nome;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setMatricula(int matricula) {
        if (matricula > 0) {
            this.matricula = matricula;
        }
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setEstrangeiro(boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public boolean isEstrangeiro() {
        return this.estrangeiro;
    }

    public String toString() {
        String ehGringo = this.isEstrangeiro() ? "Sim" : "Não";
        return
            "Nome: " + getNome() + "\n" +
            "Matricula: " + getMatricula() + "\n" +
            "Contratação: " + "(" + this.contratacao.getDia() + "/" + this.contratacao.getMes() + "/" + this.contratacao.getAno() + ")" + "\n" +
            "Estrangeiro: " + ehGringo + "\n";

    }

}