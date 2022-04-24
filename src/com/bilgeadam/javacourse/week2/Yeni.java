package com.bilgeadam.javacourse.week2;

import java.util.Scanner;

public class Yeni {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1. Toplama");
			System.out.println("2. Çýkarma");
			System.out.println("3. Çarpma");
			System.out.println("4.Bölme");
			System.out.println("Yapmak istediðiniz iþlemi giriniz");
			
			int secim;
			
			secim=scan.nextInt();
			if (secim !=1 && secim !=2 && secim !=3 && secim !=4 ) {
			System.out.println("Geçerli bir iþlem girin");
			System.out.println();
			}
			else if(secim==1 ||secim==2 || secim==3 || secim==4) {	
				System.out.println("1.Sayý: ");
				int sayi1 = scan.nextInt();
				System.out.println("2.Sayý: ");
				int sayi2 = scan.nextInt();
					
			switch(secim) {
				
				case 1:
					System.out.println("Toplam: " +(sayi1 + sayi2));
					System.out.println();
					break;
				case 2:
					System.out.println("Çýkarma: " + (sayi1 - sayi2));
					System.out.println();
					break;
				
				case 3:
					System.out.println("Çarpma: " +(sayi1 * sayi2));
					System.out.println();
					break;
				case 4:
					System.out.println("Bölme: " +(sayi1 / sayi2));
					System.out.println();
					break;
				case 0:
					
				System.exit(0);
				break;
		}
			}
			
			
			
			}
			}
	}





/*				Scanner scan = new Scanner(System.in);
				System.out.println("1.Sayý: ");
				int sayi1 = scan.nextInt();
				System.out.println("2.Sayý: ");
				int sayi2 = scan.nextInt();
 * 				System.out.println("Operator gir(+,-,*,/): ");
 * 				char operator=scan.next().charAt(0);
 * 				double result;
 * 			switch (operator){
 * 			case '+':
 * 				result=first+second;
 * 			break;
 * 			case '-':
 * 				result=first-second;
 * 			break;
 * 
 * 			case '*':
 * 				result=first*second;
 * 			break;
 * 
 * 			case '/':
 * 				result=first/second;
 * 			break;
 * 			default:
 * 			System.out.println("Error");
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */



