package com.test.project.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionss {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");
		// driver.findElement(By.id("fromCity")).sendKeys("Mumbai");
		driver.findElement(By.name("email")).sendKeys("rahulscreencast9892@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Ra9892338563@");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("New")).click();
		Thread.sleep(5000);
		
	Actions act =new Actions(driver);
	
	WebElement description=driver.findElement(By.xpath("//textarea[@name='description']"));
	description.sendKeys("Test"); 
	act.contextClick();		
	act.click(description);
				Action actSeries;
				actSeries=act.doubleClick(description).contextClick().sendKeys(Keys.CONTROL + "a").build();
				actSeries.perform();
			

	}

}
