package myTwelvethDaySeleniumTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

 public class HtmlUnit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriver driver = new ChromeDriver();
		
        WebDriver driver = new HtmlUnitDriver();
	    
		driver.manage().window().maximize();
		
        driver.get("https://www.facebook.com/");
        
        Thread.sleep(20);
        
        System.out.println("Before login,the title is : " +driver.getTitle());
        
        driver.findElement( By.id("email")).sendKeys("***********************");
        
        driver.findElement(By.id("pass")).sendKeys("***********");
        
        Thread.sleep(20);
        
        driver.findElement(By.id("u_0_b")).click();
        
        System.out.println("After login,the title is : " +driver.getTitle());
        
        System.exit(0);
		
	}

}
