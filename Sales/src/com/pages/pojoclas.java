package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclas.Baseclass;


public class pojoclas extends Baseclass {
	WebDriver driver;
	@FindBy(id="key")
	WebElement search;
	
		@FindBy(xpath="//a[@title='Deluxe PU Leather Office Computer Chair Tile Adjustable Home Chair']")
		WebElement cli;
		public pojoclas() {
			PageFactory.initElements(driver,this);
			
		}
		public void fill() {
			search.sendKeys("office chair");
			cli.click();
		}
	}


