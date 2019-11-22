package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 

public class ContactFormPOM {
	private WebDriver driver;
	
	public ContactFormPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
		
	//@FindBy(linkText="Contact Us")
	@FindBy(linkText="Contact Us")	
	private WebElement user_icon;
	
	/*@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="send2")
	private WebElement loginBtn;
	*/
	
	public void clickUserIcon() {
		
		this.user_icon.click();
	}
	
	/*public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	*/
}



