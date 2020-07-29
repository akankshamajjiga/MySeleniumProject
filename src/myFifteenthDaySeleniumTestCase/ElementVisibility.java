package myFifteenthDaySeleniumTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		 
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://register.freecrm.com/register/");
		
		boolean b1 = driver.findElement(By.cssSelector(".ui.fluid.large.blue.submit.button")).isDisplayed();
		
		System.out.println(b1);
		
		boolean b2 = driver.findElement(By.cssSelector(".ui.fluid.large.blue.submit.button")).isEnabled();		
		
		System.out.println(b2);
		
	    driver.findElement(By.linkText("I Agree to the terms and conditions")).click();
	    
	    boolean b3 = driver.findElement(By.linkText("I Agree to the terms and conditions")).isSelected();
	
		System.out.println(b3);
		
	   System.exit(0);
	   
	}

}
