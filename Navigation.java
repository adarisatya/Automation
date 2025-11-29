package Automate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class Navigation 
	{
		public static void main(String[] args) throws Exception
			{
				System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\chromedriver.exe");
				ChromeOptions p = new ChromeOptions();
				WebDriver driver = new ChromeDriver(p);
				
				// Open URL using get()
				driver.get("https://www.google.com");
				driver.manage().window().maximize();			
				
				// Open URL using navigate().to()
				driver.navigate().to("https://www.flipkart.com");
				Thread.sleep(2000);
								
				//Redirect back to Google
				driver.navigate().back();
				Thread.sleep(2000);
				
				//Redirect back to Flipkart
				driver.navigate().forward();
				Thread.sleep(2000);
				
				//Refresh the page
				driver.navigate().refresh();
				Thread.sleep(2000);
				
				//Close the browser
				driver.quit();
				
			}
	}
