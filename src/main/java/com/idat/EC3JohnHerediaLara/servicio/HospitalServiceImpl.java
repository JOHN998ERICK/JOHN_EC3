package com.idat.EC3JohnHerediaLara.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC3JohnHerediaLara.dto.HospitalDTORequest;
import com.idat.EC3JohnHerediaLara.dto.HospitalDTOResponse;
import com.idat.EC3JohnHerediaLara.modelo.Hospital;
import com.idat.EC3JohnHerediaLara.repositorio.HospitalRepositorio;









@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalRepositorio repositorio;

	@Override
	public void guardarHospital(HospitalDTORequest hospital) {
		Hospital p = new Hospital();
		p.setIdHospital(hospital.getIdHospitalDTO());
		p.setNombre(hospital.getNombreDTO());
		p.setDescripcion(hospital.getDescripcionDTO());
		
		repositorio.save(p);
	}

	@Override
	public void editarHospital(HospitalDTORequest hospital) {
		Hospital p = new Hospital();
		p.setIdHospital(hospital.getIdHospitalDTO());
		p.setNombre(hospital.getNombreDTO());
		p.setDescripcion(hospital.getDescripcionDTO());
		repositorio.saveAndFlush(p);
	}

	@Override
	public void eliminarHospital(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<HospitalDTOResponse> listarHospital() {
		List<HospitalDTOResponse> lista = new ArrayList<HospitalDTOResponse>();
		HospitalDTOResponse p = null; 
		

		for (Hospital hospital :repositorio.findAll()) {
			p = new HospitalDTOResponse();
			
			p.setIdHospital(hospital.getIdHospitalDTO());
			p.setNombre(hospital.getNombreDTO());
			p.setDescripcion(hospital.getDescripcionDTO());
			
			lista.add(p); 
			
		}
		

		return lista;
	}

	@Override
	public HospitalDTOResponse obtenerHospitalId(Integer id) {
		Hospital hospital = repositorio.findById(id).orElse(null);
		HospitalDTOResponse p = new HospitalDTOResponse();
		p.setIdHospital(hospital.getIdHospitalDTO());
		p.setNombreHospital(hospital.getNombreDTO());
		p.setDescripcion(hospital.getDescripcionDTO());
		return p;
	}



	
	

}
