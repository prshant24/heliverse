package testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.base.DwsBase;
import com.crm.pom.Login;
@Listeners(com.crm.listeners.DwsListeners.class)

public class DwsLogin extends DwsBase{

	@Test
	public void main() throws IOException, InterruptedException 
	{
	  	preCondition("chrome");
	  	Login l=new Login(driver);
	  	l.login_link();
	  	l.username("kingm@gmail.com");
	  	l.password("King@123");
	  	l.login_button();
	  	assertTrue(l.loginSuccessful().isDisplayed(),"Login is Successfull........");
	  	Thread.sleep(9000); 
	  	postCondition();
	  	
	}
	
	  	
	
}
