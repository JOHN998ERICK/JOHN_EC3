package com.idat.EC3JohnHerediaLara.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.idat.EC3JohnHerediaLara.modelo.Cliente;

@Repository
public interface HospitalRepositorio extends JpaRepository<Cliente, Integer>{

}
