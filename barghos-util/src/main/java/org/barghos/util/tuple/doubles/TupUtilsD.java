package org.barghos.util.tuple.doubles;

import org.barghos.annotation.AllowNull;
import org.barghos.util.math.MathUtils;

public class TupUtilsD
{
	public static boolean equals(@AllowNull ITupRD t1, @AllowNull ITupRD t2)
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
	
	public static boolean equals(@AllowNull ITupRD t1, @AllowNull double[] t2)
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
	
	public static boolean equals(@AllowNull double[] t1, @AllowNull ITupRD t2)
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
	
	public static boolean equals(@AllowNull double[] t1, @AllowNull double[] t2)
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
	
	public static boolean equals(double tolerance, @AllowNull ITupRD t1, @AllowNull ITupRD t2)
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
	
	public static boolean equals(double tolerance, @AllowNull ITupRD t1, @AllowNull double[] t2)
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
	
	public static boolean equals(double tolerance, @AllowNull double[] t1, @AllowNull ITupRD t2)
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
	
	public static boolean equals(double tolerance, @AllowNull double[] t1, @AllowNull double[] t2)
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
	
	public static boolean equalsAt(int index, @AllowNull ITupRD t1, @AllowNull ITupRD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.size()) return false;

		return t1.getAt(index) == t2.getAt(index);
	}
	
	public static boolean equalsAt(int index, @AllowNull ITupRD t1, @AllowNull double[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.length) return false;

		return t1.getAt(index) == t2[index];
	}
	
	public static boolean equalsAt(int index, @AllowNull ITupRD t1, double value)
	{
		if (t1 == null) return false;

		return t1.getAt(index) == value;
	}
	
	public static boolean equalsAt(int index, @AllowNull double[] t1, @AllowNull ITupRD t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.size()) return false;

		return t1[index] == t2.getAt(index);
	}
	
	public static boolean equalsAt(int index, @AllowNull double[] t1, @AllowNull double[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.length) return false;

		return t1[index] == t2[index];
	}
	
	public static boolean equalsAt(int index, @AllowNull double[] t1, double value)
	{
		if (t1 == null) return false;

		return t1[index] == value;
	}
	
	public static boolean equalsAt(double tolerance, int index, @AllowNull ITupRD t1, @AllowNull ITupRD t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		int size = t1.size();
		
		if (size != t2.size()) return false;

		return MathUtils.equals(tolerance, t1.getAt(index), t2.getAt(index));
	}
	
	public static boolean equalsAt(double tolerance, int index, @AllowNull ITupRD t1, @AllowNull double[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		int size = t1.size();
		
		if (size != t2.length) return false;

		return MathUtils.equals(tolerance, t1.getAt(index), t2[index]);
	}
	
	public static boolean equalsAt(double tolerance, int index, @AllowNull ITupRD t1, double value)
	{
		if (t1 == null) return false;

		return MathUtils.equals(tolerance, t1.getAt(index), value);
	}
	
	public static boolean equalsAt(double tolerance, int index, @AllowNull double[] t1, @AllowNull ITupRD t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		int size = t1.length;
		
		if (size != t2.size()) return false;

		return MathUtils.equals(tolerance, t1[index], t2.getAt(index));
	}
	
	public static boolean equalsAt(double tolerance, int index, @AllowNull double[] t1, @AllowNull double[] t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;

		int size = t1.length;
		
		if (size != t2.length) return false;

		return MathUtils.equals(tolerance, t1[index], t2[index]);
	}
	
	public static boolean equalsAt(double tolerance, int index, @AllowNull double[] t1, double value)
	{
		if (t1 == null) return false;

		return MathUtils.equals(tolerance, t1[index], value);
	}
	
	public static boolean isFinite(ITupRD t)
	{
		for(int i = 0, size = t.size(); i < size; i++)
		{
			if(!Double.isFinite(t.getAt(i))) return false;
		}
		
		return true;
	}
	
	public static boolean isFinite(double[] t)
	{
		for(int i = 0, size = t.length; i < size; i++)
		{
			if(!Double.isFinite(t[i])) return false;
		}
		
		return true;
	}
	
	public static boolean isFiniteAt(int index, ITupRD t)
	{
		return Double.isFinite(t.getAt(index));
	}
	
	public static boolean isFiniteAt(int index, double[] t)
	{
		return Double.isFinite(t[index]);
	}
	
	public static boolean isZero(ITupRD t)
	{
		for(int i = 0, size = t.size(); i < size; i++)
		{
			if(!MathUtils.isZero(t.getAt(i))) return false;
		}
		
		return true;
	}
	
	public static boolean isZero(double[] t)
	{
		for(int i = 0, size = t.length; i < size; i++)
		{
			if(!MathUtils.isZero(t[i])) return false;
		}
		
		return true;
	}
	
	public static boolean isZero(double tolerance, ITupRD t)
	{
		for(int i = 0, size = t.size(); i < size; i++)
		{
			if(!MathUtils.isZero(tolerance, t.getAt(i))) return false;
		}
		
		return true;
	}
	
	public static boolean isZero(double tolerance, double[] t)
	{
		for(int i = 0, size = t.length; i < size; i++)
		{
			if(!MathUtils.isZero(tolerance, t[i])) return false;
		}
		
		return true;
	}
	
	public static boolean isZeroAt(int index, ITupRD t)
	{
		return MathUtils.isZero(t.getAt(index));
	}
	
	public static boolean isZeroAt(int index, double[] t)
	{
		return MathUtils.isZero(t[index]);
	}
	
	public static boolean isZeroAt(double tolerance, int index, ITupRD t)
	{
		return MathUtils.isZero(tolerance, t.getAt(index));
	}
	
	public static boolean isZeroAt(double tolerance, int index, double[] t)
	{
		return MathUtils.isZero(tolerance, t[index]);
	}
}
