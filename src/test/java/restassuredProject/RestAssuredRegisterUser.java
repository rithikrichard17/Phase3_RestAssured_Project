package restassuredProject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredRegisterUser {
	
	@Test
	public void registerUser() {
		
		RestAssured.given()
		.baseUri("https://reqres.in")
		.basePath("/api/register")
		.when().get()
		.then()
		.statusCode(200)
		.log().all();
		
	}

}
