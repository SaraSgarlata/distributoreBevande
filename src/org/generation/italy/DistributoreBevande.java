package org.generation.italy;

import java.util.HashMap;


public class DistributoreBevande {
	

	private float credito;
	private HashMap<Integer, Bevanda> bevande = new HashMap<>();	
	

	public DistributoreBevande() { 

		bevande.put(1, new Bevanda(1, "Fanta", 1.50f));
		bevande.put(2, new Bevanda(2,"Coca", 1.50f));
		bevande.put(3, new Bevanda(3,"Coca Zero", 2.00f));
		bevande.put(4, new Bevanda(4,"Sprite", 1.50f));
		bevande.put(5, new Bevanda(5,"Ace", 2.50f));
		credito=0;
	}

	public void elencoBevande() {

		for (Integer n : bevande.keySet())
			System.out.println(n + " " + bevande.get(n).nome + " " +  bevande.get(n).prezzo + "�");
	}

	public void inserisciMoneta(Float moneta) {

		if (moneta == 0.20 || moneta == 0.50 || moneta == 1.00 || moneta == 2.00)
			credito += moneta;
	}

	public void visualizzaCredito() {
		System.out.println("credito: " + credito + "�");

	}

	public void erogaBevanda(Integer codiceBevanda) {
		if (bevande.containsKey(codiceBevanda)) {
			if (bevande.get(codiceBevanda).quantit�Disponibile > 0) {
				if (credito >= bevande.get(codiceBevanda).prezzo) {
					credito -= bevande.get(codiceBevanda).prezzo;
					System.out.println("la tua bevanda: " + bevande.get(codiceBevanda).nome);
					System.out.println("il tuo resto: " + String.format("%.2f�", credito));
					credito = 0;
					bevande.get(codiceBevanda).eroga();
				} else
					System.out.println("credito non sufficente");
			} else
				System.out.println("prodotto esaurito");
		} else
			System.out.println("prodotto non disponibile");
	}
}
