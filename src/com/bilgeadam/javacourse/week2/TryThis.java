package com.bilgeadam.javacourse.week2;

public class TryThis {


		int variable; // s�n�f de�i�keni
	public static void main(String[] args) {
		//main method i�erisinden de�i�kene de�er atad�m
		//int variable=10;
		 //bu s�n�ftan bi nesne olu�turuldu
	//TryThis tryThis= new TryThis();
		
		 
		 // olu�turulan nesnenin methodunu kulland�m. Parametre olarak i�ine de main methodda de�er atad���m de�i�keni  verdim
	// System.out.println(tryThis.method(variable));
		 // Main method i�inde de�erini belirledi�im de�i�keni konsola yazd�rd�m
	// System.out.println(variable);
		//S�n�f i�erisinde olu�turdu�um de�i�keni konsola yazd�rd�m.
	// System.out.println(tryThis.variable);
		
	}

	//bir method yaratt�m.
	int method (int variable) {
		variable +=25;
		//methodun parametre olarak i�ine ald��� de�eri kulland�m
		System.out.println(variable);
		
	
		return this.variable;
	}
}
