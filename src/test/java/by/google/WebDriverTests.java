package by.google;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.

public class WebDriverTests extends WebDriverSettings {


    @Test
    public void title() {
        driver = new ChromeDriver();
        driver.get("https://www.google.by/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));
    }

    @Test
    public void windowSizeReduction() {
        driver.manage().window().setSize(new Dimension(100, 100));
    }

    @Test
    public void requestDemoButtonAndFillingRegistrationFields() {
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get("https://portal.dev.influential.co/");
        WebElement header = driver.findElement(By.id("navbar"));
        header.findElement(By.cssSelector("[href=\"/request-a-demo\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        driver.findElement(By.id("name")).sendKeys("Slava");
        driver.findElement(By.id("email")).sendKeys("vhaidukou@elinext.com");
    }
    @Test
    public void valueInputInTextFieldAndButtonClick() {
        driver.get("https://www.seleniumhq.org/");
        WebElement searchTextField = driver.findElement(By.id("q"));
        searchTextField.sendKeys("Java Selenium");
        WebElement searchButton = driver.findElement(By.xpath("//*[@value='Go']")); // Why we can change id on "value" and submit on "Go"?
        searchButton.click();
    }

}
