package com.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {
	
	private Dress dress;

	public Gandalf(Dress theDress) {
		dress=theDress;
	}

	
	public String giveAdvice() {
		return "Je suis Gandalf le Gris ! Et je te conseille de ne pas passer...";
	}

	
	public String changeDress() {
		return this.dress.sendDressAdvice();
	}

}
