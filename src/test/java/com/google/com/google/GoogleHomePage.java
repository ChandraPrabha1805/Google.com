package com.google.com.google;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class GoogleHomePage {
	
	public static void main(String[] args) {
		
	   
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Home depot");
		driver.findElement(By.xpath("//*[contains(text(),'About')]")).click();
		driver.quit();
	

}
}