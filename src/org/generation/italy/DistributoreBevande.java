package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class DistributoreBevande {
	Scanner sc = new Scanner (System.in);
	private String bevanda;
	private Float credito;
	
	
	public void elencoBevande () {
		
	HashMap <String, Float> bevanda = new HashMap<>();
	
	bevanda.put("Fanta:\t", 1.50f);
	bevanda.put("Coca:\t", 1.50f);
	bevanda.put("Coca Zero:", 2.00f);
	bevanda.put("Sprite:\t", 1.50f);
	bevanda.put("Ace:\t", 2.50f);
	for (String n:bevanda.keySet())
		
	System.out.println(n + " " + bevanda.get(n) + "€");
	}
		
		
	
	public void inserisciMoneta (Float moneta) {
	
		if (moneta==0.50f)
			credito+=0.50f;
		else if (moneta==1.00f)
			credito+=1.00f;
		else if (moneta==2.00f)
			credito+=2.00f;
		
				
	}
	
	public void erogaBevanda () {
		
	}
}
