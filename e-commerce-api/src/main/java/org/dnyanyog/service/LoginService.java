package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.common.DBUtils;
import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;

public class LoginService {

	public LoginResponse login(LoginRequest loginBody) throws SQLException {
		LoginResponse loginResponse=new LoginResponse();
		String query="select * from user where fname='"+loginBody.user+"'and password='"+loginBody.password+"'";
		ResultSet resultSet=DBUtils.executeSelectQuery(query);
		if(resultSet.next()) {
			loginResponse.errorCode="0000";
			loginResponse.messege="Login Successfull";
			return loginResponse;
		}
		else {
			loginResponse.errorCode="911";
			loginResponse.messege="login failed";
			return loginResponse;
		}

	}

}
