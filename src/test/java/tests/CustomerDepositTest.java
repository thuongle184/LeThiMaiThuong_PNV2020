package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static tests.PageProvider.getCustomerDepositPage;
import static tests.PageProvider.getCustomerLoginPage;

public class CustomerDepositTest {

    @When("^I login with username as (.*) successfully$")
    public void loginBeforeDeposit(String usernameSelected) throws InterruptedException {
        Thread.sleep(2000);
        getCustomerLoginPage().selectUserName(usernameSelected);
        getCustomerLoginPage().clickLoginButton();
    }

    @When("^I click deposit button$")
    public void clickDepositTab() throws InterruptedException {
        Thread.sleep(2000);
        getCustomerDepositPage().navigateToDepositTab();
    }

    @When("^I type the depsit as (.*)$")
    public void chooseDepositAmount(String depositAmount) throws InterruptedException {
        Thread.sleep(2000);
        getCustomerDepositPage().typeDepositAmount(depositAmount);
    }

    @When("^I click deposit submit button$")
    public void clickDepositSubmitButton() throws InterruptedException {
        Thread.sleep(2000);
        getCustomerDepositPage().submitDeposit();
    }

    @Then("^I verify that customer deposit successfully$")
    public void depositSuccesfully() throws InterruptedException {
        Thread.sleep(2000);
        getCustomerDepositPage().verifyDepositSuccessfully();
    }
}
