package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BadgeDownload {
	public WebDriver driver;

	By profile = By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]/span[1]/span[1]/img[1]");
	By userProfile = By.cssSelector("span[id='actionmenuaction-2']");
	By badg = By.cssSelector("span[class='badge-name']");
	By downloadBadge = By.cssSelector("input[value='Download']");
	
	public BadgeDownload(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement profile() {
		return driver.findElement(profile);
	}
	
	public WebElement userProfile() {
		return driver.findElement(userProfile);
	}

	public WebElement badg() {
		return driver.findElement(badg);
	}
	
	public WebElement downloadBadge() {
		return driver.findElement(downloadBadge);
	}
}