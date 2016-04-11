package bbdd.lab12;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		//Ejemplos para leer por teclado
		System.out.println("Leer un entero por teclado");	
		int entero = ReadInt();
		System.out.println("Leer una cadena por teclado");	
		String cadena = ReadString();
	}

	/*
		1. Mostrar por pantalla los resultados de las consultas 21 y 32 de la Pr�ctica 2. 
		1.1. 21. Obtener el nombre y el apellido de los clientes que han adquirido un coche en un concesionario de Madrid, el cual dispone de coches del modelo gti.
	 */
	public static void exercise1_1() {
		
	}
	
	/* 
		1.2. 32. Obtener un listado de los concesionarios cuyo promedio de coches supera a la cantidad promedio de todos los concesionarios.  
	*/
	public static void exercise1_2() {
		
	}
	
	/*
		2. Mostrar por pantalla el resultado de la consulta 6 de la Pr�ctica 2 de forma el color de la b�squeda sea introducido por el usuario.
			6. Obtener el nombre de las marcas de las que se han vendido coches de un color introducido por el usuario.
	*/
	public static void exercise2() {
		
	}
	
	/*
		3. Realizar una aplicaci�n en Java para ejecutar la consulta 27 de la Pr�ctica 2 de forma que los l�mites la cantidad de coches sean introducidos por el usuario. 
			27. Obtener el cifc de los concesionarios que disponen de una cantidad de coches comprendida entre dos cantidades introducidas por el usuario, ambas inclusive.
	 */
	public static void exercise3() {
		
	}
	
	/*
		4. Realizar una aplicaci�n en Java para ejecutar la consulta 24 de la Pr�ctica 2 de forma que tanto la ciudad del concesionario como el color sean introducidos por el usuario. 
			24.	Obtener los nombres de los clientes que no han comprado coches de un color introducido por el usuario en concesionarios de una ciudad introducida por el usuario.
	 */
	public static void exercise4() {
		
	}
	
	/*
		5. Realizar una aplicaci�n en Java que haciendo uso de la instrucci�n SQL adecuada: 
		5.1. Introduzca datos en la tabla coches cuyos datos son introducidos por el usuario
	 */
	public static void exercise5_1() {
		
	}
	
	/*
		5.2. Borre un determinado coche cuyo c�digo es introducido por el usuario. 
	 */
	public static void exercise5_2() {
		
	}
	
	/*	 
		5.3. Actualice el nombre y el modelo para un determinado coche cuyo c�digo es introducido por el usuario.
	 */
	public static void exercise5_3() {		
		
	}
	
	/*
		6. Invocar la funci�n y el procedimiento del ejercicio 10 de la Pr�ctica 10 desde una aplicaci�n Java. 
			10.	Realizar un procedimiento y una funci�n que dado un c�digo de concesionario devuelve el n�mero ventas que se han realizado en el mismo.
		6.1. Funcion
	 */
	public static void exercise6_1() {		
			
	}
	
	/*	
		6.1. Procedimiento
	 */
	public static void exercise6_2() {		
			
	}
	
	/*
		7. Invocar la funci�n y el procedimiento del ejercicio 11 de la Pr�ctica 10 desde una aplicaci�n Java. 
			11. Realizar un procedimiento y una funci�n que dada una ciudad que se le pasa como par�metro devuelve el n�mero de clientes de dicha ciudad.
		7.1. Funcion
	 */
	public static void exercise7_1() {		
			
	}	
	
	/*
		7.2. Procedimiento
	 */
	public static void exercise7_2() {		
				
	}
		
	@SuppressWarnings("resource")
	private static String ReadString(){
		return new Scanner(System.in).nextLine();		
	}
	
	@SuppressWarnings("resource")
	private static int ReadInt(){
		return new Scanner(System.in).nextInt();			
	}
	
	
	private void createConnection(){
		
		
	}
}