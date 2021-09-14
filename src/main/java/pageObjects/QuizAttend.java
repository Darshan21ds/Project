package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuizAttend {
	public WebDriver driver;
//	By moveTo = By.xpath("//div[contains(text(),'Module 1 Quiz')]");
	By attemptNow = By.xpath("//input[@type='submit']");
	By startQuiz = By.cssSelector("input[name='submitbutton']");
	
	public QuizAttend(WebDriver driver) {
		this.driver = driver;
	}
	
/*	public WebElement moveTo() {
		return driver.findElement(moveTo);
	}  */
	
	public WebElement attemptNow() {
		return driver.findElement(attemptNow);
	}
	
	public WebElement startQuiz() {
		return driver.findElement(startQuiz);
	}
}
