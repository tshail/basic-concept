package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginvalidation {
	WebDriver driver;
	
	 @Test(priority=1)
	public void Adminm() throws Exception {
	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Reshma\\lib\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://192.168.1.102/JIBE/Account/Login.aspx?");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		/*CASE- 1. Both User name and Password are entered correctly. 
		Check whether Email field exists or not */
		    try
		        {
		          WebElement a1 = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_UserName']"));
		          System.out.println("---------Email field exists --------------\n-----------------------");
		          a1.sendKeys("reshmaa");
		          Thread.sleep(2000);
		         }
		    catch(Throwable e)
		         {
		         System.out.println("Email field not found: " + e.getMessage());
		         }

		    //Check whether Password field exists or not
		     try
		        {
			 WebElement password = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_Password']"));
		         System.out.println("----------Password field exits ------------\n-----------------------");
		         password.sendKeys("jibe@123");
		         Thread.sleep(2000);
		        }
		    catch(Throwable e)
		        {
			 System.out.println("Password field not found: " + e.getMessage());
		        }

		     //Asserting the Sign In button exists or not and clicking it
		    try
		       {
			WebElement button = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_LoginButton']"));
		        System.out.println("-------Sign In button exists----------\n-----------------------");
		      	        }
		    catch(Throwable e)
		        {
			System.out.println("Sign In button not found: "+ e.getMessage());
		        }
		    //Check if login was proper or not
		    try
		        {
			//WebElement GmailText = driver.findElement(By.xpath("//*[@id=':36']"));
		        String text = driver.getTitle();
		        System.out.println("Page Title is: " +text);
		        
		        if(text.equals("Log In"))
		       {
			System.out.println("----------Sucessful Login -------\n-----------------------");
		       }else
		       {
			System.out.println("----------Login Failure ----------\n-----------------------");
			}
		       }
		     catch(Throwable e)
		        {
			 System.out.println("Inbox link not found: "+e.getMessage());
		        }
		    
		    
		    
		 // CASE- 2. Both Email and Password Fields are blank.
		    try
		        {
		    	driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_UserName']")).clear();
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_Password']")).clear();
		    	Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_LoginButton']"));
		button.click();	
		driver.navigate().refresh();
		Thread.sleep(2000);
		//WebElement GmailText = driver.findElement(By.xpath("//*[@id=':36']"));
		String text = driver.getTitle();
		 System.out.println("Page Title is: " +text);
		 Thread.sleep(2000);
		if(text.equals("JIBE::DashBoard"))
		{
		   System.out.println("----------Sucessful Login -------");
		}
		else
		{
			System.out.println("----------Login Failure ----------");
				}
				
		}
		catch(Throwable e)
		{
				System.out.println("Error! Email and Password fields are blank. \n----------------------- ");
		System.out.println("Element not found: "+e.getMessage() + "\n-----------------------");
		  }

		 // CASE- 3. Email field is filled and Password field is blank
		    try
		    {		
		    		WebElement email = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_UserName']"));
		    email.sendKeys("reshmaa");
		    Thread.sleep(2000);
		    
		    WebElement button = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_LoginButton']"));
		    button.click();
		    Thread.sleep(2000);


		   // WebElement GmailText = driver.findElement(By.xpath(".//*[@id='nav']/li[1]/a/span"));
		    String text = driver.getTitle();
		    System.out.println("Title is" +text);
		    if(text.equals("JIBE::DashBoard"))
		    {
		    System.out.println("----------Sucessful Login -------\n-----------------------");
		    }
		    else
		    {
		    System.out.println("----------Login Failure ----------\n-----------------------");
		    		}
		    		
		     }
		    catch(Throwable e)
		     {
		    		System.out.println("Error! Password field is blank. \n-----------------------");
		    System.out.println("Element not found: "+e.getMessage() + "\n-----------------------");
		     }	

		    driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_UserName']")).clear();			// Clearing the Email field


	// CASE- 4. Email field is blank and Password field is filled

	 try
	 {		
	 		WebElement password = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_Password']"));
	 password.sendKeys("jibe@123");
	 Thread.sleep(3000);
	 
	 WebElement button = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_LoginButton']"));
	 button.click();
	 Thread.sleep(3000);

	// WebElement GmailText = driver.findElement(By.xpath("//*[@id=':36']"));
	 String text = driver.getTitle();
	 System.out.println(text);
	 Thread.sleep(3000);
	 if(text.equals("Log In"))
	 {
	 System.out.println("----------Sucessful Login -------");
	 }
	 else
	 {
	 System.out.println("----------Login Failure ----------");
	 		}
	 			
	 }
	 catch(Throwable e)
	 {
	     	System.out.println("Error! Email field is blank. \n-----------------------");
	 System.out.println("Element not found: "+e.getMessage() + "\n-----------------------");
	  }
	   
	 driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_Password']")).clear();	
	 Thread.sleep(3000);// Clearing the Password field
	 }
}