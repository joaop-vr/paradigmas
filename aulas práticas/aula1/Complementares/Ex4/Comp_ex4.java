import java.util.Scanner;

public class Comp_ex4 {
    public static void main(String argv[]) {

        Scanner input = new Scanner(System.in);
        int menor, maior;
        int vet[] = new int[7];

        System.out.println("\n*************************");
        System.out.print("Digite os 7 números do vetor:\n\n");

        for (int i = 0; i < 7; i++) {
            System.out.printf("Número [%d]: ", (i + 1));
            vet[i] = input.nextInt();
        }

        menor = vet[0];
        maior = vet[0];
        for (int i = 0; i < 7; i++) {
            if (vet[i] < menor)
                menor = vet[i];
            if (maior < vet[i])
                maior = vet[i];
        }

        System.out.println("\n*************************");
        System.out.printf("Maior: %d\n", maior);
        System.out.printf("Menor: %d\n", menor);
        input.close();
    }
}
