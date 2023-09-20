public class Servico implements Loja {

    private char formato;
    private int duracao;

    public Servico() {}

    public Servico(char formato, int duracao) {
        this.setFormato(formato);
        this.setDuracao(duracao);
    }

    public void setFormato(char formato) {
        this.formato = formato;
    }

    public char getFormato() {
        return this.formato;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void vender() {
        System.out.print("Vendendo um serviço!\n");
    }

    public void acionarGarantia() {
        System.out.print("Acionando a garantia!\n");
    }
}