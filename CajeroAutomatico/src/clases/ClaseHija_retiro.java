package clases;

public class ClaseHija_retiro extends ClasePadre_Abstracta{

	@Override
	public void Transacciones() {
		System.out.print("Cuanto desea retirar");
		Retiro();
		if (retiro <= getSaldo()) {
		transacciones=getSaldo();
		setSaldo(transacciones-retiro);
		System.out.println("-------------------------------");
		System.out.println("retiraste :"+ retiro);
		System.out.println("tu saldo actual es "+getSaldo());
		System.out.println("--------------------------------");
		}else {
			System.out.println("----------------------------");
			System.out.println("saldo insuficiente. ");
			System.out.println("----------------------------");
			
		}
	}

}
