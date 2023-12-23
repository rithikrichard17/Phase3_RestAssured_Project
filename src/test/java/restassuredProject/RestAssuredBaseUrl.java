package restassuredProject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredBaseUrl {
	
	@Test
	public void baseURL() {
		
		RestAssured.given()
		.baseUri("https://reqres.in")
		.basePath("/api")
		.when().get()
		.then()
		.statusCode(404)
		.log().all();
		
	}

}
