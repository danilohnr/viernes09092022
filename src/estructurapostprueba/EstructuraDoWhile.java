package estructurapostprueba;

public class EstructuraDoWhile {

	public static void main(String[] args) {
		/*Estructuras repetitivas
		 * -Estructuras preprueba
		 * ---Estructura while
		 * -Estructura postprueba
		 * ---Estructura do ... while */
		int num = 5;
		System.out.println("Ciclo While");
		while (num < 10) { //prueba
			num++;
			System.out.println("num = " + num);
		}
		//Con el do while
		System.out.println("Ciclo Do While");
		do {
			num++;
			System.out.println("num = " + num);
		} while (num < 10);
		
		
		System.out.println("Fin del programa.");
	}

}
