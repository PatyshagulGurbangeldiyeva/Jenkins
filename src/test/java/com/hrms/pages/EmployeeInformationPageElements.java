package com.hrms.pages;





import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrms.utils.CommonMethods;



public class EmployeeInformationPageElements extends CommonMethods {
	
	@FindBy (id="empsearch_employee_name_empName")
	public WebElement empName;
	
	@FindBy (id="empsearch_id")
	public WebElement empId;
	
	@FindBy (id="searchBtn")
	public WebElement searchBtn;
	
	@FindBy (xpath="//table[@id='resultTable']//td[2]/a")
	public WebElement userId;
	
	

	public void searchById(String id) {
             sendText(empId,id);
		
	
	}
		

	
	public  void clickUserId() {
		click(userId);
	}

}
