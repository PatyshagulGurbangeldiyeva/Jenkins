package com.hrms.practice;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class HomeworkClass1 {
	// HW get the resultSet metadata store it in the arraylist and retrieve it from
	// arraylist
	// also get column type name get the table names
	// we can use any tables we want

	// in order to get Data we need to do:
	// 1. add to pom.xml dependency "sql"
	// 2. need to make a connection (CREATING CONNECTION CLASS)
	// 3. need to create statement (CREATE STATEMENT CLASS)
	// 4. then we need to create executeQuery (selecting query)

	// jdbc:driver type://hostname:portNumber/dbName

	String dbUserName = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void dbMetaData() throws SQLException {
		Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from hs_hr_emp_emergency_contacts");

		List<String> eecNames = new ArrayList<>();

		// printing as arrayList
		while (rs.next()) {
			eecNames.add(rs.getObject("eec_name").toString());
		}
		System.out.println(eecNames);

		// printing in column
		for (String names : eecNames) {
			System.out.println(names);
		}

		System.out.println("----------Getting columns NAMES---------------");
		// get Column name
		ResultSetMetaData rsMetaData=rs.getMetaData();
		int colNum=rsMetaData.getColumnCount();
		
		for (int i=1; i<=colNum; i++) {
			String colNames=rsMetaData.getColumnName(i);
			System.out.println(colNames);
		}
		
	}

}
