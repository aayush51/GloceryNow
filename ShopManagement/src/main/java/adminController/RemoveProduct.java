package adminController;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import model.Product;

@SuppressWarnings("serial")
@WebServlet("/removeProduct")
public class RemoveProduct extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In remove data java file");
		
		int id = Integer.parseInt(req.getParameter("id"));

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("shop");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        Product product = em.find(Product.class, id);
        if (product != null) {
            et.begin();
            em.remove(product);
            et.commit();
            System.out.println("Id: "+ id + " Product Deleted !");
        }

        RequestDispatcher rd = req.getRequestDispatcher("removeData.jsp");
        req.setAttribute("msg", "Id: "+ id + " Product Deleted !");
        rd.include(req, resp);
	
	}
}
