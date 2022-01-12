package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCheckAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		MemberDAO mdao = new MemberDAO();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(mdao.loginCheck(new MemberDTO(id, pw, ""))) {
			request.getRequestDispatcher("login_success.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("login_failure.jsp").forward(request, response);
		}
		
	}

}

