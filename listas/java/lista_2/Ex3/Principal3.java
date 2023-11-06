import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Data datas[] = new Data[3];
        Data menor = new Data();
        Data maior = new Data();
        int d, m, a;

        for (int i = 0; i < 3; i++) {
            System.out.println("\n*************************");
            System.out.printf("Digite a %dª data\n", (i + 1));
            System.out.print("Dia: ");
            d = input.nextInt();
            System.out.print("Mês: ");
            m = input.nextInt();
            System.out.print("Ano: ");
            a = input.nextInt();

            datas[i] = new Data(d, m, a);
        }

        menor = datas[0];
        maior = datas[0];
        for (int i = 0; i < 3; i++) {
            if (menor.anterior(datas[i].getDia(), datas[i].getMes(), datas[i].getAno()))
                menor = datas[i];
            if (menor.posterior(datas[i].getDia(), datas[i].getMes(), datas[i].getAno()))
                maior = datas[i];
        }

        System.out.println("\n*************************");
        System.out.printf("Menor data: %s\n", menor.toString());
        System.out.printf("Maior data: %s\n", maior.toString());

        input.close();
    }
}
