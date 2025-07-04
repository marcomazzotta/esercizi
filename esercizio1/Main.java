package esercizio1;

public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Mario", "Rossi", 2004);
        Studente studente2 = new Studente("Anna", "Bianchi", 2005);

        studente1.stampaScheda();
        studente2.stampaScheda();
    }
}

