package net.serenity.calculator.steps.serenity;

import net.serenity.calculator.pages.GoogleCalculatorPage;
import net.serenity.calculator.pages.GoogleSearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class UserSteps {

    @Steps
    GoogleSearchPage searchPage;

    @Steps
    GoogleCalculatorPage calculatorPage;

    @Step
    public void search_for_calculator(String searchQuery) {
        searchPage.open();

        searchPage.searchForString(searchQuery);
        try {
            searchPage.submitForm();
        } catch (Exception ex) {
            // Some logger need to be here
        }
        searchPage.titleShouldMatch(searchQuery);
    }

    @Step
    public void produce_addition(double num1, double num2) {

        calculatorPage.addition(num1, num2);
    }

    @Step
    public void produce_subtraction(double num1, double num2) {
        calculatorPage.subtraction(num1, num2);
    }

    @Step
    public void produce_division(double num1, double num2) {
        calculatorPage.division(num1, num2);
    }

    @Step
    public void produce_multiplication(double num1, double num2) {
        calculatorPage.multiplication(num1, num2);
    }

    @Step
    public void check_result_addition(Double sum) {
        calculatorPage.checkResult(sum);
    }

    @Step
    public void check_result_subtraction(Double difference) {
        calculatorPage.checkResult(difference);
    }

    @Step
    public void check_result_multiplication(Double composition) {
        calculatorPage.checkResult(composition);
    }

    @Step
    public void check_result_division(Double quotient) {
        calculatorPage.checkResult(quotient);
    }

    @Step
    public void check_result_division_by_zero(String infinity) {
        calculatorPage.checkResult(infinity);
    }
}