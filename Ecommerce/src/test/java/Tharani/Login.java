package Tharani;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Tharani.pageobjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
        LandingPage landingPage = new LandingPage(driver);
        landingPage.goTo();
		landingPage.loginAmazon("7339354839", "Tharani@123");
        landingPage.product.sendKeys("iphone 15");
        landingPage.search.click();
        String mainPage = driver.getWindowHandle();
        System.out.println("Main page="+ mainPage);
        landingPage.iPhone.click();
        Set<String> allPages = driver.getWindowHandles();
        for(String page : allPages) {
        	if(!page.equals(mainPage)) {
        		driver.switchTo().window(page);
        		break;
        	}
        	System.out.println(driver.getCurrentUrl());
        }
        landingPage.addToCart.click();
	}
        }
        	



