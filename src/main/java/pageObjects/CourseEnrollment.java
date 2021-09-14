package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CourseEnrollment {
	public WebDriver driver;
	By enroll = By.cssSelector("input[id='id_submitbutton']");
	
	public CourseEnrollment(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement enroll() {
		return driver.findElement(enroll);
	}

}
