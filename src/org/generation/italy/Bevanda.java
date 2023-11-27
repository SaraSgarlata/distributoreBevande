package org.generation.italy;

public class Bevanda {
/*Versione 2:

Aggiungere una classe Bevanda con i seguenti attributi:

codice (Integer)
nome (String)
prezzo (float)
quantit‡Disponibile (int)
Scrivere per la classe Bevanda un costruttore parametrico con i parametri: codice, nome, prezzo. 
La quantit‡Disponibile sar‡ sempre 5 per tutte le nuove bevande.

Gli attributi di Bevanda sono tutti public (per il momento).

I metodi della classe Bevanda sono:

eroga():   decrementa la quantit‡ disponibile di 1
carica(int quantit‡): incrementa la quantit‡ disponibile del valore quantit‡
Nella classe distributore modificare l'hashmap bevande in un HashMap<Integer, Bevande>  (chiave: codice della bevanda; valore: tutto l'oggetto bevanda), e modificare la classe Distributore di conseguenza, gestendo anche la quantit‡ disponibile*/
	
	
	Integer codice;
	String nome;
	Float prezzo;
	int quantit‡Disponibile;
	public Bevanda(Integer codice, String nome, Float prezzo) {
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
		quantit‡Disponibile=5;
	}
	
	public void eroga()
	{
		if (quantit‡Disponibile>0)
			quantit‡Disponibile-=1;
	}
	
	public void carica(int quantit‡)
	{
		quantit‡Disponibile+=quantit‡;
	}
}
