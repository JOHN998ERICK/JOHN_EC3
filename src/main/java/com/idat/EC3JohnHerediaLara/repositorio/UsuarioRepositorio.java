package com.idat.EC3JohnHerediaLara.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC3JohnHerediaLara.modelo.UsuarioCliente;




@Repository
public interface UsuarioRepositorio extends JpaRepository<UsuarioCliente, Integer>{

	UsuarioCliente findByUsuario(String usuario);
}
