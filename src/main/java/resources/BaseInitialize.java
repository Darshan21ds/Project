package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseInitialize {
	public WebDriver driver;
	public Properties property;

	public WebDriver initializeDriver() throws IOException {
		 property = new Properties();
		FileInputStream fileLocation = new FileInputStream(
				"C:\\Users\\darsh\\eclipse-workspace\\completeQuiz\\src\\main\\java\\resources\\connection.properties");
		property.load(fileLocation);
		String browserName = property.getProperty("browser");

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "c:\\spacej\\Chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (browserName.equals("firefox")) {
			// write code for firefox driver.
		}
		else if (browserName.equals("IE")) {
			// write code to execute in IE Browser
		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
			return destinationFile;	
				
				
	}
}
