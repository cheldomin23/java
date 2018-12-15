import javax.swing.*;
import java.util.*;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String clave="Miguel";
		
		String pass="";
		
		while (clave.equals(pass)==false){
			
			pass=JOptionPane.showInputDialog("Ingresa la clave");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("Clave incorrecta");
			}
			
		}
		
		System.out.println("Contraeña correcta acceso ok");
		
	}

}
