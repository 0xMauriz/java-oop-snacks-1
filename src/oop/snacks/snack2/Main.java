package oop.snacks.snack2;

public class Main {

    public static void main(String[] args) {

        ContoBancario giovanniBusta = new ContoBancario(000000123456);
        ContoBancario marcoPrustola = new ContoBancario(000000234567);

        System.out.println(giovanniBusta.depositInAccount());
        System.out.println(giovanniBusta.withdrawFromAccount());
        System.out.println(giovanniBusta.getSaldoConto());

        System.out.println(marcoPrustola.depositInAccount());
        System.out.println(marcoPrustola.withdrawFromAccount());
        System.out.println(marcoPrustola.getSaldoConto());

    }

}
