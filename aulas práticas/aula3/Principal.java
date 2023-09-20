import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main(String args[]) {

        Loja s = new Servico('R', 140);
        Loja pe = new ProdutoEletronico("Lavadora Lava-seca", (float)441.4, "Boa Marca");

        ArrayList<Loja> vet = new ArrayList<Loja> ();
        vet.add(s);
        vet.add(pe);

        Iterator<Loja> i = vet.iterator();

        while(i.hasNext()) {
            Loja l = i.next();
            l.vender();
            l.acionarGarantia();
            System.out.printf("\n\n");
        }

        //for(Loja p: )
    }
}