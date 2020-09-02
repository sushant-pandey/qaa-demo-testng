package homepage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridTest {
  @Test
  public void testSeleniumGrid() {
	  WebDriver driver;
//	  System.setProperty("webdriver.chrome.driver", "C:/Users/susha/OneDrive/Desktop/JAVA-PROJECTS/qaa-demo-testng/src/main/resources/selenium-jars/chromedriver.exe");
	  
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setPlatform(Platform.WIN10);
	  capabilities.setBrowserName("chrome");
	  try {
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new ChromeOptions());
		
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
  }
}
