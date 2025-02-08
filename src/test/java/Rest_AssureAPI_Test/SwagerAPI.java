package Rest_AssureAPI_Test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SwagerAPI {
	
	@Test
	public void APItest1() {
		
		RestAssured.baseURI="https://petstore.swagger.io/";
		RequestSpecification requestSpectcation = RestAssured.given();
		Response request = requestSpectcation.request(Method.GET,"#/pet/getPetById");
		System.out.println(request.asPrettyString());
		System.out.println(request.statusCode());
		
		
		
	}

}
