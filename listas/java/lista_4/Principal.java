import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main(String argv[]) {

        cartaoNatal CN = new cartaoNatal("Arthur");
        cartaoDiaDosNamorados CDDN = new cartaoDiaDosNamorados("Vitor Hugo");
        cartaoAniversario CA = new cartaoAniversario("Natasha");

        ArrayList<cartaoWeb> vetor = new ArrayList<cartaoWeb>();
        vetor.add(CN);
        vetor.add(CDDN);
        vetor.add(CA);

        Iterator<cartaoWeb> i = vetor.iterator();

        while (i.hasNext()) {
            cartaoWeb aux = i.next();
            System.out.printf(aux.retornarMensagem(aux.getRemetente()) + "\n\n");
        }
    }
}
