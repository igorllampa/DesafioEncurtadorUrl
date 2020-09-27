package com.igorllampa.desafio.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorllampa.desafio.domain.model.Url;

public interface UrlRepository extends JpaRepository<Url, Long> {
	
	List<Url> findByIdUsuario(String idUsuario);
	List<Url> findByUrlEncurtada(String urlEncurtada);
}
