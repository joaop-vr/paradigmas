public class Celular extends ProdutoEletronico {

    public Celular() {}

    public Celular(String nome, float peso, String marca) {
        super(nome, peso, marca);
    }

    public void vender() {
        System.out.print("Vendendo o celular " +this.getMarca() + " da marca " + this.getMarca() + "!\n");
    }

    public void acionarGarantia() {
        System.out.print("Acionando a garantia do celular " +this.getMarca() + " da marca " + this.getMarca() + "!\n");
    }
}