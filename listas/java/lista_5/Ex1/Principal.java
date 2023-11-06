package Ex1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
        String rua, cidade, estado;
        int numero;
        float taxa, desconto;

        for (int i = 0; i < 200; i++) {
            System.out.printf("Entre com os dados do imóvel %d\n", i);
            System.out.printf("Rua: ");
            rua = input.nextLine();
            System.out.printf("Numero: ");
            numero = input.nextInt();
            input.nextLine(); // Consumir a nova linha deixada pelo nextInt()
            System.out.printf("Cidade: ");
            cidade = input.nextLine();
            System.out.printf("Estado: ");
            estado = input.nextLine();

            if ((i % 2) == 0) {
                System.out.printf("Desconto: ");
                desconto = input.nextFloat();
                input.nextLine(); // Consumir a nova linha deixada pelo nextFloat()
                ImovelVelho velho = new ImovelVelho(i, rua, numero, cidade, estado, desconto);
                imoveis.add(velho);
            } else {
                System.out.printf("Taxa: ");
                taxa = input.nextFloat();
                input.nextLine(); // Consumir a nova linha deixada pelo nextFloat()
                ImovelNovo novo = new ImovelNovo(i, rua, numero, cidade, estado, taxa);
                imoveis.add(novo);
            }
        }

        Iterator<Imovel> i = imoveis.iterator();
        int imovelNumero = 0;

        while (i.hasNext()) {
            Imovel aux = i.next();
            imovelNumero++;
            System.out.printf("Imovel %d: Valor = %f\n", imovelNumero, aux.calcularValorImovel());
        }

        input.close();
    }
}
