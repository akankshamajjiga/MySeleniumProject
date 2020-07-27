package myThirteenthDaySeleniumTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSHighlight {

	public static void main(String[] args) {

	  System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\chromedriver.exe");
				
	  WebDriver driver = new ChromeDriver();	
				
	  driver.manage().window().maximize();
				
	  driver.get("https://www.facebook.com/");
				
	  driver.findElement(By.id("email")).sendKeys("learnerChachi@gmail.com");
				
	  driver.findElement(By.id("pass")).sendKeys("Aku@1997");
	  
	  //driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	  
	  WebElement loginbtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));  
			
	  flash(loginbtn, driver);
			  
	}

	public static void flash(WebElement element,WebDriver driver) {

      JavascriptExecutor js = ((JavascriptExecutor)driver);
      
      String bgcolor = element.getCssValue("backgroundColor");

       for (int i=0;i<=10;i++) {
	
          changeColor("rgb(0,100,0)",element,driver);
           
          changeColor(bgcolor,element,driver);	

   }

}

       public static void changeColor(String color, WebElement element, WebDriver driver) {
	
       JavascriptExecutor js = ((JavascriptExecutor)driver);
	
       js.executeScript("arguments[0].style.backgroundColor= '"+color+"'", element);

  try {
	
	Thread.sleep(20);
	
   }

     catch(InterruptedException e) {
	
    }

    System.exit(0);
  
  }

}