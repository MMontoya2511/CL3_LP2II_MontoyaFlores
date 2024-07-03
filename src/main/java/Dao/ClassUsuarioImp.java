package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblUsuariocl3;

public class ClassUsuarioImp implements IUsuario{


	public void RegistrarUsuario(TblUsuariocl3 usuario) {
		// establecer conexion con la unidad de persistencia...
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL3_MontoyaFloresMarceloRodrigo");

		// permitir gestionar entidades
		EntityManager em = fabr.createEntityManager();

		// iniciar transaccion
		em.getTransaction().begin();

		// registrarnos
		em.persist(usuario);

		// mensaje consola
		System.out.println("USUARIO REGISTRADO en la BD");

		// confirmamos
		em.getTransaction().commit();

		// cerramos la transaccion
		em.close();

		
	} //fin de REGISTRAR

} //fin de la clase
