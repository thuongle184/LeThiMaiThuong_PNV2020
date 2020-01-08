package tests;

import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.CustomerDepositPage;
import pages.CustomerLoginPage;
import runner.TestRunner;

public class PageProvider {

    private static CustomerLoginPage customerLoginPage;
    private static CommonPage commonPage;
    private static CustomerDepositPage customerDepositPage;

    public static CustomerLoginPage getCustomerLoginPage(){
        if (customerLoginPage == null) {
            customerLoginPage = PageFactory.initElements(TestRunner.driver, CustomerLoginPage.class);
        }
        return customerLoginPage;
    }

    public static CommonPage getCommonPage(){
        if (commonPage == null) {
            commonPage = PageFactory.initElements(TestRunner.driver, CommonPage.class);
        }
        return commonPage;
    }

    public static CustomerDepositPage getCustomerDepositPage(){
        if (customerDepositPage == null) {
            customerDepositPage = PageFactory.initElements(TestRunner.driver, CustomerDepositPage.class);
        }
        return customerDepositPage;
    }
}
