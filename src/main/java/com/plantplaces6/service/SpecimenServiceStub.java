package com.plantplaces6.service;

import org.springframework.stereotype.Component;

import com.plantplaces6.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub implements ISpecimenService {

	/* (non-Javadoc)
	 * @see com.plantplaces6.service.ISpecimenService#fetchById(int)
	 */
	@Override
	public SpecimenDTO fetchById(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);
		return specimenDTO;
		
	}
	
	/* (non-Javadoc)
	 * @see com.plantplaces6.service.ISpecimenService#save(com.plantplaces6.dto.SpecimenDTO)
	 */
	@Override
	public void save(SpecimenDTO specimenDTO) {
		
	}
}
