package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.math.MathUtils;

public class RawTupUtilsF
{
	public static boolean equals(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.length) return false;

		for(int i = 0; i < size; i++)
		{
			if (t1[i] != t2[i]) return false;
		}

		return true;
	}
	
	public static boolean equalsEM(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.length) return false;

		for(int i = 0; i < size; i++)
		{
			if (MathUtils.equalsEM(tolerance, t1[i], t2[i])) return false;
		}

		return true;
	}
	
	public static boolean equalsEM4(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.length) return false;

		for(int i = 0; i < size; i++)
		{
			if (!MathUtils.equalsEM4(t1[i], t2[i])) return false;
		}

		return true;
	}
	
	public static boolean equalsEM6(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.length) return false;

		for(int i = 0; i < size; i++)
		{
			if (!MathUtils.equalsEM6(t1[i], t2[i])) return false;
		}

		return true;
	}
	
	public static boolean equalsEM8(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.length) return false;

		for(int i = 0; i < size; i++)
		{
			if (!MathUtils.equalsEM8(t1[i], t2[i])) return false;
		}

		return true;
	}
	
	public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.length) return false;

		return t1[index] == t2[index];
	}
	
	public static boolean equalsAt(int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;

		return t1[index] == value;
	}
	
	public static boolean equalsAtEM(float tolerance, int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;

		int size = t1.length;
		
		if (size != t2.length) return false;

		return MathUtils.equalsEM(tolerance, t1[index], t2[index]);
	}
	
	public static boolean equalsAtEM(float tolerance, int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM(tolerance, t1[index], value);
	}
	
	public static boolean equalsAtEM4(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.length) return false;

		return MathUtils.equalsEM4(t1[index], t2[index]);
	}
	
	public static boolean equalsAtEM4(int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM4(t1[index], value);
	}
	
	public static boolean equalsAtEM6(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.length) return false;

		return MathUtils.equalsEM6(t1[index], t2[index]);
	}
	
	public static boolean equalsAtEM6(int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM6(t1[index], value);
	}
	
	public static boolean equalsAtEM8(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null || t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.length) return false;

		return MathUtils.equalsEM8(t1[index], t2[index]);
	}
	
	public static boolean equalsAtEM8(int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM8(t1[index], value);
	}

	public static boolean isFinite(float[] t)
	{
		for(int i = 0, size = t.length; i < size; i++)
		{
			if(!Float.isFinite(t[i])) return false;
		}
		
		return true;
	}
	
	public static boolean isFiniteAt(int index, float[] t)
	{
		return Float.isFinite(t[index]);
	}

	public static boolean isInfinite(float[] t)
	{
		for(int i = 0, size = t.length; i < size; i++)
		{
			if(!Float.isInfinite(t[i])) return false;
		}
		
		return true;
	}
	
	public static boolean isInfiniteAt(int index, float[] t)
	{
		return Float.isInfinite(t[index]);
	}
	
	public static boolean isNaN(float[] t)
	{
		for(int i = 0, size = t.length; i < size; i++)
		{
			if(!Float.isNaN(t[i])) return false;
		}
		
		return true;
	}
	
	public static boolean isNaNAt(int index, float[] t)
	{
		return Float.isNaN(t[index]);
	}
	
	public static boolean isZero(float[] t)
	{
		for(int i = 0, size = t.length; i < size; i++)
		{
			if(t[i] != 0.0f) return false;
		}
		
		return true;
	}

	public static boolean isZeroEM(float tolerance, float[] t)
	{
		for(int i = 0, size = t.length; i < size; i++)
		{
			if(!MathUtils.isZeroEM(tolerance, t[i])) return false;
		}
		
		return true;
	}
	
	public static boolean isZeroEM4(float[] t)
	{
		for(int i = 0, size = t.length; i < size; i++)
		{
			if(!MathUtils.isZeroEM4(t[i])) return false;
		}
		
		return true;
	}
	
	public static boolean isZeroEM6(float[] t)
	{
		for(int i = 0, size = t.length; i < size; i++)
		{
			if(!MathUtils.isZeroEM6(t[i])) return false;
		}
		
		return true;
	}
	
	public static boolean isZeroEM8(float[] t)
	{
		for(int i = 0, size = t.length; i < size; i++)
		{
			if(!MathUtils.isZeroEM8(t[i])) return false;
		}
		
		return true;
	}

	public static boolean isZeroAt(int index, float[] t)
	{
		return t[index] == 0.0f;
	}

	public static boolean isZeroAtEM(float tolerance, int index, float[] t)
	{
		return MathUtils.isZeroEM(tolerance, t[index]);
	}
	
	public static boolean isZeroAtEM4(int index, float[] t)
	{
		return MathUtils.isZeroEM4(t[index]);
	}
	
	public static boolean isZeroAtEM6(int index, float[] t)
	{
		return MathUtils.isZeroEM6(t[index]);
	}
	
	public static boolean isZeroAtEM8(int index, float[] t)
	{
		return MathUtils.isZeroEM8(t[index]);
	}
}
