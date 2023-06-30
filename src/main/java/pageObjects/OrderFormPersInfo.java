package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormPersInfo {

	WebDriver driver;

	OrderFormPersInfo(WebDriver driver) {
		this.driver = driver;
	}

	By genderMr = By.xpath("");

	public WebElement getGenderMr() {
		return driver.findElement(genderMr);
	}

}
