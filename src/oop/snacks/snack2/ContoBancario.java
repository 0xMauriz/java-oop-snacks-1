package oop.snacks.snack2;

import java.util.Scanner;

public class ContoBancario {

    private long numeroConto;
    private long saldoConto;

    public ContoBancario(long numeroConto) {

        this.numeroConto = numeroConto;
        this.saldoConto = 0;

    }

    public String depositInAccount() {

        long depositAmount;

        Scanner input = new Scanner(System.in);

        System.out.println("Quanto vuoi depositare?: ");

        depositAmount = input.nextLong();

        this.saldoConto += depositAmount;

        return "Hai depositato: " + depositAmount + "$";

    }

    public String withdrawFromAccount() {

        long withdrawAmount;

        Scanner input = new Scanner(System.in);

        System.out.println("Quanto vuoi prelevare?: ");

        withdrawAmount = input.nextLong();

        this.saldoConto -= withdrawAmount;

        return "Hai prelevato: " + withdrawAmount + "$";

    }

    public String getSaldoConto() {

        return "Ecco il saldo del tuo conto: " + this.saldoConto;

    }

}
