package org.barghos.validation;

import org.barghos.validation.exception.argument.ArgumentInvalidException;

public class Demo
{
	
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.run();
	}
	
	public void run()
	{
		BarghosValidationConfiguration.validateArgs(false);
		
		int iterations = 600000000;
		
		for(int i = 0; i < iterations; i++)
		{
			try
			{
				test(5);
			}
			catch(ArgumentInvalidException e)
			{
			}
		}
	}
	
	public void test(int size)
	{
		Validate.Arg.checkMinSize("size", 4, size);

		blackhole(size);
	}

	public int sink;
	public void blackhole(int value)
	{
		sink++;
	}
	
}
