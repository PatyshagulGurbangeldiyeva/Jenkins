package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Class2Task {

	String dbUserName = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	
	// display the information from national table
	// but display id "nationality id, name="nationality"
	
	@Test
	public void getData() throws SQLException {
	Connection conn=	DriverManager.getConnection(dbUrl,dbUserName,dbPassword );
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery("select * from ohrm_nationality");
	ResultSetMetaData rsMetaData=rs.getMetaData();
	
	List <Map<String,String>> listData=new ArrayList<>();
	Map<String,String> mapData;// declaring a new map
	
	while (rs.next()) {
		mapData=new LinkedHashMap<>();
		for (int i=1; i<=rsMetaData.getColumnCount();i++) {
			if(rsMetaData.getColumnName(i).equalsIgnoreCase("id")) {
				mapData.put("Nationality ID", rs.getObject(i).toString());
			}else if(rsMetaData.getColumnName(i).equalsIgnoreCase("name")) {
				mapData.put("Nationality", rs.getObject(i).toString());
			}
		}
		listData.add(mapData);
		
	}
	System.out.println(listData);
	
	}
}
