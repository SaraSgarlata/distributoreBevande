package org.generation.italy;

public class Bevanda {
/*Versione 2:

Aggiungere una classe Bevanda con i seguenti attributi:

codice (Integer)
nome (String)
prezzo (float)
quantitąDisponibile (int)
Scrivere per la classe Bevanda un costruttore parametrico con i parametri: codice, nome, prezzo. 
La quantitąDisponibile sarą sempre 5 per tutte le nuove bevande.

Gli attributi di Bevanda sono tutti public (per il momento).

I metodi della classe Bevanda sono:

eroga():   decrementa la quantitą disponibile di 1
carica(int quantitą): incrementa la quantitą disponibile del valore quantitą
Nella classe distributore modificare l'hashmap bevande in un HashMap<Integer, Bevande>  (chiave: codice della bevanda; valore: tutto l'oggetto bevanda), e modificare la classe Distributore di conseguenza, gestendo anche la quantitą disponibile*/
	
	
	Integer codice;
	String nome;
	Float prezzo;
	int quantitąDisponibile;
	public Bevanda(Integer codice, String nome, Float prezzo) {
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
		quantitąDisponibile=5;
	}
	
	public void eroga()
	{
		if (quantitąDisponibile>0)
			quantitąDisponibile-=1;
	}
	
	public void carica(int quantitą)
	{
		quantitąDisponibile+=quantitą;
	}
}
