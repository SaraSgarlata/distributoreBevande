package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		Float moneta;
		
		DistributoreBevande distributore = new DistributoreBevande();
				
		System.out.println("Quale bevanda desideri? ecco le disponibilità \n");
		distributore.elencoBevande();
		
		System.out.println("\nPuoi inserire monete da: 0.50/1.00/2.00 €");
		moneta=Float.parseFloat(sc.nextLine());
		distributore.inserisciMoneta(moneta);
		
		
		
	}

}
