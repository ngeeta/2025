package com.practice.Postman;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Mock {
	String mockServerUrl = "https://66812c4d-a7a2-4796-bbd6-b505ea5b5fcd.mock.pstmn.io";
@Test
	public void get() {
		RequestSpecification request;
		Response response;
		 request=RestAssured.given().
			    	
				   header("content-type","application/json").
				   baseUri("https://66812c4d-a7a2-4796-bbd6-b505ea5b5fcd.mock.pstmn.io");
		    response=request.given().basePath("/employee").
			    	queryParam("Mobile", 200).get();
				System.out.println("-----------------");
				 int actCode=response.getStatusCode();
				    String actMsg=response.getStatusLine();
				    System.out.println(actCode+" "+actMsg );
					System.out.println("-----------------");
		
	}
	
		// https://66812c4d-a7a2-4796-bbd6-b505ea5b5fcd.mock.pstmn.io
		

}
