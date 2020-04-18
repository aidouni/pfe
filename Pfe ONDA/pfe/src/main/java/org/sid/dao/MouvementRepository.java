package org.sid.dao;

import org.sid.entities.Mouvement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MouvementRepository extends JpaRepository<Mouvement,Integer> {

}