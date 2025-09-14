package org.barghos.api.core.collection;

public class ArrayUtils 
{
	public static float[] convertToPrimitive(Float[] arr)
	{
		if(arr == null) return null;
		
		float[] out = new float[arr.length];
		
		for(int i = 0; i < arr.length; i++)
			out[i] = arr[i].floatValue();
		
		return out;
	}
	
	public static Float[] convertToObject(float[] arr)
	{
		if(arr == null) return null;
		
		Float[] out = new Float[arr.length];
		
		for(int i = 0; i < arr.length; i++)
			out[i] = arr[i];
		
		return out;
	}
	
	public static int[] convertToPrimitive(Integer[] arr)
	{
		if(arr == null) return null;
		
		int[] out = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++)
			out[i] = arr[i].intValue();
		
		return out;
	}
	
	public static Integer[] convertToObject(int[] arr)
	{
		if(arr == null) return null;
		
		Integer[] out = new Integer[arr.length];
		
		for(int i = 0; i < arr.length; i++)
			out[i] = arr[i];
		
		return out;
	}
}
