public class Principal {
    public static void main(String args[]) {
        ingressoNormal N = new ingressoNormal((float) 112.50);
        ingressoVip V = new ingressoVip((float) 112.50, (float) 50);
        ingressoCamarote C = new ingressoCamarote((float) 112.50, (float) 50, (float) 25.99);

        N.imprimir();
        V.imprimir();
        C.imprimir();
    }
}
