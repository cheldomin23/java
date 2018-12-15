import java.util.*;
public class Evalua_Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("IIngresa Edad");
		
		int edad =entrada.nextInt();
		
		if (edad >= 18) {
			
			System.out.println("Mayor de edad");
			
		}else
		
		System.out.println("menor de edad");

	}

}
