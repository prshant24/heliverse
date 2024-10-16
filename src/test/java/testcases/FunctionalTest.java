package testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.base.DwsBase2;
import com.crm.pom.FunctionalTestCase;
@Listeners(com.crm.listeners.DwsListeners.class)
public class FunctionalTest extends DwsBase2 {

	@Test
	public void functionalTest() throws InterruptedException 
	{
		FunctionalTestCase ft=new FunctionalTestCase(driver);
		ft.searchBar("computer");
		ft.searchButton();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		ft.addToCart();
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		ft.addToCart2();
		ft.shoppingCart();
		assertTrue(ft.verifyCart().isDisplayed(),"Product is not displayed");
	}
}
