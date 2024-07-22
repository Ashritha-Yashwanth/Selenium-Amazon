package Package3.SeleniumProject3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Product_Page 
{
WebDriver driver;

@FindBy(id="add-to-wishlist-button-submit")
WebElement wishlist;
	
@FindBy(linkText="View Your List")
WebElement viewlist;

@FindBy(xpath="(//a[@class='a-button-text a-text-center'])[1]")
WebElement addtocart;

public void  add_wishlist()
{
	wishlist.click();
}

public void view_list()
{
	viewlist.click();
}

public void add_to_cart()
{
	addtocart.click();
}
public Amazon_Product_Page(WebDriver driver)
{
	  PageFactory.initElements(driver,this);
}
}
