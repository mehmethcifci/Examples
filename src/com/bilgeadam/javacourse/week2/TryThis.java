package com.bilgeadam.javacourse.week2;

public class TryThis {


		int variable; // sýnýf deðiþkeni
	public static void main(String[] args) {
		//main method içerisinden deðiþkene deðer atadým
		//int variable=10;
		 //bu sýnýftan bi nesne oluþturuldu
	//TryThis tryThis= new TryThis();
		
		 
		 // oluþturulan nesnenin methodunu kullandým. Parametre olarak içine de main methodda deðer atadýðým deðiþkeni  verdim
	// System.out.println(tryThis.method(variable));
		 // Main method içinde deðerini belirlediðim deðiþkeni konsola yazdýrdým
	// System.out.println(variable);
		//Sýnýf içerisinde oluþturduðum deðiþkeni konsola yazdýrdým.
	// System.out.println(tryThis.variable);
		
	}

	//bir method yarattým.
	int method (int variable) {
		variable +=25;
		//methodun parametre olarak içine aldýðý deðeri kullandým
		System.out.println(variable);
		
	
		return this.variable;
	}
}
