package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class DistributoreBevande {
	

	private float credito;
	private HashMap<String, Float> bevande = new HashMap<>();	
	

	public DistributoreBevande() { 

		bevande.put("Fanta", 1.20f);
		bevande.put("Coca", 1.50f);
		bevande.put("Coca Zero", 2.00f);
		bevande.put("Sprite", 1.50f);
		bevande.put("Ace", 2.50f);
		credito=0;
	}

	public void elencoBevande() {

		for (String n : bevande.keySet())
			System.out.println(n + " " + bevande.get(n) + "€");
	}

	public void inserisciMoneta(Float moneta) {

		if (moneta == 0.20 || moneta == 0.50 || moneta == 1.00 || moneta == 2.00)
			credito += moneta;
	}

	public void visualizzaCredito() {
		System.out.println("credito: " + credito + "€");

	}

	public void erogaBevanda(String nomeBevanda) {
		if (bevande.containsKey(nomeBevanda)) {
			if (credito >= bevande.get(nomeBevanda)) {
				credito -= bevande.get(nomeBevanda);
				System.out.println("la tua bevanda:");
				System.out.println("il tuo resto: "+String.format("%.2f€", credito));
				credito=0;
			} else
				System.out.println("credito non sufficente");
		} else
			System.out.println("prodotto non disponibile");
		
	}
}
