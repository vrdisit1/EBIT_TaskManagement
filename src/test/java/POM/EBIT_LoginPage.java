package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.util_DefaultConfig;

public class EBIT_LoginPage {
	
	WebDriver dr;
	
	
	public EBIT_LoginPage(WebDriver dr) {
		this.dr = dr;
	}
	
	util_DefaultConfig util = new util_DefaultConfig(dr);
	
	// Repository 
	By txt_LoginID = By.xpath("//input[@id='txtUserName']");
	By txt_Password = By.xpath("//input[@id='txtPassword']");
	By btn_Login = By.xpath("//input[@id='btnLogin']");
	By btn_PopUpOk = By.xpath("//button[@class='btn btn-primary']");
	
	
	public void setUserID(String loginID_txt){
		util.textElement(dr, txt_LoginID, loginID_txt);
	}
	
	public void setPassword(String password_txt) {
		util.textElement(dr, txt_Password, password_txt);
	}
	

	public void getLogin() {
		util.buttonElement(dr, btn_Login);
		
		util.WaitForElement(dr, btn_PopUpOk);
		
			if(dr.findElement(btn_PopUpOk).isDisplayed()){
				util.WaitForElement(dr, btn_PopUpOk);
				dr.findElement(btn_PopUpOk).click();
			}else {
				System.out.println("First Time Loagin");
			}
		
	}
}
