package com.bilgeadam.javacourse.week2;

public class Password {

	private String password;

	public Password() {  //Constructor (yap�c�) method
		super();		//hiyerar�ide bir �st s�n�f�n method veya �zniteliklerine eri�mek i�in
						//burada ayn� imzaya sahip yap�c� methodu �a��r�yor
						//"bu" s�n�f�n password isimli niteli�ine eri�mek i�in
		
		this.password="";
	}
	
	
	public boolean check (String password) {
		return password.equals(this.password);
	}
	
	public boolean assign (String oldPassword, String newPassword) {
	boolean isSuccessful=false;
	
	if(newPassword !=null) {
		if(this.check(oldPassword) && this.checkSyntax(newPassword)) {
		isSuccessful=true;
		this.password=newPassword;
		}
	}
	return isSuccessful;
	}
	private boolean checkSyntax(String password) {
		boolean isCorrect=false;
		char first=password.toLowerCase().charAt(0);
		isCorrect = (first!=password.charAt(0));
		
		return isCorrect;
	}
}
