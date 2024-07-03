package TestEntidades;

import java.util.List;

import Dao.ClassProductoImp;
import model.TblProductocl3;
public class TestEntidadProductoscl3 {

	public static void main(String[] args) {
		//Registrar
		TblProductocl3 producto=new TblProductocl3();
		ClassProductoImp crud=new ClassProductoImp();
		
		//Ingresando registros
		producto.setNombrecl3("Monitor View Sonic");
		producto.setPrecioventacle(399.99);
		producto.setPreciocompcl3(499.99);
		producto.setEstadocl3("actualizar");
		producto.setDescripcl3("Monitor de 24 pulgadas y 75Hz");
		
		
		//llamamos al metodo Registrar
		crud.RegistrarProducto(producto); 

		//Listado
		List<TblProductocl3> listado = crud.ListadoProductos();
		
		//bucle FOR
		for(TblProductocl3 lis:listado){
			
			System.out.println(
							   "Nombre" + lis.getNombrecl3() + 
							   "PrecioVenta" + lis.getPrecioventacle() +
							   "PrecioComp" + lis.getPreciocompcl3() +
							   "Estado" + lis.getEstadocl3() +
							   "Descripcion" + lis.getDescripcl3());
			
		} //fin FOR
		
	} //fin de MAIN

} //fin de la clase