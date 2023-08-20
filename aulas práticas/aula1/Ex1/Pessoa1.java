import java.time.LocalDate;

public class Pessoa1 {

    private String nome;
    private int idade;
    private int dia;
    private int mes;
    private int ano;

    public void setNome(String nome) {
        if (nome.length() > 0)
            this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        if (idade > 0)
            this.idade = calcularIdade();
    }

    public int getIdade() {
        return this.idade;
    }

    public void setDia(int dia) {
        if ((this.mes == 2) && ((1 <= dia) && (dia <= 28)))
            this.dia = dia;
        else if ((this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10
                || this.mes == 12) && ((1 <= dia) && (dia <= 31)))
            this.dia = dia;
        else if ((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 10) && ((1 <= dia) && (dia <= 30)))
            this.dia = dia;
    }

    public int getDia() {
        return this.dia;
    }

    public void setMes(int mes) {
        if ((1 <= mes) && (mes <= 12))
            this.mes = mes;
    }

    public int getMes() {
        return this.mes;
    }

    public void setAno(int ano) {
        if (ano > 0)
            this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

    public Pessoa1() {
    }

    public Pessoa1(String nome, int dia, int mes, int ano) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public void ajustarDataDeNascimento(int dia, int mes, int ano) {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        int diaAtual, mesAtual, anoAtual, idade;

        diaAtual = dataAtual.getDayOfMonth();
        mesAtual = dataAtual.getMonthValue();
        anoAtual = dataAtual.getYear();

        if ((this.mes < mesAtual) || (this.mes == mesAtual && this.dia <= diaAtual)) {
            idade = anoAtual - this.ano;
        } else {
            idade = (anoAtual - this.ano) - 1;
        }

        return idade;
    }

}
