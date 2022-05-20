package com.practice01.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.practice01.dao.Practice01DAOInterface;
import com.practice01.entity.Practice01User;

@Service
@Transactional
@Scope(scopeName = "prototype")
public class Practice01Service implements Practice01ServiceInterface{
	
	@Autowired
	private Practice01DAOInterface pdi;

	@Override
	public String createProfileService(Practice01User pu) {
		
		pdi.save(pu);
		return "profile created for "+pu.getName();
		
	}

}
