package com.bilgeadam.javacourse.week2;

import java.util.Scanner;

public class Register_Login {

	public static void main(String[] args) {

		String userName="";
		String password="";
		
		do {System.out.println("1 kayýt olsun   2 giriþ yap");
		
		Scanner scan=new Scanner(System.in);
		int key=scan.nextInt();
		
		
		switch(key) {
			case 1:
				Scanner input= new Scanner(System.in);
				System.out.println("Kullanýcý oluþturma sayfasýna hoþgeldiniz.Kullanýcý adýnýz");
				userName=input.nextLine();
				System.out.println("Þifre");
				password=input.nextLine();
				System.out.println("Hesabýnýz oluþturuldu");
				break;
				
			case 2 :
				Scanner scanner= new Scanner(System.in);
				System.out.println("Lütfen kullanýcý adý giriniz: ");
				String userNameEntry=scanner.nextLine();
				System.out.println("Þifre");
				String passwordEntry=scanner.nextLine();
				
				if(userNameEntry.equals(userName) && passwordEntry.equals(password)) {
					
					System.out.println("Hoþgeldiniz");
				}
				else {
					System.out.println("Kullanýcý adýnýz ya da þifreniz yanlýþ");
				}
				break;
				
			default:
				break;
			
		}}while(true);
		
		
		}	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner scan= new Scanner(System.in);
		System.out.println("Kayýt olmak için 1'i tuþlarýn.");
		System.out.println("Giriþ yapmak için 2'i tuþlarýn.");
		
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
			System.out.println("Kullanýcý oluþturuldu");
			
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
					System.out.println("Giriþ baþarýlý");
				}
					else {
						System.out.println("Giriþ baþarýsýz.");
					}
				}
				else {
					System.out.println("Kullanýcý adý veya þifre yanlýþ!");
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
					System.out.println("Kullanýcý tanýmlý deðil.Lütfen kaydolunuz.");
				
					System.out.print("ID: ");
					scan.next();
					ID=scan.nextLine();
					System.out.println();
					System.out.print("Password: ");
					scan.next();
					Pass=scan.nextLine();
					System.out.println();
					System.out.println("Kullanýcý oluþturuldu");
				
					System.out.print("ID: ");
					scan.next();
					ID2=scan.nextLine();
					System.out.println();
					System.out.print("Password: ");
					scan.next();
					Pass2=scan.nextLine();
					System.out.println();
					if(ID2.equals(ID) && Pass2.equals(Pass)) {
						System.out.println("Giriþ baþarýlý");
					}
					else {
						System.out.println("Kullanýcý adý veya þifre yanlýþ!");
					}
			}	
			
		}
		else {
			System.out.println("Eksik ya da yanlýþ tuþlama yaptýnýz.");
		}
		
			}
			
		
		}
		*/
		
	


