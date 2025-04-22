package com.one2one.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="address")
public class Address
{

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressid;
	private String house_detial;
	private String city;
	private String state;
	
	
	public Address(String house_detial, String city, String state) 
	{
		super();
		this.house_detial = house_detial;
		this.city = city;
		this.state = state;
	}
	public Address() {
		super();
	}
	public String getHouse_detial() {
		return house_detial;
	}
	public void setHouse_detial(String house_detial) {
		this.house_detial = house_detial;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [house_detial=" + house_detial + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
}
