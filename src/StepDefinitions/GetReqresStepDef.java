package StepDefinitions;

import java.util.List;
import java.util.Map;
import com.balaji.domain.UserDetails;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetReqresStepDef {
	
	RequestSpecification httpRequest = null;
	Response response;
	ValidatableResponse json = null;
	
	@Given("^List of Users exist in Page ([^\"]*)$$")
	public void list_of_Users_exist_in_Page(String page) throws Exception {
		 RestAssured.baseURI = "https://reqres.in";
		 httpRequest = RestAssured.given();
			httpRequest.given().
			param("page", page);
	}

	@When("^a user retrieves the Users list of Page 2$")
	public void a_user_retrieves_the_Users_list_of_Page() throws Exception {
		response = httpRequest.when().get("/api/users");
	}

	@Then("^the status code is ([^\"]*)$")
	public void the_status_code_is(String statuscode) throws Exception {
		System.out.println("status code = " + statuscode);
		json = response.then().assertThat().statusCode(Integer.parseInt(statuscode));
	}

	@Then("^response includes the following$")
	public void response_includes_the_following(Map<String,String> responseFields) throws Exception {
		for (Map.Entry<String, String> field : responseFields.entrySet()) {
			System.out.println(field.getKey() + " " + field.getValue());
			JsonPath jsonpath = response.jsonPath();
			int page = jsonpath.get("page");
			int per_page = jsonpath.get("per_page");
			int total = jsonpath.get("total");
			//if(StringUtils.isNumeric(field.getValue())){
				//json.body(field.getKey(), equalTo(Integer.parseInt(field.getValue())));
			
		//	}
		//	else{
				//json.body(field.getKey(), equalTo(field.getValue()));
				//System.out.println(field.getKey() + " " + field.getValue());
		//	}
		}
	}

	@Then("^response includes the following list of users in any order$")
	public void response_includes_the_following_list_of_users_in_any_order(List<UserDetails> users) throws Exception {
		System.out.println("Number of users in the Page List :"+ users.size());
		for(int i = 0;i< users.size();i++)
		{
			UserDetails user = users.get(i);
			System.out.println("id = " + user.id + " email = " + user.email + " first_name = " + user.first_name + " last_name = " + user.last_name + " avatar = " + user.avatar);			
		}
	}


}
