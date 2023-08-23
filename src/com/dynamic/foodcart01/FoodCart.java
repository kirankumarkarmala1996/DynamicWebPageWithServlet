package com.dynamic.foodcart01;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dynamic.foodcart01.Food;
import com.dynamic.foodcart01.FoodCartDBUtils;

/**
 * Servlet implementation class FoodCart
 */
@WebServlet("/FoodCart")
public class FoodCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//	get the data from the data base
		String[] fooditems = { "briyani", "pizza", "Vegbriyani" };
		request.setAttribute("fooditems", fooditems);

//		try {
//			List<Food> fooditems = FoodCartDBUtils.getFoodList();
//			request.setAttribute("fooditems", fooditems);
//
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//	 redirect  to a different pages
		RequestDispatcher dispatcher = request.getRequestDispatcher("FoodCart.jsp");
		dispatcher.forward(request, response);
	}

}
