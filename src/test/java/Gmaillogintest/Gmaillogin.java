package Gmaillogintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Gmaillogin {
	   WebDriver driver;
	@BeforeClass
    public void setUp() {
        // Set the system property for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Gmailtestpro\\Driver\\chromedriver.exe");

        // Initialize the WebDriver instance (in this case, ChromeDriver)
        driver = new ChromeDriver();
      
    }

    @Test
    public void openGoogle() {
        //1 Navigate to a website (e.g., google.com)
        //driver.get("https://www.google.com");
    	driver.get("https://mail.google.com/mail/u/0/?pli=1#inbox");
    	
    	
        try {
        	WebElement emailInput = driver.findElement(By.id("identifierId"));
            emailInput.sendKeys("pritha.banerjee12071998@gmail.com");
			Thread.sleep(5000);
			 WebElement nextButton = driver.findElement(By.id("identifierNext"));
		     nextButton.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        
       // WebElement passwordInput = driver.findElement(By.name("password"));
        //passwordInput.sendKeys("Pri@1207");

        // Perform your test actions here
        // Example: driver.findElement(By.name("q")).sendKeys("TestNG");
    }
    
    /* @AfterClass
    public void tearDown() {
        // Close the browser and quit the WebDriver
        if (driver != null) {
            driver.quit();
        }
    }*/
}
