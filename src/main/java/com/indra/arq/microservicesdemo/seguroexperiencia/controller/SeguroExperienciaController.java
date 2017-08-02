package com.indra.arq.microservicesdemo.seguroexperiencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.indra.arq.microservicesdemo.seguroexperiencia.model.SeguroExperiencia;
import com.indra.arq.microservicesdemo.seguroexperiencia.repo.SeguroExperienciaRepository;

@RestController
@RequestMapping("/microservicesdemo")
public class SeguroExperienciaController {
	
	@Autowired
	SeguroExperienciaRepository seguroExperienciaRepository;

	// Alta Seguro Experiencia
//	@RequestMapping(method = RequestMethod.POST)
//	public SeguroExperiencia create(@RequestBody SeguroExperiencia seguro){		
//		SeguroExperiencia result = seguroExperienciaRepository.save(seguro);
//		return result;
//	}
	
	// Consulta Seguro Experiencia por Id
//	@RequestMapping(method = RequestMethod.GET, value="/{seguroId}")
//	public SeguroExperiencia get(@PathVariable String seguroId){
//		return seguroExperienciaRepository.findOne(seguroId);
//	}
	
	// Consulta Seguro Experiencia (all)
	@RequestMapping(method = RequestMethod.GET, value="")
	public List<SeguroExperiencia> getAll(){
		return seguroExperienciaRepository.findAll();
	}
	
}
