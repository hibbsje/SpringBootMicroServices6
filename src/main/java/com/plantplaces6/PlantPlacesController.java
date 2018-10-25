package com.plantplaces6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.plantplaces6.dto.SpecimenDTO;
import com.plantplaces6.service.ISpecimenService;



@Controller
public class PlantPlacesController {
	
	@Autowired
	private ISpecimenService specimenServiceStub;
	
	/**
	 * Handle the /start endpoint.
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read(Model model) {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchById(43);
		model.addAttribute("specimenDTO", specimenDTO);
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
	public ModelAndView readSilver() {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchById(43);
		specimenDTO.setSpecimenId(83);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Start");
		modelAndView.addObject("specimenDTO", specimenDTO);
		return modelAndView;
	}
	

	
	@PostMapping("/start")
	public String create() {
		return "start";
	}
	
	/**
	 * Handle the / endpoint
	 * @return
	 */
	@RequestMapping("/start")
	public String index() {
		return "start";
	}
	             
}
