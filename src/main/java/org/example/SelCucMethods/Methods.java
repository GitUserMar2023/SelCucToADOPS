package org.example.SelCucMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import javax.xml.xpath.XPath;
import java.util.concurrent.TimeUnit;

public class Methods {
    WebDriver driver;
        public void OpenWebPage (String URL)
    {

        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
    }


    public void click(String locatorType,String locatorValue) throws InterruptedException {
        if (locatorType == "XPath") {
           // driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
            Thread.sleep(2000);
            driver.findElement(By.xpath(locatorValue)).click();

        } else if (locatorType == "Name") {
            // driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
            Thread.sleep(2000);
            driver.findElement(By.name(locatorValue)).click();

        } else if (locatorType == "ClassName") {
            // driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
            Thread.sleep(2000);
            driver.findElement(By.className(locatorValue)).click();

        } else if (locatorType == "ID") {
            // driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
            Thread.sleep(2000);
            driver.findElement(By.id(locatorValue)).click();

        } else if (locatorType == "LinkText") {
            // driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
            Thread.sleep(2000);
            driver.findElement(By.linkText(locatorValue)).click();

        }
    }
    public void verify(String locatorType,String locatorValue, String expectedValue) throws InterruptedException
    {
        String actualValue;

        if (locatorType == "XPath") {
            // driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
            Thread.sleep(2000);
            driver.findElement(By.xpath(locatorValue)).getText();
            actualValue = driver.findElement(By.xpath(locatorValue)).getText();
            //Assert.assertEquals(expectedValue, actualValue);
            actualValue.contains(actualValue);
                                    }
        else if (locatorType == "Name") {
            // driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
            Thread.sleep(2000);
            driver.findElement(By.name(locatorValue)).getText();
            actualValue = driver.findElement(By.name(locatorValue)).getText();
            Assert.assertEquals(expectedValue, actualValue);
                                        }
        else if (locatorType == "ClassName") {
            // driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
            Thread.sleep(2000);
            driver.findElement(By.className(locatorValue)).getText();
            actualValue = driver.findElement(By.className(locatorValue)).getText();
            Assert.assertEquals(expectedValue, actualValue);
                                             }
        else if (locatorType == "ID") {
            // driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
            Thread.sleep(2000);
            driver.findElement(By.id(locatorValue)).getText();
            actualValue = driver.findElement(By.id(locatorValue)).getText();
            Assert.assertEquals(expectedValue, actualValue);
                                      }
        else if (locatorType == "LinkText") {
            // driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
            Thread.sleep(2000);
            driver.findElement(By.linkText(locatorValue)).getText();
            actualValue = driver.findElement(By.linkText(locatorValue)).getText();
            Assert.assertEquals(expectedValue, actualValue);
                                            }

    }

    public void closeBrowser()
    {
        driver.quit();
    }


    }