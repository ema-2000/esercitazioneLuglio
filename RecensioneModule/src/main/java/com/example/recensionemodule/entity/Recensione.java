package com.example.recensionemodule.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.extern.java.Log;

@Entity
@Table(name = "Recensione")
@Data
@Log
public class Recensione {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable = false)
    private Long idRecensione;

    @Column
    private String titoloRecensione;

    @Column
    private String descrizioneRecensione;

    @Column
    private Long idArticolo;

    public String getTitoloRecensione() {
        return titoloRecensione;
    }

    public void setTitoloRecensione(String titoloRecensione) {
        this.titoloRecensione = titoloRecensione;
    }

    public String getDescrizioneRecensione() {
        return descrizioneRecensione;
    }

    public void setDescrizioneRecensione(String descrizioneRecensione) {
        this.descrizioneRecensione = descrizioneRecensione;
    }

    public Long getIdArticolo() {
        return idArticolo;
    }

    public void setIdArticolo(Long idArticolo) {
        this.idArticolo = idArticolo;
    }

}