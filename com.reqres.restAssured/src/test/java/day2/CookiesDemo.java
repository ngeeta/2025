package day2;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class CookiesDemo {

	//@Test
	void cookie() {
		given()
	
		.when().get("https://www.google.com")
		
		.then()
		.cookie("AEC","AVcja2ds3J_srmdtjKAb9QlzJvl5PLz1DP3h8rom-1B2iorfVSnbtx2ibC8")
		.statusCode(200)
		.log().all();
	}
	@Test()
	void getCookieInfo() {
		Response res=given()
		
		.when().get("https://www.google.com");
		//Single Cookie
		String cookie=res.getCookie("AEC");
		System.out.println(cookie);
		Map<String,String> cookies=new HashMap<String,String>();
		cookies=res.getCookies();
		
		for(String s:cookies.keySet()) {
			System.out.println(s+" : "+cookies.get(s));
		}
		
		Iterator itr=cookies.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println("--------"+ itr.next());
		}
	}
	@Test
	void header() {
		Response res=given()
				.when().get("https://www.google.com");
		
		System.out.println("response :: "+res.getHeader("Content-Encoding"));
		Headers headers=res.getHeaders();
		for(Header h:headers) {
			System.out.println(h.getName() + " : "+h.getValue());
		}
				
	}
}
