package com.test.project.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrowser {

	public static WebDriver driver;

	public static void main(String[] args) {
		
		String browserName= "chrome";
	
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver=new ChromeDriver(); 
			
		}else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
			
		driver.get("https://makemytrip.com");
		
		/*driver.findElement(By.name("email")).sendKeys("rbrahulbarapatre@gmail.com"); 
		driver.findElement(By.name("password")).sendKeys("Ra123456789@");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();*/
		
		driver.findElement(By.id("fromCity")).sendKeys("Mumbai");
		
		}
}
