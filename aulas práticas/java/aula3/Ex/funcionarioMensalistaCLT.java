public class funcionarioMensalistaCLT extends funcionarioMensalista {

    protected boolean carteiraAssinada;

    // Construtor default
    public funcionarioMensalistaCLT() {
    }

    // Construtor completo
    public funcionarioMensalistaCLT(String nome, int matricula, int dia, int mes, int ano, boolean estrangeiro,
            float salarioMensal, boolean carteiraAssinada) {
        super(nome, matricula, dia, mes, ano, estrangeiro, salarioMensal);
        this.setCarteiraAssinada(carteiraAssinada);
    }

    // Construtor sem carteiraAssinada
    public funcionarioMensalistaCLT(String nome, int matricula, int dia, int mes, int ano, boolean estrangeiro,
            float salarioMensal) {
        this(nome, matricula, dia, mes, ano, estrangeiro, salarioMensal, false);
    }

    public void setCarteiraAssinada(boolean carteiraAssinada) {
        this.carteiraAssinada = carteiraAssinada;
    }

    public boolean getCarteiraAssinada() {
        return this.carteiraAssinada;
    }

}
