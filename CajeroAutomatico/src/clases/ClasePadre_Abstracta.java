package clases;

import java.util.Scanner;

public abstract class ClasePadre_Abstracta{

	protected int deposito;
	protected int retiro;
	protected int transacciones;
	private static int saldo;
	Scanner entrada = new Scanner(System.in);

	public void operaciones() {
		int flag = 0;
		int opcion = 0;
		do {
			do{
				 System.out.println("\t		 cajero emi\t");
				 System.out.println("	cual pintaaaa?:");
				 System.out.println("1 :retirar ");
				 System.out.println("2 :depositar ");
				 System.out.println("3: consultar saldo");
				 System.out.println("4: salir");
				 opcion = entrada.nextInt();
			
				
				 switch (opcion) {
					 case 1:
						 ClasePadre_Abstracta mensaje = new ClaseHija_retiro();
						 mensaje.Transacciones();;
						 
						 break;
						 
					 case 2:
						 ClasePadre_Abstracta mensajero =new ClaseHija_Deposito();
						 mensajero.Transacciones();
						 
						break;
					 	
					 case 3:
						 ClasePadre_Abstracta mensaje3 =new ClaseHija_Consulta();
						 mensaje3.Transacciones();
						 						 
						 break;
						 
					 case 4:
						 System.out.println("Gracias, vuelva prontos!!");
						 	flag=2;
						 break;
						 
					 default:
						 System.out.println("opcion incorrecta, intentelo de nuevo");
						 break;
				 }
				 
			}while((opcion > 4) && (opcion < 1));
		
		} while (flag == 0);
	}
	
	
	//solicitar cant de retiro
	public void Retiro() {
		retiro = entrada.nextInt();
		
	}
	//deposito
	public void Deposito() {
		deposito = entrada.nextInt();
	}
	//clase abstracta
	public abstract void Transacciones();
	
	//getters and setters
	
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo= saldo;
	}
}