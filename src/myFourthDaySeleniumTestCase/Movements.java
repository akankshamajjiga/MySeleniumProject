package myFourthDaySeleniumTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
      System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		 
      WebDriver driver = new ChromeDriver();
	
	  driver.manage().window().maximize();
		 
	  driver.get("https://www.spicejet.com/Default.aspx");	 
	  
	  Actions a = new Actions(driver);
	  
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  a.moveToElement(driver.findElement(By.id("header-addons"))).build().perform();
	  
	  driver.findElement(By.id("header-addons")).click();
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.findElement(By.linkText("SpiceMax")).click();
	  
	}

}
