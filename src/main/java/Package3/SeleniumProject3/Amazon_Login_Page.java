package Package3.SeleniumProject3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import package2.Test_Data;

public class Amazon_Login_Page extends Test_Data
{
	WebDriver driver;
 @FindBy(name="email")
 WebElement email;
 
 @FindBy(id ="continue")
 WebElement continue_button;
 
 @FindBy(id="ap_password")
 WebElement pswd;
 
 @FindBy(id="signInSubmit")
 WebElement signin;
 
 public void un()
 {
	 email.sendKeys(un1);
	 }
 
 public void conti_button()
 {
	 continue_button.click();
 }
 
 public void password()
 {
	 pswd.sendKeys(pwd);
 }
 
 public void sigin_button()
 {
	 signin.click();
 }
  public Amazon_Login_Page(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
}
