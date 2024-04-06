package com.api.test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class getApi {
	
	@Test
	public void post()
	 {
		HashMap h = new HashMap();
				h.put("Name", "New abc");
				h.put("Role", "mchf");
				h.put("Company", "Pet");
				h.put("age", "6");
				
	    given().
	    contentType("application/json").
	    body(h).
	    when().post("http://localhost:8000/users/").
	    then().log().body().statusCode(201);
	 }

	
		@Test
		public void getapi()
		 {
		    given().
		    contentType("application/json").
		    when().
		    get("http://localhost:8000/users/").
		    then().log().body().statusCode(200);
		 }
		@Test
		public void put()
		 {
			HashMap h = new HashMap();
			h.put("Name", "pumskyone");
			h.put("Role", "ABC");
			h.put("Company", "Pet");
			h.put("Experience", "6");
	
			
		    given().
		    contentType("application/json").body(h).
		    when().
		    put("http://localhost:8000/users/be11").
		    then().log().body().statusCode(200);
		 }


}
