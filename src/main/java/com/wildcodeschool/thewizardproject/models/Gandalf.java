package com.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gandalf")
public class Gandalf implements WizardInterface {
	
	private Dress dress;

	public Gandalf(Dress theDress) {
		dress=theDress;
	}

	@Autowired
	public String giveAdvice() {
		return "Je suis Gandalf le Gris ! Et je te conseille de ne pas passer...";
	}

	
	public String changeDress() {
		return this.dress.sendDressAdvice();
	}

}
