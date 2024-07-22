package Package3.SeleniumProject3;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import itestlisterner.Screenshot_ITestListener;
import package2.Test_Data;
@Listeners(Screenshot_ITestListener.class)
public class Testcase4 extends Screenshot_ITestListener
{
		 
		@Test
		 public void login_to_search() throws EncryptedDocumentException, IOException
		 {
			driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 Test_Data t1 = new Test_Data();
			 t1.Data_fetching();
			 Amazon_Login_Page a1 = new Amazon_Login_Page(driver);
			 a1.un();
			 a1.conti_button();
			 a1.password();
			 a1.sigin_button();
			 Amazon_Home_Page a2 = new  Amazon_Home_Page(driver);
			 a2.searching();
			 Amazon_SearchResult_Page a3 = new Amazon_SearchResult_Page(driver);
			 a3.click_first_prod();
			 
			 Set<String> id2 = driver.getWindowHandles();
			System.out.println(id2);
			Iterator<String> id1 = id2.iterator();
			String pid1 = id1.next();
			String cid1 =  id1.next();
			System.out.println(pid1);
			System.out.println(cid1);
			driver.switchTo().window(cid1);
			 
			 Amazon_Product_Page a4 = new Amazon_Product_Page(driver);
		     a4.add_wishlist();	
	        a4.view_list();
	        a4.add_to_cart();
	        
	        WebElement s2 =  driver.findElement(By.id("twotabsearchtextbox"));
		     Assert.assertEquals(s2.isDisplayed(),true,"failed");
		 
	 }
	
}
