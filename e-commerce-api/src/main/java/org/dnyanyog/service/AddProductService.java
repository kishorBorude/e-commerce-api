package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.common.DBUtils;
import org.dnyanyog.dto.AddProductRequest;
import org.dnyanyog.dto.AddProductResponce;

public class AddProductService {

	public AddProductResponce addProduct(AddProductRequest addProduct) throws SQLException {
		
		AddProductResponce addProductResponce=new AddProductResponce();
	   String query="insert into product(ProductName,ProductQuantity,ProductPrice) values('"+addProduct.productName+"','"+addProduct.productQuantity+"','"+addProduct.productPrice+"')";
	   DBUtils.executeQuery(query);
	   String checkQuery="select * from product where ProductName='"+addProduct.productName+"' ";
		ResultSet resultSet=DBUtils.executeSelectQuery(checkQuery);
		if(resultSet.next())
		{
			addProductResponce.errorcode="0000";
			addProductResponce.success="Product Addition Successfully..!";
			return addProductResponce;
		}
		else
		{
			addProductResponce.errorcode="9111";
			addProductResponce.success="Product Addition Failed";
			return addProductResponce;
		}
	}
}
