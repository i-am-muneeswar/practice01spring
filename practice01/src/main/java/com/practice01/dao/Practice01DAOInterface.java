package com.practice01.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice01.entity.Practice01User;

@Repository
public interface Practice01DAOInterface extends JpaRepository<Practice01User, String>{
	
	

}
