package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import pages.GooglePageObject;

public class GoogleSearchSteps {
	GooglePageObject googlePageObject;
	
	@Step("{0} opens browser on Google Page")
	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
//		google.navigateToGoogle();
		googlePageObject.open();
	}

	@Step("{0} user enters a text in search box")
	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		googlePageObject.writeOnSearchField("Automation Step by Step");
	}

	@Step("{0} user enters a text in search box")
	@When("user enters a text read on sheet in search box")
	public void user_enters_a_text_read_on_googleSheet_in_search_box() {
		googlePageObject.readSheetAndWriteOnSearchField(0);
	}

	@Step("{0} user enters a text in search box")
	@When("user enters a text read on DataBase in search box")
	public void user_enters_a_text_read_on_dataBase_in_search_box() {
		googlePageObject.readDBAndWriteOnSearchField(1);
	}

	@Step("{0} user hits enter")
	@When("hits enter")
	public void hits_enter() {
		googlePageObject.pressEnterOnSearchField();
	}

	@Step("{0} assert that Online Courses exist in PageSource")
	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		googlePageObject.assertContent();
	}

}
