package com.practice01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice01.entity.Practice01User;
import com.practice01.service.Practice01ServiceInterface;

@RestController
public class Practice01Controller {
	
	@Autowired
	private Practice01ServiceInterface psi;
	
	@PostMapping("createProfile")
	public String createProfile(@RequestBody Practice01User pu) {
		
		return psi.createProfileService(pu);
		
	}
	
	@GetMapping("viewProfile")

}
