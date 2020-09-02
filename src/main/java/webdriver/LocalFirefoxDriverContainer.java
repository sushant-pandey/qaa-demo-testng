package webdriver;

import javax.annotation.PreDestroy;

import org.openqa.selenium.WebDriver;

public class LocalFirefoxDriverContainer implements WebDriverContainer{
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
