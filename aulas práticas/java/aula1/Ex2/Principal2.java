public class Principal2 {
    public static void main(String args[]) {

        Pessoa2 grupo[] = new Pessoa2[2];

        for (int i = 0; i < 2; i++) {
            grupo[i] = new Pessoa2();
        }

        grupo[0] = new Pessoa2("Grace Hopper", 9, 10, 1906);
        grupo[1] = new Pessoa2("Ada Lovelace", 10, 10, 1815);

        for (int i = 0; i < 2; i++) {
            System.out.printf("Idade de %s: %d\n", grupo[i].getNome(), grupo[i].calcularIdade());
        }

    }
}