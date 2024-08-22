package entities;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class GaraDiAtletica extends Evento {
    private int setAtleti;
    private int vincitoreId;

    public GaraDiAtletica() {
    }

    public GaraDiAtletica(Date dataEvento, String descrizione, String luogo, Long numeroMassimoPartecipanti, String titolo,
                          int setAtleti, int vincitoreId) {
        super(dataEvento, descrizione, luogo, numeroMassimoPartecipanti, titolo);
        this.setAtleti = setAtleti;
        this.vincitoreId = vincitoreId;
    }

    public int getSetAtleti() {
        return setAtleti;
    }

    public void setSetAtleti(int setAtleti) {
        this.setAtleti = setAtleti;
    }

    public int getVincitoreId() {
        return vincitoreId;
    }

    public void setVincitoreId(int vincitoreId) {
        this.vincitoreId = vincitoreId;
    }
}
