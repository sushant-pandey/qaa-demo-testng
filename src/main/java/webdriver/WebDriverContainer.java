package webdriver;

import org.openqa.selenium.WebDriver;

public interface WebDriverContainer {
	WebDriver getWebDriver();
	
	void destroyWebDriver();
}
