package mySecondDaySeleniumTestCase;

	import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


	public class Alerts {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "D:\\akanksha\\chromedriver_win32\\chromedriver.exe");

			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			driver.findElement(By.name("proceed")).click();
			
			Thread.sleep(5000);
			
		    Alert alert = driver.switchTo().alert();

			System.out.println(alert.getText());
			
			String text = alert.getText();
			
			if(text.equals("Please enter a valid user name")) {
				
				System.out.println("correct alert msg");
				
			}
				
				else {
					
					System.out.println("incorrect alert msg");
				}
			
			alert.accept();
		
		}
	}
