
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers. *;
public class Tests_GET {

	
@Test	
public void test_1() {
header("Content-Type","application/json").
given().get("https://reqres.in/api/users?page=2").


then().statusCode(200).
body("data.id[1]", equalTo(8)).
body("data.first_name", hasItems("Michael", "Lindsay","Tobias","Byron","George","Rachel")).log().all();



	
}

private RestAssured header(String string, String string2) {
	
	return null;
}

	
}
