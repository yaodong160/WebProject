package com.qf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String characterEncoding = req.getCharacterEncoding();
        String password = req.getParameter("password");
        System.out.println("Get请求");
        System.out.printf("请求参数为：\r\n\tusername:%s,\r\n\t password:%s,\r\n characterEncoding:%s", username, password,characterEncoding);

//        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.println("注册成功");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String characterEncoding = req.getCharacterEncoding();
        String password = req.getParameter("password");
        System.out.println("post请求");
        System.out.printf("请求参数为：\r\n\tusername:%s,\r\n\t password:%s,\r\n characterEncoding:%s", username, password,characterEncoding);

//        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.println("注册成功");
    }
}
