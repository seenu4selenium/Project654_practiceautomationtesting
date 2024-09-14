package testScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.Locators;

public class TS_03_LostYourPassword {
	Locators loc = new Locators();

	@Test
	public void f() throws Exception {
		 WebDriver driver;
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      Thread.sleep(5000);
	      driver.get("https://practice.automationtesting.in");
	      //driver.findElement(By.linkText("Practice site")).click();
	      driver.findElement(loc.myAccount).click();
	      driver.findElement(loc.lostYourPassword).click();
		  driver.findElement(loc.lostPassword_UserName).sendKeys("test12345@gmail.com");
		  driver.findElement(loc.lostPassword_ResetButton).click();
		
	}
}
