package com.baseclas;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	WebDriver driver;
	Select sele;
	
public void launch(String Url) {
	driver.get(Url);
}
public void fill(WebElement ele,String val) {
	ele.sendKeys(val);
}

public void btnclick(WebElement ele) {
ele.click();

}
public void eleselect(WebElement ele, int in) {
	sele=new Select(ele);
	sele.selectByIndex(in);
}
public void clo() {
driver.close();

}
}
