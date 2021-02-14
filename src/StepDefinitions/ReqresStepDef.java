package StepDefinitions;

import static org.hamcrest.Matchers.equalTo;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ReqresStepDef {
	
	
	
	 RequestSpecification httpRequest = null;
	 Response response = null;
	 
	 @Before
	 public void BeforeMethod() {
		 
		 RestAssured.baseURI = "https://reqres.in";
	        //This specifices this is HTTP Protocol Specification
	        httpRequest = RestAssured.given(); 
		 
	 }
	  
	   

	/*response =   RestAssured.given().
			     param("page","2").
			     when().
			     get("/api/users").
			     then().
			     assertThat().statusCode(200).and().
			     header("Content-Type","application/json; charset=utf-8").and().
			     header("Content-Encoding","gzip").and().
			     body("page",equalTo(2)).and().
			     extract().
			     response();*/
	
	@Given("^Set the Parameter to page as (\\d+)$")
	public void set_the_Parameter_to_page_as(int arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("given");
	}

	@When("^Perform Ger Operation to get the list of users$")
	public void perform_Ger_Operation_to_get_the_list_of_users() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when");
	}

	@Then("^Verify the status code$")
	public void verify_the_status_code() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then");
	}

	@Then("^Verify the Response Header Content-Type$")
	public void verify_the_Response_Header_Content_Type() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("thenn");
	}

	@Then("^Verify the Response Header content-encoding$")
	public void verify_the_Response_Header_content_encoding() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("thengiven");
	}

	@Then("^Verify the Response Body for Page is (\\d+)$")
	public void verify_the_Response_Body_for_Page_is(int arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("thenthengiven");
	}


}
