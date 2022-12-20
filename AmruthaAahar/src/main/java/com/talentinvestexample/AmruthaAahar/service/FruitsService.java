package com.talentinvestexample.AmruthaAahar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talentinvestexample.AmruthaAahar.repo.FruitsRepo;
import com.talentinvestexample.AmruthaAahar.model.Fruits;


@Service
public class FruitsService {
	@Autowired
	private FruitsRepo fruitsRepo;
	
	public List<Fruits>getAllFruits(){
		return fruitsRepo.findAll();
	}

	public void deleteFruits(int fID) {
		// TODO Auto-generated method stub
		fruitsRepo.deleteById(fID);
		
	}
	

}
