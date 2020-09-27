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
	
	
	
	public Url salvar(Url url) {
			
		Util util = new Util();
				
		url.setUrlEncurtada(util.geraUrlEncurtada());		
		url.setDataCriacao(OffsetDateTime.now());		
		url.setStatusClicks(util.numeroRandomico());
						
		return urlRepository.save(url);
	}
		
}
