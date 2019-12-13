package com.JohnsonControls.app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.EBIT_LoginPage;
import POM.EBIT_ProjectPlanning;
import POM.EBIT_SearchProjectPage;
import utility.util_DefaultConfig;

public class EBIT_TaskManagement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr=null;
		dr = new ChromeDriver();
		
		// Create Object for DefaultConfig 
		util_DefaultConfig util = new util_DefaultConfig(dr);
			util.OpenBrowser("Chrome");
		
		
		EBIT_LoginPage login = new EBIT_LoginPage(dr);
			login.setUserID("cmaricn");
			login.setPassword("Vikhroli_Q1");
			login.getLogin();
			
		
		EBIT_SearchProjectPage search = new EBIT_SearchProjectPage(dr);
			search.getOpportunities();
			
			// Search Project and Sub Project
			String ProjectName = "FY20-CPD: Embedded Controls-12-BAS Verasys & Gateways";
			String SubProjectName = "Embedded Controls-12-4-BAS Verasys UI-Product Development";
			search.getProjectDetails(ProjectName);
			search.getSubProject(SubProjectName);
			
		EBIT_ProjectPlanning plan = new EBIT_ProjectPlanning(dr);	
			plan.getPlanning();
			plan.setCreateEditPlan();
			
			
			
			
		System.out.println("ALl Done");
		
		
		
		
	}

}
