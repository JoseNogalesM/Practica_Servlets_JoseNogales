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
@WebServlet(name = "JoseNogalesJSON", urlPatterns = {"/JoseNogalesJSON"})
public class JoseNogalesJSON extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        try  {
            /* TODO output your page here. You may use following sample code. */
            out.println(" {\"empleados\":[");
            out.println(" {\"nombre\"\"Antonio\",\"apellidos\":\"Nogales\"},");
            out.println(" {\"nombre\"\"Jorge\",\"apellidos\":\"Choque\"},");
            out.println(" {\"nombre\"\"Susan\",\"apellidos\":\"Mamani\"},");
            out.println(" {\"nombre\"\"Cris\",\"apellidos\":\"Octavio\"},");
            out.println(" ]}");
            

        }finally{
            out.close();
        }
    }
}