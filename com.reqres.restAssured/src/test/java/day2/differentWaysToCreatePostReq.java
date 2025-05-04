package day2;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class differentWaysToCreatePostReq {
	static {
		System.out.println("Different ways to create post request");
		System.out.println("Using Hash Map");
		System.out.println("Using org.json");
		System.out.println("Using POJO class");
		System.out.println("Using External json data");

	}
//1. Using HasMap
	HashMap<String, Object> data = new HashMap<String, Object>();
	String id;

	@Test(priority = 1)
	void testPostusingHashMap() {
		data.put("name", "geeta");
		data.put("location", "france");
		data.put("phone", 456);

		String courseArr[] = { "java", "csharp" };
		data.put("courses", courseArr);
		System.out.println("Read fRom HashMap");

		id = given().contentType("application/json").body(data)

				.when().post("http://localhost:3000/students").jsonPath().getString("id");
		/*
		 * .then() .assertThat() .statusCode(201) .body("name",equalTo("geeta"))
		 * .body("location",equalTo("france")) .body("phone", equalTo(456))
		 * .body("courses[0]", equalTo("java")) .body("courses[1]", equalTo("csharp"))
		 * 
		 * .header("Content-Type", "application/json") .log().all();
		 */

	}

	@Test(priority = 2)
	void testDelete() {
		given()

				.when().delete("http://localhost:3000/students/" + id)

				.then().statusCode(200);
	}

//2. Using Org.json
	@Test()
	void testPostusingJson() {
		JSONObject jdata = new JSONObject();
		jdata.put("name", "geeta");
		jdata.put("location", "france");
		jdata.put("phone", 456);
		System.out.println("Read fRom org.JSON");

		String courseArr[] = { "java", "csharp" };
		jdata.put("courses", courseArr);

		id = given().contentType("application/json").body(jdata)

				.when().post("http://localhost:3000/students").jsonPath().getString("id");

	}

	@Test(dependsOnMethods = "testPostusingJson")
	void testDeleteFromJson() {
		given()

				.when().delete("http://localhost:3000/students/" + id)

				.then().statusCode(200);
	}

//3. Using POJO Class
	@Test
	public void usingPOJO() {
		Student_Pojo sp = new Student_Pojo();
		String coursesArr[] = { "C", "c++" };
		sp.setName("Geeta");
		sp.setLocation("Japan");
		sp.setPhone("456");
		sp.setCourses(coursesArr);
		System.out.println("Read fRom POJO");

		given().contentType("application/json").body(sp).when().post("http://localhost:3000/students")
		.then()
		.assertThat().statusCode(201).
		body("name", equalTo(sp.getName())).
		body("location", equalTo(sp.getLocation()))
		.body("phone", equalTo(sp.getPhone()))
	//	.body("courses[0]", equalTo(sp.getCourses()))

				.header("Content-Type", "application/json").log().all();
	}
	
	//4 Using Json File
	@Test
	public void usingJsonFile() throws IOException {
		File f=new File(".\\body.json");
		FileReader fs=new FileReader(f);
		System.out.println("Read fRom JSON File");
		
		JSONTokener jt=new JSONTokener(fs);
		JSONObject jo=new JSONObject(jt);
		
		given().contentType("application/json")
		.body(jo.toString())
		.when().post("http://localhost:3000/students")
		.then()
		.assertThat().statusCode(201).
		body("name", equalTo("kiara")).
		body("location", equalTo("sam"))
		.body("phone", equalTo("999"))
		.body("courses[0]", equalTo("Java"))
		.body("courses[1]", equalTo("Selenium"))


				.header("Content-Type", "application/json").log().all();
		
	}
	
}
