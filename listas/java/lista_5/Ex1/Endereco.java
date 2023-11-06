package Ex1;

public class Endereco {

    private String rua;
    private String cidade;
    private String estado;
    private int numero;

    public Endereco() {

    }

    public Endereco(String rua, int numero, String cidade, String estado) {
        this.setRua(rua);
        this.setNumero(numero);
        this.setCidade(cidade);
        this.setEstado(estado);
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return this.rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;
    }
}
