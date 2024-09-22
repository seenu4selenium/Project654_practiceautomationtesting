package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.Locators;

public class XpathDemo {
	Locators loc = new Locators();

	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("TestFN");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("TestLN");

	}
}
