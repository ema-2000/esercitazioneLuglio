package com.example.articolomodule.service;

import com.example.articolomodule.entity.Articolo;
import com.example.articolomodule.entity.articoloDto.ArticoloDto;

import java.util.List;

public interface ArticoloService {


    ArticoloDto findById(Long id);

    List<ArticoloDto> findAll();

    List<Articolo> findAllArticoli();

    void save(Articolo articolo);

    void deleteById(Long id);

    String getTitoloArticoloById(Long id);
}
