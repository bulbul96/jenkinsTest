package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[contains(@id,'Email')]")
WebElement enterEmail;
public void editemail() {
	enterEmail.sendKeys("himu1125@hotmail.com");

}
@FindBy(xpath="//input[contains(@id,'Password')]")
WebElement enterPassword;
public void editpassword() {
	enterPassword.sendKeys("lana6220");
}
@FindBy(xpath="//input[contains(@class,'button-1 login-button')]")
WebElement pressLogin;
public void ClickLogin() {
	pressLogin.click();
}
}
