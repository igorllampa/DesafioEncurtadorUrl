package com.igorllampa.desafio.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.igorllampa.desafio.domain.model.Url;
import com.igorllampa.desafio.domain.repository.UrlRepository;
import com.igorllampa.desafio.domain.service.CadastroUrlService;

@RestController
@RequestMapping("encurtador")
public class UrlController {

	@Autowired
	private UrlRepository urlRepository;
	
	@Autowired
	private CadastroUrlService cadastroUrlService;
	
	@GetMapping("/listar")
	public List<Url> listar(){
		return urlRepository.findAll();
	}
	
	@GetMapping("/listar/{idUsuario}")
	public List<Url> listarUrlUsuario(@PathVariable String idUsuario){		
		return urlRepository.findByIdUsuario(idUsuario);
	}

	@GetMapping("/{urlEncurtada}")
	public List<Url> listarUrlDetalhada(@PathVariable String urlEncurtada){		
		return urlRepository.findByUrlEncurtada(urlEncurtada);
	}
	
	@RequestMapping(value = "/gerador", method = RequestMethod.POST,
    produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)	
	public @ResponseBody Url gerarUrl(@RequestBody Url url) {							
		return cadastroUrlService.salvar(url);		
	}
		
}
