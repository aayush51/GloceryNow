package adminController;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Category;

@WebServlet("/categoryManagement")
public class CategoryManagement extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String categoryName = req.getParameter("categoryName");
			String categoryImage = req.getParameter("categoryImage");
			String operation = req.getParameter("operation");
			System.out.println(categoryName + " " + categoryImage);

			RequestDispatcher rd = req.getRequestDispatcher("categoryManagement.jsp");

			if (categoryName.isEmpty() || categoryImage.isEmpty()) {
				req.setAttribute("error", "Please Fill The Fields");
			}

			HttpSession session = req.getSession();
			String email = (String) session.getAttribute("email");
			String password = (String) session.getAttribute("password");
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/shopkeeper?user=postgres&password=root");
			PreparedStatement ps = con.prepareStatement("select * from users where user_email=?");
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String adminpass = rs.getString("user_password");
				if (adminpass.equals(password)) {

					EntityManagerFactory emf = Persistence.createEntityManagerFactory("shop");
					EntityManager em = emf.createEntityManager();
					EntityTransaction et = em.getTransaction();
					
					if(operation.equalsIgnoreCase("addCategory")) {
						Category category = new Category();
						category.setName(categoryName);
						category.setImage(categoryImage);
						et.begin();
						em.persist(category);
						et.commit();
						req.setAttribute("operation", "Category Has Been Added !");
					}
					if(operation.equalsIgnoreCase("removeCategory")) {
						req.setAttribute("task", "Remove Category");
						Category category = em.find(Category.class, categoryName);
						et.begin();
						em.remove(category);
						et.commit();
						req.setAttribute("operation", "Category Has Been Removed !");
					}
					if(operation.equalsIgnoreCase("updateCategory")) {
						Category category = em.find(Category.class, categoryName);
						category.setName(categoryName);
						category.setImage(categoryImage);
						et.begin();
						em.merge(category);
						et.commit();
						req.setAttribute("operation", "Category Has Been Updated !");

					}
					
					System.out.println("Category Saved !");
					
					rd.include(req, resp);

				} else {
					req.setAttribute("error", "Facing Problem While Processing Data");
					rd.include(req, resp);
				}

			} else {
				req.setAttribute("error", "Facing Problem While Processing Data");
				rd.include(req, resp);
			}
		} catch (Exception e) {
			RequestDispatcher rd = req.getRequestDispatcher("categoryManagement.jsp");
			rd.include(req, resp);
		}

	}
}
