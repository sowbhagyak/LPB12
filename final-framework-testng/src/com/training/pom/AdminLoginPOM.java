package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPOM {
private WebDriver driver;
	
	public AdminLoginPOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(className="sign-in")
		private WebElement user_icon;
	
	@FindBy(xpath="//*[contains(@id,'user_login')]" )
	private WebElement userName;
	
	@FindBy(xpath="//*[contains(@id,'user_pass')]" )
	private WebElement password;
	
	@FindBy(xpath="//input[@type='submit' and @name='login']")
	private WebElement loginBtn;
	
	
	public void clickUserIcon() {
		this.user_icon.click();
	}
	
	public void sendUserName(String userName) {
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
}
