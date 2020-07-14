package myFifthDaySeleniumTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		 
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().back();
		
		Thread.sleep(30);
		
		driver.navigate().forward();
		
		Thread.sleep(30);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
	}

}
