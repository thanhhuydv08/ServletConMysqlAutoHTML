package servlet;

import java.awt.Frame;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;
import model.Book;

/**
 * Servlet implementation class CodeHtmlJava
 */
@WebServlet({ "/CodeHtmlJava", "/CodeHtmlJava.html" })
public class CodeHtmlJava extends HttpServlet {
	private static final long serialVersionUID = 1L;

	FormHtmlDefault formHtmlDefault = new FormHtmlDefault();
    ArrayList<Book> arrayList = new ArrayList<Book>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CodeHtmlJava() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		Controller controller = new Controller("book");
		String sql = "Select * from book";
		arrayList = controller.CRUDdatabase(sql, null, 4);
		System.out.println("chiều dai mang "+ arrayList.size());
		formHtmlDefault.PrintlnHtml(out, arrayList);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
