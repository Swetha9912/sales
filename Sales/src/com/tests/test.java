package com.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.pages.pojoclas;


public class test {
	WebDriver driver;
	pojoclas poj;
@BeforeTest
	public void Browse() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\hi\\eclipse-workspace\\CrazySales\\drivers\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("");
	driver.manage().window().maximize();
 poj=new pojoclas();
}
@AfterTest
public void validate() {
	driver.close();
}

}


