package Automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstTest {
	public class TestNG {
		WebDriver driver ;
		@Test
		public void f() {
		  
		    String baseUrl = "https://www.google.com/";
		      
		         
		        System.out.println("LAUNCH THE BROWSER"); 
		        driver = new ChromeDriver();
		        driver.get(baseUrl);
		        String testTitle = "Free QA Automation Tools For Everyone";
		        String originalTitle = driver.getTitle();
		        Assert.assertEquals(originalTitle, testTitle);
	  }
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("Starting Test On Chrome Browser");
		}
		
		@AfterMethod
		public void afterMethod() {
			 driver.close();
			System.out.println("Finished Test On Chrome Browser");
			System.out.println("Install a chrome");
			System.out.println("maven");
		}
	}

}
