package com.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {
	
	private Dress dress;

	public Dumbledore(Dress theDress) {
		dress = theDress;
	}
	
	public String giveAdvice() {
		return "Je suis le magicien Dumbledore et je te conseille d'être sage !";
	}

	public String changeDress() {
		return this.dress.sendDressAdvice();
	}

}
