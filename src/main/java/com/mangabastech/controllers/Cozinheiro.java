// package com.mangabastech.controllers;

// import java.io.IOException;
// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import com.models.Pedido;

// @WebServlet("/cozinheiro")
// public class Cozinheiro extends HttpServlet {
// private static final long serialVersionUID = 1L;

// protected void doGet(HttpServletRequest request, HttpServletResponse
// response)
// throws ServletException, IOException {
// request.getRequestDispatcher("/views/cozinheiro.jsp").forward(request,
// response);
// }

// protected void doPost(HttpServletRequest request, HttpServletResponse
// response)
// throws ServletException, IOException {
// String nomeCozinheiro = request.getParameter("nomeCozinheiro");
// String status = request.getParameter("status");
// String pedido = request.getParameter("pedido");

// Pedido p = new Pedido(nomeCozinheiro, pedido, 0);
// p.setStatus(status);

// request.setAttribute("pedido", p);
// request.getRequestDispatcher("/views/cozinheiro.jsp").forward(request,
// response);
// }
// }