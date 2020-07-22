package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;



public class MetaData {
	String dbUsername="syntax_hrm";
	String dbPassword= "syntaxhrm123";
				// jdbc:driver type://hostname:portNumber/dbName 
				// ( to find hostname,port and dbName we go to sql and click to home, then 
				//  click to mySqlConnection in homePage to settings, there you will find hostname and portNumber,
				//dbName you will find by enetering to database: use syntaxhrm_mysql
	String dbUrl="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql"; 
	
	@Test 
	public void dbMetaData() throws SQLException { // I want to get additional information about my dataBase we use MetaData
		Connection conn=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		DatabaseMetaData dbMetaData= conn.getMetaData(); // it is an interface DatabasemetaData
		String driverName= dbMetaData.getDriverName();
		String dbVersion= dbMetaData.getDatabaseProductVersion();
		System.out.println(driverName);
		System.out.println(dbVersion);
	}

	// display all info about employee whose emp_number is 14688
	@Test
	public void rsMetaData() throws SQLException {
		Connection conn=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from hs_hr_employees where emp_number=14688");
		ResultSetMetaData rsMetadata= rs.getMetaData(); // getting extra info not data in sql
		int columnsNumber=rsMetadata.getColumnCount();
		System.out.println(columnsNumber);
		
		// get the first column name
		String colmName1=rsMetadata.getColumnName(1);
		System.out.println(colmName1);
		
		System.out.println();
		System.out.println("---------------------------");
		// get all colum names
		for (int i=1; i<=columnsNumber; i++) {
			String colmNames=rsMetadata.getColumnName(i);
			System.out.println(colmNames);
		}
	}
}
