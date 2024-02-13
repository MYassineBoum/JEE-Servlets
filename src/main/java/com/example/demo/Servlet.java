package com.example.demo;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = {"/StudentServlet", "/AddressServlet"})
public class Servlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String action = req.getParameter("action");

        if ("student".equals(action)) {
            doPostStudent(req, resp);
        } else if ("address".equals(action)) {
            doPostAddress(req, resp);
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action");
        }
    }
    public void doPostStudent(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>Ajouter Etudiant</h1>");
        printWriter.print("<p> nom : " + nom + "</p>");
        printWriter.print("<p> prenom : " + prenom + "</p>");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();
    }

    public void doPostAddress(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String rue = req.getParameter("rue");
        String ville = req.getParameter("ville");

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>Ajouter Adresse</h1>");
        printWriter.print("<p> Rue : " + rue + "</p>");
        printWriter.print("<p> Ville : " + ville + "</p>");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();
    }
}