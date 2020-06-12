import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class addPlace {
	public static void main(String[] args)
	{
		
		//Adding a place in Map
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().log().all().queryParams("key","qaclick123").header("Content-Type","application/JSON")
		.body("{\r\n" + 
				"    \"location\": {\r\n" + 
				"        \"lat\": -38.383494,\r\n" + 
				"        \"lng\": 33.427362\r\n" + 
				"    },\r\n" + 
				"    \"accuracy\": 50,\r\n" + 
				"    \"name\": \"Mobin Francis\",\r\n" + 
				"    \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
				"    \"address\": \"14,Kottiyoor\",\r\n" + 
				"    \"types\": [\r\n" + 
				"        \"shoe park\",\r\n" + 
				"        \"shop\"\r\n" + 
				"    ],\r\n" + 
				"    \"website\": \"http://google.com\",\r\n" + 
				"    \"language\": \"French-IN\"\r\n" + 
				"}")
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200);
		   
	}

}
