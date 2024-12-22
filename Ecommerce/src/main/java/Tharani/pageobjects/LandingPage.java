package Tharani.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ap_email")
	WebElement userEmail;
	
	@FindBy(id="continue")
	WebElement button;
	
	@FindBy(id="ap_password")
	WebElement userPassword;
	
	@FindBy(id="signInSubmit")
	WebElement submit;
	
	public void loginAmazon(String email,String password ) {
		userEmail.sendKeys(email);
		button.click();
		userPassword.sendKeys(password);
		submit.click();
	}
	
	public void goTo() {
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

	}
	
	public @FindBy(name="field-keywords")
	WebElement product;
	
	public @FindBy(id="nav-search-submit-button")
	WebElement search;
	
	public @FindBy(linkText="Apple iPhone 15 (128 GB) - Blue")
	WebElement iPhone;
	
	public @FindBy(xpath="//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']")
	WebElement addToCart;
	
	

}
