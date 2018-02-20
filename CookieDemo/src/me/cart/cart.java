package me.cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static int S_ID = 1;
	public static HashMap<String, HashMap> globalMap = new HashMap<String, HashMap>();

	public cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void processRequset(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html:charset=UTF-8");

		HashMap<String, String> sessionInfo = null;
		String sID = "";

		Cookie c = findCookie(request);
		if (c == null) {
			sID = makeID();
			sessionInfo = new HashMap<String, String>();

			globalMap.put(sID, sessionInfo);

			Cookie sessionCookie = new Cookie("JSessionId", sID);
			response.addCookie(sessionCookie);
		}

		else {
			sessionInfo = (HashMap<String, String>) globalMap.get(c.getValue());
		}

		PrintWriter out = response.getWriter();
		String url="http://localhost8080/CookieDemo/cart";
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body><br> <br>");

		out.println("<h1>Name is " + "ali" + " value is " + "322" + "</h1>");
		out.println("</body>");
		out.println("</html>");
		
		/*out.println("<html>");
		out.println("<body>");
		out.println("<h2>The Shopping cart</h2>");
		out.println("<form action=" + url + ">" + "<h3><input type=checkbox name=firstCB value=firstCB />"
				+ " java core servlts</h3>" + "<br>" + "<h3><input type=checkbox name=secondCB value=secondCB />"
				+ " java how to program</h3>" + "<br>" + "<h3><input type=checkbox name=thirdCB value=thirdCB />"
				+ " java complete reference</h3>" + "<br>" + "<input type=submit value=\"Add to Cart\" />" + "</from>");
		out.println("</body>");
		out.println("</html>");*/

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequset(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequset(request, response);
	}

	public String makeID() {
		String c = "ABC" + S_ID++;
		return c;
	}

	public Cookie findCookie(HttpServletRequest request) {

		Cookie[] c = request.getCookies();

		if (c != null) {

			for (int i = 0; i < c.length; i++) {
				Cookie cc = c[i];

				if (cc.getName().equals(cc.getValue())) {
				}
				return cc;
			}
		}
		return null;
	}
}
