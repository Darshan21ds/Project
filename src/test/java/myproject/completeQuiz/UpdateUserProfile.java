package myproject.completeQuiz;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.DashBoardPage;
import pageObjects.EditProfile;
import pageObjects.Loginpage;
import pageObjects.UserProfile;
import resources.BaseInitialize;

public class UpdateUserProfile extends BaseInitialize{
	WebDriver driver = null;

	@BeforeTest
	public void testLogin() throws IOException {
		driver = initializeDriver();
	}

	public void navigationPage(String username, String password) throws IOException, InterruptedException {
		driver.get(property.getProperty("url"));
		Thread.sleep(3000);
		Loginpage lp = new Loginpage(driver);
		lp.username().sendKeys(username);
		lp.password().sendKeys(password);
		lp.loginbutton().click();
		
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[][] { { "user153", "User@9135" }};
				return data;
	}
	@Test
	public void editTheUser() {
	DashBoardPage dashboard = new DashBoardPage(driver);
	 dashboard.getUserPhoto().click();

	
		dashboard.getProfileOption().click();

	
		UserProfile userProf = new UserProfile(driver);
		userProf.getEditProfile().click();
		EditProfile editProfile = new EditProfile(driver);
		editProfile.getFirstName().clear();
		editProfile.getFirstName().sendKeys("TEST1");
		editProfile.getLastName().clear();
		editProfile.getLastName().sendKeys("USER1");
		Select Email_display_DD = new Select(editProfile.getMailDisplay());
		Email_display_DD.selectByIndex(1);
		editProfile.getCityOrTown().clear();
		editProfile.getCityOrTown().sendKeys("USA");
		Select countryDropdown = new Select(editProfile.getcountryDropDown());
		countryDropdown.selectByValue("IN");
		Select TimeZone_DD = new Select(editProfile.getTimeZone());
		TimeZone_DD.selectByValue("UTC");
		editProfile.getAdditionalName().click();
		editProfile.getFirstNamePhonetic().clear();
		editProfile.getFirstNamePhonetic().sendKeys("first");
		editProfile.getLastNamePhonetic().clear();
		editProfile.getLastNamePhonetic().sendKeys("last");
		editProfile.getMiddleName().clear();
		editProfile.getMiddleName().sendKeys("middle");
		editProfile.getAlternateName().clear();
		editProfile.getAlternateName().sendKeys("Test");
		editProfile.getUpdateProfileButton().click();
	}


	@AfterTest
	public void tearDown() {
		driver.close();
	}

}

