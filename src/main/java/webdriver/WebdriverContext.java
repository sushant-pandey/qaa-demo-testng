package webdriver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class WebdriverContext {
	@Bean(name= {"webdrivercontainer"})
	public WebDriverContainer getWebDriverContainer() {
		WebDriverContainer container = new LocalWebDriverCategory().getWebDriverContainer();
		
		String webdrivertype = System.getProperty("webdrivertype");
		
		String osplatform = System.getProperty("osplatform");
		
		String logintype = System.getProperty("logintype");
		
		System.out.println("osplatform = " + osplatform
				+"\n webdrivertype = " + webdrivertype
				+"\n logintype = " + logintype);
		
		if(webdrivertype.equalsIgnoreCase("grid")) {
			container = new RemoteWebDriverCategory().getWebDriverContainer();
		}
		return container;
	}
}
