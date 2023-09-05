/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nogal
 */
@WebServlet(name = "JoseNogalesCSV", urlPatterns = {"/JoseNogalesCSV"})
public class JoseNogalesCSV extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/csv");
        response.setHeader("Content-disposition","attachment;filename=Nogales.csv");
        PrintWriter out = response.getWriter();
        try  {
            /* TODO output your page here. You may use following sample code. */
            out.println(" id;tnombre;apellidos;edad");
            out.println("1;Antonio;Nogales;23");
            out.println("2;Juan;pinto;23");
            out.println("3;Adrian;mamani;25");

        }finally{
            out.close();
        }
    }
}
