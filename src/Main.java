package questao1;

public class Main {
    public static void main(String[] args) {

    Pix pix = new Pix("15:25",525,340.00,true);

    CartaoCredito cc = new CartaoCredito("18:52", 526, 859.00,"****5844","Mastercard", "Fernanda");

    CartaoDebito cd = new CartaoDebito("00:01", 527, 150.25, "****6584", "Rafael");

    System.out.println(pix.imprimirCupomFiscal());
    System.out.println(cc.imprimirCupomFiscal());
    System.out.println(cd.imprimirCupomFiscal());
    }
}
