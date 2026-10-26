package modello;

public class Monopattino extends Veicolo {
    public int velocitaMassima;

    public Monopattino(String codice, int batteria, int velocitaMassima) {
        super(codice, batteria);
        this.velocitaMassima = velocitaMassima;
    }
    @Override
    public double calcolaCosto(int minuti) {
        return minuti * 0.25;
    }
    @Override
    public double consumoBatteriaPerMinuto() {
        return 1.50;
    }
}
