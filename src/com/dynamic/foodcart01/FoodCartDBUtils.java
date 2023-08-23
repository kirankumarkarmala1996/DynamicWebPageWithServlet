package com.dynamic.foodcart01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDBUtils {

	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/mydb";
		String userName = "root";
		String Password = "Admin@123";

		ArrayList<Food> food = new ArrayList<Food>();

//		load the mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");

//		get the connection
		Connection conn = DriverManager.getConnection(url, userName, Password);

//		create a statement
		Statement stm = conn.createStatement();

//		execute statement and loop over the result set
		ResultSet rst = stm.executeQuery(" select * from Food");
		while (rst.next()) {
			int fId = rst.getInt(1);
			String fItem = rst.getString(2);
			float fprice = rst.getFloat(3);
			Food f= new Food(fId, fItem, fprice);
			food.add(f);

		}
		return food;

	}

}
