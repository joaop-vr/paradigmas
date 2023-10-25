import java.util.Scanner;

public class Comp_ex6 {
    public static void main(String argv[]) {

        Scanner input = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int chave, colunaChave, linhaChave;

        colunaChave = -1;
        linhaChave = -1;

        System.out.println("\n*************************");
        System.out.print("Digite os números da matriz(4x4):\n\n");

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("Número [%d,%d]: ", (l + 1), (c + 1));
                matriz[l][c] = input.nextInt();
            }
        }

        System.out.println("\n*************************");
        System.out.print("\nMatriz:\n");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("%4d", matriz[c][l]);
            }
            System.out.print("\n");
        }

        System.out.println("\n*************************");
        System.out.print("Informe o número a ser buscado: ");
        chave = input.nextInt();

        System.out.println("\n*************************");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                if (matriz[l][c] == chave) {
                    linhaChave = l + 1;
                    colunaChave = c + 1;
                }
            }
        }

        if ((colunaChave != -1) || (linhaChave != -1)) {
            System.out.printf("O número %d está em Matriz[%d][%d].\n", chave, linhaChave, colunaChave);
        } else {
            System.out.printf("Número não encontrado\n");
        }
        input.close();
    }
}
