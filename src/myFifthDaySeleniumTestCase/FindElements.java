package myFifthDaySeleniumTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		 
	      WebDriver driver = new ChromeDriver();
		
		  driver.manage().window().maximize();	
		
		  driver.get("https://www.facebook.com");
		
		  List <WebElement> linklist = driver.findElements(By.tagName("a"));
		  
		  //List <WebElement> linklist = driver.findElements(By.tagName("input"));
		  
		  //List <WebElement> linklist = driver.findElements(By.tagName("button"));
		
		  System.out.println(linklist.size());
		
		  for(int i=0 ; i<linklist.size() ; i++) {
			  
		    String linktext = linklist.get(i).getText();
			  
			System.out.println(linktext);
			  
		  }
		    
	}

}
