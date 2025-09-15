package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.AllowNull;
import org.barghos.api.core.math.MathUtils;

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
	
	public static boolean equalsEM4(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.size()) return false;

		for(int i = 0; i < size; i++)
		{
			if (!MathUtils.equalsEM4(t1.getAt(i), t2.getAt(i))) return false;
		}

		return true;
	}
	
	public static boolean equalsEM4(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.length) return false;

		for(int i = 0; i < size; i++)
		{
			if (!MathUtils.equalsEM4(t1.getAt(i), t2[i])) return false;
		}

		return true;
	}
	
	public static boolean equalsEM4(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.size()) return false;

		for(int i = 0; i < size; i++)
		{
			if (!MathUtils.equalsEM4(t1[i], t2.getAt(i))) return false;
		}

		return true;
	}
	
	public static boolean equalsEM6(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.size()) return false;

		for(int i = 0; i < size; i++)
		{
			if (!MathUtils.equalsEM6(t1.getAt(i), t2.getAt(i))) return false;
		}

		return true;
	}
	
	public static boolean equalsEM6(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.length) return false;

		for(int i = 0; i < size; i++)
		{
			if (!MathUtils.equalsEM6(t1.getAt(i), t2[i])) return false;
		}

		return true;
	}
	
	public static boolean equalsEM6(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.size()) return false;

		for(int i = 0; i < size; i++)
		{
			if (!MathUtils.equalsEM6(t1[i], t2.getAt(i))) return false;
		}

		return true;
	}
	
	public static boolean equalsEM8(@AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.size()) return false;

		for(int i = 0; i < size; i++)
		{
			if (!MathUtils.equalsEM8(t1.getAt(i), t2.getAt(i))) return false;
		}

		return true;
	}
	
	public static boolean equalsEM8(@AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.length) return false;

		for(int i = 0; i < size; i++)
		{
			if (!MathUtils.equalsEM8(t1.getAt(i), t2[i])) return false;
		}

		return true;
	}
	
	public static boolean equalsEM8(@AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.size()) return false;

		for(int i = 0; i < size; i++)
		{
			if (!MathUtils.equalsEM8(t1[i], t2.getAt(i))) return false;
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
	
	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.size()) return false;

		return MathUtils.equalsEM4(t1.getAt(index), t2.getAt(index));
	}
	
	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.length) return false;

		return MathUtils.equalsEM4(t1.getAt(index), t2[index]);
	}
	
	public static boolean equalsAtEM4(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM4(t1.getAt(index), value);
	}
	
	public static boolean equalsAtEM4(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.size()) return false;

		return MathUtils.equalsEM4(t1[index], t2.getAt(index));
	}
	
	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.size()) return false;

		return MathUtils.equalsEM6(t1.getAt(index), t2.getAt(index));
	}
	
	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.length) return false;

		return MathUtils.equalsEM6(t1.getAt(index), t2[index]);
	}
	
	public static boolean equalsAtEM6(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM6(t1.getAt(index), value);
	}
	
	public static boolean equalsAtEM6(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.size()) return false;

		return MathUtils.equalsEM6(t1[index], t2.getAt(index));
	}
	
	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, @AllowNull ITupRF t2)
	{
		if (t1 == t2) return true;
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.size()) return false;

		return MathUtils.equalsEM8(t1.getAt(index), t2.getAt(index));
	}
	
	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, @AllowNull float[] t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.size();
		
		if (size != t2.length) return false;

		return MathUtils.equalsEM8(t1.getAt(index), t2[index]);
	}
	
	public static boolean equalsAtEM8(int index, @AllowNull ITupRF t1, float value)
	{
		if (t1 == null) return false;

		return MathUtils.equalsEM8(t1.getAt(index), value);
	}
	
	public static boolean equalsAtEM8(int index, @AllowNull float[] t1, @AllowNull ITupRF t2)
	{
		if (t1 == null && t2 == null) return true;
		if (t1 == null) return false;
		if (t2 == null) return false;
		
		int size = t1.length;
		
		if (size != t2.size()) return false;

		return MathUtils.equalsEM8(t1[index], t2.getAt(index));
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
	
	public static boolean isFinite(ITupRF t)
	{
		for(int i = 0, size = t.size(); i < size; i++)
		{
			if(!Float.isFinite(t.getAt(i))) return false;
		}
		
		return true;
	}
	
	public static boolean isFiniteAt(int index, ITupRF t)
	{
		return Float.isFinite(t.getAt(index));
	}
	
	public static boolean isZero(ITupRF t)
	{
		for(int i = 0, size = t.size(); i < size; i++)
		{
			if(t.getAt(i) != 0.0f) return false;
		}
		
		return true;
	}
	
	public static boolean isZeroEM4(ITupRF t)
	{
		for(int i = 0, size = t.size(); i < size; i++)
		{
			if(!MathUtils.isZeroEM4(t.getAt(i))) return false;
		}
		
		return true;
	}
	
	public static boolean isZeroEM6(ITupRF t)
	{
		for(int i = 0, size = t.size(); i < size; i++)
		{
			if(!MathUtils.isZeroEM6(t.getAt(i))) return false;
		}
		
		return true;
	}
	
	public static boolean isZeroEM8(ITupRF t)
	{
		for(int i = 0, size = t.size(); i < size; i++)
		{
			if(!MathUtils.isZeroEM8(t.getAt(i))) return false;
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
	
	public static boolean isZeroAt(int index, ITupRF t)
	{
		return t.getAt(index) == 0.0f;
	}
	
	public static boolean isZeroAtEM4(int index, ITupRF t)
	{
		return MathUtils.isZeroEM4(t.getAt(index));
	}
	
	public static boolean isZeroAtEM6(int index, ITupRF t)
	{
		return MathUtils.isZeroEM6(t.getAt(index));
	}
	
	public static boolean isZeroAtEM8(int index, ITupRF t)
	{
		return MathUtils.isZeroEM8(t.getAt(index));
	}
	
	public static boolean isZeroAt(float tolerance, int index, ITupRF t)
	{
		return MathUtils.isZero(tolerance, t.getAt(index));
	}
}
