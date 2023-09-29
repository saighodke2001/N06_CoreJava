package com.tnsif.Multithreading;

public class RunnableImpl implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i=1;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" :"+"Hello");
			try
			{
				Thread.sleep(600);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

	
}
