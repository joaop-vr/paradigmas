import java.time.LocalDate;

public class Data4 {

    private int dia;
    private int mes;
    private int ano;

    public void setDia(int dia, int mes) {
        if ((mes == 2) && ((1 <= dia) && (dia <= 28)))
            this.dia = dia;
        else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10
                || mes == 12) && ((1 <= dia) && (dia <= 31)))
            this.dia = dia;
        else if ((mes == 4 || mes == 6 || mes == 9 || mes == 10) && ((1 <= dia) && (dia <= 30)))
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

    public Data4() {
    }

    public void ajustarData(int dia, int mes, int ano) {
        this.setDia(dia, mes);
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
