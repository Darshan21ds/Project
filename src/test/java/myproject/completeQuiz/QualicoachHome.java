package myproject.completeQuiz;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Loginpage;
import pageObjects.QuizAttend;
import pageObjects.SelectCourse;
import resources.BaseInitialize;


public class QualicoachHome extends BaseInitialize {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(BaseInitialize.class.getName());
	
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeDriver();
		log.info("Driver is Initialized");
		driver.get(property.getProperty("url"));
		log.info("Navigated to Homepage");
		
	}
	
	@Test(dataProvider="getData")
	public void navigationPage(String username, String password) throws IOException, InterruptedException {
		driver.get(property.getProperty("url"));
		Thread.sleep(3000);
		Loginpage lp = new Loginpage(driver);
		lp.username().sendKeys(username);
		lp.password().sendKeys(password);
		lp.loginbutton().click();
		log.info("login is sucessful");
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[][] { { "user153", "User@9135" }};
				return data;
	}
	
	@Test
	public void selectCourse() throws InterruptedException {

		SelectCourse sc = new SelectCourse(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1800)");
		sc.optCourse().click();	
		log.info("course is selected");
	}
	
/*	@Test
	public void selfEnroll() {
		CourseEnrollment ce = new CourseEnrollment(driver);
		ce.enroll().click();	
		log.info("Student is enrolled to the course");
	} */
	
	@Test
	public void Quizmodule() {
		QuizAttend qa = new QuizAttend(driver);

		qa.attemptNow().click();
	//	qa.startQuiz().click();
		log.info("Quiz is attempted");
	}
	
	
	@AfterTest
	public void kill() {
		driver.close();
		log.info("driver is closed");
	}
}
