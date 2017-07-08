package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Multiplewindowhandle {
	 WebDriver driver;
	 
	 @Test(priority=1)
	 public void setup() throws InterruptedException{
		 
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Reshma\\lib\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://192.168.1.102/JIBE/Account/Login.aspx?");
		Thread.sleep(3000);
		driver.manage().window().maximize();

		// capturing title
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		
	
	 
	driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_LoginButton']")).click();
	Thread.sleep(2000);
	
	String a=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_LoginUserValidationSummary']")).getText();
	System.out.println("error msg"+a);
	Thread.sleep(2000);

		// login credational
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_UserName']")).sendKeys("reshmaa");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_Password']")).sendKeys("jibe@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_LoginButton']")).sendKeys(Keys.ENTER);
		// driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_LoginButton']")).click();
		Thread.sleep(3000);

		// Refresh page
		driver.navigate().refresh();
		Thread.sleep(4000);

	
		//get currenurl
		driver.get(driver.getCurrentUrl());
		Thread.sleep(4000);
		
		
		
		// get new title
		String title1 = driver.getTitle();
		System.out.println("Title is: " + title1);

		// Select "crew" module
		WebElement crewm = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/a/span")));
		Actions action = new Actions(driver);
		action.moveToElement(crewm).build().perform();
		action.moveToElement(crewm).perform();
		Thread.sleep(2000);

		// Select "admin"
		WebElement admin = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/ul/li[1]/a/span")));
		admin.click();
		action.moveToElement(admin).build().perform();

		// Select "Training Types"
		WebElement TrainingTypes = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[7]/a/span"));
		TrainingTypes.click();
		Thread.sleep(5000);

		// click on training type edit button
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_gvTrainingTypes_ctl02_ImgUpdate']")).click();
		Thread.sleep(5000);

		// get value of textbox
		String a1 = driver.findElement(By.name("ctl00$MainContent$txtTrainingType")).getAttribute("value");
		System.out.println("textbox name :" + a1);
		Thread.sleep(5000);

		/*//click on save
		driver.findElement(By.xpath(".//input[@name='ctl00$MainContent$btnsave']")).click();
		Thread.sleep(5000);*/
		
		/*//getting colour of textbox
		String clr=driver.findElement(By.name("ctl00$MainContent$btnFilter")).getCssValue("colour");
		System.out.println("colour of textbox:" +clr);
		Thread.sleep(5000);*/
		// click on save
		driver.findElement(By.xpath(".//input[@name='ctl00$MainContent$btnsave']")).click();
		Thread.sleep(5000);

		// verifying element is displayed on screen using display method
		boolean btnpresent = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ImgAdd']")).isDisplayed();
		System.out.println("button (isdisplayed):" + btnpresent);

		// verifying element is displayed on screen using enabled method
		boolean btnpresent1 = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_ImgAdd']")).isEnabled();
		System.out.println("button (isenabled) :" + btnpresent1);

	}
	 
	 //****************************************************************************************************************************************************//
	 @Test(priority=2)
	 public void width () throws InterruptedException{
		 
		// Select "crew" module
		WebElement crewm = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/a/span")));
		Actions action = new Actions(driver);
		action.moveToElement(crewm).build().perform();
		action.moveToElement(crewm).perform();
		Thread.sleep(2000);

		// Select "admin"
		WebElement admin = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/ul/li[1]/a/span")));
		admin.click();
		action.moveToElement(admin).build().perform();

		// Select "Training Types"
		WebElement TrainingTypes = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[7]/a/span"));
		TrainingTypes.click();
		Thread.sleep(5000);

		// click on training type edit button
		driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_gvTrainingTypes_ctl02_ImgUpdate']")).click();
		Thread.sleep(5000);

		WebElement element = driver.findElement(By.xpath(".//input[@name='ctl00$MainContent$txtTrainingType']"));

		int high = element.getSize().height;
		int width = element.getSize().width;

		System.out.println("height :" + high);
		System.out.println("Width :" + width);

		// click on save
		driver.findElement(By.xpath(".//input[@name='ctl00$MainContent$btnsave']")).click();
		Thread.sleep(5000);
	 }
	  
	//****************************************************************************************************************************************************//
		 @Test(priority=3)
		 public void viewdropdownlist () throws InterruptedException{
	  
		// Select "crew" module
		WebElement crewm = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/a/span")));
		Actions action = new Actions(driver);
		action.moveToElement(crewm).build().perform();
		action.moveToElement(crewm).perform();
		Thread.sleep(2000);

		// Select "admin"
		WebElement admin = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/ul/li[1]/a/span")));
		admin.click();
		action.moveToElement(admin).build().perform();

		// Select "crew rank scale"
		WebElement TrainingTypes = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[13]/a/span"));
		TrainingTypes.click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(6000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		 }}
