package com.capgemini.core.enquiry.model;

import java.util.List;

import com.capgemini.core.enquiry.beans.EnquiryDetails;
import com.capgemini.core.enquiry.util.DBUtil;

public class EnquiryDetailsDAOImpl implements EnquiryDetailsDAO {
	private List <EnquiryDetails> impl;
	DBUtil dbUtil = new DBUtil();
	private int id=1000;
	

	public EnquiryDetailsDAOImpl() {
		impl =  dbUtil.getDetails();
	}
	public int generateId() {
		return id++;
		
	}

	@Override
	public int add(EnquiryDetails details) {
		int id = generateId();
		details.setId(id);
		impl.add(details);
		return id;
		
		
		
	}

	@Override
	public EnquiryDetails getDetailsId(int id) {
		int index = impl.indexOf(new EnquiryDetails(id));
		if(index == -1)
			System.out.println("Id is not found");
		return impl.get(index);
	}

}
