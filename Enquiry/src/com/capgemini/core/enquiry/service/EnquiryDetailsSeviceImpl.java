package com.capgemini.core.enquiry.service;

import java.util.ArrayList;

import com.capgemini.core.enquiry.beans.EnquiryDetails;
import com.capgemini.core.enquiry.model.EnquiryDetailsDAO;
import com.capgemini.core.enquiry.model.EnquiryDetailsDAOImpl;

public class EnquiryDetailsSeviceImpl implements EnquiryDetailsService {
	private EnquiryDetailsDAO enqDAO;
	ArrayList<EnquiryDetails> enq;

	public EnquiryDetailsSeviceImpl() {
		enqDAO = new EnquiryDetailsDAOImpl();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(EnquiryDetails details) {
		if(details == null)
			throw new NullPointerException();
		if(details.getFirstName()==null || details.getLastName()==null || details.getGender()==null || details.getTechnology()==null)
			throw new IllegalArgumentException();
			int id=0;
		id = enqDAO.add(details);
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public EnquiryDetails getDetailsId(int id) {
		EnquiryDetails details = null;
		details = enqDAO.getDetailsId(id);
		// TODO Auto-generated method stub
		return details;
	}

}
