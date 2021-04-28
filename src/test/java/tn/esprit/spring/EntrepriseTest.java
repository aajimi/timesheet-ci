package tn.esprit.spring;


import java.text.ParseException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseTest {
	Entreprise entreprise=new Entreprise();
	
	@Autowired
	IEntrepriseService us;
	
	
	@Test
	public void TestajoutEntreprise() throws ParseException {
		
		
		Entreprise  en=new Entreprise("TELNET","INNOVATION");
		
		
		Entreprise ajoutentreprise = us.ajoutEntreprise(en);
		System.out.print(ajoutentreprise.toString());
	
		
	}
	
	
}
