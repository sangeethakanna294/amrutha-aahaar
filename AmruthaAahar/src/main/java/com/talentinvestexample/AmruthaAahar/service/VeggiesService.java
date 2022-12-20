package com.talentinvestexample.AmruthaAahar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talentinvestexample.AmruthaAahar.model.Veggies;
import com.talentinvestexample.AmruthaAahar.repo.VeggiesRepo;

import antlr.collections.List;

@Service
public class VeggiesService {
	
	@Autowired
	private VeggiesRepo veggiesRepo;
	
	public java.util.List<Veggies> getAllVeggies(){
		return veggiesRepo.findAll();
	}
	public void deleteVeggies(int vID) {
		veggiesRepo.deleteById(vID);
	}

}
