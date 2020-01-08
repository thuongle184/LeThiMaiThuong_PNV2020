package tests;

import cucumber.api.java.en.Given;
import runner.TestRunner;

public class CommonTest {

    @Given("^Open website (.*)$")
        public void userGoOnTheWeb(String website) throws InterruptedException {
        Thread.sleep(3000);
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();
    }
}
