package by.google;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {


        @Test
        public void firstTest() {
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.google.by/");
            String title = driver.getTitle();
            Assert.assertTrue(title.equals("Google"));
            driver.quit();
    }
}
