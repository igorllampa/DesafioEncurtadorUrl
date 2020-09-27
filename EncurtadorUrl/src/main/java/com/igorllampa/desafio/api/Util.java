package com.igorllampa.desafio.api;

import java.math.BigInteger;
import java.util.Random;

public class Util {

	public Long numeroRandomico() {					
		return Long.valueOf( new Random().nextInt(9999));		
	}
	
	public String geraUrlEncurtada() {		
		Random quantidadedeletras = new Random();        
        String letras = "aBcDEfGHiJKLmNOpQRStUvYWxZ";
        String randomString = "";
        int index = -1;
        for (int i = 0; i <= 7; i++) {
            index = quantidadedeletras.nextInt(letras.length());
            randomString += letras.substring(index, index + 1);
            System.out.println(randomString);
        }
        return randomString;
	}
}
