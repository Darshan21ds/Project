package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	public WebDriver driver;
	By username = By.cssSelector("input[id='username']");
	By password = By.cssSelector("input[id ='password']");
	By loginbutton = By.cssSelector("[id='loginbtn']");

	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement username() {
		return driver.findElement(username);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement loginbutton() {
		return driver.findElement(loginbutton);
	}

}



