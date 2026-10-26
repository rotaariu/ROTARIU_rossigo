package modello;

import it.kamaladafrica.codicefiscale.CodiceFiscale;

public class Utente {
    private int id;
    private String nome;
    private String email;
    private CodiceFiscale codiceFiscale;
    private double credito; // in €

    public Utente(int id, String nome, String email, CodiceFiscale codiceFiscale, double credito) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.codiceFiscale = codiceFiscale;
        this.credito = credito;
    }
}
