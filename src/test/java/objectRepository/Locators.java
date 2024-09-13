package objectRepository;

import org.openqa.selenium.By;

public class Locators {

	// Login locators
	public final By PracticeSite_Menu = By.linkText("Practice Site");
	public final By MyAccount_Menu = By.linkText("My Account123");
	public final By LoginPage_UserName = By.id("username");
	public final By LoginPage_Password = By.name("password");
	public final By LoginPage_LoginButton = By.name("login");
	public final By UserPage_LogoutLink = By.linkText("Logout");

	// Register locators

	// TS_04_shop_any_product_as_a_Guest locators-Edited by Sneha
	public final By shopMenu = By.linkText("Shop");
	public final By product = By.xpath("//*[@id=\"content\"]/ul/li[1]/a[1]/h3");
	public final By addToCart = By.xpath("//*[@id=\"product-169\"]/div[2]/form/button");
	public final By viewBasket = By.xpath("//*[@id=\"content\"]/div[1]/a");
	public final By proceedToCheckout = By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a");
	public final By billingFirstName = By.id("billing_first_name");
	public final By billingLastName = By.id("billing_last_name");
	public final By billingEmail = By.id("billing_email");
	public final By billingPhone = By.id("billing_phone");
	public final By billingAddress = By.id("billing_address_1");
	public final By billingCity = By.id("billing_city");
	public final By billingPostcode = By.id("billing_postcode");
	public final By billingCountry = By.id("billing_country");
	public final By billingState = By.id("billing_state");
	public final By placeOrder = By.id("place_order");
}
