package DemoSelenium3.DemoSelenium3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyLoginPage {
	
	WebDriver driver;
	myclassTest lp;
	
	
	@BeforeTest
	public void  beforeTest()
	{
		System.setProperty("webDriver.chrome.driver", "C:\\Testing\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8083/TestMeApp/login.htm");
		lp=PageFactory.initElements(driver, myclassTest.class);
				
	}
	
	@Test
	public void MainScript()
	{
		lp.LoginTestMeApp("Lalitha", "Password123");
	}

}
