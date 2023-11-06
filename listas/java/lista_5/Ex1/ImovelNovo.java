package Ex1;

public class ImovelNovo extends Imovel {

    private float taxaNovo;

    public ImovelNovo() {

    }

    public ImovelNovo(float valor, String rua, int numero, String cidade, String estado, float taxa) {
        super(valor, rua, numero, cidade, estado);
        this.setTaxa(taxa);
    }

    public void setTaxa(float taxa) {
        this.taxaNovo = taxa;
    }

    public float getTaxa() {
        return this.taxaNovo;
    }

    public float calcularValorImovel() {
        return (this.getPreco() + this.getTaxa());
    }
}
