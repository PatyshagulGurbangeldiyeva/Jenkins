package com.hrms.tesbase;

import com.hrms.pages.AddEmployeePageElements;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.EmployeeInformationPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.SauceDemoLoginPageElements;
import com.hrms.pages.viewEmployeeListPageElements;


//initializes all pages class and stores references in static varibales
//that will called/used in test classes
public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static DashboardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static viewEmployeeListPageElements viewEmp;
	public static SauceDemoLoginPageElements sauceLogin;
	
	public static EmployeeInformationPageElements empInfo;
	public static void initialize() {
		
		login=new LoginPageElements();
		dashboard=new DashboardPageElements();
		addEmp=new AddEmployeePageElements();
		pdetails=new PersonalDetailsPageElements();
		viewEmp= new viewEmployeeListPageElements();
		sauceLogin=new SauceDemoLoginPageElements();
		
		empInfo=new EmployeeInformationPageElements();
	}
}
