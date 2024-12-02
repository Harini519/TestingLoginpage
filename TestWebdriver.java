package com.webdrivertest.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

;

public class TestWebdriver {
   public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 String url="https://www.hackerrank.com/auth/login";
	 driver.get(url);
	 
	 // sucessfully website open ;
	   String actualTitle="Welcome to the-internet";
	   String exceptedTitle=  driver.getTitle();
	   if (exceptedTitle.equals(actualTitle))
     {
            System.out.println("Verification Successful - The correct title is displayed on the web page.");
     }
    else
     {
            System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
     }
	   
	  try {

//	   WebDriverWait wait = new WebDriverWait(driver, null);
//	     
//	   WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-aria6357234694-6722")));
	 
	 WebElement username= driver.findElement(By.name("username"));
		  username.clear();
		  username.sendKeys("harininaidu19@gmail.com");
		  
//	 
	 WebElement password = driver.findElement(By.name("password"));
     password.clear();
     password.sendKeys("harini");
     
     WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
     submit.submit();
   }catch(Exception e) {
	   System.out.println(e);
   }
   }

}
