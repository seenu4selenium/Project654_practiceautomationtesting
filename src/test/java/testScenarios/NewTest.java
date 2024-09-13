package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.Locators;

public class NewTest {
	Locators loc = new Locators();

	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/");
		driver.findElement(loc.shopMenu).click();
		// Scroll into Element view
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(loc.product));
		Thread.sleep(1000);

		driver.findElement(loc.product).click();

		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(loc.addToCart));
		Thread.sleep(1000);

		driver.findElement(loc.addToCart).click();

		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(loc.viewBasket));
		Thread.sleep(1000);

		driver.findElement(loc.viewBasket).click();

		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(loc.proceedToCheckout));
		Thread.sleep(1000);

		driver.findElement(loc.proceedToCheckout).click();
		driver.findElement(loc.billingFirstName).sendKeys("john");
		driver.findElement(loc.billingLastName).sendKeys("smith");
		driver.findElement(loc.billingEmail).sendKeys("johnsmith@gmail.com");
		driver.findElement(loc.billingPhone).sendKeys("7894561230");

		// Country selection
		driver.findElement(By.id("select2-chosen-1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("s2id_autogen1_search")).sendKeys("united sta");
		Thread.sleep(500);
		driver.findElement(By.id("select2-result-label-2042")).click();
		Thread.sleep(1000);

		// driver.findElement(loc.billingCountry).sendKeys("United States (US)");

		driver.findElement(loc.billingAddress).sendKeys("7894 avz street");
		driver.findElement(loc.billingCity).sendKeys("New York");

		// state selection
		driver.findElement(By.id("select2-chosen-919")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("s2id_autogen919_search")).sendKeys("New york");
		Thread.sleep(500);
		driver.findElement(By.id("select2-result-label-2153")).click();
		Thread.sleep(1000);

		// driver.findElement(loc.billingState).sendKeys("New York");
		driver.findElement(loc.billingPostcode).sendKeys("78945");

		driver.findElement(loc.placeOrder).click();

	}
}
