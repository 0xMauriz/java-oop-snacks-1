package oop.snacks.snack1;

public class Main {

    public static void main(String[] args) {

        Studenti francoPaglia = new Studenti("Franco", "Paglia", 23);
        Studenti jhonnyFresco = new Studenti("Jhonny", "Fresco", 21);
        Studenti gigiSquaglio = new Studenti("Gigi", "Squaglio", 35);
        Studenti marcoPera = new Studenti("Marco", "Pera", 76);

        System.out.println(francoPaglia.getAllInfo());
        System.out.println(jhonnyFresco.getAllInfo());
        System.out.println(gigiSquaglio.getAllInfo());
        System.out.println(marcoPera.getAllInfo());

    }

}
