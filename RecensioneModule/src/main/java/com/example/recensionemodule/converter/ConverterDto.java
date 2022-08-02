package com.example.recensionemodule.converter;

import com.example.recensionemodule.entity.Recensione;
import com.example.recensionemodule.entity.entityDto.RecensioneDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ConverterDto {

    public List<RecensioneDto> convertiLista(List<Recensione> recensioniList){

        List<RecensioneDto> recensioneDtoList=new ArrayList<>();
        for(Recensione r:recensioniList){
            RecensioneDto rDto=new RecensioneDto();
            rDto.setDescrizione(r.getDescrizioneRecensione());
            rDto.setTitolo(r.getTitoloRecensione());
            recensioneDtoList.add(rDto);
        }
        return recensioneDtoList;
    }

    public RecensioneDto convertiRecensione(Recensione recensione){

        RecensioneDto recensioneDto=new RecensioneDto();
        recensioneDto.setTitolo(recensione.getTitoloRecensione());
        recensioneDto.setDescrizione(recensione.getDescrizioneRecensione());
        return recensioneDto;
    }
}
