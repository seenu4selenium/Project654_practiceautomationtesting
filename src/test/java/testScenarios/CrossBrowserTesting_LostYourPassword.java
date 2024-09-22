package testScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import objectRepository.Locators;

public class CrossBrowserTesting_LostYourPassword {
	Locators loc = new Locators();
	WebDriver driver;

	@Parameters("browserName")
	@Test
	public void f(String browserName) throws Exception {

		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Please give valid browsername");
		}

		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://practice.automationtesting.in");
		// driver.findElement(By.linkText("Practice site")).click();
		driver.findElement(loc.myAccount).click();
		driver.findElement(loc.lostYourPassword).click();
		driver.findElement(loc.lostPassword_UserName).sendKeys("test12345@gmail.com");
		driver.findElement(loc.lostPassword_ResetButton).click();

	}
}
