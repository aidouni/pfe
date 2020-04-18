package org.sid;

import java.text.SimpleDateFormat;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.sid.dao.AeroportRepository;
import org.sid.dao.ComptoirRepository;
import org.sid.dao.MouvementRepository;
import org.sid.dao.PasserelleRepopsitory;
import org.sid.dao.PorteRepository;
import org.sid.dao.VolRepository;
import org.sid.entities.Aeroport;
import org.sid.entities.Comptoir;
import org.sid.entities.Mouvement;
import org.sid.entities.Passerelle;
import org.sid.entities.Porte;
import org.sid.entities.Vol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
	AeroportRepository aRepository;
	@Autowired
	VolRepository vRepository;
	@Autowired
	MouvementRepository mRepository;
	@Autowired
	PorteRepository pRepository;
	@Autowired
	PasserelleRepopsitory passerelleRepopsitory;
	@Autowired
	ComptoirRepository cRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
		LocalTime localTime = LocalTime.of(00, 00, 01);
		Aeroport a1 = aRepository.save(new Aeroport("nom", "ville", "libelle", "pays", "OASI", "IATA"));
		Aeroport a2 = aRepository.save(new Aeroport("nom", "ville", "libelle", "pays", "OASI", "IATA"));
		Vol v1 = vRepository.save(new Vol(dt.parse("2020-05-01"),dt.parse("2020-05-31"), "d", "sens", a1, a2));
		Porte p1 = pRepository.save(new Porte("Porte1"));
		Passerelle p2 = passerelleRepopsitory.save(new Passerelle("Passerelle1"));
		Comptoir c1 = cRepository.save(new Comptoir( "Comptoir1"));
		Comptoir c2 = cRepository.save(new Comptoir( "Comptoir2"));
		Comptoir c3 = cRepository.save(new Comptoir( "Comptoir3"));
		Set<Comptoir> cSet = new HashSet<Comptoir>();
		cSet.add(c1);
		cSet.add(c2);
		cSet.add(c3);
		Mouvement m1 = mRepository.save(new Mouvement(15, localTime, "etat", cSet, p1, p2, v1));
		


		}
}
