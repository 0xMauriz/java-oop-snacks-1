package oop.snacks.snack1And3;

public class RegistroStudenti {

    private Studenti[] registro;

    public RegistroStudenti() {

        this.registro = new Studenti[0];

    }

    public Studenti[] getRegistro() {

        return this.registro;

    }

    public void setRegistro(Studenti[] registro) {

        this.registro = registro;

    }

    public void addStudente(Studenti studente) {

        Studenti[] registroAggiornato = new Studenti[this.registro.length + 1];

        for (int i = 0; i < this.registro.length; i++) {
            registroAggiornato[i] = this.registro[i];
        }

        registroAggiornato[registroAggiornato.length - 1] = studente;

        this.registro = registroAggiornato;

    }

    @Override
    public String toString() {
        String outputString = "La classe è composta da: ";
        for (Studenti studente : this.registro) {
            outputString += String.format("%s", studente.getInfoStudente());
        }
        return outputString;
    }

}
