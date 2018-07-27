package com.capgemini.core.enquiry.util;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.core.enquiry.beans.EnquiryDetails;

public class DBUtil {
	
	private List<EnquiryDetails> details = new ArrayList<EnquiryDetails>();
	{
	details.add(new EnquiryDetails(101,"Ram"," ","Male","Java"));
	details.add(new EnquiryDetails(102,"sam","Achanta","Female",".net"));
}
	public List<EnquiryDetails> getDetails() {
		return details;
	}
	public void setDetails(List<EnquiryDetails> details) {
		this.details = details;
	}
	
	
}