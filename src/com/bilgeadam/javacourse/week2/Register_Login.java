package com.bilgeadam.javacourse.week2;

import java.util.Scanner;

public class Register_Login {

	public static void main(String[] args) {

		String userName="";
		String password="";
		
		do {System.out.println("1 kay�t olsun   2 giri� yap");
		
		Scanner scan=new Scanner(System.in);
		int key=scan.nextInt();
		
		
		switch(key) {
			case 1:
				Scanner input= new Scanner(System.in);
				System.out.println("Kullan�c� olu�turma sayfas�na ho�geldiniz.Kullan�c� ad�n�z");
				userName=input.nextLine();
				System.out.println("�ifre");
				password=input.nextLine();
				System.out.println("Hesab�n�z olu�turuldu");
				break;
				
			case 2 :
				Scanner scanner= new Scanner(System.in);
				System.out.println("L�tfen kullan�c� ad� giriniz: ");
				String userNameEntry=scanner.nextLine();
				System.out.println("�ifre");
				String passwordEntry=scanner.nextLine();
				
				if(userNameEntry.equals(userName) && passwordEntry.equals(password)) {
					
					System.out.println("Ho�geldiniz");
				}
				else {
					System.out.println("Kullan�c� ad�n�z ya da �ifreniz yanl��");
				}
				break;
				
			default:
				break;
			
		}}while(true);
		
		
		}	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner scan= new Scanner(System.in);
		System.out.println("Kay�t olmak i�in 1'i tu�lar�n.");
		System.out.println("Giri� yapmak i�in 2'i tu�lar�n.");
		
		int s=scan.nextInt();
		String ID1="";
		String Pass1="";
		String ID="";
		String Pass="";
		String ID2="";
		String Pass2="";
		
		
		if (s==1) {
			System.out.print("ID: ");
			scan.next();
			ID1=scan.nextLine();
			System.out.println();
			System.out.print("Password: ");
			scan.next();
			Pass1=scan.nextLine();
			System.out.println();
			System.out.println("Kullan�c� olu�turuldu");
			
			System.out.print("ID: ");
			scan.next();
			ID=scan.nextLine();
			System.out.println();
			System.out.print("Password: ");
			scan.next();
			Pass=scan.nextLine();
			System.out.println();
				if(ID.equals(ID1)) {
					if(Pass.equals(Pass1)) {
					System.out.println("Giri� ba�ar�l�");
				}
					else {
						System.out.println("Giri� ba�ar�s�z.");
					}
				}
				else {
					System.out.println("Kullan�c� ad� veya �ifre yanl��!");
				}
		}
		else if(s==2) {
			System.out.print("ID: ");
			scan.next();
			ID2=scan.nextLine();
			System.out.println();
			System.out.print("Password: ");
			scan.next();
			Pass2=scan.nextLine();
				if(ID2.equals(ID) && Pass2.equals(Pass)){
				
				}
				else {
					System.out.println("Kullan�c� tan�ml� de�il.L�tfen kaydolunuz.");
				
					System.out.print("ID: ");
					scan.next();
					ID=scan.nextLine();
					System.out.println();
					System.out.print("Password: ");
					scan.next();
					Pass=scan.nextLine();
					System.out.println();
					System.out.println("Kullan�c� olu�turuldu");
				
					System.out.print("ID: ");
					scan.next();
					ID2=scan.nextLine();
					System.out.println();
					System.out.print("Password: ");
					scan.next();
					Pass2=scan.nextLine();
					System.out.println();
					if(ID2.equals(ID) && Pass2.equals(Pass)) {
						System.out.println("Giri� ba�ar�l�");
					}
					else {
						System.out.println("Kullan�c� ad� veya �ifre yanl��!");
					}
			}	
			
		}
		else {
			System.out.println("Eksik ya da yanl�� tu�lama yapt�n�z.");
		}
		
			}
			
		
		}
		*/
		
	


