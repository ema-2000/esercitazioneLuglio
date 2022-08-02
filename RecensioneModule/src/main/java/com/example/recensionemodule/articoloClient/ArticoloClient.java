package com.example.recensionemodule.articoloClient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="articolo", url="http://localhost:8082/api/articolo/")
public interface ArticoloClient {

	@GetMapping(value="getArticolo")
	public Long getArticolo(@RequestParam Long idArticolo);

	@GetMapping(value="getTitoloArticolo")
	public String getTitoloArticolo(@RequestParam Long idArticolo);

}
