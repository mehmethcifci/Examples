package com.bilgeadam.javacourse.week2;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber2 {
public static void main(String[] args) {
			
	
	Random rnd = new Random(); //random say� �retmeye yarayan s�n�f
			int numberToGuess = rnd.nextInt(101); //0 ila 100 aras�nda say� �retiyo
			boolean numberFound = false; //ilk durumda say� bulunmam�� durumda	
			Scanner scan = new Scanner(System.in);
			int guess; //tahmin edilen say�
			do {
				System.out.println("L�tfen 0 ila 100 aras�nda  bir say� giriniz: ");
				guess= scan.nextInt();
				System.out.println();
		
		if ( guess==numberToGuess){
			System.out.println("Tebrikler buldunuz!");
			numberFound = true;
		}
		else {
			if (guess>numberToGuess) {
				System.out.println("�ok y�ksek");
			}
			else {
				System.out.println("�ok al�ak");
			}
			
		}}
		while(!numberFound);  //asl�nda numberFound a ihtiya� yok. while(numberToGuess != guess) �eklinde de olabilirdi
		scan.close();
		System.out.println("Umar�m e�lendiniz");
	
	}
			


}

