package com.basicsofjava.learninghasarelations;

public class Battery {
	int capacity=1400;
	int rembattery=14;
	public void charge()
	{
		System.out.println("Charging...");
		for(int i=rembattery;i<100;i++)
		{
			System.out.println("Remaining battery is :"+rembattery+"%");
			rembattery++;
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				
			}
			
		}
		
	}

}
