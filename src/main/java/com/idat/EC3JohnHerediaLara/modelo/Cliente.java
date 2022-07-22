package com.idat.EC3JohnHerediaLara.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String nombre;
	private String celular;
	
	@OneToOne(mappedBy = "usuarios")
	private UsuarioCliente usuarios;
	
	@ManyToMany(mappedBy = "cliente", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private List<Hospital> hospital = new ArrayList<Hospital>();
	
}
