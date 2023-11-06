package Ex1;

public abstract class Imovel {

    private float preco;
    private Endereco endereco;

    public Imovel() {
    }

    public Imovel(float valor, String rua, int numero, String cidade, String estado) {
        this.setPreco(preco);
        this.setEndereco(rua, numero, cidade, estado);
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setEndereco(String rua, int numero, String cidade, String estado) {
        this.endereco = new Endereco(rua, numero, cidade, estado);
    }

    public String getEndereco() {
        return this.endereco.getRua() + ", " + this.endereco.getNumero() + " -- " + this.endereco.getCidade() + ", "
                + this.endereco.getEstado() + "\n";
    }

    public abstract float calcularValorImovel();
}