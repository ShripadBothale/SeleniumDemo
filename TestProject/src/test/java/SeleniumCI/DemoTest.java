package SeleniumCI;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sun.jna.Platform;

public class DemoTest {
	
	@Test
	public void Democlass (){
		WebDriver driver = new FirefoxDriver();
//		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//	        capabilities.setCapability("version", "5");
//	        capabilities.setCapability("platform", Platform.WINDOWS);
//		String baseUrl = "http://en.wikipedia.org/wiki/Main_Page";
//		this.driver = new RemoteWebDriver(new URL("http://shripadbothale:661de51c-84ea-4704-b6a0-58db91abd495@ondemand.saucelabs.com:80/wd/hub"),
//                capabilities);
		String baseUrl = "http://en.wikipedia.org/wiki/Main_Page";
		  driver.get(baseUrl);
		  driver.findElement(By.xpath(".//*[@id='searchInput']")).sendKeys("software testing");
		  driver.findElement(By.xpath("//*[@id='searchButton']")).click();
		  driver.close();
}
}