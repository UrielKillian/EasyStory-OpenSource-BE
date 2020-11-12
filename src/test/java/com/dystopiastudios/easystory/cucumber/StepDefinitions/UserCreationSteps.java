package com.dystopiastudios.easystory.cucumber.StepDefinitions;

import com.dystopiastudios.easystory.cucumber.SpringIntegrationTest;
import com.dystopiastudios.easystory.cucumber.resource.SaveUserResource;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.http.HttpStatus;

import java.io.IOException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class UserCreationSteps extends SpringIntegrationTest {
    SaveUserResource userResource = new SaveUserResource();

    @Given("i am a client and entered the correct data")
    public void i_am_a_client_and_entered_the_correct_data() {
        userResource.setUsername("Frosty");
        userResource.setPassword("password");
        userResource.setFirstName("Roberto");
        userResource.setLastName("Sanchez");
        userResource.setEmail("robertosan@gmail.com");
        userResource.setTelephone("996532401");

    }

    @Given("i am a client and entered the incorrect data")
    public void i_am_a_client_and_entered_the_incorrect_data() {
        userResource = null;
    }

    @When("i make a user request to {string}")
    public void i_make_a_user_request_to(String path) throws IOException {
        executePost(path, userResource);
    }
    @Then("the response result received should be {int}")
    public void the_response_result_received_should_be(Integer codeResponse) {
        assertThat(response.value(), is(codeResponse));
    }
    @Then("the response result received should be a bad {int}")
    public void the_response_result_received_should_be_a_bad(Integer codeResponse) {
        assertThat(response.value(), is(HttpStatus.BAD_REQUEST.value()));
    }
}
