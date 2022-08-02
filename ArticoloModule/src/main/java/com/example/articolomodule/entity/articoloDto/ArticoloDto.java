package com.example.articolomodule.entity.articoloDto;

import lombok.Data;
import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;

@Data
@Log
public class ArticoloDto {

    private String titoloArticolo;

    private List<String> recensioni=new ArrayList<>();

    public ArticoloDto(){
    }

    public ArticoloDto(String stringa){
        titoloArticolo=stringa;
    }

}
