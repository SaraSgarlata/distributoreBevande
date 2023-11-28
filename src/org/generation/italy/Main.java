package org.generation.italy;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
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
