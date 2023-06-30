package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormDelivery {

	WebDriver driver;

	OrderFormDelivery(WebDriver driver) {
		this.driver = driver;
	}

	By someThing = By.xpath("Something");

	public WebElement getSomething() {
		return driver.findElement(someThing);
	}

}
