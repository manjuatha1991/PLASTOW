package Regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import AmazonPOM.Search_Page;
import AmazonPOM.SelectShoes;

public class Run {

	@Test
	public void open() {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Search_Page se = new Search_Page(driver);
		se.SearchProduct("shoes");
		se.clickOnSearch(); 
		//Reporter.log("testmajjss");
        //SelectShoes se1 = new SelectShoes(driver);
         //   se1.selectAsShoes();	
	}
}
