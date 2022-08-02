package com.example.articolomodule.converterDto;



import com.example.articolomodule.entity.Articolo;
import com.example.articolomodule.entity.articoloDto.ArticoloDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ConverterDto {

    public List<ArticoloDto> convertiLista(List<Articolo> recensioniList){

        List<ArticoloDto> recensioneDtoList=new ArrayList<>();
        for(Articolo r:recensioniList){
           ArticoloDto rDto=new ArticoloDto();
            rDto.setTitoloArticolo(r.getTitoloArticolo());
            recensioneDtoList.add(rDto);
        }
        return recensioneDtoList;
    }

    public ArticoloDto convertiArticolo(Articolo recensione){

        ArticoloDto recensioneDto=new ArticoloDto();
        recensioneDto.setTitoloArticolo(recensione.getTitoloArticolo());
        return recensioneDto;
    }
}
