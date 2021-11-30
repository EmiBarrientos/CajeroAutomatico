package clases;

public class ClaseHija_Deposito extends  ClasePadre_Abstracta{
	@Override
	public void Transacciones() {
		System.out.println("ingrese cant de deposito");
		Deposito();
		transacciones = getSaldo();
		setSaldo(transacciones + deposito);
		
		System.out.println("-------------------------------");
		System.out.println("depositaste:" + deposito);
		System.out.println("Tu saldo actual es de : "+ getSaldo());
		System.out.println("-------------------------------");
	}
	
}
