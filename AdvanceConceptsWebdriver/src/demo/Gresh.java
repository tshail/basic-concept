package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

public class Gresh {
	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filepath){
		if(report==null){
			report=new ExtentReports("C:\\Users\\Reshma\\workspace\\Vetting\\report.html",false);
			
			report.addSystemInfo("Host Name","Reshma");
			report.addSystemInfo("Environment","QA");
		
		}
		return report;
		}
	
public void mouseh(WebDriver driver1) throws Exception{
	WebDriver driver=driver1;
	
	WebElement technical=driver.findElement(By.xpath(".//*[@id='nav']/li[8]/a/span"));
	Actions action=new Actions(driver);
	action.moveToElement(technical).build().perform();
	action.moveToElement(technical).perform();
	Thread.sleep(2000);
	
	WebElement pms=driver.findElement(By.xpath(".//*[@id='nav']/li[8]/a/span"));
	pms.click();
	action.moveToElement(pms).perform();
	
	WebElement jobstatus=driver.findElement(By.xpath(".//*[@id='nav']/li[8]/a/span"));
	jobstatus.click();
	
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
    Thread.sleep(2000);			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
