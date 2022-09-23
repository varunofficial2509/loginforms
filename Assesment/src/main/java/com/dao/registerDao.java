package com.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.JDBCConnection.JDBCConnection;
import com.javabeans.registerbean;

public class registerDao {

	public boolean insert(registerbean rg)
	{
		String sql = "insert into registered values(?,?,?)";
		try {
			PreparedStatement sts = JDBCConnection.getconnect().prepareStatement(sql);
			sts.setString(1, rg.getEmpid());
			sts.setString(2, rg.getEmpname());
			sts.setString(3, rg.getEmail());
			
			return sts.executeUpdate()>0;
		
		
		} 
		
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return false;
		
	}

	

}
