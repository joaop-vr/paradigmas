public class cartaoAniversario extends cartaoWeb {

    public cartaoAniversario(String remetente) {
        this.setRemetente(remetente);
    }

    public String retornarMensagem(String remetente) {
        return "Querida " + remetente + ",\n" +
                "Parabéns por completar mais um ano de juventude eterna!\n"
                + "Que este aniversário seja tão incrível quanto você é!";
    }

}
