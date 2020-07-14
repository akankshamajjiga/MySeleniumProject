package myFifthDaySeleniumTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		 
	      WebDriver driver = new ChromeDriver();
		
		  driver.manage().window().maximize();	
		
		  driver.get("https://www.ebay.com/");
		 
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		  //driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("java");
		
		  //driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("java");
		  
		  //driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("java");
		  
		  driver.findElement(By.xpath("//input[starts-with(@id,'gh-ac')]")).sendKeys("java");
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	}

}
