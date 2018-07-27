package com.capgemini.core.enquiry.view;


import java.util.Scanner;

import com.capgemini.core.enquiry.beans.EnquiryDetails;
import com.capgemini.core.enquiry.service.EnquiryDetailsService;
import com.capgemini.core.enquiry.service.EnquiryDetailsSeviceImpl;

public class Client {
	private EnquiryDetailsService enqserv;

	public Client() {
	enqserv = new EnquiryDetailsSeviceImpl();
	}
	public static void main(String[] args) {
		Client client = new Client();
		//make sure application runs forever unless you close it
		while(true)
		client.menu();
	}
	private void menu() {
		// TODO Auto-generated method stub
		System.out.println("1) Add EnquiryDetails");
		System.out.println("2) Get EnquiryDetails");
		Scanner console = new Scanner(System.in);
		System.out.println("Please Select an Option:");
		int choice = console.nextInt();
		switch (choice) {
		case 1:
		
			EnquiryDetails enquiryDetails = new EnquiryDetails();
			System.out.println("1)Enter First name: ");
			String firstname = console.next();
			System.out.println("1)Enter last name: ");
			String lastname = console.next();
			System.out.println("1)Enter Gender: ");
			String gender = console.next();
			System.out.println("1)Enter Technology: ");
			String technology = console.next();
			enquiryDetails.setFirstName(firstname);
			enquiryDetails.setLastName(lastname);
			enquiryDetails.setGender(gender);
			enquiryDetails.setTechnology(technology);
			int id = enqserv.add(enquiryDetails);
			System.out.println("Details Updated" + id);	
			break;
		case 2:
			System.out.println("Enter Employee ID to view Details");
			int empId=console.nextInt();
			enquiryDetails = enqserv.getDetailsId(empId);
			System.out.println("FirstName:" + enquiryDetails.getFirstName());
			System.out.println("LastName:" +enquiryDetails.getLastName());
			System.out.println("Gender:" + enquiryDetails.getGender());
			System.out.println("Technology:" + enquiryDetails.getTechnology());
			break;
		default:	System.out.println("Invalid Option");
			break;
		}
	}

}
