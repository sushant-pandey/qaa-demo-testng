package homepage;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import webdriver.WebDriverContainer;
import webdriver.WebdriverContext;

@ContextConfiguration(classes = WebdriverContext.class)
public class SeleniumGridTest extends AbstractTestNGSpringContextTests {
	@Autowired
	WebDriverContainer container;

	@Test
	public void testSeleniumGrid01() {
		long id = Thread.currentThread().getId();
		System.out.println("testSeleniumGrid01"+id);
		WebDriver driver = container.getWebDriver();
	}
	
	@Test
	public void testSeleniumGrid02() {
		long id = Thread.currentThread().getId();
		System.out.println("testSeleniumGrid02"+id);
		WebDriver driver = container.getWebDriver();
	}
	
	@Test
	public void testSeleniumGrid03() {
		long id = Thread.currentThread().getId();
		System.out.println("testSeleniumGrid03"+id);
		WebDriver driver = container.getWebDriver();
	}
}
