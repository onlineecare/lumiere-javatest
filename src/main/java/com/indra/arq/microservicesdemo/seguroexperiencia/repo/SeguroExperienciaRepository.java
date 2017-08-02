package com.indra.arq.microservicesdemo.seguroexperiencia.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.indra.arq.microservicesdemo.seguroexperiencia.model.SeguroExperiencia;


//public interface SeguroExperienciaRepository extends MongoRepository<SeguroExperiencia, String> {
//
//}

@Component
public class SeguroExperienciaRepository{
	
	public List<SeguroExperiencia> findAll(){
		
		SeguroExperiencia dummy = new SeguroExperiencia();
		dummy.setId("1");
		dummy.setTipoSeguro("prueba dummy");
		dummy.setAmigos(5);
		List<SeguroExperiencia> result = new ArrayList<SeguroExperiencia>();
		result.add(dummy);
		return result;
		
	}
	
}