package bobcat.test.pages;

import java.util.function.BooleanSupplier;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.cognifide.qa.bb.aem.core.pages.AemAuthorPage;
import com.cognifide.qa.bb.qualifier.PageObject;
import com.cognifide.qa.bb.wait.BobcatWait;
import com.google.inject.Inject;


@PageObject
public class TestPage extends AemAuthorPage<TestPage> {
	
	Logger log= Logger.getAnonymousLogger();
	
  @Inject
  private BobcatWait bobcatWait;

  private String title = "Home Page";
  private String url ;
  

public void setUrl(String url) {
	this.url = url;
}


public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
    
  }

  public boolean isDisplayed() {
	log.info("Home Page Entry");  
    return bobcatWait.isConditionMet(ExpectedConditions.titleIs(getTitle()));
  }

  public boolean isNotAvailable() {
    return bobcatWait.isConditionMet(ExpectedConditions.titleContains("404 Resource"));
  }

public String getFullUrl(String url) {
	
	    return url;
	  }
	
	
}

