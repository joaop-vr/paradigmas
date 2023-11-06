package Ex1;

public class ImovelVelho extends Imovel {

    private float descontoVelho;

    public ImovelVelho() {

    }

    public ImovelVelho(float valor, String rua, int numero, String cidade, String estado, float desconto) {
        super(valor, rua, numero, cidade, estado);
        this.setDescontoVelho(desconto);
    }

    public void setDescontoVelho(float desconto) {
        this.descontoVelho = desconto;
    }

    public float getDescontoVelho() {
        return this.descontoVelho;
    }

    public float calcularValorImovel() {
        return (this.getPreco() - this.getDescontoVelho());
    }
}
