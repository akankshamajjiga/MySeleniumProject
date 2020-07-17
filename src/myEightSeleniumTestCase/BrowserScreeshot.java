package myEightSeleniumTestCase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BrowserScreeshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		 
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		driver.get("https://www.myntra.com/ethnic-wear-dresses-menu");
		
		File src = ((TakesScreenshot)driver) .getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("C:\\Users\\User\\eclipse-workspace\\MySeleniumProject\\src\\myEightSeleniumTestCase\\myntra.png"));
		
		System.exit(0);
		
	}

   }

		
