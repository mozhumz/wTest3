package cn.servlet;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.entity.User;
import cn.service.UserService;
import cn.service.UserServiceImpl;


//�����¼����
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		String password=request.getParameter("password");
			//���û�������session
			request.getSession().setAttribute("username", name);
			request.getSession().setAttribute("password", password);
			//�ض�������ҳ��
			response.sendRedirect("chat.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
