package com.tnsif.runnabledemo;

public class UsingRunneable implements Runnable  {

	Thread t;
	int end, start;
	String msg;

	public UsingRunneable(int end, int start, String msg) {
		super();
		this.end = end;
		this.start = start;
		this.msg = msg;

		t = new Thread(this, "Child Thread");
		t.start();
	}

	@Override
	public void run() {
		for (int i = end; i > start; i--) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
			System.out.println(i + msg);
		}

	}
	
	public static void main(String[] args) {
		//lambda Expression
		
				Runnable r2=()->System.out.println("runnable with Lambda Expression");
				new Thread(r2).start();
	}

}
