package tn.esprit.spring.services;

import java.util.List;

import javax.sound.midi.Soundbank;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.EntrepriseRepository;



@Service
public class EntrepriseServiceImpl implements IEntrepriseService {
	private static final Logger l = LogManager.getLogger(EntrepriseServiceImpl.class);

	@Autowired
	EntrepriseRepository entrepriseRepository;
	
	
	public List<Entreprise> getAllEntreprise() {
		l.info("In  Contrat : ");
		List<Entreprise> listCont = (List<Entreprise>) entrepriseRepository.findAll();
		for (Entreprise cont : listCont) {
			l.debug("entreprise  : " + cont);
		}
		l.info(" la list des entreprises");
		return listCont;
	}
	@Override
	public Entreprise ajoutEntreprise(Entreprise e) {
		l.info("Ajout departement : " + e);
		Entreprise depr = entrepriseRepository.save(e);
		l.info(e + "entreprise a été  Ajoutée");
		return depr;
	}

	@Override
	public void suppriEntrepriseById(int entrepriseID) {
		l.info("supprimé contrat id : " + entrepriseID);
		entrepriseRepository.delete(entrepriseRepository.findById(entrepriseID).get());

	}
	@Override
	public List<Entreprise> getAllDepartements() {
		l.info("trouver la liste des département");
		return (List<Entreprise>) entrepriseRepository.findAll();
	}

	@Override
	public Entreprise chercherEntreprise(int id) {
		l.info("Chercher département par id = " + id);
		Entreprise d =  entrepriseRepository.findById(id).get();
		l.info("dpartement  : " + d.toString());
		return d; 
	}

}