package restassuredProject;


import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestAssuredLoggingTest {
	
	Logger logger = LogManager.getLogger(RestAssuredLoggingTest.class);
	
	@Test
	public void loggingTest() {
		
		
		logger.info("RestAssured-Practise-Project");
		File file = new File("D:\\Mphasis Training\\Selenium workspace\\Phase3_RestAssuredProject\\src\\main\\resource\\data.json");
		int id = RestAssured.given()
				.baseUri("https://reqres.in")
				.basePath("/api/unknown")
				.contentType(ContentType.JSON)
				.body(file)
				.when().get()
				.then()
				.statusCode(200)
				.log().all()
				.body("name", Matchers.equalTo("fuchsia rose")).extract().path("id");
				logger.trace("The status code is checked");
				System.out.println(id);
				logger.trace("ID has been captured and validated");
		
	}
	
}
	
	

