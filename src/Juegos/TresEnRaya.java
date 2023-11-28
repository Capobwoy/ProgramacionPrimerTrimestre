package Juegos;

import java.util.Scanner;

public class TresEnRaya {

//Hacemos el scanner global
static Scanner entrada = new Scanner(System.in);

//creamos un array global
static char[] tablero =new char[9];
	public static void main(String[] args) {
		
		//Inicializamos las variables
		int winsJugador1=0;
		int winsJugador2=0;
		int empate=0;
		int opcion;
		
		//Hacemos un bucle repetir mientras, para que una vez seleccionemos una opcion y
		//terminemos, nos vuelva a pedir una opcion
		do {
			
			//Mostramos el menu al usuario
			mostrarMenu();
			
			//leemos que opcion eligió el usuario
			opcion=leerOpcion();
			
			//Usamos el switch para decir que va a hacer cada opción que elija el usuario
			switch(opcion) {
			
			//Indicamos que pasara al elegir la opcion 1
			case 1:
				int pos=0;
				
				//iniciamos 
				iniciar();
				System.out.println("Jugador1 es 'X' y Jugador2 es 'O'");
				
				//Hacemos un repetir mientras para que los jugadores introduzcan su movimiento
				//en el que comprobamos que hay casillas libres y no ha ganado ningun jugador
				//si eso no se cumple ya no se repite mas
				//Una vez se introduzca el movimiento se rellena el tablero con X o Y segun el jugador que lo introduzca
				//En el jugador2 comprobamos de nuevo que quedan casillas libres y no ha ganado el jugador1
				do {
					
					System.out.println("Jugador1, introduzca movimiento (1-9)");
					pos=entrada.nextInt();
					movimientoJugador1(pos);
					dibujaTablero();
					if (ganaJugador1()==false && quedanCasillas()==true) {
					System.out.println("Jugador2, introduzca movimiento (1-9)");
					pos=entrada.nextInt();
					movimientoJugador2(pos);
					dibujaTablero();
					}
					
				}while((quedanCasillas()==true)&&(ganaJugador1()==false)&&(ganaJugador2()==false));
				
				//si la funcion e ganaJugador1 es verdadera imprimos que ha ganado y le aumentamos
				//su variable de victorias para poder reflejarla en la estadistica una vez la pidamos
				if (ganaJugador1()==true) {
					System.out.println("Jugador1 gana");
					winsJugador1++;
				}
				
				//si la funcion e ganaJugador2 es verdadera imprimos que ha ganado y le aumentamos
				//su variable de victorias para poder reflejarla en la estadistica una vez la pidamos
				if (ganaJugador2()==true) {
					System.out.println("Jugador2 gana");
					winsJugador2++;
				}
				
				//Si es falso que hayan ganado alguno de los 2 jugadores imprimimos que ha habido
				//empate e incrementramos la variable empate para la hora de reflejar las estadisticas
				if ((ganaJugador1()==false)&&(ganaJugador2()==false)) {
					System.out.println("Han empatado");
					empate++;
				}
				
				//Lo sacamos de switch para que no realice las siguientes opciones
				break;
				
			//Indicamos que pasara al elegir la opcion 2	
			case 2:
				System.out.println("Jugador1 ha ganado "+ winsJugador1+" partidas");
				System.out.println("Jugador2 ha ganado "+winsJugador2+" partidas");
				System.out.println("Se han empatado "+empate+" veces");
				
				//Lo sacamos de switch para que no realice las siguientes opciones
				break;
			
			//Indicamos que pasara al elegir la opcion 3
			case 3:
				System.out.println("Hasta pronto :)");
				
				//Lo sacamos de switch para que no realice las siguientes opciones
				break;
				
			//Indicamos la opcion por defecto si no elegimos ninguno de las anteriores opciones
			default:
				System.out.println("Opción no válida. Intente de nuevo.");
			}
		
		//Nos mantendremos en el repetir mientras si elegimos una opcion distinta de 3
			//Si elegimos el 3 nos hará lo que le indicamos en la opcion 3 y se saldra del repetir mientras
		}while(opcion!=3);
	
	//Cerramos el main
	}
		
	//Hacemos una funcion que inicie el tablero
	public static void iniciar() {
	        for (int i = 0; i < 9; i++) {
	            tablero[i] = ' ';
	        }
	    }
	
	//Hacemos una funcion que nos dibuje el tablero y nos marque que posicion de la array
	//hay en el sitio indicado cuando se le pida en el main
	 public static void dibujaTablero() {
		 System.out.println("-----------");
		 System.out.println("| "+tablero[6]+" | "+tablero[7]+" | "+tablero[8]+" |");
		 System.out.println("-----------");
		 System.out.println("| "+tablero[3]+" | "+tablero[4]+" | "+tablero[5]+" |");
		 System.out.println("-----------");
		 System.out.println("| "+tablero[0]+" | "+tablero[1]+" | "+tablero[2]+" |");
	 }
	 
