package modello;

import java.util.Date;

public class Noleggio {
    private Utente utente;
    private Veicolo veicolo;
    private Date orarioInizio;
    private Date orarioFine;

    public Noleggio(Utente utente, Veicolo veicolo, Date orarioInizio, Date orarioFine) {
        this.utente = utente;
        this.veicolo = veicolo;
        this.orarioInizio = orarioInizio;
        this.orarioFine = orarioFine;
    }
}
