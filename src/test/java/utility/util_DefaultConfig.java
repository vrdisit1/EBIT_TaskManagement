package utility;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class util_DefaultConfig {
	
	WebDriver dr;
	
	public util_DefaultConfig(WebDriver dr) {
		this.dr=dr;
	}
	
	public void OpenBrowser(String BrowserName) {
		
		System.out.println("VRD Cllaed : - "+BrowserName);
		
		// Open EBIT Portal
		dr.get("http://ebit.jci.com/Ebit_Views/Login/Login.html#");
		
		// Applied Browser Properties 
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
	}
	
	
	// Wait For Elements
	public static void WaitForElement(WebDriver dr, By by) {

		WebDriverWait Wait = new WebDriverWait(dr, 120);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	
	public void textElement(WebDriver dr, By by, String textBoxValue) {
		// TODO Auto-generated method stub
		WaitForElement(dr, by);
		dr.findElement(by).sendKeys(textBoxValue);
	}

	public void buttonElement(WebDriver dr, By by) {
		// TODO Auto-generated method stub
		WaitForElement(dr, by);
		dr.findElement(by).click();
		
	}
	
	public void dropdownElement(WebDriver dr, By by, String dropdownValues) {
		WaitForElement(dr, by);
		Select dropDownValue = new Select(dr.findElement(by));
		dropDownValue.selectByVisibleText(dropdownValues);
		
	}
	
	
	public void calanederClickForOpen(WebDriver dr, By by,String DateFormat) {
		// TODO Auto-generated method stub
		WaitForElement(dr, by);
		dr.findElement(by).click();	
		
		SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MMM-yyyy");
		String date = DATE_FORMAT.format(0);
		String month = DATE_FORMAT.format(1);
		
		System.out.println(date);
		System.out.println(month);
		
	}

	
	
	
	
	

}
