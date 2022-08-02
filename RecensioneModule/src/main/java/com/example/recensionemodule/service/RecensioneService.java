package com.example.recensionemodule.service;


import com.example.recensionemodule.articoloClient.ArticoloClient;
import com.example.recensionemodule.entity.Recensione;
import com.example.recensionemodule.entity.entityDto.RecensioneDto;

import java.util.List;

public interface RecensioneService {

    void delete(Long id);

    public RecensioneDto findById(Long id);

    public List<RecensioneDto> findAll();

    List<RecensioneDto> findAllByIdArticolo(Long id);

    void save(Recensione recensione);

    Recensione getReferenceById(Long id);
}
