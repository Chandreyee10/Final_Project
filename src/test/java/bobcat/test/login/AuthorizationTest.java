package bobcat.test.login;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.cognifide.qa.bb.aem.core.api.AemActions;
import com.cognifide.qa.bb.api.actions.ActionException;
import com.cognifide.qa.bb.api.actions.ActionsController;
import com.cognifide.qa.bb.junit5.guice.Modules;
import com.cognifide.qa.bb.modules.BobcatRunModule;
import com.cognifide.qa.bb.page.BobcatPageFactory;
import com.google.inject.Inject;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

import bobcat.test.pages.SignInPage;
import bobcat.test.pages.TestPage;
import java.util.logging.Logger;

/**
 * Test for presenting how to log in to the page.
 */
@Modules(BobcatRunModule.class)
@Epic("AEM 6.4 Base Tests")
@Feature("Login to AEM")
public class AuthorizationTest { 
	 
	@Inject
	private ActionsController controller;

	@Inject
	private BobcatPageFactory bobcatPageFactory;

	
	@Test
	@Story("Login to AEM and open Test page")
	@Description("Login to author instance and open test page")
	public void loginTest() throws ActionException {
		Logger log= Logger.getAnonymousLogger();
		
		/*Code for Login Page start */
		SignInPage signinpage = bobcatPageFactory.create("/content/etap/LoginPage.html", SignInPage.class);
		controller.execute(AemActions.LOG_IN);
		try {
		Thread.sleep(10000);
		}
		catch(Exception e) {
			
		}
		
		signinpage.open().login("admin","admin");
		TestPage testpage = bobcatPageFactory.create("/content/etap/en.html", TestPage.class);
		try {
	    Thread.sleep(10000);
		}
		catch(Exception e) {
				
		}
		assertTrue(testpage.open().isDisplayed());
		/*Code for Login Page end */
		
	}

}
