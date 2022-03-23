package stepdefs;

import io.cucumber.java.en.Given;

public class MainStepDefs {
    @Given("Some initial step")
    public void initial_step() {
        System.out.println("Hi!");
    }
}
