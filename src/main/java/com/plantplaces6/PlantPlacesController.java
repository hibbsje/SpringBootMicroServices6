package com.plantplaces6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.plantplaces6.dto.SpecimenDTO;
import com.plantplaces6.service.SpecimenServiceStub;



@Controller
public class PlantPlacesController {
	
	@Autowired
	private SpecimenServiceStub specimenServiceStub;
	
	/**
	 * Handle the /start endpoint.
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read() {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchById(43);
		return "start";
	}
	
	
	@RequestMapping(value="/start", method=RequestMethod.GET, headers={"Content-Type=text/json"})
	public String readJSON() {
		return "start";
	}
	

	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loyalty=blue"})
	public String readBlue() {
		return "start";
	}
	
	/**
	 * Handle the /start endpoint.
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loyalty=silver"})
	public String readSilver() {
		return "start";
	}
	

	
	@PostMapping("/start")
	public String create() {
		return "start";
	}
	
	/**
	 * Handle the / endpoint
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "start";
	}
	             
}
