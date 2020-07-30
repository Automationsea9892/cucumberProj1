package com.test.project.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvokeBrowser {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		String browser = "firefox";

		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		

		driver.get("https://ui.cogmento.com/");

		driver.findElement(By.name("email")).sendKeys("rahulscreencast9892@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Ra987456321@");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

	}
}

/*
 * driver.get("https://flipkart.com"); Thread.sleep(5000);
 * driver.findElement(By.
 * xpath("//input[@type='text' and @class='_2zrpKA _1dBPDZ']")).sendKeys(
 * "testuser12345");
 */

/*
 * driver.manage().window().maximize();
 * 
 * driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
 * 
 * WebDriverWait wait = new WebDriverWait(driver, 20);
 * wait.until(ExpectedConditions .visibilityOfElementLocated(By.
 * xpath("//input[@autocomplete='new-password' and  @name='first_name']")));
 * driver.manage().window().maximize(); driver.get("https://ui.cogmento.com/");
 * 
 * driver.findElement(By.name("email")).sendKeys("rahulscreencast9892@gmail.com"
 * ); driver.findElement(By.name("password")).sendKeys("Ra9892338563@");
 * driver.findElement(By.
 * xpath("//div[@class='ui fluid large blue submit button']")).click();
 * Thread.sleep(5000); driver.findElement(By.linkText("Contacts")).click();
 * Thread.sleep(5000);
 * driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
 * Thread.sleep(5000); driver.findElement(By.
 * xpath("//input[@autocomplete='new-password' and  @name='first_name']")).
 * sendKeys("jason");
 * 
 * driver.findElement(By.
 * xpath("//input[@autocomplete='new-password8765' or @name='first_name']"))
 * .sendKeys("jason");
 * 
 */
// driver.findElement(By.xpath("//*[contains(text(),'Forms')]")).click();
/*
 * Thread.sleep(5000);
 * //driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]")).click();
 * driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[3]")).click();
 */

// driver.findElement(By.tagName("a")).click();
// driver.findElements(By.tagName("a")).get(2).click();

/*
 * List<WebElement> elem=driver.findElements(By.tagName("a")); for(WebElement
 * elem2:elem) { if(elem2.getText().equals("Sign Up")) {
 * System.out.println(elem2.getText()); elem2.click(); break;
 * 
 * }
 * 
 * }
 */

/*
 * driver.findElement(By.id("fromCity")).sendKeys("nagpur");
 * driver.findElement(By.name("email")).sendKeys("rahulb989@gmail");
 * driver.findElement(By.name("password")).sendKeys("rahul876677");
 * System.out.println(driver.findElement(By.linkText("Classic CRM")).getText());
 * System.out.println(driver.findElement(By.linkText("Sign Up")).getText());
 * driver.findElement(By.partialLinkText("your password?")).click();
 */

/*
 * driver.findElement(By.xpath("//*[contains(text(),'Free account')]")).click();
 * 
 * driver.findElement(By.linkText("Contacts")).click();
 * 
 * 
 * driver.findElement(By.linkText("New")).click();
 * 
 * WebDriverWait wait=new WebDriverWait(driver,20);
 * 
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
 * xpath("//*[@name='first_name' or @type='text']"))).click();
 * 
 * driver.findElement(By.xpath("//*[@name='first_name' or @type='text']")).
 * sendKeys("Elston");
 */
