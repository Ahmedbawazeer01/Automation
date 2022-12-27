package Automate;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class BrowserDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.facebook.com/");
		WebElement username_txt=w.findElement(By.id("email"));
		username_txt.sendKeys("Shaikahmed243@gmail.com");
		WebElement password_txt=w.findElement(By.id("pass"));
		password_txt.sendKeys("Hamad5011");
		WebElement login_btn=w.findElement(By.name("login"));
		login_btn.click();
		System.out.println("Welcome");
		System.out.println("Hello");
		
		
		

	}

}
