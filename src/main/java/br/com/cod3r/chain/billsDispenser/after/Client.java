package br.com.cod3r.chain.billsDispenser.after;

public class Client {

	public static void main(String[] args) {
//		Dispenser dispenser = new Dispenser();
//		System.out.println("Withdrawing $230...");
//		dispenser.withDraw(230);
//		System.out.println("Withdrawing $1589...");
//		dispenser.withDraw(1589);
		
		Dispenser customDispenser = new Dispenser(new Bill(256), new Bill(1));
		System.out.println("Withdrawing $230...");
		customDispenser.withDraw(230);
		System.out.println("Withdrawing $1589...");
		customDispenser.withDraw(1589);
	}
}
