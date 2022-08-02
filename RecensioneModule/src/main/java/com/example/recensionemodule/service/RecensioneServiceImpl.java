package com.example.recensionemodule.service;


//import com.example.recensionemodule.converter.ConverterDto;
import com.example.recensionemodule.converter.ConverterDto;
import com.example.recensionemodule.entity.Recensione;
import com.example.recensionemodule.entity.entityDto.RecensioneDto;
import com.example.recensionemodule.repository.RecensioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RecensioneServiceImpl implements RecensioneService {

    @Autowired
    RecensioneRepository recensioneRepository;

   @Autowired
   ConverterDto converterDto;

    @Override
    public void save(Recensione recensione){recensioneRepository.save(recensione);}

    @Override
    public void delete(Long id) {
        recensioneRepository.deleteById(id);
    }

    @Override
    public RecensioneDto findById(Long id) {
        return converterDto.convertiRecensione(recensioneRepository.getReferenceById(id));
    }

    @Override
    public List<RecensioneDto> findAll(){
        return converterDto.convertiLista(recensioneRepository.findAll());
    }

    @Override
    public List<RecensioneDto> findAllByIdArticolo(Long id){
        return converterDto.convertiLista(recensioneRepository.findAllByIdArticolo(id));
    }

    @Override
    public Recensione getReferenceById(Long id){
        return recensioneRepository.getReferenceById(id);
    }
}