package se.thinkcode.notes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NotesSteps {
    private Memory memory;
    private Note note;

    @Given("she must remember to book Nalen")
    public void she_must_remember_to_book_Nalen() {
        memory = new Memory();
        note = new Note("Remember to book Nalen");
    }

    @When("she writes the note")
    public void she_writes_the_note() {
        memory.save(note);
    }

    @Then("should she be able to see the note")
    public void should_she_be_able_to_see_the_note() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
