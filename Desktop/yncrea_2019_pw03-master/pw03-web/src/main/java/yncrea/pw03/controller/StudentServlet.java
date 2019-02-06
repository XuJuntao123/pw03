package yncrea.pw03.controller;



import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ConfigurableApplicationContext;

import yncrea.pw03.dao.StudentDAO;
import yncrea.pw03.dao.StudentService;
import yncrea.pw03.entity.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




@WebServlet(urlPatterns = "/students")
public class StudentServlet extends HttpServlet{
	int count;
	@Resource
	private StudentService studentService;
	private ConfigurableApplicationContext configurableApplicationContext;
	
	private List<Student> students;
	
    @Override
    public void init() throws ServletException {
        super.init();
        students = new ArrayList<>();
    }
    
    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("students",students);
        req.getRequestDispatcher("Students.jsp").forward(req,resp);
    }
    
    @Override
    public void destroy() {
        saveState();
      }

      public void saveState() {

        try {
          FileWriter fileWriter = new FileWriter("InitDestroyCounter.initial");
          String initial = Integer.toString(count);
          fileWriter.write(initial, 0, initial.length());
          fileWriter.close();
          return;
        }
        catch (IOException e) {  
        }

	
	
      }	

}
