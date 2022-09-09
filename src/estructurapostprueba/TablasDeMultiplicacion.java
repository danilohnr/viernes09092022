package estructurapostprueba;
import java.util.*;
public class TablasDeMultiplicacion {

	public static void main(String[] args) {
		/*Imprimir la tabla de multiplicación que desee el usuario*/
		Scanner lector = new Scanner(System.in);
		System.out.print("Tabla de multiplicacion: ");
		
		
		byte num = lector.nextByte();
		
		for(int i=1;i <= num;i++) {
			for (int j = 1; j <=10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
	}

}
