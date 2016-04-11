package bbdd.lab12;

import java.sql.*;
import java.util.Scanner;

public class Program {

	public static Connection conn;
	
	
	public static void main(String[] args) throws SQLException {
		//
		// // Ejemplos para leer por teclado
		// System.out.println("Leer un entero por teclado");
		// int entero = ReadInt();
		// System.out.println("Leer una cadena por teclado");
		// String cadena = ReadString();
		
		exercise1_1();
		exercise1_2();
	}

	private static Connection createConnection() {
		conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@156.35.94.99:1521:DESA", "UO237464",
					"UO237464");
		} catch (SQLException e) {
			e.printStackTrace();;
		}
		return conn;
	}

	/*
	 * 1. Mostrar por pantalla los resultados de las consultas 21 y 32 de la
	 * Práctica 2. 1.1. 21. Obtener el nombre y el apellido de los clientes que
	 * han adquirido un coche en un concesionario de Madrid, el cual dispone de
	 * coches del modelo gti.
	 */
	public static void exercise1_1() throws SQLException {
		conn = createConnection();
		Statement stat = null;
		ResultSet rs;
		
		System.out.println("Exercise 1_1 \n");
		
		try{
			stat = conn.createStatement();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		String query = "SELECT nombre, apellido"
				+ " FROM Clientes NATURAL JOIN Ventas NATURAL JOIN Concesionarios NATURAL JOIN Coches"
				+ " WHERE ciudadc = 'madrid' AND modelo = 'gti' ";
		rs = stat.executeQuery(query);
		
		while(rs.next()){
			System.out.println(rs.getString("nombre") + " " + rs.getString("apellido"));
		}
		System.out.println();
		
		
		rs.close();
		stat.close();
		conn.close();
	}

	/*
	 * 1.2. 32. Obtener un listado de los concesionarios cuyo promedio de coches
	 * supera a la cantidad promedio de todos los concesionarios.
	 */
	public static void exercise1_2() throws SQLException {
		conn = createConnection();
		Statement stat = null;
		ResultSet rs;
		
		System.out.println("Exercise 1_2 \n");
		
		try{
			stat = conn.createStatement();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		String query ="SELECT cifc, avg(CANTIDAD) as average "
				+ "FROM Distribucion "
				+ "GROUP BY cifc "
				+ "HAVING avg(CANTIDAD) > (select avg(cantidad)from distribucion)";
		
		rs = stat.executeQuery(query);
		
		while(rs.next()){
			System.out.println(rs.getString("cifc") + "\t" + rs.getFloat("average"));
		}
		System.out.println();
		
		
		rs.close();
		stat.close();
		conn.close();
	}

	/*
	 * 2. Mostrar por pantalla el resultado de la consulta 6 de la Práctica 2 de
	 * forma el color de la búsqueda sea introducido por el usuario. 6. Obtener
	 * el nombre de las marcas de las que se han vendido coches de un color
	 * introducido por el usuario.
	 */
	public static void exercise2() throws SQLException {
		conn = createConnection();
		Statement stat = null;
		ResultSet rs;
		
		System.out.println("Exercise 2 \n");
		
		try{
			stat = conn.createStatement();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		String query ="SELECT cifc, avg(CANTIDAD) as average "
				+ "FROM Distribucion "
				+ "GROUP BY cifc "
				+ "HAVING avg(CANTIDAD) > (select avg(cantidad)from distribucion)";
		
		rs = stat.executeQuery(query);
		
		while(rs.next()){
			System.out.println(rs.getString("cifc") + "\t" + rs.getFloat("average"));
		}
		System.out.println();
		
		
		rs.close();
		stat.close();
		conn.close();
		
	}

	/*
	 * 3. Realizar una aplicación en Java para ejecutar la consulta 27 de la
	 * Práctica 2 de forma que los límites la cantidad de coches sean
	 * introducidos por el usuario. 27. Obtener el cifc de los concesionarios
	 * que disponen de una cantidad de coches comprendida entre dos cantidades
	 * introducidas por el usuario, ambas inclusive.
	 */
	public static void exercise3() {

	}

	/*
	 * 4. Realizar una aplicación en Java para ejecutar la consulta 24 de la
	 * Práctica 2 de forma que tanto la ciudad del concesionario como el color
	 * sean introducidos por el usuario. 24. Obtener los nombres de los clientes
	 * que no han comprado coches de un color introducido por el usuario en
	 * concesionarios de una ciudad introducida por el usuario.
	 */
	public static void exercise4() {

	}

	/*
	 * 5. Realizar una aplicación en Java que haciendo uso de la instrucción SQL
	 * adecuada: 5.1. Introduzca datos en la tabla coches cuyos datos son
	 * introducidos por el usuario
	 */
	public static void exercise5_1() {

	}

	/*
	 * 5.2. Borre un determinado coche cuyo código es introducido por el
	 * usuario.
	 */
	public static void exercise5_2() {

	}

	/*
	 * 5.3. Actualice el nombre y el modelo para un determinado coche cuyo
	 * código es introducido por el usuario.
	 */
	public static void exercise5_3() {

	}

	/*
	 * 6. Invocar la función y el procedimiento del ejercicio 10 de la Práctica
	 * 10 desde una aplicación Java. 10. Realizar un procedimiento y una función
	 * que dado un código de concesionario devuelve el número ventas que se han
	 * realizado en el mismo. 6.1. Funcion
	 */
	public static void exercise6_1() {

	}

	/*
	 * 6.1. Procedimiento
	 */
	public static void exercise6_2() {

	}

	/*
	 * 7. Invocar la función y el procedimiento del ejercicio 11 de la Práctica
	 * 10 desde una aplicación Java. 11. Realizar un procedimiento y una función
	 * que dada una ciudad que se le pasa como parámetro devuelve el número de
	 * clientes de dicha ciudad. 7.1. Funcion
	 */
	public static void exercise7_1() {

	}

	/*
	 * 7.2. Procedimiento
	 */
	public static void exercise7_2() {

	}

	@SuppressWarnings("resource")
	private static String ReadString() {
		return new Scanner(System.in).nextLine();
	}

	@SuppressWarnings("resource")
	private static int ReadInt() {
		return new Scanner(System.in).nextInt();
	}
}
