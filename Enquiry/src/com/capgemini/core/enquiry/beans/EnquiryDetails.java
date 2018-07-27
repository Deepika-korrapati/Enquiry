package com.capgemini.core.enquiry.beans;

public class EnquiryDetails {
	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	private String technology;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnquiryDetails other = (EnquiryDetails) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public EnquiryDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EnquiryDetails(int id, String firstName, String lastName, String gender, String technology) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.technology = technology;
	}
	public EnquiryDetails(int id) {
		super();
		this.id = id;
	}
	public EnquiryDetails(String firstName, String lastName, String gender, String technology) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.technology = technology;
	}
	

	
	
	

}
