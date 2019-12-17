package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.util_DefaultConfig;

public class EBIT_ProjectSchedulingPage {
	
	WebDriver dr=null;
	
	public EBIT_ProjectSchedulingPage(WebDriver dr) {
		// TODO Auto-generated constructor stub
		this.dr = dr;
	}

	
	
	util_DefaultConfig util=new util_DefaultConfig(dr);
	
	// Repository 
	
	By btn_AddTask = By.xpath("//div[@id='SubTaskCteration1']//div[@class='container-fluid']//div[@class='modal-dialog']//div[@class='modal-body']//div[@class='ng-scope']//div[@class='modal-content ng-scope']//form[@name='TaskAllocationForm']//div[@class='row clearfix margin_bot fixedTable']//div//button[@class='btn btn-primary'][contains(text(),'Add')]");
	By tbl_TotalTaskRows = By.xpath("//div[@id='SubTaskCteration1']//tr//td[2]");
	
	//Project Scheduling field's details
	public int getRowCount = 0;
	
	// Test Boxes 
	By txt_Task = By.xpath("//div[@id='SubTaskCteration1']//input[@class='form-control m-t-5 m-l-5 ng-pristine ng-untouched ng-invalid ng-invalid-required']");
	By txt_PlanHours = By.xpath("//div[@id='SubTaskCteration1']//input[@class='form-control width50px ng-pristine ng-untouched ng-valid ng-valid-required']");
	By txt_CompletePersentage = By.xpath("//div[@id='SubTaskCteration1']//input[@class='form-control width50px ng-pristine ng-untouched ng-invalid ng-invalid-required']");
	
	
	// DropDownes 
	By drop_Category = By.xpath("//div[@id='TaskAllocation']//tr[39]//td[7]//div[1]//select[@id='Category']");
	By drop_Activity = By.xpath("//div[@id='SubTaskCteration1']//select[@id='Activity']");
	By drop_TaskStatus = By.xpath("//div[@id='SubTaskCteration1']//td[@class='paddingZero']//select[@id='SubProject']");
			
	
	// Start and End Date
	By cal_StartDate = By.xpath("//div[@id='SubTaskCteration1']//input[@class='form-control datepicker Task_inputBox2 ng-pristine ng-untouched ng-invalid ng-invalid-required']");
	By cal_EndDate = By.xpath("//div[@id='SubTaskCteration1']//input[@class='form-control datepicker_enddate Task_inputBox2 ng-pristine ng-untouched ng-invalid ng-invalid-required']");
	
	// Check_Boxes 
	By chk_IsMilestone = By.xpath("//div[@id='SubTaskCteration1']//td[@class='paddingZero']//option[contains(text(),'Default Status')]");
	By chk_IsRework = By.xpath("");
	By chk_IsWarranty = By.xpath("");

	
	
	
	
	
	public void setTaskDetails() throws InterruptedException {
		
	
		// Add Values in Text Box 
		util.textElement(dr, txt_Task, "VRD");
		util.textElement(dr, txt_PlanHours, "40");
		util.textElement(dr, txt_CompletePersentage, "99");
		
		// Select Values in Drop-down 
		util.dropdownElement(dr, drop_Category, "Technology");
		util.dropdownElement(dr, drop_Activity, "DT - Coding: Code Creation");
		util.dropdownElement(dr, drop_TaskStatus, "Default Status");
		
		// Select Start and EndDate
		util.calanederClickForOpen(dr, cal_StartDate, "01-Dec-2019");
		util.calanederClickForOpen(dr, cal_EndDate, "06-Dec-2019");
		
		
		
		
		
		
		
		
		
		
	}
	
	public void getAddTask() {
		// Click on Add button for adding task
		util.buttonElement(dr, btn_AddTask);
	}
	
	
	
	
	
	
	

}
