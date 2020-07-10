package myFirstDaySeleniumTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\akanksha\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//validation point
		
		if(title.equals("Google")) {
			
			System.out.println("correct");
			
		}
		
		else {
			
			System.out.println("in-correct");
			
		}
		
		System.out.println(driver.getCurrentUrl());
		
	   //System.out.println(driver.getPageSource());
		
		driver.quit();
		
		
	}

}
