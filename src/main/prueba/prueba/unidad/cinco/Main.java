package prueba.unidad.cinco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);
		
		System.out.println("-----SISTEMA BANCO PICHINCHA-----");
		System.out.println("Ingrese Clave");
		String C = teclado1.nextLine();		 
		
		int N = 0;
		int S = 2500;
		int SA = 0;
		int C2 = 0;
		
		if (C == 85DB) {
			do {
				System.out.println("-----MENÚ-----");
				System.out.println("1. Consultar Pagos");
				System.out.println("2. Realizar Transferencia");
				System.out.println("3. SALIR");
				N = teclado.nextInt();
				
				if (N == 1) {
					System.out.println("No tiene ningún pago pendiente");
				}else {
					if (N == 2) {
						System.out.println("Ingrese la cuenta de destino de la transferencia");
						String D = teclado1.nextLine();
						System.out.println("Ingrese Monto a transferir");
						int M = teclado1.nextInt();		
						SA = S - M;
						System.out.println("Su nuevo saldo es: " + SA);
						
					}
				}
				
			}while (N != 3);
		}else {
			System.out.println("La clave no es la correcta");
			do {
				System.out.println("Ingrese Clave");
				String C1 = teclado1.nextLine();
			}while (C2 != -1);
		}
	}

}
