package webdriver;

public class LocalWebDriverCategory implements WebDriverCategory{

	public WebDriverContainer getWebDriverContainer() {
		WebDriverContainer container = new LocalChromeDriverContainer();
		String browser = System.getProperty("browser");
		if(browser.equalsIgnoreCase("firefox")) {
			container = new LocalFirefoxDriverContainer();
		}
		return container;
	}

}
