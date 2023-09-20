public class ProdutoEletronico implements Loja {

    private String nomeFabricante;
    private float peso;
    private String marca;

    public ProdutoEletronico() {}

    public ProdutoEletronico (String nome, float peso, String marca) {
        this.setNomeFabricante(nome);
        this.setPeso(peso);
        this.setMarca(marca);
    }

    public void setNomeFabricante (String nome) {
        if (!(nome.isEmpty())) {
            this.nomeFabricante = nome;
        }
    }

    public String getNomeFabricante() {
        return this.nomeFabricante;
    }

    public void setPeso(float peso) {
        if (peso > 0.0) {
            this.peso = peso;
        }
    }

    public float getPeso() {
        return this.peso;
    }

    public void setMarca(String marca) {
        if (!marca.isEmpty()) {
            this.marca = marca;
        }
    }

    public String getMarca() {
        return this.marca;
    }

    public void vender() {
        System.out.print("Vendendo um serviço!\n");
    }

    public void acionarGarantia() {
        System.out.print("Acionando a garantia!\n");
    }

}