import java.util.Scanner;

public class Ex3 {
    public static void main(String argv[]) {

        Scanner input = new Scanner(System.in);
        int x, fX;

        System.out.println("\n*****************************\n");
        System.out.print("Número: ");
        x = input.nextInt();

        if ((0 <= x) && (x < 5))
            fX = x;
        else if ((5 <= x) && (x < 10))
            fX = 2 * x + 1;
        else
            fX = x - 3;

        System.out.printf("f(%d) = %d\n\n", x, fX);

        input.close();
    }
}
