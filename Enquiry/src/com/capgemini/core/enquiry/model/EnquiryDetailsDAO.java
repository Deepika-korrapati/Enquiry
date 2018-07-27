package com.capgemini.core.enquiry.model;

import com.capgemini.core.enquiry.beans.EnquiryDetails;

public interface EnquiryDetailsDAO {
public int add(EnquiryDetails details);
public EnquiryDetails getDetailsId(int id);	

}
