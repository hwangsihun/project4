package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpCheckAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		MemberDAO2 mdao2 = new MemberDAO2();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		if(mdao2.signupCheck(new MemberDTO(id, pw, name))) {
			request.getRequestDispatcher("signup_success.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("signup_failure.jsp").forward(request, response);
		}
	}

}
