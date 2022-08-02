package com.example.articolomodule.restController;

import com.example.articolomodule.entity.Articolo;
import com.example.articolomodule.entity.articoloDto.ArticoloDto;
import com.example.articolomodule.recensioneClient.RecensioneClient;
import com.example.articolomodule.service.ArticoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/articolo/")
public class ArticoloRestController {

    @Autowired
    ArticoloService articoloService;

    @Autowired
    RecensioneClient recensioneClient;

    @GetMapping(value="ottieniArticolo")
    public ArticoloDto ottieniRecensione(@RequestParam Long id) {
        if(id!=0) {
            return articoloService.findById(id);
        }
        return new ArticoloDto("Non esiste");
    }

    @GetMapping(value = "ottieniArticoloRecensito")
    public ArticoloDto ottieniArticoloRecensito(@RequestParam Long id){
            ArticoloDto articoloDto=articoloService.findById(id);
            List<String> recensioni;
            recensioni=recensioneClient.ottieniDescrizioni(id);
            if(recensioni!=null)
                articoloDto.setRecensioni(recensioni);
            else {
                recensioni.add("Non esistono recensioni per questo articolo");
                articoloDto.setRecensioni(recensioni);
            }
            return articoloDto;
    }

    @GetMapping(value = "ottieniArticoliRecensiti")
    public List<ArticoloDto> ottieniArticoliRecensiti(){
        List<ArticoloDto> articoliDto=articoloService.findAll();
        List<String> recensioni;
        List<Articolo> articoli=articoloService.findAllArticoli();
        int i=0;
        for(Articolo a:articoli){
            recensioni=recensioneClient.ottieniDescrizioni(a.getArticolo());
            articoliDto.get(i).setRecensioni(recensioni);
            ++i;
        }
        return articoliDto;
    }

    @PostMapping(value = "creaArticolo")
    public void creaArticolo(@RequestBody Articolo articolo){
        articoloService.save(articolo);
    }

    @DeleteMapping(value = "cancellaArticolo")
    public String deleteArticolo(@RequestParam Long id){
        if(id!=null && articoloService.findById(id)!=null){
            articoloService.deleteById(id);
            return "eliminato";
        }
        return "non eliminato";
    }

    @GetMapping(value = "getTitoloArticolo")
    public String getTitoloArticolo(Long idArticolo){
            return articoloService.getTitoloArticoloById(idArticolo);
    }
}
