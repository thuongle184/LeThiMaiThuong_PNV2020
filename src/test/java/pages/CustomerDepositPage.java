package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CustomerDepositPage {

    @FindBy(css = "button.btn-lg:nth-child(2)")
    WebElement depositTab;
    @FindBy(css = ".form-control")
    WebElement depositNumber;
    @FindBy(css = ".btn-default")
    WebElement depositButton;
    @FindBy(css = ".error")
    WebElement message;


    public void navigateToDepositTab() throws InterruptedException {
        depositTab.click();
    }

    public void typeDepositAmount(String depositAmount) throws InterruptedException {
        depositNumber.clear();
        depositNumber.sendKeys(depositAmount);
    }

    public void submitDeposit() throws InterruptedException {
        depositButton.click();
    }

    public void verifyDepositSuccessfully() throws InterruptedException {
        if (message.isDisplayed()){
                System.out.println("Deposit Successful");
        }
        else System.out.println("user not loggined");
    }

}
