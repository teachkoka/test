package com.sample.test.proxy;

public class PatientsData implements PatientsService{
	
	public String getAllPatientsInfo(){
		return "SivaInfo, Sarath Info, Rakesh Info";
	}

	public String getPatientInfo(String name) {
		// TODO Auto-generated method stub
		return name +"info, only";
	}

	
}
