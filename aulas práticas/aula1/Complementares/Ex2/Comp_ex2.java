import java.util.Scanner;

public class Comp_ex2 {
    public static void main(String argv[]) {

        Scanner input = new Scanner(System.in);
        int somaCol1, somaCol2, somaCol3;
        int matriz[][] = new int[3][3];
        int vet[] = new int[3];

        System.out.println("\n*************************");
        System.out.println("Digite os números da matriz (3x3): ");

        somaCol1 = 0;
        somaCol2 = 0;
        somaCol3 = 0;

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("Número [%d,%d]: ", (l + 1), (c + 1));
                matriz[l][c] = input.nextInt();

                if (((l + 1) % 3) == 1)
                    somaCol1 += matriz[l][c];
                if (((l + 1) % 3) == 2)
                    somaCol2 += matriz[l][c];
                if (((l + 1) % 3) == 0)
                    somaCol3 += matriz[l][c];
            }
        }

        vet[0] = somaCol1;
        vet[1] = somaCol2;
        vet[2] = somaCol3;

        System.out.println("\n*************************");
        System.out.print("\nEntrada:\n");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("%4d", matriz[c][l]);
            }
            System.out.print("\n");
        }

        System.out.println("\n*************************");
        System.out.print("\nSaída:");
        for (int i = 0; i < 3; i++) {
            System.out.printf(" %d", vet[i]);
        }
        System.out.print("\n");

        input.close();
    }
}