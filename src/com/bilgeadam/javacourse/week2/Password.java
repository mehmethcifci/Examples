package com.bilgeadam.javacourse.week2;

public class Password {

	private String password;

	public Password() {  //Constructor (yapýcý) method
		super();		//hiyerarþide bir üst sýnýfýn method veya özniteliklerine eriþmek için
						//burada ayný imzaya sahip yapýcý methodu çaðýrýyor
						//"bu" sýnýfýn password isimli niteliðine eriþmek için
		
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
