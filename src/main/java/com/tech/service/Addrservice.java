package com.tech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.Controller.Addres;
import com.tech.Dao.Addrdao;




@Service
public class Addrservice {
	
	@Autowired
	Addrdao addrdao;
	
	
	public Addrservice() {
		System.out.println("inside Addrservice constructor");
	}
	

	public List<Addres> Create( List<Addres> add) {
		
		return addrdao.saveAll(add) ;
		
	}
 
	public List<Addres> getall(){
	return	addrdao.findAll();
		
	}
	
	public void delete(int s) {
		addrdao.deleteById(s);
		
	}
	
}



