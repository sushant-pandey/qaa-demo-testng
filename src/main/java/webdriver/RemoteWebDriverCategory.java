package webdriver;

public class RemoteWebDriverCategory implements WebDriverCategory{

	public WebDriverContainer getWebDriverContainer() {
		WebDriverContainer container = new RemoteChromeDriverContainer();
		String browser = System.getProperty("browser");
		if(browser.equalsIgnoreCase("firefox")) {
			container = new RemoteFirefoxDriverContainer();
		}
		return container;
	}

}
