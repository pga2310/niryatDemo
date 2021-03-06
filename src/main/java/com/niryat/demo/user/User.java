package com.niryat.demo.user;



public class User {
	private int id;
	private String name;
	private String username;
	private String password;
	private String zipcode;
	private String city;
	private String state;

	public User(){}
	
	public User(int id, String name, String username, String password, String zipcode, String city, String state) {
		super();
		this.id = id;
		this.name = name;
		this.username=username;
		this.password=password;
		this.zipcode=zipcode;
		this.city=city;
		this.state=state;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
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
	

}
