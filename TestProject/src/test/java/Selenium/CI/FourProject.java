package Selenium.CI;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FourProject {

	
	@Test
	public void Login (){
		WebDriver driver =new FirefoxDriver();
		  String baseUrl = "https://n3g.4projects.com/PreApp/Login.aspx";
		  driver.get(baseUrl);
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//*[@id='LoginBox1_txtLogin']")).isDisplayed();
		  driver.findElement(By.xpath("//*[@id='LoginBox1_txtLogin']")).sendKeys("AutoExistingUser");
		  driver.findElement(By.xpath("//*[@id='LoginBox1_txtPassword']")).sendKeys("123456");
		  driver.findElement(By.xpath("//*[@id='LoginBox1_btnLogin']")).click();
		  //driver.findElement(By.xpath("//*[text()='Logout']")).click();
		  
//		  driver.close();
}
}