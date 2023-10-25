public class Principal1 {
    public static void main(String args[]) {

        Pessoa1 exemplo1 = new Pessoa1();
        Pessoa1 exemplo2 = new Pessoa1();
        exemplo1 = new Pessoa1("Grace Hopper", 9, 10, 1906);
        exemplo2 = new Pessoa1("Ada Lovelace", 10, 10, 1815);

        System.out.printf("Idade de Grace Hopper: %d\n", exemplo1.calcularIdade());
        System.out.printf("Idade de Ada Lovelace: %d\n", exemplo2.calcularIdade());
    }
}