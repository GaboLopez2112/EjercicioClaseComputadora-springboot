package com.gestioncomputador.repository;

import com.gestioncomputador.model.Computadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputadoraRespository extends JpaRepository<Computadora,Integer> {

}
