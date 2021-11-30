package clases;

public class ClaseMain {

	public static void main(String[] args) {
		ClasePadre_Abstracta menu = new ClaseHija_Consulta();
		
		menu.setSaldo(2000);
		menu.operaciones();
				
	}

}
