package org.generation.italy;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		/*Modificare la classe Main facendo in modo che venga visualizzato un menu di scelta con queste opzioni:

			1) Inserisci moneta
			2) Scegli bevanda
			3) Carica bevanda
			4) Esci
			
			Ogni volta che si visualizza il menu bisogna visualizzare l'elenco delle bevande disponibili (per ogni bevanda visualizzare: codice, nome, prezzo).
			La voce 3 (carica bevanda) è accessibile solo inserendo la password "12345"*/
		
		Scanner sc = new Scanner (System.in);
		Float moneta;
		int codiceBevanda;
		String risposta;
		DistributoreBevande distributore = new DistributoreBevande();
		
		do {

			System.out.println("Quale bevanda desideri? ecco le disponibilità \n");
			distributore.elencoBevande();

			do {
				System.out.println("\nPuoi inserire monete da: 0.50/1.00/2.00 €");
				moneta = Float.parseFloat(sc.nextLine());
				distributore.inserisciMoneta(moneta);
				distributore.visualizzaCredito();
				System.out.println("vuoi inserire altre monete?");
				risposta = sc.nextLine();
			} while (risposta.equals("si"));

			System.out.println("scegli numero bevanda");
			codiceBevanda = Integer.parseInt(sc.nextLine());
			distributore.erogaBevanda(codiceBevanda);
			System.out.println("il tuo credito ora: ");
			distributore.visualizzaCredito();
			System.out.println("vuoi altro?");
			risposta = sc.nextLine();
		} while (risposta.equals("si"));
		
		
		System.out.println("Arrivederci");
	}

}
