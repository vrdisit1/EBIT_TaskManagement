package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.util_DefaultConfig;

public class EBIT_SearchProjectPage {

	
	WebDriver dr;
	public EBIT_SearchProjectPage(WebDriver dr) {
		this.dr = dr;
	}
	
	util_DefaultConfig util = new util_DefaultConfig(dr);
	
	
	// Repository 
	By btn_menuToggle = By.xpath("//span[@class='fa fa-bars']");
	By lnk_opportunities = By.xpath("//a[contains(text(),'Opportunities')]");
	By lnk_leftnavigationdiv = By.xpath("//div[@id='ebit_menu']//ul//li//a");
	By txt_projectname = By.xpath("//input[@class='form-control ng-pristine ng-valid ng-touched ng-untouched']");
	By btn_Search = By.xpath("//button[@class='btn-search ebit_icon']");
	By getSubProjectGrid = By.xpath("//section[@class='content ng-scope']//tr//td[3]");
			
			
			
	public void getOpportunities() throws InterruptedException {
		
		Thread.sleep(10000);
		util.buttonElement(dr,btn_menuToggle);
		
		List<WebElement> allOptions = dr.findElements(lnk_leftnavigationdiv);
		System.out.println(allOptions.size());
		
		for(int i=0; i<allOptions.size();i++) {
			System.out.println(i +" - "+allOptions.get(i).getText());
			String LeftMenuGetText = allOptions.get(i).getText();
			if(LeftMenuGetText.equals("Opportunities")) {
				allOptions.get(i).click();
				break;
			}
		}
		
		
	}
	
	public void getProjectDetails(String ProjectName) throws InterruptedException {
		Thread.sleep(5000);
		util.textElement(dr, txt_projectname, ProjectName);
		util.buttonElement(dr, btn_Search);
		//dr.findElement(txt_projectname).sendKeys(Keys.ENTER);
	}
	
	public void getSubProject(String SubProject) throws InterruptedException {
		//System.out.println("Sub Project Found");
		Thread.sleep(5000);
		List<WebElement> getSubProject = dr.findElements(getSubProjectGrid);
		System.out.println("Total SubProject List -"+getSubProject.size());
		for (int i=0; i<getSubProject.size(); i++) {
			System.out.println(i+" - "+getSubProject.get(i).getText());
			String getProjectListName = getSubProject.get(i).getText();
			
			if (getProjectListName.equals(SubProject)){
				getSubProject.get(i).click();
				System.out.println("Click Done");
			}
			break;
		}
	}
	
	
	
}
