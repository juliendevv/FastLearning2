package projetweb;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Annonce
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet() {
    	super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init()throws ServletException{
    	// TODO Auto-generated constructor stub
    	super.init();
    	System.err.println("coucou");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/* Création d'une instance d'inscription */
		Inscription nvinstance = new Inscription();
		
		/*Initialisation des propriétés*/
		nvinstance.setPrenom(request.getParameter("pnom"));
		nvinstance.setNom(request.getParameter("name"));

		/* Stockage des infos dans l'objet request */
		request.setAttribute( "test", nvinstance ); 
		
		this.getServletContext().getRequestDispatcher( "/RestitutionInscription.jsp" ).forward( request, response ); /*Appel du fichier jsp*/

	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
