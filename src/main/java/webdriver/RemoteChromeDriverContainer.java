package webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteChromeDriverContainer implements WebDriverContainer {
	WebDriver driver = null;

	public WebDriver getWebDriver() {
		System.out.println("Call to get webdriver");
		long id = Thread.currentThread().getId();
		System.out.println("getWebDriver"+id);
		return driver;		
	}

	@PostConstruct
	public void createNewWebDriverInstance() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setPlatform(Platform.WIN10);
		capabilities.setBrowserName("chrome");
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new ChromeOptions());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@PreDestroy
	public void destroyWebDriver() {
		System.out.println("Pre destroy method auto called");
		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}

}
