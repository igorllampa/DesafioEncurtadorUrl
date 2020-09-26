package com.igorllampa.desafio.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@PostMapping("/{idUsuario}/{urlOriginal}")
	@ResponseStatus(HttpStatus.CREATED)	
	public String gerarUrl(@PathVariable("idUsuario") String idUsuario, @PathVariable("urlOriginal") String urlOriginal) {
				
		cadastroUrlService.salvar(idUsuario, urlOriginal);
		
		String retorno = idUsuario +" - " +urlOriginal;
		return retorno;
	}
	
}
