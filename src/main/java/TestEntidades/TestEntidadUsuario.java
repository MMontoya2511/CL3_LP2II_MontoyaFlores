package TestEntidades;

import Dao.ClassUsuarioImp;
import model.TblUsuariocl3;

public class TestEntidadUsuario {

	public static void main(String[] args) {
		//Registrar
		TblUsuariocl3 usuario=new TblUsuariocl3();
		ClassUsuarioImp crud=new ClassUsuarioImp();
		
		//Ingresando registros
		usuario.setIdusuariocl3(1);
		usuario.setUsuariocl3("melxncobenas");
		usuario.setPasswordcl3("limoncito15"); 
		
		usuario.setIdusuariocl3(2);
		usuario.setUsuariocl3("marcelomontoya25");
		usuario.setPasswordcl3("251104"); 
		
		//invocamos a registrar
		crud.RegistrarUsuario(usuario);

	}

}
