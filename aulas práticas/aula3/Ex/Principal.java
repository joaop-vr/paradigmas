public class Principal {
    public static void main(String argv[]) {

        funcionarioHorista FH = new funcionarioHorista("Zezinho", 20224165, 13, 2, 1998, false, 100, 30);
        funcionarioMensalista FM = new funcionarioMensalista("Marciazinha", 12548796, 22, 10, 1971, true, 4500);

        System.out.printf(FH.toString());
        System.out.printf("\nSalário: " + FH.calcularSalario());

        System.out.printf(FM.toString());
        System.out.printf("\nSalário: " + FM.calcularSalario());

    }
}
