package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {
	
	
	
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver;
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Reshma\\lib\\chromedriver_win32\\chromedriver.exe");	 
		  driver = new ChromeDriver();
		  driver.get("http://www.way2selenium.com/");
		  Thread.sleep(5000);
		  driver.manage().window().maximize();
		 }
	
	
	}


