package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassProductoImp;
import model.TblProductocl3;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    } //fin del controlador

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("listarProductos".equals(action)) {
            ClassProductoImp crud = new ClassProductoImp();
            List<TblProductocl3> listadoProductos = crud.ListadoProductos();
            
            request.setAttribute("listadoproducto", listadoProductos);
            request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
        } else {
            // Manejar otros casos o acciones según sea necesario
        }
        
        TblProductocl3 producto=new TblProductocl3();
        ClassProductoImp crud=new ClassProductoImp();
        
        String accion=request.getParameter("accion");
        if(accion!=null){
			switch(accion){
			case "Modificar":
				int codigo=Integer.parseInt(request.getParameter("cod"));
				//asignar el codigo...
				producto.setIdproductoscl3(codigo);
				
				
				TblProductocl3 buscarcod=crud.BuscarProducto(producto);
				//enviar los valores buscados por codigo de la base de datos
				//al formulario actualizar..
				request.setAttribute("codigo",buscarcod.getIdproductoscl3());
				request.setAttribute("nombre",buscarcod.getNombrecl3());
				request.setAttribute("precioCompra",buscarcod.getPreciocompcl3());
				request.setAttribute("precioVenta",buscarcod.getPrecioventacle());
				request.setAttribute("estado",buscarcod.getEstadocl3());
				request.setAttribute("descripcion",buscarcod.getDescripcl3());
				
				
				//redireccionar..
				request.getRequestDispatcher("/FormActualizarProducto.jsp").forward(request, response);
				//salimos
				break;
				
			case "Eliminar":
				int codeliminar=Integer.parseInt(request.getParameter("cod"));
				//asignamos el codigo a eliminar
				producto.setIdproductoscl3(codeliminar);
				//invocamos al metodo eliminar...
				crud.EliminarProducto(producto);
				//refrescar el listado..
				List<TblProductocl3> listado=crud.ListadoProducto();
				request.setAttribute("listadodeclientes",listado);
				//redireccionar
				request.getRequestDispatcher("/FormRegistrarProducto");
				//salimos
				break;
				
			case "Listar":
				List<TblProductocl3> listadocliente=crud.ListadoProducto();
				//invocamos el listado  de productos para la vista
				request.setAttribute("listadodeclientes",listadocliente);
				//redireccionamos
				request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
				//salimos
				break;
				

				
              
    }}}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		//recuperamos 

		String codigo= request.getParameter("codigo");
		String nombrecl3= request.getParameter("nombre");
		String precioCompraStr = request.getParameter("precioCompra");
        String precioVentaStr = request.getParameter("precioVenta");
		String estadocl3= request.getParameter("estado");
		String descripcl3= request.getParameter("descripcion");
		
        double preciocompcl3 = Double.parseDouble(precioCompraStr);
        double precioventacle = Double.parseDouble(precioVentaStr);
        
        List<TblProductocl3> listadoproductos=null;
		
		//instanciando
		TblProductocl3 producto=new TblProductocl3();
		ClassProductoImp crud=new ClassProductoImp();
		
		//asignando valores
		producto.setNombrecl3(nombrecl3);
		producto.setPreciocompcl3(preciocompcl3);
		producto.setPrecioventacle(precioventacle);
		producto.setEstadocl3(estadocl3);
		producto.setDescripcl3(descripcl3);
		if(codigo!=null){
			int cod=Integer.parseInt(codigo);
			
			producto.setIdproductoscl3(cod);
			
			//llamo a actualizar
			crud.ActualizarProducto(producto);
			
			//actualizando listado
			listadoproductos=crud.ListadoProductos();
			
			
		}else{
		
		//llamamos a registrar
		crud.RegistrarProducto(producto);
		
		//actualizamos listado
		listadoproductos=crud.ListadoProductos();
		}
		
		//invocamos al listado del producto para la vista
		request.setAttribute("listadoproducto", listadoproductos);
		
		//redireccionamos
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request,response);
		
		
		
	} //fin de doPost

}
