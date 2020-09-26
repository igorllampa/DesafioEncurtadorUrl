package com.igorllampa.desafio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igorllampa.desafio.domain.model.Url;

public interface UrlRepository extends JpaRepository<Url, Long> {

}
