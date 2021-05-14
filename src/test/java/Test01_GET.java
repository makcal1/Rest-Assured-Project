
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers. *;
import static org.hamcrest.Matcher. *;
public class Test01_GET {


	@Test
	void test_01() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");


		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());

		int statucCode = response.getStatusCode();
		Assert.assertEquals(statucCode, 201);


	}
     @Test
     void test_02() {
    	 
    	 given().
    	 get("https://reqres.in/api/users?page=2").
    	 then()
    	 .statusCode(200)
    	 .body("data.id[0]",equalTo(7));
     
     }
	private ResponseAwareMatcher<Response> equalTo(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
