package org.barghos.util.collection;

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
}
