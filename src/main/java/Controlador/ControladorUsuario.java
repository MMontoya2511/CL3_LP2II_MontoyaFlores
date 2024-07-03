package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassUsuarioImp;
import model.TblUsuariocl3;

/**
 * Servlet implementation class ControladorUsuario
 */
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
        super();

    } //fin del controlador

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	} // fin de doGET

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//recuperamos valores
		String usuario = request.getParameter("usuario");
		String password= request.getParameter("password");
		
		//instanciando
		TblUsuariocl3 registroUsuario = new TblUsuariocl3();
		ClassUsuarioImp  crud = new ClassUsuarioImp();
		
		//asignando valores
		registroUsuario.setUsuariocl3(usuario);
		registroUsuario.setPasswordcl3(password);	
		
		//llamamos a registrar
		crud.RegistrarUsuario(registroUsuario);
		
		//redireccionamos
		response.sendRedirect("index.jsp");
		
		doGet(request, response);
	} //fin de doPost

} 
