package firstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
    WebDriver wd;

    @BeforeMethod
    public void preConditions() {
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com");
    }
        @Test
        public void testName () {

            WebElement el = wd.findElement(By.tagName("a"));
            WebElement el1 = wd.findElement(By.tagName("div"));
         //   WebElement el2 = wd.findElement(By.ByClassName("btn btn-sm btn-link"));
          //  WebElement link = wd.findElement(By.linkText(("Sign up")));
        }

    }

