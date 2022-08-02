package com.example.articolomodule.service;

import com.example.articolomodule.converterDto.ConverterDto;
import com.example.articolomodule.entity.Articolo;
import com.example.articolomodule.entity.articoloDto.ArticoloDto;
import com.example.articolomodule.repository.ArticoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticoloServiceImpl implements ArticoloService{

    @Autowired
    ArticoloRepository articoloRepository;

    @Autowired
    ConverterDto converterDto;

    @Override
    public ArticoloDto findById(Long id){
        return converterDto.convertiArticolo(articoloRepository.getReferenceById(id));
    }

    @Override
    public List<ArticoloDto> findAll(){
        return converterDto.convertiLista(articoloRepository.findAll());
    }

    @Override
    public List<Articolo> findAllArticoli(){return articoloRepository.findAll();}

    @Override
    public void save(Articolo articolo){
        articoloRepository.save(articolo);
    }

    @Override
    public void deleteById(Long id){
        articoloRepository.deleteById(id);
    }

    @Override
    public String getTitoloArticoloById(Long id){
        return articoloRepository.getTitoloArticoloById(id);
    }

}
