package Interfaz;
import Mundo.*;
import java.util.*;

public class Pruebas {
	public static void main(String[] args) {
		ControlTv CT = new ControlTv();
		Scanner sc = new Scanner(System.in);
		int op;
		
		do {
			System.out.println("Selecciona una opcion \n" + 
								"1. Agregar producto a inventario \n" +
								"2. Consultar informacion del producto \n" +
								"3. Agregar descuento \n" + 
								"4. Eliminar Producto \n" +
								"5. Salir \n");
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				System.out.print("Codigo identificador: ");
				int readCode = sc.nextInt();
				System.out.print("Marca del Televisor: ");
				String readMarc = sc.next();
				System.out.print("Escribe el valor del equipo: ");
				double readPrice = sc.nextLong();
				System.out.print(CT.AgregarProducto(readCode, readMarc, readPrice));
				break;
				
			case 2:
				System.out.print("Escribe el identificador del producto: ");
				int readCode2 = sc.nextInt();
				System.out.println(CT.consultarInfo(readCode2));
				break;
			/*case 3:
				System.out.print("Escriba el identificador del producto: ");
				int readCode3 = sc.nextInt();
				System.out.print("Descuento (%): ");
				int readDescuento = sc.nextInt();
				System.out.println(CT.GenDescuento(readCode3, readDescuento));
				break;*/
				
			case 4:
				System.out.println("Escribe el identificador: ");
				int readCode4 = sc.nextInt();
				System.out.print(CT.EliminarProducto(readCode4));
				break;
				
			case 5:
				op = 100;
				break;
			}
		}while(op != 100);
		sc.close();
	}
}
