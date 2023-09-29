package com.tnsif.Multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//First Way Using Implementing runnable interface
		RunnableImpl imp=new RunnableImpl();
		Thread thread1=new Thread(imp,"ChildThread");
		thread1.start();
		
		
		Runnable obj=new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						
						char ch='A';
						for(int i=1;i<=25;i++,ch++)
						{
							System.out.println(Thread.currentThread().getName()+":"+ch);
						}
							
						
					}
			
				};
				
				Thread thread2=new Thread(obj,"ChildThread2");
				thread2.start();
				
				
				//lambda Expression
				
	}

}
