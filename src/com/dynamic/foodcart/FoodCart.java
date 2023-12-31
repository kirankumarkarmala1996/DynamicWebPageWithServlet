package com.dynamic.foodcart;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/FoodCart")
public class FoodCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//	get the data from the data base
		String[] fooditems = { "briyani", "pizza", "Vegbriyani","vegitable rice" };
		request.setAttribute("fooditems", fooditems);

//	 redirect  to a different pages
		RequestDispatcher dispatcher = request.getRequestDispatcher("FoodCart.jsp");
		dispatcher.forward(request, response);
	}

}
