package demo;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class crud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// validate if ADdd Place API is working as expected
		// given - all input details (Adres, parametreler ve body)
		// when - submit the API (GET/POST/DELETE/PUT hangisi ise onu yazıyoruz)
		// then - validate the response (Sonuc)

		RestAssured.baseURI = "https://petstore3.swagger.io/api/v3";

		//create pet
		
		String response = given().log().all().header("Content-Type", "application/json")
				.body("{\r\n" + "  \"id\": 10,\r\n" + "  \"name\": \"corgi\",\r\n" + "  \"category\": {\r\n"
						+ "    \"id\": 1,\r\n" + "    \"name\": \"Dogs\"\r\n" + "  },\r\n" + "  \"photoUrls\": [\r\n"
						+ "    \"string\"\r\n" + "  ],\r\n" + "  \"tags\": [\r\n" + "    {\r\n" + "      \"id\": 0,\r\n"
						+ "      \"name\": \"string\"\r\n" + "    }\r\n" + "  ],\r\n"
						+ "  \"status\": \"available\"\r\n" + "}")
				.when().post("/pet").then().assertThat().statusCode(200).extract().response().asString();
		System.out.println(response);
		
	//update pet 
		
		String newName = "köpüş corgi";
		String newResponse= given().log().all().header("Content-Type","application/json").
				body("{\r\n"
						+ "  \"id\": 10,\r\n"
						+ "  \"name\": \"" + newName + "\",\r\n"
						+ "  \"category\": {\r\n"
						+ "    \"id\": 1,\r\n"
						+ "    \"name\": \"Dogs\"\r\n"
						+ "  },\r\n"
						+ "  \"photoUrls\": [\r\n"
						+ "    \"string\"\r\n"
						+ "  ],\r\n"
						+ "  \"tags\": [\r\n"
						+ "    {\r\n"
						+ "      \"id\": 0,\r\n"
						+ "      \"name\": \"string\"\r\n"
						+ "    }\r\n"
						+ "  ],\r\n"
						+ "  \"status\": \"available\"\r\n"
						+ "}").when().put("/pet").then().assertThat().log().all().statusCode(200).extract().response().asString();
		System.out.println(newResponse);
		
		
		//get pet
	String getPetResponse = given().log().all().queryParam("petId", "10").header("Content-Type","application/json")
				.when().get("/pet/10").then().assertThat().statusCode(200).extract().response().asString();
		System.out.println(getPetResponse); 
		
		
		//delete pet
		
		String response2=	given().log().all().queryParam("petId", "10").header("Content-Type" ,"application/json")
		.when().delete("/pet/10").then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(response2);  

	}

}