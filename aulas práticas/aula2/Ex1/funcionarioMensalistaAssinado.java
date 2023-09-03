public class funcionarioMensalistaAssinado extends funcionarioMensalista{
    
    private boolean carteiraAssinada;

    // Construtor padrão
    public funcionarioMensalistaAssinado() {}

    // Construtor completo
    public funcionarioMensalistaAssinado(String nome, int matricula, int dia, int mes, int ano, boolean estrangeiro, float valor, boolean assinada) {
        super(nome, matricula, dia, mes, ano, estrangeiro, valor);
        this.setCarteiraAssinada(assinada);
    }

    public void setCarteiraAssinada(boolean assinada) {
        this.carteiraAssinada = assinada;
    }

    public boolean isCarteiraAssinada() {
        return this.carteiraAssinada;
    }
}
