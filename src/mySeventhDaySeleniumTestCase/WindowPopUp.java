package mySeventhDaySeleniumTestCase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		 
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		Thread.sleep(30);
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator <String> it =handler.iterator();
		
		String parentWindowId = it.next();
		
		System.out.println("parent-window id is : " +parentWindowId);
		
		String childWindowId = it.next();
		
		System.out.println("child-window id is : " +childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		Thread.sleep(30);
		
		System.out.println("child-window popup title" +driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		Thread.sleep(30);
		
		System.out.println("parent-window popup title" +driver.getTitle());
		
		System.exit(0);
		
	}

}
