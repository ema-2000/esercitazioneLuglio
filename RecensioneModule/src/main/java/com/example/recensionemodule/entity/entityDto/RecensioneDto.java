package com.example.recensionemodule.entity.entityDto;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class RecensioneDto {
    public RecensioneDto(String string, String string2) {
        this.titolo=string;
        this.descrizione=string2;
    }
    public RecensioneDto() {}
    private String titolo;
    private String descrizione;

    private String titoloArticolo;
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


}
