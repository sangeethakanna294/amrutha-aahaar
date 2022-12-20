package com.talentinvestexample.AmruthaAahar.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.talentinvestexample.AmruthaAahar.model.Veggies;
import com.talentinvestexample.AmruthaAahar.service.VeggiesService;

import antlr.collections.List;

@Controller
public class VeggiesController {
	
	@Autowired 
	private VeggiesService veggiesService;
	static ArrayList<Veggies> veggiesList = new ArrayList<>();

	@RequestMapping("/veggies")
	public ModelAndView VeggiesPage() {
		ModelAndView mav = new ModelAndView();
		java.util.List<Veggies> veggiesList = veggiesService.getAllVeggies();
		mav.setViewName("veggies");
		mav.addObject(veggiesList);
		
		return mav;
	}
	
	@RequestMapping("/createVeggies")
	public ModelAndView HomePage() {
		ModelAndView mav = new ModelAndView("createVeggies");
		return mav;
	}
	
	@RequestMapping("/deleteVeggies/{vID}")
	public ModelAndView deleteVeggies(@PathVariable("vID")int vID) {
		ModelAndView mav = new ModelAndView();
		veggiesService.deleteVeggies(vID);
		java.util.List<Veggies> veggiesList = veggiesService.getAllVeggies();
		mav.setViewName("veggies");
		mav.addObject(veggiesList);
		
		return mav;
	}
	
	

}
