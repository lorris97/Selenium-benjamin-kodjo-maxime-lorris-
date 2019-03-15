
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author lorris
 */
public class Selenium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lorris\\Desktop\\master\\Développement\\Selenium\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://stackoverflow.com/questions/18684202/java-lang-noclassdeffounderror-com-google-common-collect-maps-selenium");
        driver.manage().window().maximize();
// TODO code application logic here
    }
    
}
