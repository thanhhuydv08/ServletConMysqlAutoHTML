package servlet;

import java.io.PrintWriter;
import java.util.ArrayList;

import model.Book;

public class BodyHtmlDynamic {
public BodyHtmlDynamic() {
	// TODO Auto-generated constructor stub
}
void PrintlnBodyHtml(PrintWriter out, ArrayList<Book> arrayList) {
	out.println("<h1 class="+"internal"+"> Tôi đang code html bằng java code dùng frame servlet <h1>");
	// tạo table cho trang
out.println("<table style=\"font-size: 20px ; font-weight: normal\" border=\"1\">\r\n" + 
		"        <tr>\r\n" + 
		"            <th> STT</th>\r\n" + 
		"           <th  >Tên Sách </th>\r\n" + 
		"           <th >Tác Giả </th>\r\n" + 
		"        </tr>\r\n");
for(int i=0; i<arrayList.size();i++) {
	out.println(" <tr>\r\n" + 
			"            <td>"+(i+1)+"</td>\r\n" + 
			"            <td>"+arrayList.get(i).getNameBook()+"</td>\r\n" + 
			"            <td>"+arrayList.get(i).getNameAuthor()+"</td>\r\n" + 
			"        </tr>");
}

out.println("</table>");
	
}
}
