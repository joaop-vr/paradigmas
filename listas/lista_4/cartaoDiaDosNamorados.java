public class cartaoDiaDosNamorados extends cartaoWeb {

    public cartaoDiaDosNamorados(String remetente) {
        this.setRemetente(remetente);
    }

    public String retornarMensagem(String remetente) {
        return "Querida " + remetente + ",\n" +
                "Feliz Dia dos Namorados! Espero que esse tenha sido o único cartão do dia dos namorados que tenha ganhado nessa data!\n"
                +
                "De todo meu coração,\n" +
                "João";
    }

}
