import java.util.Scanner;

public class Principal5 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        Estudante turma[] = new Estudante[5];
        String nome;
        float notaFinal, media;
        
        media = 0;
        for (int i = 0; i < 5; i++) {

            System.out.printf("Informe o nome do estudante: ");
            nome = input.next();

            System.out.printf("Informe a nota final do estudante: ");
            notaFinal = input.nextFloat();

            turma[i] = new Estudante();
            turma[i].setNome(nome);
            turma[i].setNotaFinal(notaFinal);

            media += notaFinal/5;
        }

        System.out.printf("Média da turma: %f\n\n", media);
        for (int i = 0; i < 5; i++) {

            System.out.printf("%s", turma[i].toString());
            System.out.printf("Situação: ");
            if (turma[i].getNotaFinal() < 40) {
                System.out.printf("Reprovado\n\n");
            }
            else if ((40 <= turma[i].getNotaFinal()) && (turma[i].getNotaFinal() < 69)) {
                System.out.printf("Exame Final\n\n");
            }
            else {
                System.out.printf("Aprovado\n\n");
            }
        }

        input.close();
    }
}