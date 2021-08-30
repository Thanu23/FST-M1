package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity5 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		WebElement jobLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/a[text()='Jobs']")));
		jobLink.click();
		String title = driver.getTitle();
     	  if (title.matches("Jobs – Alchemy Jobs"))
     	  {
     		  System.out.println("Page title is: " + title);
     
     		  driver.close();
     		  
     	  }
     	else 
		{ 
			System.out.println("the heading of the current page is not as expected  " + title);
		}
	}
}
