public abstract class ProdutoEletronico implements Loja {

    protected String nomeFabricante;
    protected float peso;
    protected String marca;

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

    public void ligar() {
        if (this instanceof Celular) {
            System.out.printf("Ligando o celular " + this.getNomeFabricante() + "!\n");
        }
        else if (this instanceof Televisao) {
            System.out.printf("Ligando a televisão " + this.getNomeFabricante() + "!\n");
        }
        else {
            System.out.println("Dispositivo não suportado.");
        }
    }

    public void desligar() {
        if (this instanceof Celular) {
            System.out.printf("Desligando o celular " + this.getNomeFabricante() + "!\n");
        }
        else if (this instanceof Televisao) {
            System.out.printf("Desligando a televisão " + this.getNomeFabricante() + "!\n");
        }
        else {
            System.out.println("Dispositivo não suportado.");
        }
    }
}