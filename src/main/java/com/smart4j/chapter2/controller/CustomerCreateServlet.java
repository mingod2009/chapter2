package com.smart4j.chapter2.controller;

import com.smart4j.chapter2.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sam on 2017/10/20.
 */
@WebServlet("/customer_create")
public class CustomerCreateServlet extends HttpServlet {
    private CustomerService customerService;

    @Override
    public void init() throws ServletException {
        customerService = new CustomerService();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
        doPost(req, resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.getRequestDispatcher("/WEB-INF/view/customer_create.jsp").forward(req, resp);
    }
}
