package com.practice.RestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import java.util.HashMap;

import org.hamcrest.Matchers;

public class HTTPRequests {
	int id;
static {
	System.out.println("given()->content-Type,set-cookies,addAuth,addParam,setheadres");
	System.out.println("when()-get,post,put,delete");
	System.out.println("when()-validate status code,extract response,extract headers,cookies & responseBody");
}
@Test(priority = 1)
void getUsers() {
	//https://reqres.in//api/users/2
	 given()
     .when()
     .get("https://reqres.in/api/users?page=2")
     .then()
         .statusCode(200)
         .body("page", Matchers.equalTo(2))
         .log().all();
	
}
@Test(priority = 2)
void createUser() {
	HashMap<String, String> hs=new HashMap<String, String>();
	hs.put("name", "Geeta");
	hs.put("job", "Manager");
	id=given().contentType("application/json").body(hs)
	
	.when().post("https://reqres.in/api/users")
	.jsonPath().getInt("id");
	System.out.println("id from capture "+id);
	//Below is validation
	//.then().statusCode(201)
	//.log().all();
}
@Test(priority = 3,dependsOnMethods = "createUser")
//depends parameter is given if create user pass then only update user happen
public void  updateUser() {
	HashMap<String, String> hs=new HashMap<String, String>();
	hs.put("name", "Geeta");
	hs.put("job", "Sr Manager");
	given().contentType("application/json").body(hs)
	.when().put("https://reqres.in/api/users/"+id).then().statusCode(200).log().all();
}
@Test(priority = 4)
void deleteUser() {
	given()
	
	.when().delete("https://reqres.in/api/users/"+id)
	.then().statusCode(204).log().all();
}
}
