package Selenium.CI;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTest {

	@Test
	public void FirstTest (){
		WebDriver driver =new FirefoxDriver();
		  String baseUrl = "http://en.wikipedia.org/wiki/Main_Page";
		  driver.get(baseUrl);
		  //String expectedTitle = "Welcome to JPetStore 6";
		        //String actualTitle = "";
		  driver.findElement(By.xpath(".//*[@id='searchInput']")).sendKeys("software testing");
		  driver.findElement(By.xpath("//*[@id='searchButton']")).click();
	}
}
