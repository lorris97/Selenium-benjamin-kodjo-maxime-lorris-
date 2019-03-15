
import org.junit.*;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author lorris
 */
public class SeleniumTest {
    
    public SeleniumTest() {
    }

    @Test 
    public void seleniumTest()throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lorris\\Desktop\\master\\Développement\\Selenium\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://about.google/intl/fr_fr//");
        
        assertEquals("https://about.google/intl/fr_fr/", driver.getCurrentUrl());
        
        WebElement elem = driver.findElement(By.linkText("Nos produits"));
        elem.click();
        
        WebElement elem2 = driver.findElement(By.linkText("Notre entreprise"));
        elem2.click();
                  
        WebElement elem3 = driver.findElement(By.linkText("Nos histoires"));
        elem3.click();        
         
       
       
        driver.close();

    }
}