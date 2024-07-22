package Package3.SeleniumProject3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_AddressSelect_Page 
{
WebDriver driver;

@FindBy(linkText="Proceed to checkout")
WebElement proceed;


@FindBy(xpath="(//input[@name='submissionURL'])[1]")
WebElement selectaddress;

public void proceed_to_buy()
{
	proceed.click();
}
public void select_address()
{
	selectaddress.click();
}
public Amazon_AddressSelect_Page(WebDriver driver)
{
	  PageFactory.initElements(driver,this);
}
}
