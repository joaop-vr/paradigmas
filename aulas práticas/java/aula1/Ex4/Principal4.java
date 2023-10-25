public class Principal4 {
    public static void main(String args[]) {

        Pessoa4 grupo[] = new Pessoa4[2];

        for (int i = 0; i < 2; i++) {
            grupo[i] = new Pessoa4();
        }

        grupo[0] = new Pessoa4("Grace Hopper", 9, 10, 1906);
        grupo[1] = new Pessoa4("Ada Lovelace", 10, 10, 1815);

        for (int i = 0; i < 2; i++) {
            System.out.printf("Idade de %s: %d ", grupo[i].getNome(), grupo[i].getIdade());
            grupo[i].imprimirData();
        }

    }
}