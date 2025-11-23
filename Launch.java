package Automate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class Launch  
	{
		public static void main (String[] args) throws Exception 
			{
				System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\chromedriver.exe" );
				ChromeOptions p = new ChromeOptions(); // ChromeOptions is the inbuilt Selenium Class or function to Validate the Browser Behavior and Settings.
				p.addArguments("--incognito");
				p.addArguments("test-type");
				WebDriver driver = new ChromeDriver(p); // ChromeDriver is the Instance class which was invoked by the Parent Class - WebDriver followed by storing the Value in the instance Variable  - driver to invoke and Execute the User Defined Methods.
				driver.get("https://www.flipkart.com");
				driver.manage().window().maximize();
				String title = driver.getTitle();
				System.out.println(title);
				String Url = driver.getCurrentUrl();
				System.out.println(Url);
				Thread.sleep(5000);
				driver.quit();
			}	
	}
