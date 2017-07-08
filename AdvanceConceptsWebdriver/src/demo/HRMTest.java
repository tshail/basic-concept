package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HRMTest {
	WebDriver driver;
	
	@Test(priority=1)
	public void login() throws Exception {
		//WebDriver driver=driver1;
		
       //Set Property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Reshma\\lib\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();

		//Enter URL
		
		driver.get("https://repssi.orangehrmlive.com/symfony/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		// capturing title
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		
		// login credential
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
/*	}
		
		@Test(priority=2)*/
		//public void Dashboard(WebDriver driver1) throws Exception {
			//WebDriver driver=driver1;
		/*	
	     String Title1=driver.getTitle();
	     System.out.println(Title1);*/
		
		String url=driver.getCurrentUrl();   //local vairable
		System.out.println(url);
			
		//Click on  PIM Module
	     driver.findElement(By.xpath(".//*[@id='menu_pim_viewPimModule']")).click();
	     Thread.sleep(2000);
		
		//click on PIM-->add Employee
	     driver.findElement(By.xpath(" .//*[@id='menu_pim_addEmployee']")).click();
	     Thread.sleep(2000);
		
	    //click on PIM-->Bulk update
	     driver.findElement(By.xpath(".//*[@id='menu_pim_viewBulkUpdater']")).click();
	     Thread.sleep(4000);
	    
		//mouse hover on PIM-->Reports
	     WebElement report=driver.findElement(By.xpath(".//*[@id='menu_core_viewDefinedPredefinedReports']"));
	     Actions action= new Actions(driver);
	     action.moveToElement(report).build().perform();
	     Thread.sleep(4000);
	     
	     WebElement DefinedPredefinedReports=driver.findElement(By.xpath(".//*[@id='menu_core_viewDefinedPredefinedReports']"));
	     DefinedPredefinedReports.click();
	     Thread.sleep(4000);
	     
	    //mouse hover on PIM-->configuration
	     WebElement configuration=driver.findElement(By.xpath(".//*[@id='menu_pim_Configuration']"));
	     Actions action1= new Actions(driver);
	     action1.moveToElement(configuration).build().perform();
	     Thread.sleep(4000);
	     
	     WebElement ConfigurePIM=driver.findElement(By.xpath(".//*[@id='menu_pim_configurePim']"));
	     ConfigurePIM.click();
	     Thread.sleep(4000);
	     
	     //click on PIM-->add Employee
	     driver.findElement(By.xpath(" .//*[@id='menu_pim_addEmployee']")).click();
	     Thread.sleep(2000);
	     
	     //Enter First Name
	     driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("Anki");
	     Thread.sleep(2000);
	     
	     //Enter last Name
	     driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys("abc");
	     Thread.sleep(2000); 
	     
	     //click on "Browse" button
	     driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
	     Thread.sleep(2000);
	     
	     //click on save button
	     driver.findElement(By.xpath(".//*[@id='btnSave']")).click();
	     Thread.sleep(3000);
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
}
}