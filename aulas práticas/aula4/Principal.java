import java.util.LinkedList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Collections;

public class Principal {
    public static void main(String args[]) {

        

        /*********************************************************
         * 
         * Enunciados do 1 ao 3
         * 
         * Loja s = new Servico('R', 140);
         * Loja tv = new Televisao("Tv ultra led", (float)1441.4, "Boa Marca", (float) 80.0);
         * Loja celular = new Celular("iPhone23", (float)7.500, "Apple");
         *
         * LinkedList<Loja> vet = new LinkedList<Loja> ();
         * vet.add(s);
         * vet.add(tv);
         * vet.add(celular);
         *  
         * Iterator<Loja> i = vet.iterator();
         * 
         * while(i.hasNext()) {
         *     Loja l = i.next();
         *     l.vender();
         *     l.acionarGarantia();
         *     if (l instanceof ProdutoEletronico) {
         *         ProdutoEletronico aux = (ProdutoEletronico) l;
         *         aux.ligar();
         *         aux.desligar();
         *     }
         *     System.out.printf("\n\n");
         * }
         * 
         *********************************************************/
        
        // Enunciado do 4

        Televisao tv1 = new Televisao("LG Eletronics", (float) 30.8, "LG", (float) 75);
        Televisao tv2 = new Televisao("Mondial", (float) 4.5, "Sony", (float) 32);
        Televisao tv3 = new Televisao("Britânia", (float) 16, "Philco", (float) 50);

        HashSet<ProdutoEletronico> televisoes = new HashSet<ProdutoEletronico> ();
        televisoes.add(tv1);
        televisoes.add(tv2);
        televisoes.add(tv3);

        Iterator<ProdutoEletronico> i = televisoes.iterator();

        System.out.printf("***** HashSet *****\n");
        while(i.hasNext()) {
            Televisao aux = (Televisao) i.next();
            System.out.printf(aux.toString() + "\n");
        }

        //Enunciado do 5
        TreeSet<ProdutoEletronico> arvore = new TreeSet<ProdutoEletronico> ();
        arvore.add(tv1);
        arvore.add(tv2);
        arvore.add(tv3);

        System.out.printf("***** TreeSet *****\n");
        for (ProdutoEletronico produto: arvore) {
            System.out.printf(produto.toString() + "\n");

        }
        
    }
}