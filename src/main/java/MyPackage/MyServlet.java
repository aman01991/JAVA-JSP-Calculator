package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] jokes = {
		"Why did the two Java methods get a divorce?",
		"Why did the private classes break up?",
		"Why do Java programmers wear glasses?",
		"Why did the Java developer teach his kids about double quotes?"
	};
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("bt1");
		
		//type casting
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		
//		int sum = num1 + num2;
		int ans;
		
		if(str3.equals("1")) ans = a+b;
		else if(str3.equals("2")) ans = a-b;
		else if(str3.equals("3")) ans = a*b;
		else ans = a/b;
		
		int randomIndex = (int) (Math.random() * jokes.length);
		String randomJoke = jokes[randomIndex];
		
//		response.getWriter().append("Served at: ").append("Ans = " +ans);
		response.sendRedirect("NewFile.jsp?ans= " +ans+ "&joke= " +randomJoke);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
