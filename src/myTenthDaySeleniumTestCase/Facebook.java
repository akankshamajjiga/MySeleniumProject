package myTenthDaySeleniumTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
			
		 driver.manage().window().maximize();
		
         driver.get("https://www.facebook.com/");
         
         driver.findElement( By.id("email")).sendKeys("learnerChachi@gmail.com");
         
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         
         driver.findElement(By.id("pass")).sendKeys("Aku@1997");
         
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         
         driver.findElement(By.id("u_0_b")).click();
         
         System.exit(0); 
         
	}

}
