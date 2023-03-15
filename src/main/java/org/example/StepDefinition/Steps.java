package org.example.StepDefinition;
import org.example.SelCucMethods.Methods;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;

public class Steps {
    Methods method = new Methods();
    String URL = "https://www.canada.ca/en/immigration-refugees-citizenship.html";
    String workLocatorType;
    String workLocatorValue;

    @Given("User Opens IRCC Webpage")
    public void OpenWebPage() {
        method.OpenWebPage(URL);
        System.out.println("Opened Webpage");
    }

    @When("I select Work")
    public void SelectWorkOption() throws InterruptedException {
        workLocatorType = "LinkText";
        workLocatorValue = "Work";
        method.click(workLocatorType, workLocatorValue);
        System.out.println("Selected Work");
    }

    @Then("I should be on the Work in Canada page")
    public void verifyIfYourAreOnWorkInCanadaPage() throws InterruptedException {
        workLocatorType = "XPath";
        workLocatorValue = "//div[@class='mwsgeneric-base-html parbase section']//h1";
        method.verify(workLocatorType, workLocatorValue, "Work in Canada");
        System.out.println("I am on Work in Canada page");
    }

    @Then("select Find out if you need a work permit")
    public void clickFindOutIfYouNeedWorkPermit() throws InterruptedException {
        workLocatorType = "LinkText";
        workLocatorValue = "Find out if you need a work permit";
        method.click(workLocatorType, workLocatorValue);
        System.out.println("Clicked on Find out if you need a work permit");
    }

    @Then("I should be on Find out if you need a work permit page")
    public void verifyIfYouAreOnFindOutIfYouNeedWorkPermitPage() throws InterruptedException {
        workLocatorType = "XPath";
        workLocatorValue = "//h1[@id='wb-cont']";
        method.verify(workLocatorType, workLocatorValue, "Find out if you need a work permit");
        System.out.println("I am on Find out if you need a work permit page");
    }

    @When("I click on Find out what you need")
    public void clickFindOutWhatYouNeed() throws InterruptedException {
        workLocatorType = "XPath";
        workLocatorValue = "//a[@class='btn btn-call-to-action']";
        method.click(workLocatorType, workLocatorValue);
        System.out.println("Clicked on Find out what you need");
    }

    @Then("I Click on the radio button I’m the main or principal applicant")
    public void clickImTheMainOrPrincipalApplicant() throws InterruptedException {
        workLocatorType = "XPath";
        workLocatorValue = "//input[@value='I’m the main or principal applicant']";
        method.click(workLocatorType, workLocatorValue);
        System.out.println("Clicked on the radio button I’m the main or principal applicant");
                                                                                  }

    @Then("I click on Next button")
    public void clickOnNextButton() throws InterruptedException {
        workLocatorType = "XPath";
        workLocatorValue = "//div[@class='visible']/a[text()='Next ']";
        method.click(workLocatorType, workLocatorValue);
        System.out.println("Clicked on the Next button");                            }

    @Then("I click on radio button NO")
    public void clickOnRadioButtonNo() throws InterruptedException {
        workLocatorType = "XPath";
        workLocatorValue = "//input[@value='No']";
        method.click(workLocatorType, workLocatorValue);
        System.out.println("Clicked on radio button No");
                                                                    }

    @Then ("I click on radio button I applied or will apply for permanent residence very soon")
    public void clickOnRadioButtonIAppliedOrWillApplyForPRVerySoon() throws InterruptedException {
        workLocatorType = "XPath";
        workLocatorValue = "//div[@class='radio']/label[contains(text(), ' I applied or will apply for permanent residence very soon')]/input";
        System.out.println("Clicked on the radio button I applied or will apply for permanent residence very soon");
        method.click(workLocatorType, workLocatorValue);
                                                                                                 }

    @Then ("I click on radio button in Canada and applied for permanent residence in a program under Express Entry")
    public void clickOnRadioButtoninCanadaAndAppliedForPRinAProgUnderEE() throws InterruptedException{
        workLocatorType = "XPath";
        workLocatorValue = "//div[@class='radio']/label[contains(text(), ' in Canada and applied for permanent residence in a program under Express Entry')]/input";
        method.click(workLocatorType, workLocatorValue);
        System.out.println("Clicked on the radio button in Canada and applied for permanent residence in a program under Express Entry");
                                                                                                        }

    @Then ("I am on the You need a work permit page")
    public void verifyIfYouAreOnYouNeedAWorkPermitPage() throws InterruptedException
    {
        workLocatorType = "XPath";
        workLocatorValue = "//h1[text()=' You need a work permit ']";
       // System.out.println("Clicked on the Next button");
        //String expectedValue="You need a work permit";
        method.verify(workLocatorType, workLocatorValue, "You need a work permit");
        System.out.println("You Need a Work Permit");

    }

    @Then ("I Close the Browser")
    public void closeTheBrowser ()
    {
        System.out.println("Ending Test");
        System.out.println("Closing Browser");
        method.closeBrowser();
        System.out.println("Test successful");

    }


}