package oop.snacks.snack1And3;

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

        RegistroStudenti registroStudenti = new RegistroStudenti();

        System.out.println(registroStudenti);

        registroStudenti.addStudente(marcoPera);
        registroStudenti.addStudente(francoPaglia);

        System.out.println(registroStudenti.toString());

        registroStudenti.addStudente(gigiSquaglio);
        registroStudenti.addStudente(jhonnyFresco);

        System.out.println(registroStudenti.toString());

    }

}
