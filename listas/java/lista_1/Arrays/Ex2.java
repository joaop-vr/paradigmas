import java.util.Scanner;

public class Ex2 {
    public static void main(String argc[]) {

        Scanner input = new Scanner(System.in);
        int m1[][] = new int[3][3];
        int m2[][] = new int[3][3];
        int mSoma[][] = new int[3][3];

        System.out.print("\n********************\n\n");
        System.out.println("Digite os 9 valores da matriz 1(3x3):");

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("(%d,%d): ", l, c);
                m1[l][c] = input.nextInt();
            }
        }

        System.out.print("\n********************\n\n");
        System.out.println("Digite os 9 valores da matriz 2(3x3):");

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("(%d,%d): ", l, c);
                m2[l][c] = input.nextInt();
            }
        }

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++)
                mSoma[l][c] = m1[l][c] + m2[l][c];
        }

        System.out.print("\n********************\n\n");
        System.out.println("Matriz resultante:");
        for (int l = 0; l < 3; l++) {
            System.out.printf(" %d | %d | %d \n", mSoma[l][0], mSoma[l][1], mSoma[l][1]);
        }

        input.close();
    }
}
