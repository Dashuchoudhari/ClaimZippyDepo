package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop =new Properties();
	public static FileReader fr;

	public void setup() throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
	}

		/*if(driver==null) {
			FileReader fr = new FileReader("C:\\Users\\BusinessComputers.in\\eclipse-workspace\\ClaimZippyProject\\src\\test\\java\\config\\config.properties");
			prop.load(fr);

		}

		if(prop.getProperty("browser").equalsIgnoreCase("chrome")){

			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://demoqa.com/automation-practice-form");
	}
			

		
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){

			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get(prop.getProperty("testURL"));

		}
		else if(prop.getProperty("browser").equalsIgnoreCase("edge")){

			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get(prop.getProperty("testURL"));

		}

	}*/
			
	@AfterTest
	void tearDown() {

		driver.close();

		System.out.println("TearDown successfull");

	}

}
