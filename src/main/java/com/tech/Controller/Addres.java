package com.tech.Controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Addres_db")
public class Addres {
	
	@Id
	@Column
	private int id;
	
	@Column
	private String city;
	
	@Override
	public String toString() {
		return "Addres [id=" + id + ", city=" + city + ", status=" + status + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column
	private String status;

	

	
	
	
	
	
}
