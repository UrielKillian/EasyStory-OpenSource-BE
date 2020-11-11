package com.dystopiastudios.easystory.cucumber.StepDefinitions;

import com.dystopiastudios.easystory.cucumber.SpringIntegrationTest;
import com.dystopiastudios.easystory.resource.QualificationResource;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class QualificationViewSteps extends SpringIntegrationTest {
    QualificationResource qualificationResource=new QualificationResource();
    @Given("i am a user in the qualification view")
    public void i_am_a_user_in_the_qualification_view() {
       qualificationResource.getUserId();
       qualificationResource.getPostId();
       qualificationResource.getQualification();
       qualificationResource.getCreatedAt();
       qualificationResource.getUpdatedAt();
    }


    @When("i make a get request to {string}")
    public void i_make_a_get_request_to(String path) throws IOException {
        executeGet(path,qualificationResource);
    }
    @Then("i should receive a status code {int}")
    public void i_should_receive_a_status_code(Integer codeResponse) {
        assertThat(response.value(), is(codeResponse));
    }
}
