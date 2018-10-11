package com.plantplaces6.service;

import com.plantplaces6.dto.SpecimenDTO;

public interface ISpecimenService {

	/**
	 * Get specimens from persistence layer.
	 * @param id a unique lookup
	 * @return a specimen with a matching ID
	 */
	SpecimenDTO fetchById(int id);

	/**
	 * Persist the given DTO
	 * @param specimenDTO
	 */
	void save(SpecimenDTO specimenDTO);

}