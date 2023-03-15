package org.example.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (features={"src/main/resources/BDD-Scripts"}, glue={"org.example.StepDefinition"}, tags="@workpermitcheck")

public class runCucumber {

    @BeforeClass
    public static void startUp() {
        System.out.println("Test started.");
    }

    @AfterClass
    public static void endTest() {
        System.out.println("Test ended.");
    }
}
