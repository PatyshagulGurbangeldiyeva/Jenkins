package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JDBCDemo {
	
	// in order to get Data we need to do:
	// 1. add to pom.xml dependency "sql"
	// 2. need to make a connection (CREATING CONNECTION CLASS)
	// 3. need to create statement (CREATE STATEMENT CLASS)
	// 4. then we need to create executeQuery (selecting query)
	
	
	String dbUsername="syntax_hrm";
	String dbPassword= "syntaxhrm123";
				// jdbc:driver type://hostname:portNumber/dbName 
				// ( to find hostname,port and dbName we go to sql and click to home, then 
				//  click to mySqlConnection in homePage to settings, there you will find hostname and portNumber,
				//dbName you will find by enetering to database: use syntaxhrm_mysql
	String dbUrl="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql"; 
	
	@Test //this annotation "test" will execute the case
	public void abc() throws SQLException { // import Connection from javaSQL
		Connection conn=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		System.out.println("DB connection is successful");
		Statement st=conn.createStatement(); // importing from javaSql
		ResultSet rs=st.executeQuery("select * from hs_hr_employees"); // copy the select query from SQL ---> it will return ResultSet
	
		rs.next();
		String firstname=rs.getString("emp_firstname");
		System.out.println(firstname);
		
		// we want to get YUNUS name ( he comes after Faisal) so we again used next()
		
		rs.next();
		String firstname2=rs.getObject("emp_firstname").toString();// when we do not know do we get String then we need to getObject and convert it toString
		System.out.println(firstname2);
	
		String allData;
		while (rs.next()) {
			allData=rs.getObject("emp_firstname").toString();
			System.out.println(allData);
		}
		
		// after we done with our execution we must to close everything---> we close it from inside out
		// the purpose of closing result, statement and connection is ---> closing the door so nobody will see data!!!!
		rs.close();
		st.close();
		conn.close();
	
	}
	
	// retrieve all the job titles and store them in arrayList and show it in console from arrayList
	
	@Test 
	public void job_titles() throws SQLException {
		Connection con=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement statement=con.createStatement();
		ResultSet result=statement.executeQuery("select job_title from ohrm_job_title");
		
		List <String> jobTitles= new ArrayList<>();
		while(result.next()) {
			jobTitles.add(result.getObject("job_title").toString());
			
		}
		System.out.println(jobTitles); // printing as a list
		
		System.out.println();
		System.out.println("-------------------------------");
		for (String jt:jobTitles) { // printing as a column
			System.out.println(jt);
		}
		result.close();
		statement.close();
		con.close();
	
	}

}
