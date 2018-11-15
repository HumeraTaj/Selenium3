package DemoSelenium3.DemoSelenium3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class myclassTest {

  
  WebDriver driver;
  
  public void HomePage(WebDriver ldriver) 
  
  {
  this.driver = ldriver;
  
  
  }
  
  @FindBy(id="userName") WebElement username;
  @FindBy(how = How.ID, using = "password") WebElement password;
  @FindBy(how = How.NAME, using = "Login") WebElement loginButton;
  @FindBy(how = How.LINK_TEXT, using = "Forgot Password?") WebElement forget_password;
  
  public void LoginTestMeApp(String userid, String Password)
  {
	username.sendKeys(userid);
	password.sendKeys(Password);
	loginButton.click();
  }
  
}
