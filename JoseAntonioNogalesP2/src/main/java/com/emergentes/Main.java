
package com.emergentes;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Main", urlPatterns = {"/Main"})
public class Main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String op = request.getParameter("op");
        Tareas objper = new Tareas();
        int id, pos;
        HttpSession ses = request.getSession();
        ArrayList<Tareas> lista = (ArrayList<Tareas>) ses.getAttribute("listaper");
        switch (op) {
            case "nuevo":
                request.setAttribute("miobjper", objper);
                request.getRequestDispatcher("editar.jsp").forward(request, response);
                break;
            case "editar":
                id = Integer.parseInt(request.getParameter("id"));
                pos = buscarPorIndice(request, id);
                objper = lista.get(pos);
                request.setAttribute("miobjper", objper);

                request.getRequestDispatcher("editar.jsp").forward(request, response);

                break;
            case "elminar":
                id = Integer.parseInt(request.getParameter("id"));
                pos = buscarPorIndice(request, id);
                if (pos >= 0) {
                    lista.remove(pos);
                }
                request.setAttribute("listaper", lista);
                response.sendRedirect("index.jsp");
                break;

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        HttpSession ses = request.getSession();
        ArrayList<Tareas> lista = (ArrayList<Tareas>) ses.getAttribute("listaTareas");
        Tareas objper = new Tareas();
        objper.setId(id);
        objper.setActividad(request.getParameter("actividad"));
      
        if (id == 0) {
            //nuevo registro
            int idNuevo = obtenerID(request);
            objper.setId(idNuevo);
            lista.add(objper);
        } else {
            //edicion
            int pos = buscarPorIndice(request, id);
            lista.set(pos, objper);
        }
        request.setAttribute("listaTareas", lista);
        response.sendRedirect("index.jsp");
    }

    public int buscarPorIndice(HttpServletRequest request, int id) {
        HttpSession ses = request.getSession();
        ArrayList<Tareas> lista = (ArrayList<Tareas>) ses.getAttribute("listaTareas");

        int pos = -1;
        if (lista != null) {
            for (Tareas ele : lista) {
                ++pos;
                if (ele.getId() == id) {
                    break;
                }
            }
        }
        return pos;
    }

    public int obtenerID(HttpServletRequest request) {
        HttpSession ses = request.getSession();
        ArrayList<Tareas> lista = (ArrayList<Tareas>) ses.getAttribute("listaTareas");
        int idn = 0;
        for (Tareas ele : lista) {
            idn = ele.getId();
        }
        return idn + 1;

    }

}