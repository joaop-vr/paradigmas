package Ex1;

import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int num;

        lampadaFluorescente L1 = new lampadaFluorescente('D', 25);
        lampadaLed L2 = new lampadaLed('L');

        System.out.printf("Escolha uma lampada [1 ou 2]: ");
        num = input.nextInt();

        if (num == 1) {
            if (L1.getEstado() == "Ligado") {
                L1.setEstado('d');
            } else {
                L1.setEstado('l');
            }
            System.out.printf("A lampada 1 estava " + L1.getEstado() + "mas não está mais.");
        } else {
            if (L2.getEstado() == "Ligado") {
                L2.setEstado('d');
            } else {
                L2.setEstado('l');
            }
            System.out.printf("A lampada 2 estava " + L2.getEstado() + "mas não está mais.");
        }
        input.close();
    }
}
