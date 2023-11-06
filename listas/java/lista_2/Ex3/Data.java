import java.time.LocalDate;

public class Data {

    int dia, mes, ano;

    // Construtor padrão
    public Data() {
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
    }

    // Construtor com parâmetros
    public Data(int dia, int mes, int ano) {
        this.setDia(dia, mes);
        this.setMes(mes);
        this.setAno(ano);
    }

    // Construtor sem ano (assumimos o ano atual)
    public Data(int dia, int mes) {
        this.setDia(dia, mes);
        this.setMes(mes);

        LocalDate dataAtual = LocalDate.now();
        int anoAtual;
        anoAtual = dataAtual.getYear();
        this.setAno(anoAtual);
    }

    // Construtor sem mes e ano (assumimos o mes e ano atual)
    public Data(int dia) {
        LocalDate dataAtual = LocalDate.now();
        int mesAtual, anoAtual;

        mesAtual = dataAtual.getMonthValue();
        anoAtual = dataAtual.getYear();

        this.setDia(dia, mesAtual);
        this.setMes(mesAtual);
        this.setAno(anoAtual);
    }

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

    public boolean anterior(int d, int m, int a) {

        if (a < this.ano)
            return true;
        else if (a == this.ano) {
            if (m < this.mes)
                return true;
            else if (m == this.mes) {
                if (d < this.dia)
                    return true;
            }
        }

        return false;
    }

    public boolean posterior(int d, int m, int a) {
        if (a > this.ano)
            return true;
        else if (a == this.ano) {
            if (m > this.mes)
                return true;
            else if (m == this.mes) {
                if (d > this.dia)
                    return true;
            }
        }

        return false;
    }

    public boolean equals(int d, int m, int a) {
        if ((d == this.dia) && (m == this.mes) && (a == this.ano))
            return true;
        return false;
    }

    public String toString() {
        return String.format("%2d/%2d/%2d", getDia(), getMes(), getAno());
    }

}
