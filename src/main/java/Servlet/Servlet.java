package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//Implementamos el path de acceso al Servlet
@WebServlet("/ingresar")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Le decimos al servidor que tipo de contenido me va
        //a devolver
        resp.setContentType("text/html");
        //Recibimos parametros por medio de get
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        //Implementamos la variable PrintWriter
        PrintWriter out = resp.getWriter();

        //Creo la plantilla html
        out.print("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("<title>Datos de Usuario</title>");
        out.println("<style>");
        out.println("/* Estilos base */");
        out.println("body {");
        out.println("    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;");
        out.println("    background-color: #f7f7f7; /* Color de fondo gris claro */");
        out.println("    margin: 0;");
        out.println("    padding: 0;");
        out.println("    display: flex;");
        out.println("    justify-content: center;");
        out.println("    align-items: center;");
        out.println("    height: 100vh;");
        out.println("    color: #333;");
        out.println("}");

        out.println("/* Contenedor principal */");
        out.println(".container {");
        out.println("    background-color: white;");
        out.println("    border-radius: 8px;");
        out.println("    padding: 30px;");
        out.println("    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);");
        out.println("    width: 100%;");
        out.println("    max-width: 600px;");
        out.println("    text-align: center;");
        out.println("}");

        out.println("/* Encabezado */");
        out.println("h1 {");
        out.println("    font-size: 24px;");
        out.println("    color: #1da1f2; /* Azul de Twitter */");
        out.println("    margin-bottom: 20px;");
        out.println("}");

        out.println("/* Estilo para la tabla */");
        out.println("table.data-table {");
        out.println("    width: 100%;");
        out.println("    border-collapse: collapse;");
        out.println("    margin-bottom: 20px;");
        out.println("}");

        out.println("table.data-table th, table.data-table td {");
        out.println("    padding: 10px;");
        out.println("    text-align: left;");
        out.println("    border: 1px solid #e1e8ed; /* Borde suave */");
        out.println("}");

        out.println("table.data-table th {");
        out.println("    background-color: #f4f4f9; /* Color de fondo suave para encabezados */");
        out.println("    font-weight: bold;");
        out.println("    color: #333;");
        out.println("}");

        out.println("table.data-table td {");
        out.println("    background-color: #fff;");
        out.println("    color: #555;");
        out.println("}");

        out.println("/* Estilo para el botón 'Volver al inicio' */");
        out.println("button.back-button {");
        out.println("    padding: 10px 20px;");
        out.println("    background-color: #1da1f2; /* Azul de Twitter */");
        out.println("    color: white;");
        out.println("    border: none;");
        out.println("    border-radius: 5px;");
        out.println("    font-size: 16px;");
        out.println("    cursor: pointer;");
        out.println("    transition: background-color 0.3s ease;");
        out.println("    margin-top: 20px;");
        out.println("}");

        out.println("button.back-button:hover {");
        out.println("    background-color: #1991db; /* Color de fondo más oscuro al pasar el mouse */");
        out.println("}");

        out.println("button.back-button:active {");
        out.println("    background-color: #1581c1; /* Color aún más oscuro al hacer clic */");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"container\">");
        out.println("<h1>Información del Usuario</h1>");
        out.println("<table class=\"data-table\">");
        out.println("<thead>");
        out.println("<tr>");
        out.println("<th>Usuario</th>");
        out.println("<th>Contraseña</th>");
        out.println("<th>Email</th>");
        out.println("</tr>");
        out.println("</thead>");
        out.println("<tbody>");
        out.println("<tr>");
        out.println("<td>" + username + "</td>");
        out.println("<td>" + password + "</td>");
        out.println("<td>" + email + "</td>");
        out.println("</tr>");
        out.println("</tbody>");
        out.println("</table>");
        out.println("<button class=\"back-button\" onclick=\"window.location.href='index.html'\">Volver al inicio</button>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");

    }
}