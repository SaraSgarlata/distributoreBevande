package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class DistributoreBevande {
	Scanner sc = new Scanner (System.in);
	
	 float credito =0;
	 	
	
		
	HashMap <String, Float> bevanda = new HashMap<>() {{
	
	put("Fanta:\t", 1.50f);
	put("Coca:\t", 1.50f);
	put("Coca Zero:", 2.00f);
	put("Sprite:\t", 1.50f);
	put("Ace:\t", 2.50f);

	}};

			
	public void elencoBevande () {
		
		for (String n:bevanda.keySet())	
			System.out.println(n + " " + bevanda.get(n) + "€");
			}
	
	public void inserisciMoneta (Float moneta) {
	
		if (moneta==0.50f)
			credito+=0.50;
		else if (moneta==1.00f)
			credito+=1.00;
		else if (moneta==2.00f)
			credito+=2.00;					
	}
	
	public void visualizzaCredito () {
		System.out.println("Il credito inserito è :"+ credito + "€\n");
		
	}
	public void erogaBevanda (String bevandaScelta1) {
		if(bevanda.containsKey(bevandaScelta1))
			
		if (credito>=bevanda.get(bevandaScelta1)){
				
				credito-=bevanda.get(bevandaScelta1);
		
		System.out.println("la tua bevanda è stata erogata");
		
			}
			
			else System.out.println("credito non sufficiente");
			else System.out.println("prodotto non disponibile");
		
	}
}
