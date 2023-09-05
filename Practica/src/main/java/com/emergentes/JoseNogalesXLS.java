
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
@WebServlet(name = "JoseNogalesXLS", urlPatterns = {"/JoseNogalesXLS"})
public class JoseNogalesXLS extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/vn.ms-excel");
        response.setHeader("Content-disposition","filename=sumadedosnumeros.xls");
        PrintWriter out = response.getWriter();
        try  {
            /* TODO output your page here. You may use following sample code. */
            out.println("REspuesta generada desde Excel");
            out.println("100");
            out.println("200");
            out.println("La suma es de:/t");
            out.println("=suma(a2:a3)");

        }finally{
            out.close();
        }
    }

  


}
