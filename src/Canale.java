public class Canale {
    private int numero;
    private String nome;
    private String frequenza;
    private int potenzaRilevata;

    public Canale(int numero, String nome, String frequenza, int potenzaRilevata) {
        this.numero = numero;
        this.nome = nome;
        this.frequenza = frequenza;
        this.potenzaRilevata = potenzaRilevata;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getFrequenza() {
        return frequenza;
    }

    public int getPotenzaRilevata() {
        return potenzaRilevata;
    }

    @Override
    public String toString() {
        return "Canale " + numero + ": " + nome + " (Frequenza: " + frequenza + ", Potenza: " + potenzaRilevata + ")";
    }
}
