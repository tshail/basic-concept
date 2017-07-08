package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest {
	
	public void Adminm(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Reshma\\lib\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.get("http://114.79.180.66/JIBE/Account/Login.aspx?");
			Thread.sleep(3000);
			driver.manage().window().maximize();

				// Select "crew" module
				WebElement crew = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/a/span")));
				Actions action = new Actions(driver);
				action.moveToElement(crew).build().perform();
				action.moveToElement(crew).perform();
				Thread.sleep(2000);

				// Select "admin"
				WebElement admin = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/ul/li[1]/a/span")));
				admin.click();
				action.moveToElement(admin).build().perform();

				// Select "crew rank"
				WebElement crewrank = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[32]/a/span"));
				crewrank.click();
				Thread.sleep(5000);
				
				
				driver.findElement(By.xpath(".//input[@type='checkbox']")).getSize();
				Thread.sleep(5000);
				
}
}	