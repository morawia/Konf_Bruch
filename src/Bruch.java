public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        // TODO: Setzen Sie die Attribute entsprechend
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {

        return numerator;
    }

    public int getDenominator() {

        return denominator;
    }

    public double toDecimal() {
        // TODO: Die Methode soll den Dezimalwert zum Bruch retournieren
        // Achtung: Ganzzahldivision!
        if (getDenominator() != 0) {
            return (double)getNumerator()/(double) getDenominator();
        }
        return 0;
    }

    public String print() {
        // TODO: Die Methode soll den Bruch als Text retournieren z.B.: "5 / 7"
        return getNumerator() + " / " + getDenominator();
    }

    public Bruch multiplicate(Bruch b2) {
        /* TODO:
        *  Erstellen Sie für das Ergebnis eine neue Bruch-Variable
        *   => Übergeben Sie im Konstruktur für numerator den
        *       eigenen numerator multipliziert mit b2.getNumerator()
        *   => Selbige auch für denominator
        *  Retournieren Sie ihre neue Bruch-Variable
        * */
        Bruch bruchOne = new Bruch(getNumerator()* b2.getNumerator(), getDenominator()* b2.getDenominator());

        return bruchOne;
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        // TODO: Multiplizieren Sie den eigenen Bruch mit b2 und b3
        Bruch bruchTwo = new Bruch(getNumerator()* b2.getNumerator() * b3.getNumerator(), getDenominator()* b2.getDenominator() * b3.getDenominator());
        return bruchTwo;
    }
}
