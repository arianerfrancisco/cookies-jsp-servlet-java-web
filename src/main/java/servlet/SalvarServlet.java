package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Salvar")
public class SalvarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SalvarServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		Cookie cookie= new Cookie("nomeusu",nome);
		cookie.setMaxAge(30*60); // alterando este campo para 0, o cookie � apagado
		response.addCookie(cookie);
	}
}
