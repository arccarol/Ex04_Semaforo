package view;

import java.util.concurrent.Semaphore;
import controller.Semáforo04;

public class Principal {
	
	public static void main(String[] args) {
	
	int permissoes = 1;
	int permite = 1;
	Semaphore semaforoinicio = new Semaphore(permissoes);
	Semaphore semaforofim = new Semaphore(permite);
	
	for (int i = 1; i <= 20; i++) {
		
	Semáforo04 t = new Semáforo04 (semaforoinicio, semaforofim);
	 t.start();
}

}

}
