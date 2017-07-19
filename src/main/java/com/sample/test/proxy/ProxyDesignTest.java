package com.sample.test.proxy;

public class ProxyDesignTest {

	
	public static void main(String[] args) {
		
		PatientsDataProxy proxy = new PatientsDataProxy();
		
		System.out.println(proxy.getPatientInfo("Siva"));

	}

}
