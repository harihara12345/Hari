package com.Authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

@Test
public class premitive {

	public void preauth()
	{
		RestAssured.baseURI="http://restapi.demoqa.com";
		RequestSpecification httprequests = RestAssured.given();
		httprequest.auth().preemptive().GOA("Toolsqa", "Testpassword");
		Request resp = httprequst.request(Method.GET."/");
		
		Int status
		
		
	}
}
