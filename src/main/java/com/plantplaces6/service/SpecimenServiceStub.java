package com.plantplaces6.service;

import org.springframework.stereotype.Component;

import com.plantplaces6.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub {

	public SpecimenDTO fetchById(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);
		return specimenDTO;
	}
	
	public void save(SpecimenDTO specimenDTO) {
		
	}
}
