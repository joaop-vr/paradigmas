import java.util.Scanner;

class Telefone {
    int ddi;
    int ddd;
    int numero;

    public void cadastrar(int ddi, int ddd, int numero) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
    }

    public void exibir() {
        System.out.printf("+%d (%d) %d\n", this.ddi, this.ddd, this.numero);
    }
}

public class Ex1 {
    public static void main(String args[]) {

        int ddi, ddd, numero;
        Scanner input = new Scanner(System.in);
        Telefone vet[] = new Telefone[5];

        for (int i = 0; i < 5; i++) {

            vet[i] = new Telefone();

            do {
                System.out.print("\nDDI: ");
                ddi = input.nextInt();
            } while ((ddi != 55) && (ddi != 1) && (ddi != 61));

            System.out.print("\nDDD: ");
            ddd = input.nextInt();

            System.out.print("\nNúmero: ");
            numero = input.nextInt();

            vet[i].cadastrar(ddi, ddd, numero);
        }

        System.out.println("\n*** Exibindo telefones cadastrados ***");
        for (int i = 0; i < 5; i++)
            vet[i].exibir();

        input.close();
    }

}