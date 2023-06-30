package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormPayment {

	WebDriver driver;

	OrderFormPayment(WebDriver driver) {
		this.driver = driver;
	}

	By someElement = By.xpath("   ");

	public WebElement getSomeEl() {
		return driver.findElement(someElement);
	}

}
