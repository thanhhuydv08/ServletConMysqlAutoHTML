package servlet;

import java.io.PrintWriter;
import java.util.ArrayList;

import model.Book;

public class FormHtmlDefault {
	 BodyHtmlDynamic bodyHtmlDynamic = new BodyHtmlDynamic();
	 StyleCssHtml styleCssHtml = new StyleCssHtml();
public FormHtmlDefault() {
	// TODO Auto-generated constructor stub
}
public void PrintlnHtml( PrintWriter out, ArrayList<Book> arrayList){
	 out.println("<!DOCTYPE html>");
     out.println("<html style=\"font-size: 20px\">");
     out.println("<head>");
     out.println("<title>Xin chào</title>");
     // gọi tới css cần tạo
        styleCssHtml.PrintlnStyleCssHtml(out);
     out.println("</head>");
     out.println("<body>");
     // gọi tới class nội dụng muốn thông tin
         bodyHtmlDynamic.PrintlnBodyHtml(out, arrayList);
     out.println("</body>");
     out.println("</html>");
}
}
