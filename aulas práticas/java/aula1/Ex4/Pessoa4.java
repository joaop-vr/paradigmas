public class Pessoa4 {

    private String nome;
    private int idade;
    private Data4 data = new Data4();

    public void setNome(String nome) {
        if (nome.length() > 0)
            this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setData(int dia, int mes, int ano) {
        this.data.ajustarData(dia, mes, ano);
    }

    public Data4 getData() {
        return this.data;
    }

    public void setIdade(int dia, int mes, int ano) {
        this.idade = this.data.calcularIdade();
    }

    public int getIdade() {
        return this.idade;
    }

    public Pessoa4() {
    }

    public Pessoa4(String nome, int dia, int mes, int ano) {
        this.setNome(nome);
        this.data.ajustarData(dia, mes, ano);
        this.setIdade(dia, mes, ano);
    }

    public void imprimirData() {

        Data4 aux = new Data4();
        aux = getData();
        System.out.printf("Data: %d/%d/%d\n", aux.getDia(), aux.getMes(), aux.getAno());
    }

}
