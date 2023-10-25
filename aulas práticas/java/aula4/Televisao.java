import java.util.Comparator;

public class Televisao extends ProdutoEletronico implements Comparable<Televisao> {

    private float tamPolegada;
    
    public Televisao() {}

    public Televisao(String nome, float peso, String marca, float tam) {
        super(nome, peso, marca);
        this.setTamPolegada(tam);
    }

    public void setTamPolegada(float tam) {
        this.tamPolegada = tam;
    }

    public float getTamPolegada() {
        return this.tamPolegada;
    }

    public void vender() {
        System.out.print("Vendendo a televisão " +this.getNomeFabricante() + " da marca " + this.getMarca() + "!\n");
    }

    public void acionarGarantia() {
        System.out.print("Acionando a garantia da televisão " +this.getNomeFabricante() + " da marca " + this.getMarca() + "!\n");
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNomeFabricante() + "\n"
                + "Marca: " + this.getMarca() + "\n"
                + "Peso: " + this.getPeso() + "\n"
                + "Tamanho (polegadas): " + this.getTamPolegada() + "\n";
    }

    @Override
    public int compareTo(Televisao outraTelevisao) {
        if (this.peso < outraTelevisao.getPeso()) {
            return 1;
        } else if (this.peso == outraTelevisao.getPeso()) {
            return 0;
        } else {
            return -1;
        }
    } 
}