package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		float moneta;
		String risposta, bevandaScelta;
		
		DistributoreBevande distributore = new DistributoreBevande();
				
		System.out.println("Quale bevanda desideri? ecco le disponibilità \n");
		distributore.elencoBevande();//nome classe + nome metodo che stampa la lista e la scorre con for each
		
		do {
			
		System.out.println("\nPuoi inserire monete da: 0.50/1.00/2.00 €");
		moneta=Float.parseFloat(sc.nextLine());
		distributore.inserisciMoneta(moneta);//nome classe + nome metodo che calcola i soldi inseriti
		
		distributore.visualizzaCredito();//nome classe e metodo che visualizza il credito inserito
		
		System.out.println("Vuoi inserire un'altra moneta?");
		risposta=sc.nextLine();
		}
		while(risposta.equals("si"));
		
		do {
		System.out.println("Seleziona la bevanda desiderata: ");
		bevandaScelta=sc.nextLine().toLowerCase();
		
		System.out.println("Il tuo credito è: ");
		distributore.visualizzaCredito();//mi dice il credito iniziale, da cambiare errore
		
		System.out.println("Vuoi prendere un'altra bevanda?");
		risposta=sc.nextLine();
		}
		while(risposta.equals("si"));
		
		System.out.println("Il tuo resto è:");
		distributore.visualizzaCredito();//errore da cambiare
		System.out.println("Grazie e arrivederci");
		
		
	}

}
