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
	
	
	private Integer codice;
	private String nome;
	private Float prezzo;
	private int quantitąDisponibile;
	
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
		if (quantitą>0 && quantitą<50-quantitąDisponibile)
		quantitąDisponibile+=quantitą;
	}

	public Integer getCodice() {
		return codice;
	}

	public void setCodice(Integer codice) {
		if (codice>0 && codice<6)
			this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (!nome.isEmpty())
			this.nome = nome;
	}

	public Float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Float prezzo) {
		if (prezzo>0)
			this.prezzo = prezzo;
	}

	public int getQuantitąDisponibile() {
		return quantitąDisponibile;
	}

	public void setQuantitąDisponibile(int quantitąDisponibile) {
		if (quantitąDisponibile>0 && quantitąDisponibile<50)
			this.quantitąDisponibile = quantitąDisponibile;
	}
	
	public int zuccheroBevanda() {
		int zucchero=0;
		switch(codice) 
		{
			case 1:		//fanta
				zucchero= 100;
				break;
			case 2:		//coca cola
				zucchero= 1500;
				break;
			case 3:		//coca zero
				zucchero= 15;
				break;
			case 4:		//sprite
				zucchero= 80;
				break;
			case 5:		//ACE
				zucchero= 200;
				break;
		}
		return zucchero;
	}
	
	
}
