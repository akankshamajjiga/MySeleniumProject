package myNinthDaySeleniumTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotstarPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
			
		 driver.manage().window().maximize();
		
		driver.get("https://www.hotstar.com/in");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector(".nav-link.has-new")).click();
		
		driver.findElement(By.id("searchField")).sendKeys("The Lion King");
		
		driver.findElement(By.id("searchField")).click();
		
		driver.findElement(By.cssSelector(".thumbnail-container")).click();
		
		System.exit(0);
	
	}

}
