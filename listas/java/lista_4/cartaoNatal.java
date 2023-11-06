public class cartaoNatal extends cartaoWeb {

    public cartaoNatal(String remetente) {
        this.setRemetente(remetente);
    }

    public String retornarMensagem(String remetente) {
        return "Querido(a) " + this.getRemetente() + ",\n"
                + "Neste Natal, que a alegria, o amor e a paz preencham os seus corações.\n"
                + "Feliz Natal e um próspero Ano Novo!\n";
    }
}
