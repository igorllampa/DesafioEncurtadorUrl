package com.igorllampa.desafio.api;

import java.math.BigInteger;
import java.util.Random;

public class Util {

	public Long numeroRandomico() {					
		return Long.valueOf( new Random().nextInt(9999));		
	}
}
