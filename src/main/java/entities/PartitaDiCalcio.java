package entities;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class PartitaDiCalcio extends Evento {
    private String squadraDiCasa;
    private String squadraOspite;
    private String squadraVincente;
    private int numeroGolCasa;
    private int numeroGolTrasferta;

    public PartitaDiCalcio() {
    }

    public PartitaDiCalcio(Date dataEvento, String descrizione, String luogo, Long numeroMassimoPartecipanti, String titolo,
                           String squadraDiCasa, String squadraOspite, String squadraVincente,
                           int numeroGolCasa, int numeroGolTrasferta) {
        super(dataEvento, descrizione, luogo, numeroMassimoPartecipanti, titolo);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.numeroGolCasa = numeroGolCasa;
        this.numeroGolTrasferta = numeroGolTrasferta;
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getNumeroGolCasa() {
        return numeroGolCasa;
    }

    public void setNumeroGolCasa(int numeroGolCasa) {
        this.numeroGolCasa = numeroGolCasa;
    }

    public int getNumeroGolTrasferta() {
        return numeroGolTrasferta;
    }

    public void setNumeroGolTrasferta(int numeroGolTrasferta) {
        this.numeroGolTrasferta = numeroGolTrasferta;
    }
}
