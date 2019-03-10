package com.gunjan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowAdditionCookie extends HttpServlet{
	
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int k=0;
		Cookie cookies[] = req.getCookies();	
		for(Cookie c:cookies)
		{
			if(c.getName().equals("a"))
			
		   k=Integer.parseInt(c.getValue());
		
		}
		 PrintWriter out = res.getWriter();
		 out.print("Two number addition is :"+k);
		
	

}

}