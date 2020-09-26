package com.igorllampa.desafio.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igorllampa.desafio.domain.model.Url;
import com.igorllampa.desafio.domain.repository.UrlRepository;

@RestController
@RequestMapping("encurtador")
public class UrlController {

	@Autowired
	private UrlRepository urlRepository;
	
	@GetMapping("/listar")
	public List<Url> listar(){
		return urlRepository.findAll();
	}
	
}
