package modello;

public abstract class Veicolo {
    private String codice;
    private int batteria; // in %
    private StatoVeicolo stato;
    public Veicolo(String codice, int batteria) {
        this.codice = codice;
        this.batteria = batteria;
        this.stato = StatoVeicolo.LIBERO;
    }
    public abstract double calcolaCosto(int minuti);
    public abstract double consumoBatteriaPerMinuto();

    public String getCodice() { return codice; }
    public int getBatteria() { return batteria; }
    public void setBatteria(int batteria) { this.batteria = batteria; }
    public StatoVeicolo getStato() { return stato; }
    public void setStato(StatoVeicolo stato) { this.stato = stato; }
}
