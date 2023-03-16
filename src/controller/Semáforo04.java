package controller;

import java.util.concurrent.Semaphore;

public class Semáforo04 extends Thread{
	
	private Semaphore semaforoinicio;
	private Semaphore semaforofim;
	int cod;
	double saldo;
	double valor;

	public Semáforo04(Semaphore semaforoinicio, Semaphore semaforofim) {
		
		this.semaforoinicio = semaforoinicio ;
	    this.semaforofim = semaforofim ;
		
	}

	@Override
	public void run() {
		
		   // Inicio da seção critica
		 try {
			 
			     semaforoinicio.acquire();
				 saqueDinheiro();
				 semaforofim.acquire();
				 Deposito();
		  
		 }catch (Exception e) {
			 e.printStackTrace();
		 }finally {
			 semaforoinicio.release();
			 semaforofim.release();
	    //Fim da seção critica
		 } 
		 
}
	



		private void Deposito() {
			cod = (int) (Math.random()*1001);
			 saldo =  (Math.random()*1001);
			 valor =  (Math.random()*1001);
			
			System.out.println("Codigo da conta = "+ cod);
			System.out.printf(" Saldo da conta =%.2f",saldo);
			System.out.println("                                ");
			System.out.printf(" Valor a ser transacionado =%.2f",valor);
			System.out.println("                                ");
			 System.out.printf(" Valor DEPOSITADO =%.2f",valor);
			 System.out.println("                                ");
			 System.out.println("--------------------------");
	}

		private void saqueDinheiro() {
			cod = (int) (Math.random()*5001);
			 saldo = (int) (Math.random()*2001);
			 valor = (int) (Math.random()*2001);
			
			System.out.println(" Codigo da conta = "+ cod);
			System.out.printf(" Saldo da conta =%.2f",saldo);
		    System.out.println("                                ");
			System.out.printf(" Valor a ser transacionado =%.2f",valor);
			System.out.println("                                ");
				 System.out.printf(" Valor SACADO =%.2f",valor);
				 System.out.println("                                ");
				 System.out.println("--------------------------");
	}		
}

