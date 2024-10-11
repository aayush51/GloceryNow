package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


@SuppressWarnings("serial")
@WebServlet("/adminLogin")
public class AdminLogin extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("em");
		String password = req.getParameter("ps");

		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/shopkeeper?user=postgres&password=root");
			PreparedStatement ps = con.prepareStatement("select * from users where user_email=?");
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				do {
					System.out.println(rs.getString(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println(rs.getString(4));

					String adminpass = rs.getString("user_password");
					String adminemail = "asmaayush2018@gmail.com";

					if (adminemail.equals(email) && adminpass.equals(password)) {

						HttpSession session = req.getSession();
						session.setAttribute("email", email);
						session.setAttribute("password", password);
						
						RequestDispatcher rd = req.getRequestDispatcher("adminHome.jsp");
						rd.forward(req, resp);
					} else {
						RequestDispatcher rd = req.getRequestDispatcher("adminLogin.jsp");
						req.setAttribute("error", "Wrong Password");
						rd.include(req, resp);
					}
				} while (rs.next());
			} else {
				RequestDispatcher rd = req.getRequestDispatcher("adminLogin.jsp");
				req.setAttribute("error", "Please Register First");
				rd.include(req, resp);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
