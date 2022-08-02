package com.example.articolomodule.recensioneClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value ="recensione", url="http://localhost:8081/api/recensione/")
public interface RecensioneClient {

    @GetMapping(value = "ottieniDescrizioni")
    public List<String> ottieniDescrizioni(@RequestParam Long id);
}
