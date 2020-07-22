package myEleventhdaySeleniumTestCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
    
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\MySeleniumProject\\src\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		 
	    driver = new ChromeDriver();
		
		}
		
		else if(browserName.equals("FF")) {
			
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\geckodriver.exe");
			
		driver = new FirefoxDriver();
		
		}
		
		else if(browserName.equals("IE")) {
			
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\chromedriver_win32\\internetexplorerdriver.exe");	
		
		driver = new InternetExplorerDriver();
			
		}
			
		driver.get(url);
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.id(prop.getProperty("firstname_id"))).sendKeys(prop.getProperty("firstname"));
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.id(prop.getProperty("lastname_id"))).sendKeys(prop.getProperty("lastname"));
		
		System.exit(0);
	}
	
}
