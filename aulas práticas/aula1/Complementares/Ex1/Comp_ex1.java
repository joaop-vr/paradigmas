import java.util.Scanner;

public class Comp_ex1 {
    public static void main(String argv[]) {

        Scanner input = new Scanner(System.in);
        int tam, tamPares, tamImpares, somaPares;

        System.out.println("*************************");
        System.out.print("Digite a quantidade de números: ");
        tam = input.nextInt();

        tamPares = 0;
        tamImpares = 0;
        somaPares = 0;
        int vet[] = new int[tam];
        int vetPares[] = new int[tam];
        int vetImpares[] = new int[tam];

        System.out.println("*************************\n");
        for (int i = 0; i < tam; i++) {
            System.out.printf("Número %d: ", i + 1);
            vet[i] = input.nextInt();

            if ((vet[i] % 2) == 0) {
                vetPares[tamPares] = vet[i];
                tamPares++;
            } else {
                vetImpares[tamImpares] = vet[i];
                tamImpares++;
            }
        }

        System.out.println("\n*************************");
        System.out.print("\nNúmeros pares:");
        for (int i = 0; i < tamPares; i++) {
            System.out.printf(" %d", vetPares[i]);
            somaPares += vetPares[i];
        }
        System.out.printf("\nSoma pares: %d\n", somaPares);

        System.out.println("*************************");
        System.out.print("\nNúmeros ímpares:");
        for (int i = 0; i < tamImpares; i++) {
            System.out.printf(" %d", vetImpares[i]);
        }
        System.out.printf("\nQntd ímpares: %d\n", tamImpares);

        input.close();
    }
}