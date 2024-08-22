package entities;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Concerto extends Evento {
    private String genere;
    private boolean inStreaming;

    public Concerto() {
    }

    public Concerto(Date dataEvento, String descrizione, String luogo, Long numeroMassimoPartecipanti, String titolo,
                    String genere, boolean inStreaming) {
        super(dataEvento, descrizione, luogo, numeroMassimoPartecipanti, titolo);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }
}
