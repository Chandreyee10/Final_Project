package bobcat.test.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cognifide.qa.bb.page.Page;
import com.cognifide.qa.bb.qualifier.PageObject;
import com.cognifide.qa.bb.scope.webelement.WebElementLocator;
import com.google.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.cognifide.qa.bb.aem.core.api.AemActions;
import com.cognifide.qa.bb.aem.core.pages.AemAuthorPage;
import com.cognifide.qa.bb.api.actions.ActionException;
import com.cognifide.qa.bb.api.actions.ActionsController;
import com.cognifide.qa.bb.junit5.guice.Modules;
import com.cognifide.qa.bb.modules.BobcatRunModule;
import com.cognifide.qa.bb.page.BobcatPageFactory;
import com.google.inject.Inject;
import java.util.logging.Logger;


@PageObject
public class SignInPage extends AemAuthorPage<SignInPage>{

      Logger log= Logger.getAnonymousLogger();
      
	  @FindBy(id="inputUsername") //method used to find WebElement, in that case Id
	  private WebElement loginTextbox;
	  
	  @FindBy(id="inputPassword")
	  private WebElement passwordTextBox;
	  
	  @FindBy(id="loginButton")
	  private WebElement loginButton;

	  public void login(String username, String password) {
		// login method prepared according to Page Object Pattern
	    
	           loginTextbox.sendKeys(username);
	           passwordTextBox.sendKeys(password);
	           loginButton.click();
	           log.info("Etap Login Page Entry");
	  }

	}
