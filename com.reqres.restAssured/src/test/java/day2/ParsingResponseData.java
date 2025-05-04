package day2;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matchers;
public class ParsingResponseData {

	@Test(priority = 1)
	void jsonResponse() {
		 given()
	     .when()
	     .get("http://localhost:3000/Book")
	     .then()
	         .statusCode(200)
	         .body("Library[2].Title", equalTo("Black List"))
	         .log().all();
		System.out.println("-------------------");	
	}
}
