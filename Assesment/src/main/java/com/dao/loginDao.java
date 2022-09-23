package com.dao;import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.JDBCConnection.JDBCConnection;
import com.javabeans.loginbean;

public class loginDao {
	public static boolean check(loginbean lg)
	{
		boolean status  = false;
		
		String sql = "select * from registered where empid = ? and empname = ? ";
		try {
			PreparedStatement sts = JDBCConnection.getconnect().prepareStatement(sql);
			sts.setString(1, lg.getEmpid());
			sts.setString(2, lg.getEmpname());
			ResultSet rs = sts.executeQuery();
            status = rs.next();
		} 
		
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return status;
		
	}
	
	public static boolean login(loginbean lg)
	{
		String sql = "insert into logindetails values(?,?,CURRENT_TIMESTAMP)";
		try {
			PreparedStatement sts = JDBCConnection.getconnect().prepareStatement(sql);
			sts.setString(1, lg.getEmpid());
			sts.setString(2, lg.getEmpname());
			//sts.setString(3, lg.getDate());
			return sts.executeUpdate()>0;
		
		} 
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return false;
	}

}
