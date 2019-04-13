package cisco;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WeatherInfoServlet")
public class WeatherInfoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int zip = Integer.parseInt(request.getParameter("zip"));
		WeatherInfoService ws = new WeatherInfoService();
		String weather = ws.getWeatherInformation(zip);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<h1 style='text-align:center;color:red;font-size:200px;padding-top:150px'>"+weather+"</h1>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
