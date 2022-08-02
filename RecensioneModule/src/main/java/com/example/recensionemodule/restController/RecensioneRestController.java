package com.example.recensionemodule.restController;

import com.example.recensionemodule.articoloClient.ArticoloClient;
import com.example.recensionemodule.entity.Recensione;
import com.example.recensionemodule.entity.entityDto.RecensioneDto;
import com.example.recensionemodule.service.RecensioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/recensione/")
public class RecensioneRestController {

    @Autowired
    RecensioneService recensioneService;

    @Autowired
    ArticoloClient articoloClient;

    @GetMapping(value="ottieniRecensione")
    public RecensioneDto ottieniRecensione(@RequestParam Long id) {
        if(id!=0) {
            RecensioneDto rDto=recensioneService.findById(id);
            rDto.setTitoloArticolo(articoloClient.getTitoloArticolo(recensioneService.getReferenceById(id).getIdArticolo()));
            return rDto;
        }
        return new RecensioneDto("Non esiste", "nessuna recensione con questo id");
    }

    @PostMapping(value="salvaRecensione")
    public void salvaRecensione(@RequestBody Recensione recensione){
            recensioneService.save(recensione);
        }

    @GetMapping(value = "ottieniLista")
    public List<RecensioneDto> ottieniLista(){
        return recensioneService.findAll();
    }


   @GetMapping(value="ottieniDescrizioni")
    public List<String> ottieniDescrizioni(@RequestParam Long id) {
        List<String> descrizioni=new ArrayList<>();
        List<RecensioneDto> recensioniDto;
        recensioniDto=recensioneService.findAllByIdArticolo(id);
        for(RecensioneDto r: recensioniDto){
            descrizioni.add(r.getDescrizione());
        }
        return descrizioni;
    }
}
