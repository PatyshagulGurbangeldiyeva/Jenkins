package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;



import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ModifyPersonalDetail extends CommonMethods {
	
	@And("admin navigates to Employee Information page")
	public void admin_navigates_to_Employee_Information_page() {
	    dashboard.navigateToEmployeeList();
	    wait(5);
	}
	
	@Given("admin searches employee by full name {string}")
	public void admin_searches_employee_by_full_name(String fullName) {
		viewEmp.empName.sendKeys(fullName,Keys.ENTER);
		wait(3);
		jsClick(viewEmp.searchBtn);
		wait(2);
		}
	@And("admin selects employee from the list")
	public void admin_select_employee_from_the_list() {
	    viewEmp.userName.click();
	}
	@When("admin navigates to Personal Details page and click to Edit")
	public void admin_navigate_to_Personal_Deatils_page_and_click_to_Edit() {
	    pdetails.btnEditAndSave.click();    
	}
	@Then("admin adds new information and save")
	public void admin_adds_new_information_and_save(DataTable dataTable) {
		
			List<Map<String, String>> modifyEmployeeList = dataTable.asMaps();

			for (Map<String, String> map : modifyEmployeeList) {

				String otherId = map.get("OtherId");
				String dateOfBirth = map.get("DateOfBirth");
				String NickName = map.get("NickName");
				String military = map.get("MilitaryService");
				String snn = map.get("SSN");
				String driverLicenceNumber = map.get("DriverLicenceNumber");
				String sinNumber = map.get("SinNumber");

				sendText(pdetails.empOtherId, otherId);
				sendText(pdetails.dateOfBorthSendKeys, dateOfBirth);
				sendText(pdetails.nickName, NickName);
				sendText(pdetails.miltaryservice, military);
				sendText(pdetails.SSNno, snn);
				sendText(pdetails.driverLicenceNo, driverLicenceNumber);
				sendText(pdetails.SINno, sinNumber);
				
				pdetails.selectInfo("Married" ,"Japanese" );
				wait(2);
				pdetails.ChangeLicExpDate("Jun","20","2021");
				wait(5);
				pdetails.SmokerCheckbox.click();
				
				pdetails.btnEditAndSave.click();			
	}
	}
	
	
	@Given("admin searches employee by id {string}")
	public void admin_searches_employee_by_id(String id) {
		viewEmp.empName.sendKeys(id,Keys.ENTER);
		jsClick(viewEmp.searchBtn);
		wait(2);
	}
	

}
