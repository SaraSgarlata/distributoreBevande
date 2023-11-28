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
		int codiceBevanda, quantita;
		String risposta, password;
		DistributoreBevande distributore = new DistributoreBevande();
		
		do {
			System.out.println("\n\n\n\n\n\n");
			// System.out.println("Quale bevanda desideri? ecco le disponibilità \n");
			distributore.elencoBevande();
			distributore.visualizzaCredito();
			
			System.out.println("1 - inserisci moneta");
			System.out.println("2 - scegli bevanda");
			System.out.println("3 - carica bevanda");
			System.out.println("4 - esci");
			
			System.out.println("scegli le opzioni da 1 a 4");
			risposta=sc.nextLine();
			
			if(risposta.equals("1")) {
				System.out.println("\nPuoi inserire monete da: 0.50/1.00/2.00 €");
				moneta = Float.parseFloat(sc.nextLine());
				distributore.inserisciMoneta(moneta);
			}else if (risposta.equals("2")) {
				
				System.out.println("scegli numero bevanda");
				codiceBevanda = Integer.parseInt(sc.nextLine());
				distributore.erogaBevanda(codiceBevanda);
			} else if (risposta.equals("3")) {
				System.out.println("inserisci password");
				password=sc.nextLine();
				if(password.equals("12345")) {
					
					System.out.println("quale bevanda vuoi caricare?");
					codiceBevanda = Integer.parseInt(sc.nextLine());
					System.out.println("quanta ne vuoi caricare");
					quantita= Integer.parseInt(sc.nextLine());
					distributore.caricaBevanda(codiceBevanda, quantita);
				
				}else 
					System.out.println("password errata");
				
			}
				
			
				
		} while (!risposta.equals("4"));
		
		
		System.out.println("Arrivederci");
	}

}
