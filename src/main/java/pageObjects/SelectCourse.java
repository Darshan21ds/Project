package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectCourse {
	public WebDriver driver;
	By optCourse = By.xpath
	("//body/div[6]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]");
	
	public SelectCourse(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement optCourse() {
		return driver.findElement(optCourse);
	}

	
}
