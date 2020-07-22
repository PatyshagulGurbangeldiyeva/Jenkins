package com.hrms.pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.tesbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class viewEmployeeListPageElements extends CommonMethods {
	@FindBy(name = "empsearch[employee_name][empName]")
	public WebElement empName;

	@FindBy(id = "empsearch_id")
	public WebElement empID;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;

	@FindBy(xpath = "//table[@id='resultTable']//td/a")
	public List<WebElement> data;

	@FindBy(xpath = "//table[@id='resultTable']//td[2]/a")
	public WebElement userId;

	@FindBy(xpath = "//table[@id='resultTable']//td[3]/a")
	public WebElement userName;

	@FindBy(xpath = "//table[@id='resultTable']")
	public WebElement employeesTable;
	
	@FindBy(xpath = "//table[@id='resultTable']//tbody//tr/td[3]")
	public List<WebElement> tableFirstName;
	
	@FindBy(xpath = "//table[@id='resultTable']//tbody//tr/td[4]")
	public List<WebElement> tableLastName;

	public viewEmployeeListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void employeeIdIsDisplayed() {
		System.out.println("first way");
		System.out.println("The user ID is displayed : " + userId.getText() + " " + userId.isDisplayed());

		System.out.println();
		System.out.println("second way");
		String expectedId = "10079";
		String actualId = viewEmp.userId.getText();
		Assert.assertEquals("Id is not matching", expectedId, actualId);
	}

	public boolean isTableDisplayed() {

		return employeesTable.isDisplayed();
	}
	
	public List <Map<String, String>> getFirstnameFromTable(){
		List<Map<String,String>> uiName=new ArrayList<>();
		for (WebElement row:tableFirstName) {
			Map<String,String> storeUINames= new LinkedHashMap <>();
			String tableName=row.getText(); //.substring(0,4); // if there is name and middle name "Jack William"--> we are just getting firstName
			storeUINames.put("emp_firstname", tableName);
			uiName.add(storeUINames);
		}
		return uiName;
	}

	public void employeeNameIsDisplayed() {
		System.out.println("The user NAME is displayed: " + userName.getText() + " " + userName.isDisplayed());

	}
	
	public List <Map<String,String>> getLastNameFromTable(){
		List <Map<String,String>>lastNamesList=new ArrayList<>();
		for (WebElement lastNames:tableLastName) {
			Map<String,String> uiLastName=new LinkedHashMap<>();
			String lastName=lastNames.getText();
			uiLastName.put("emp_lastname", lastName);
			lastNamesList.add(uiLastName);
		}
		return lastNamesList;
	}

	@FindBy(id = "sidenav")
	public List<WebElement> personalDetails;

	public void choose(List<WebElement> element, String textToSelect) {

		for (WebElement detail : element) {
			if (detail.getText().equalsIgnoreCase(textToSelect))
				;
			detail.click();
			break;

		}
	}

}
