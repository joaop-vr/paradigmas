public abstract class cartaoWeb {

    protected String remetente;

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getRemetente() {
        return this.remetente;
    }

    public abstract String retornarMensagem(String remetente);
}
