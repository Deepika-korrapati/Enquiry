package com.capgemini.core.enquiry.service;

import com.capgemini.core.enquiry.beans.EnquiryDetails;

public interface EnquiryDetailsService {
	public int add(EnquiryDetails details);
	public EnquiryDetails getDetailsId(int id);	

}
