package com.talentinvestexample.AmruthaAahar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.talentinvestexample.AmruthaAahar.model.Fruits;
import com.talentinvestexample.AmruthaAahar.service.FruitsService;

@Controller
public class FruitsController {
	
	@Autowired
	private FruitsService fruitsService;

	@RequestMapping("/fruits")
	public ModelAndView fruitsPage() {
		ModelAndView mav = new ModelAndView();
		List<Fruits> fruitsList = fruitsService.getAllFruits();
		mav.setViewName("fruits");
		mav.addObject(fruitsList);
		
		return mav;
	}
	
	@RequestMapping("/createFruits")
	public ModelAndView VeggiesPage() {
		ModelAndView mav = new ModelAndView("createFruits");
		return mav;
	}
	
	@RequestMapping("/deleteFruits/{fID}")
	public ModelAndView deleteFruits(@PathVariable("fID")int fID) {
		ModelAndView mav = new ModelAndView();
		fruitsService.deleteFruits(fID);
		List<Fruits> fruitsList = fruitsService.getAllFruits();
		mav.setViewName("fruits");
		mav.addObject(fruitsList);
		
		return mav;
	}

}
