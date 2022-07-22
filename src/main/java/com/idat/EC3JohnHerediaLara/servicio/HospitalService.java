package com.idat.EC3JohnHerediaLara.servicio;

import java.util.List;

import com.idat.EC3JohnHerediaLara.dto.HospitalDTORequest;
import com.idat.EC3JohnHerediaLara.dto.HospitalDTOResponse;








public interface HospitalService {

	public void guardarHospital(HospitalDTORequest hospital);
	public void editarHospital(HospitalDTORequest hospital);
	public void eliminarHospital(Integer id);
	public List<HospitalDTOResponse> listarHospital();
	public HospitalDTOResponse obtenerHospitalId(Integer id);
}
