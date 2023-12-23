package restassuredProject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredGetUser {
	
	
	@Test
	public void getUser() {
		
		RestAssured.given()
		.baseUri("https://reqres.in")
		.basePath("/api/users")
		.when().get()
		.then().statusCode(200)
		.log().all();
	}

}
