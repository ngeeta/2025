package day2;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
public class PathQueryParameter {

	@Test
	public void pathQuery() {
		//https://reqres.in/api/users?page=2
		
		given()
		.pathParam("pathParam","users")
		.headers("x-api-key","reqres-free-v1")
		.queryParam("page", 2)
		
		.when()
		.get("https://reqres.in/api/{pathParam}")
		
		.then()
		.statusCode(200)
		.log().all();
		System.out.println(RestAssured.baseURI);
		}
}
