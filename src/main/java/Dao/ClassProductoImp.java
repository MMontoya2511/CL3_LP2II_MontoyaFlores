package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl3;

public class ClassProductoImp implements IProducto{

	public void RegistrarProducto(TblProductocl3 producto) {
		// establecer conexion con la unidad de persistencia...
				EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL3_MontoyaFloresMarceloRodrigo");

				// permitir gestionar entidades
				EntityManager em = fabr.createEntityManager();

				// iniciar transaccion
				em.getTransaction().begin();

				// registrarnos
				em.persist(producto);

				// mensaje consola
			//	System.out.println("DATO REGISTRADO en la BD");

				// confirmamos
				em.getTransaction().commit();

				// cerramos la transaccion
				em.close();

			} // fin registrar

	public List<TblProductocl3> ListadoProductos() {
		// establecer conexion con la unidad de persistencia...
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL3_MontoyaFloresMarceloRodrigo");

		// gestionamos las entidades
		EntityManager em = fabr.createEntityManager();

		// iniciar transaccion
		em.getTransaction().begin();

		// recuperamos los productos de la base de datos
		List<TblProductocl3> listadoproductos=em.createQuery("select p from TblProductocl3 p", TblProductocl3.class).getResultList();

		// confirmamos la transaccion
		em.getTransaction().commit();

		// cerramos
		em.close();
		
		return listadoproductos;
	} //fin de LISTAR

	@Override
	public void ActualizarProducto(TblProductocl3 producto) {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_MontoyaFloresMarceloRodrigo");
		//permite gestionar entidades
		EntityManager em=fabr.createEntityManager();
		//iniciar transaccion
		em.getTransaction().begin();
		//actualizamos
		em.merge(producto);
		//comfirmamos 
		em.getTransaction().commit();
		//cerramos
		em.close();
	}

	@Override
	public void EliminarProducto(TblProductocl3 producto){
		//establecemos la conexion con unidad de persistencia.
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_MontoyaFloresMarceloRodrigo");
		//gestionar las entidades
		EntityManager em=fabr.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos el codigo a eliminar
		TblProductocl3 elim=em.merge(producto);
		//procedemos a eliminar el registro
		em.remove(elim);
		//emitimos mensaje por consola
		System.out.println("producto eliminado de la base de datos");
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
	}   //fin del metodo eliminar ...

	@Override
	public TblProductocl3 BuscarProducto(TblProductocl3 cliente) {
		//establecemos la conexion con la unidad de persistencia..
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_MontoyaFloresMarceloRodrigo");
		//gestionar las entidads
		EntityManager em=fabr.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos el codigo a buscar
		TblProductocl3 buscliente=em.find(TblProductocl3.class,cliente.getIdproductoscl3());
		//confirmamos 
		em.getTransaction().commit();
		//cerramos
		em.close();
		return buscliente;
	}  //fin del metodo buscar cliente...

	@Override
	public List<TblProductocl3> ListadoProducto() {
		// TODO Auto-generated method stub
		return null;
	}


}

