package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.common.DBUtils;
import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponce;

public class AddUserService {
	public AddUserResponce addUser(AddUserRequest addUser) throws SQLException
	{
		AddUserResponce addUserResponce=new AddUserResponce();
		String query="insert into user(firstName,lastName,age,gender,email, mobileNo,password) values('"+addUser.firstName+"','"+addUser.lastName+"','"+addUser.age+"','"+addUser.gender+"','"+addUser.email+"','"+addUser.mobileNo+"','"+addUser.password+"')";
		DBUtils.executeQuery(query);
		String checkQuery="select * from user where firstName='"+addUser.firstName+"' and password='"+addUser.password+"'";
		ResultSet resultSet=DBUtils.executeSelectQuery(checkQuery);
		if(resultSet.next())
		{
			addUserResponce.errorcode="0000";
			addUserResponce.status="User Addition Successfully..!";
			return addUserResponce;
		}
		else
		{
			addUserResponce.errorcode="9111";
			addUserResponce.status="User Addition Failed";
			return addUserResponce;
		}
	}

}
