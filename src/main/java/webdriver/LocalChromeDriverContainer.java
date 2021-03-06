package webdriver;

import javax.annotation.PreDestroy;

import org.openqa.selenium.WebDriver;

public class LocalChromeDriverContainer implements WebDriverContainer{
	WebDriver driver = null;
	
	public WebDriver getWebDriver() {		
		return null;
	}

	@PreDestroy
	public void destroyWebDriver() {
		System.out.println("Pre destroy method auto called");
		if(driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}
}
