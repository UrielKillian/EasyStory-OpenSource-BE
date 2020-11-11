package com.dystopiastudios.easystory.cucumber.StepDefinitions;

import com.dystopiastudios.easystory.cucumber.SpringIntegrationTest;
import com.dystopiastudios.easystory.resource.BookmarkResource;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BookmarkViewSteps extends SpringIntegrationTest {

    BookmarkResource bookmarkResource = new BookmarkResource();
    @Given("i am a user in the bookmark view")
    public void i_am_a_user_in_the_bookmark_view() {
        bookmarkResource.getUserId();
        bookmarkResource.getPostId();
        bookmarkResource.getCreatedAt();
        bookmarkResource.getUpdatedAt();
    }


    @When("i make a get request to {string}")
    public void i_make_a_get_request_to(String path) throws IOException {
        executeGet(path,bookmarkResource);
    }
    @Then("i should receive a status code {int}")
    public void i_should_receive_a_status_code(Integer codeResponse) {
        assertThat(response.value(), is(codeResponse));
    }
}