	 //Hacemos una funcion que nos muestre el menu cuando se le pida en el main
	 public static void mostrarMenu() {
		System.out.println("1.Jugar artida");
		System.out.println("2.Mostrar estadísticas");
		System.out.println("3.Salir");
	}
	 
	 //Hacemos una funcion que nos lea la opcion elegida en el menu cuando se le pida en el main
	 public static int leerOpcion() {
		 System.out.println("Introduce una opcion");
		 int opcion=entrada.nextInt();
		 return opcion;
	 }
	 
	 //Hacemos una funcion en el que indicaremos el movimiento del jugador1 y la rellenamos
	 //comprobando con otra funcion creada que la posicion existe y no esta ocupada cuando se le pida en el main
	 public static void movimientoJugador1(int pos) {
		 boolean valido=movimientoValido(pos);
		 if (valido==true) {
			 tablero[pos-1]='X';
		 }
		 while (valido==false) {
			 System.out.println("La posición está ocupada o no es válida. Introducelo de nuevo.");
			 pos=entrada.nextInt();
			 valido=movimientoValido(pos);
			 if (valido==true) {
				 tablero[pos-1]='X';
			 }
		 }
	 }
	 
	//Hacemos una funcion en el que indicaremos el movimiento del jugador2 y la rellenamos
	//comprobando con otra funcion creada que la posicion existe y no esta ocupada cuando se le pida en el main
	 public static void movimientoJugador2(int pos) {
		 boolean valido=movimientoValido(pos);
		 if (valido==true) {
			 tablero[pos-1]='O';
		 }
		 while (valido==false) {
			 System.out.println("La posición está ocupada o no es válida. Introducelo de nuevo.");
			 pos=entrada.nextInt();
			 valido=movimientoValido(pos);
			 if (valido==true) {
				 tablero[pos-1]='O';
			 }
		 }
	 }
	 
	 //Hacemos una funcion que compruebe que las casillas entre el 0 y 8 esten vacias
	 //cuando se le pida en el main
	 public static boolean quedanCasillas() {
		for (int i=0;i<9;i++) {
			if (tablero[i]==' ') {
				return true;
			}
		}
		return false;
	 }
	 
	 //Hacemos una funcion que comprueve que el movimiento esta entre 0 y 8
	 //cuando se le pida en el main
	 public static boolean movimientoValido(int pos) {
		 if (pos<0 || pos>9) {
			 return false;
		 }
		 else if (tablero[pos-1]=='X' || tablero[pos-1]=='O') {
			 	return false;
		 }else {
			 return true;
		 }
	 }
	 
	 //Hacemos una funcion que compruebe las posibilidades de victoria de jugador 1
	 //cuando se le pida en el main
	 public static boolean ganaJugador1() {
		if (((tablero[0]=='X')&&(tablero[1]=='X')&&(tablero[2]=='X')||
				(tablero[3]=='X')&&(tablero[4]=='X')&&(tablero[5]=='X')||
				(tablero[6]=='X')&&(tablero[7]=='X')&&(tablero[8]=='X')||
				(tablero[0]=='X')&&(tablero[3]=='X')&&(tablero[6]=='X')||
				(tablero[1]=='X')&&(tablero[4]=='X')&&(tablero[7]=='X')||
				(tablero[2]=='X')&&(tablero[5]=='X')&&(tablero[8]=='X')||
				(tablero[0]=='X')&&(tablero[4]=='X')&&(tablero[8]=='X')||
				(tablero[2]=='X')&&(tablero[4]=='X')&&(tablero[6]=='X'))) {
				return true;
		}
		return false;	
	 }
	 
	//Hacemos una funcion que compruebe las posibilidades de victoria de jugador 2
	//cuando se le pida en el main
	 public static boolean ganaJugador2() {
			if (((tablero[0]=='O')&&(tablero[1]=='O')&&(tablero[2]=='O')||
					(tablero[3]=='O')&&(tablero[4]=='O')&&(tablero[5]=='O')||
					(tablero[6]=='O')&&(tablero[7]=='O')&&(tablero[8]=='O')||
					(tablero[0]=='O')&&(tablero[3]=='O')&&(tablero[6]=='O')||
					(tablero[1]=='O')&&(tablero[4]=='O')&&(tablero[7]=='O')||
					(tablero[2]=='O')&&(tablero[5]=='O')&&(tablero[8]=='O')||
					(tablero[0]=='O')&&(tablero[4]=='O')&&(tablero[8]=='O')||
					(tablero[2]=='O')&&(tablero[4]=='O')&&(tablero[6]=='O'))) {
				return true;
			}
			return false;	
		 }
}