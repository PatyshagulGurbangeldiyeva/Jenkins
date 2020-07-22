package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class RecapClass1 {
	
	String dbUserName = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void getConnected() throws SQLException {
		
		Connection connection=DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		DatabaseMetaData dbMetaData=connection.getMetaData(); // getting name of dataBase
		String dbName=dbMetaData.getDatabaseProductName();
		System.out.println(dbName);
		
		Statement st=connection.createStatement();
		ResultSet rs=st.executeQuery("select * from ohrm_skill");
		ResultSetMetaData rsMetaData=rs.getMetaData();// want to get numbers of columns ( it is an additional information so we use metaData)
		int colNumber=rsMetaData.getColumnCount();
		System.out.println(colNumber);
		
		for (int i=1; i<=colNumber; i++) {// want to get coulms names
		String colName=rsMetaData.getColumnName(i);
		System.out.println("column name is "+"'"+colName+"'");
		}
		
		String id;
		String name;
		while (rs.next()) {
			id=rs.getObject("id").toString();
			name=rs.getObject("name").toString();
			System.out.println(id+"="+name);
		}
		rs.close();
		st.close();
		connection.close();
	}

}
