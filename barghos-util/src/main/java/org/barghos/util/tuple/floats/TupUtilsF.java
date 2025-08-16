package org.barghos.util.tuple.floats;

import org.barghos.annotation.AllowNull;
import org.barghos.util.math.MathUtils;

public class TupUtilsF
{
	public static boolean equals(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.size()) return false;

		for(int i = 0; i < size; i++)
		{
			if (t1.getAt(i) != t2.getAt(i)) return false;
		}

		return true;
	}
	
	public static boolean equals(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.length) return false;

		for(int i = 0; i < size; i++)
		{
			if (t1.getAt(i) != t2[i]) return false;
		}

		return true;
	}
	
	public static boolean equals(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.size()) return false;

		for(int i = 0; i < size; i++)
		{
			if (t1[i] != t2.getAt(i)) return false;
		}

		return true;
	}
	
	public static boolean equals(@AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.length) return false;

		for(int i = 0; i < size; i++)
		{
			if (t1[i] != t2[i]) return false;
		}

		return true;
	}
	
	public static boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.size()) return false;

		for(int i = 0; i < size; i++)
		{
			if (MathUtils.equals(tolerance, t1.getAt(i), t2.getAt(i))) return false;
		}

		return true;
	}
	
	public static boolean equals(float tolerance, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.length) return false;

		for(int i = 0; i < size; i++)
		{
			if (MathUtils.equals(tolerance, t1.getAt(i), t2[i])) return false;
		}

		return true;
	}
	
	public static boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.size()) return false;

		for(int i = 0; i < size; i++)
		{
			if (MathUtils.equals(tolerance, t1[i], t2.getAt(i))) return false;
		}

		return true;
	}
	
	public static boolean equals(float tolerance, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.length) return false;

		for(int i = 0; i < size; i++)
		{
			if (MathUtils.equals(tolerance, t1[i], t2[i])) return false;
		}

		return true;
	}
	
	public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.size()) return false;

		return t1.getAt(index) == t2.getAt(index);
	}
	
	public static boolean equalsAt(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.length) return false;

		return t1.getAt(index) == t2[index];
	}
	
	public static boolean equalsAt(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return t1.getAt(index) == value;
	}
	
	public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.size()) return false;

		return t1[index] == t2.getAt(index);
	}
	
	public static boolean equalsAt(int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.length) return false;

		return t1[index] == t2[index];
	}
	
	public static boolean equalsAt(int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;

		return t1[index] == value;
	}
	
	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		int size = t1.size();
		
		if (size != t2.size()) return false;

		return MathUtils.equals(tolerance, t1.getAt(index), t2.getAt(index));
	}
	
	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		int size = t1.size();
		
		if (size != t2.length) return false;

		return MathUtils.equals(tolerance, t1.getAt(index), t2[index]);
	}
	
	public static boolean equalsAt(float tolerance, int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equals(tolerance, t1.getAt(index), value);
	}
	
	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		int size = t1.length;
		
		if (size != t2.size()) return false;

		return MathUtils.equals(tolerance, t1[index], t2.getAt(index));
	}
	
	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, @AllowNull float[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		int size = t1.length;
		
		if (size != t2.length) return false;

		return MathUtils.equals(tolerance, t1[index], t2[index]);
	}
	
	public static boolean equalsAt(float tolerance, int index, @AllowNull float[] t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equals(tolerance, t1[index], value);
	}
	
	public static boolean isFinite(ITupRF t)
	{
		for(int i = 0, size = t.size(); i < size; i++)
		{
			if(!Float.isFinite(t.getAt(i))) return false;
		}
		
		return true;
	}
	
	public static boolean isFinite(float[] t)
	{
		for(int i = 0, size = t.length; i < size; i++)
		{
			if(!Float.isFinite(t[i])) return false;
		}
		
		return true;
	}
	
	public static boolean isFiniteAt(int index, ITupRF t)
	{
		return Float.isFinite(t.getAt(index));
	}
	
	public static boolean isFiniteAt(int index, float[] t)
	{
		return Float.isFinite(t[index]);
	}
	
	public static boolean isZero(ITupRF t)
	{
		for(int i = 0, size = t.size(); i < size; i++)
		{
			if(!MathUtils.isZero(t.getAt(i))) return false;
		}
		
		return true;
	}
	
	public static boolean isZero(float[] t)
	{
		for(int i = 0, size = t.length; i < size; i++)
		{
			if(!MathUtils.isZero(t[i])) return false;
		}
		
		return true;
	}
	
	public static boolean isZero(float tolerance, ITupRF t)
	{
		for(int i = 0, size = t.size(); i < size; i++)
		{
			if(!MathUtils.isZero(tolerance, t.getAt(i))) return false;
		}
		
		return true;
	}
	
	public static boolean isZero(float tolerance, float[] t)
	{
		for(int i = 0, size = t.length; i < size; i++)
		{
			if(!MathUtils.isZero(tolerance, t[i])) return false;
		}
		
		return true;
	}
	
	public static boolean isZeroAt(int index, ITupRF t)
	{
		return MathUtils.isZero(t.getAt(index));
	}
	
	public static boolean isZeroAt(int index, float[] t)
	{
		return MathUtils.isZero(t[index]);
	}
	
	public static boolean isZeroAt(float tolerance, int index, ITupRF t)
	{
		return MathUtils.isZero(tolerance, t.getAt(index));
	}
	
	public static boolean isZeroAt(float tolerance, int index, float[] t)
	{
		return MathUtils.isZero(tolerance, t[index]);
	}
}
