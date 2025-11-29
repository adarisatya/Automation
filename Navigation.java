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
				
				//Get the Title of the Page
				String title = driver.getTitle();
				System.out.println("Get the Title of the Page : " + title);
				
				//Get the Current URL of the Page
				String url = driver.getCurrentUrl();
				System.out.println("Get the Current URL of the Page : " + url);
				
				//Get the PageSource of the Page
				String source = driver.getPageSource();
				System.out.println("Get the Page Source of the Page : " + source.length());
				int preview = Math.min(500, source.length());
				System.out.println("Page source " + source.substring(0, preview));
				
				//Close the browser
				driver.quit();
				
			}
	}
