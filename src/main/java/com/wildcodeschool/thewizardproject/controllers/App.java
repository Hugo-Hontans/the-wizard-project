package com.wildcodeschool.thewizardproject.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wildcodeschool.thewizardproject.models.WizardInterface;

public class App {

	public void start() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		
        WizardInterface myWizard = context.getBean("gandalf", WizardInterface.class);
        context.close();
        
        System.out.println("");
        System.out.println("******************");
        System.out.println(myWizard.giveAdvice());
        System.out.println("******************");
        System.out.println(myWizard.changeDress());
        System.out.println("******************");
    }

}
