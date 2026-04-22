package oop.snacks.snack1And3;

public class Studenti {

    private String nome;
    private String cognome;
    private int eta;

    public Studenti(String nome, String cognome, int eta) {

        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;

    }

    public String getInfoStudente() {
        return String.format("%s %s, %d", this.nome, this.cognome, this.eta);
    }

    public String getAllInfo() {
        return this.nome + " " + this.cognome + ", " + this.eta + " anni";
    }

}
