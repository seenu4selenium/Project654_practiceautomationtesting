package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.Locators;

public class TS_02_Login {
	// Create an object for Locators class
	// Classname objName = new Classname();
	Locators loc = new Locators();

	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(loc.PracticeSite_Menu).click();
		Thread.sleep(5000);
		driver.findElement(loc.MyAccount_Menu).click();
		driver.findElement(loc.LoginPage_UserName).sendKeys("seenu4selenium@gmail.com");
		driver.findElement(loc.LoginPage_Password).sendKeys("seenu4selenium@123");
		driver.findElement(loc.LoginPage_LoginButton).click();
		Thread.sleep(5000);
		driver.findElement(loc.UserPage_LogoutLink).click();
		System.out.println("Test Case passed");

	}
}
