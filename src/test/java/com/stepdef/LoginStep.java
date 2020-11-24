package com.stepdef;

import org.openqa.selenium.support.PageFactory;

import com.common.Base;
import com.pageobjectmodel.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends Base{
LoginPage lp;
	

@Given("^go to homepage$")
public void go_to_homepage() throws Throwable {
    getDriver();
    lp=PageFactory.initElements(driver, LoginPage.class);
    
}

@When("^user enters valid user name$")
public void user_enters_valid_user_name() throws Throwable {
    lp.editemail();
    
}

@When("^user enters a valid password$")
public void user_enters_a_valid_password() throws Throwable {
    lp.editpassword();
    
}

@When("^also user able to click login button$")
public void also_user_able_to_click_login_button() throws Throwable {
    lp.ClickLogin();
    
}

@Then("^user login successfully$")
public void user_login_successfully() throws Throwable {
    
    
}

}
