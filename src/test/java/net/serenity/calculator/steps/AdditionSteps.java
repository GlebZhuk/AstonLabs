package net.serenity.calculator.steps;

import net.serenity.calculator.steps.serenity.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class AdditionSteps {

    @Steps
    UserSteps user;

    @Given("I have searched for <search_query>")
    public void givenIHaveSearchedForCalculator(@Named("search_query") String searchQuery) {
        user.search_for_calculator(searchQuery);
    }

    @When("I add the <first_numer> by the <second_number>")
    public void whenIAddTheNumbers(@Named("first_number") Double firstNumber, @Named("second_number") Double secondNumber) {
        user.produce_addition(firstNumber, secondNumber);
    }

    @Then("I get the <sum>")
    public void thenIGetTheSum(@Named("sum") Double sum) {
        user.check_result_addition(sum);
    }

}
