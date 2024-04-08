package com.tech.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tech.service.Addrservice;

@RestController
public class Addrescontroller {
	
	public Addrescontroller() {
		System.out.println(" inside Addrescontroller constructor");
	}
	
	@Value("${base_url}")
	String url1;

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	Addrservice addrservice;
	

	@GetMapping("/hi2")
	public String add() {
		return "hi helllllo addres";
		
	}
	
	@PostMapping("/createaddr")
	public List<Addres> creat(@RequestBody List<Addres> std) {
		return addrservice.Create(std);
		
	}
	
	@GetMapping("/getalladdr")
	public List<Addres> getall() {
		return addrservice.getall();
	}
	
	@DeleteMapping("deleteaddr/{id}")
	public void delete( @PathVariable("id") int id) {
		addrservice.delete(id);
	}
	
	@PostMapping("/getname93")
	public String get() {
		String url= url1+"/getstdname"+0;
		ResponseEntity<String>	r=restTemplate.exchange(url, HttpMethod.GET, null, String.class);
		return r.getBody();
		
	}
}
