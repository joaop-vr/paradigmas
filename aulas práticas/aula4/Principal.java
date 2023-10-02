import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main(String args[]) {

        Loja s = new Servico('R', 140);
        Loja tv = new Televisao("Tv ultra led", (float)1441.4, "Boa Marca");
        Loja celular = new Celular("iPhone23", (float)7.500, "Apple");

        ArrayList<Loja> vet = new ArrayList<Loja> ();
        vet.add(s);
        vet.add(tv);
        vet.add(celular);

        Iterator<Loja> i = vet.iterator();

        while(i.hasNext()) {
            Loja l = i.next();
            l.vender();
            l.acionarGarantia();
            System.out.printf("\n\n");
        }

    }
}