package com.capgemini.core.enquiry.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.core.enquiry.beans.EnquiryDetails;
import com.capgemini.core.enquiry.model.EnquiryDetailsDAO;

public class TestEnquiryService {
	EnquiryDetailsSeviceImpl obj = new EnquiryDetailsSeviceImpl();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=NullPointerException.class)
	public void testAdd() {
		obj.add(null);
		
	}

	@Test(expected=IllegalArgumentException.class)
	public void testAdd1() {
		obj.add(new EnquiryDetails());
		
	}
//	@Test
//	public void testAdd2() {
//		obj.add(new EnquiryDetails());
//		
//	}

//	@Test
//	public void testGetDetailsId() {
//
//		
//	}

}
