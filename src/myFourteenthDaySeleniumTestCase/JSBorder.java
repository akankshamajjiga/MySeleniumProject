package myFourteenthDaySeleniumTestCase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSBorder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		
		  WebDriver driver = new ChromeDriver();	
					
		  driver.manage().window().maximize();
					
		  driver.get("https://www.facebook.com/");
					
		  driver.findElement(By.id("email")).sendKeys("*************************");
					
		  driver.findElement(By.id("pass")).sendKeys("*********");
		  
		  //driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		  
		  WebElement loginbtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));  
				
		  flash(loginbtn, driver);
				    
		  drawBorder(loginbtn, driver);
		  
		  File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  
		  FileUtils.copyFile(src, new File("C:\\Users\\User\\eclipse-workspace\\MySeleniumProject\\src\\border.png"));
		  
		  //generateAlert(driver, "There is an issue with login button");
		  
		  clickElementByJS(loginbtn, driver);
		  
		  //driver.navigate().refresh();
		  
		  //refreshBrowserByJS(driver);
		  
		  System.out.println(getTitleByJS(driver));
		  
		  System.out.println(getPageInnerText(driver));
		  
		  //scrollPageDown(driver);
		  
		  //WebElement groupslink = driver.findElement(By.xpath("//a[contains(text(),'Groups']")); 
		  
		  //scrollIntoView(groupslink, driver);
		  
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

	       }  

         public static void drawBorder( WebElement element, WebDriver driver) {
	
         JavascriptExecutor js = ((JavascriptExecutor)driver);
	
         js.executeScript("arguments[0].style.border= '3px solid red'", element);
   
         }
         
         public static void generateAlert( WebDriver driver, String message ) {
         
        	 JavascriptExecutor js = ((JavascriptExecutor)driver);
        	 
        	 js.executeScript("alert('"+message+"')");
         
     }

         public static void clickElementByJS( WebElement element, WebDriver driver ) {
             
        	 JavascriptExecutor js = ((JavascriptExecutor)driver);
        	
        	 js.executeScript("arguments[0].click();" ,element);
         
         }  
         

         public static void refreshBrowserByJS( WebDriver driver ) {
             
        	 JavascriptExecutor js = ((JavascriptExecutor)driver);
        	
        	 js.executeScript("history.go[0]");
         
         }
        
         public static String getTitleByJS( WebDriver driver ) {
         
        	 JavascriptExecutor js = ((JavascriptExecutor)driver);
         
             String title = js.executeScript("return document.title;").toString();
         
             return title;
         
      }
         
         public static String getPageInnerText( WebDriver driver ) {
             
        	 JavascriptExecutor js = ((JavascriptExecutor)driver);
         
             String pageText = js.executeScript("return document.documentElement.innerText;").toString();
         
             return pageText;
           
         }  
         
         public static void scrollPageDown( WebDriver driver ) {
             
        	 JavascriptExecutor js = ((JavascriptExecutor)driver);
         
             js.executeScript("window.scrollTo(0,document.body.scrollHeight");
        
             
        }
         public static void scrollIntoView( WebElement element, WebDriver driver ) {
             
        	 JavascriptExecutor js = ((JavascriptExecutor)driver);
         
             js.executeScript("arguments[0].scrollIntoView(true)",element);
             
         }
    }
