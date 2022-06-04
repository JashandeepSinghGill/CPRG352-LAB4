/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jashan Gill
 */
public class NotesServlet extends HttpServlet {
    private String title;
    private String content;
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         boolean editCheck = request.getParameter("edit")==null;
         if(editCheck){
             this.title = "This is the title";
             this.content = "Content goes here";
              request.setAttribute("title",this.title );
              request.setAttribute("content", this.content );
             getServletContext().getRequestDispatcher("/WEB-INF/viewNotes.jsp").forward(request, response);
         }else{
              request.setAttribute("title", this.title);
              request.setAttribute("content", this.content);
             getServletContext().getRequestDispatcher("/WEB-INF/addNote.jsp").forward(request, response);
         }
        // After a JSP has been loaded, stop the code call
        return; // VERY IMPORTANT!
    }

        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       this.title = request.getParameter("title");
       this.content = request.getParameter("content");
        
        request.setAttribute("title", title);
        request.setAttribute("content", content);
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewNotes.jsp").forward(request, response);
    }


}
