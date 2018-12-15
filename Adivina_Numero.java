import javax.swing.*;
import java.util.*;

public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio=(int)(Math.random()*100);// refundicion
		
		System.out.println(aleatorio);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero=0;
		
		int intentos = 0;
		
		while (numero!=aleatorio) {
			
			intentos++;
			
			System.out.println("Ingresa un numero");
			
			numero=entrada.nextInt();
			
			if (aleatorio<numero) {
				
				System.out.println("Mas Bajo");
				
			}
			
			else if (aleatorio>numero) {
				
				System.out.println("Mas alto");
				
				
			}
			
		}
		
		System.out.println("Correcto, lo has conseguido en "+ intentos+" intentos");
	}

}
