package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.util_DefaultConfig;

public class EBIT_ProjectPlanning {
	
	WebDriver dr =null;
	
	public EBIT_ProjectPlanning(WebDriver dr) {
		// TODO Auto-generated constructor stub
		this.dr= dr;
	}

	
	
	util_DefaultConfig util = new util_DefaultConfig(dr);
	
	// Repository 
	By lnk_Planning = By.xpath("//div[@class='m-t-30 ebit-view']//li[9]//a[1]");
	By btn_CreateEditPlan = By.xpath("//button[@class='font11p btn btn-primary col-sm-3 pull-right']");
	
	
	
	public void getPlanning() {
		util.buttonElement(dr, lnk_Planning);
	}
	
	public void setCreateEditPlan() {
		util.buttonElement(dr, btn_CreateEditPlan);
	}
	
	
	
	

}
