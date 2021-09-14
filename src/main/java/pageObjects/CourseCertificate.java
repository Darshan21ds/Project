package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CourseCertificate {
	public WebDriver driver;

	By profile = By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]/span[1]/span[1]/img[1]");
	By userProfile = By.cssSelector("span[id='actionmenuaction-2']");
	By courseIstqb = By.xpath("//li[@class='contentnode'] //a[contains(text(),'ISTQB-ISEB')]");
	By courseCertificate = By.xpath("//a[contains(text(),'Course Certification')]");
	By istqbCerti = By.xpath("//div[contains(text(),'ISTQB Certificate')]");
	By getCerti = By.cssSelector("input[type='submit']");
	
	public CourseCertificate(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement profile() {
		return driver.findElement(profile);
	}
	public WebElement userProfile() {
		return driver.findElement(userProfile);
	}
	
	public WebElement courseIstqb() {
		return driver.findElement(courseIstqb);
	}
	public WebElement courseCertificate() {
		return driver.findElement(courseCertificate);
	}
	public WebElement istqbCerti() {
		return driver.findElement(istqbCerti);
	}
	public WebElement getCerti() {
		return driver.findElement(getCerti);
	}
	
}
