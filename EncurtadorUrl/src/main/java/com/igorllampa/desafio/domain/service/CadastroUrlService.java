package com.igorllampa.desafio.domain.service;

import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.igorllampa.desafio.api.Util;
import com.igorllampa.desafio.domain.model.Url;
import com.igorllampa.desafio.domain.repository.UrlRepository;

@Service
public class CadastroUrlService {

	@Autowired
	private UrlRepository urlRepository;
		
	private Util util;
	
	public Url salvar(String idUsuario, String urlOriginal) {
		
		Url url = new Url();
		url.setIdUsuario(idUsuario);
		url.setUrlOriginal(urlOriginal);		
		url.setUrlEncurtada("teste");		
		url.setDataCriacao(OffsetDateTime.now());		
		url.setStatusClicks(Long.valueOf("15"));
		
		return urlRepository.save(url);
	}
		
}
