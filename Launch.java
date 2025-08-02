package Autopack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launch 
	{
		public static void main(String[] args) throws Exception
			{
				System.setProperty("webdriver.chrome.drive","C:\\AUTOMATION\\chrome.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://www.flipkart.com");
				ChromeOptions p = new ChromeOptions();
				p.addArguments("window-size=1920,1080");
				driver.manage().window().minimize();
				driver.manage().window().maximize();
				p.addArguments("--incognito");
				String title = driver.getTitle();
				System.out.println(title);
				String url = driver.getCurrentUrl();
				System.out.println(url);
				driver.close();
			}
	}	
