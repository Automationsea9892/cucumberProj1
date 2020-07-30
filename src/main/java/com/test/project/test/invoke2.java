package com.test.project.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class invoke2 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://ui.cogmento.com/");
		driver.findElement(By.name("email")).sendKeys("rahulscreencast9892@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Ra987456321@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		
		/*Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().to("https://www.amazon.in ");
		Thread.sleep(5000);
		driver.navigate().refresh();*/
		
		
	}
}
















/*
 * String browserName = "firefox";
 * 
 * if (browserName.equalsIgnoreCase("chrome")) {
 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
 * + "\\drivers\\chromedriver.exe"); driver = new ChromeDriver();
 * 
 * } else if (browserName.equalsIgnoreCase("firefox")) {
 * System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
 * "\\drivers\\geckodriver.exe"); driver = new FirefoxDriver();
 * 
 * } driver.manage().window().maximize();
 * driver.get("https://ui.cogmento.com/");
 * 
 * //driver.findElement(By.id("fromCity")).sendKeys("Mumbai");
 * driver.findElement(By.name("email")).sendKeys("rahulscreencast9892@gmail.com"
 * ); driver.findElement(By.name("password")).sendKeys("Ra9892338563@");
 * driver.findElement(By.
 * xpath("//div[@class='ui fluid large blue submit button']")).click();
 * //implicite wait //Explicite wait //Fluient wait. Thread.sleep(5000);
 * driver.findElement(By.partialLinkText("Compa")).click();
 */

// name
// classname
