package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.ExtractionParam;

public class ArithmeticOpsF
{
	
	private ArithmeticOpsF() { }
	
	public static float[] tup_add_f(float[] v1, float[] v2, int size)
	{
		for(int i = 0; i < size; i++)
		{
			v1[i] += v2[i];
		}
		
		return v1;
	}
	
	public static float[] tup_add_f(float[] v1, float value, int size)
	{
		for(int i = 0; i < size; i++)
		{
			v1[i] += value;
		}
		
		return v1;
	}
	
	public static float[] tup_addN_f(float[] v1, float[] v2, int size)
	{
		float[] res = new float[size];
		
		for(int i = 0; i < size; i++)
		{
			res[i] = v1[i] + v2[i];
		}
		
		return res;
	}
	
	public static float[] tup_addN_f(float[] v1, float value, int size)
	{
		float[] res = new float[size];
		
		for(int i = 0; i < size; i++)
		{
			res[i] = v1[i] + value;
		}
		
		return res;
	}
	
	public static float[] tup_addT_f(float[] v1, float[] v2, @ExtractionParam float[] res, int size)
	{
		for(int i = 0; i < size; i++)
		{
			res[i] = v1[i] + v2[i];
		}
		
		return res;
	}
	
	public static float[] tup_addT_f(float[] v1, float value, @ExtractionParam float[] res, int size)
	{
		for(int i = 0; i < size; i++)
		{
			res[i] = v1[i] + value;
		}
		
		return res;
	}
	
	public static float[] tup_sub_f(float[] v1, float[] v2, int size)
	{
		for(int i = 0; i < size; i++)
		{
			v1[i] -= v2[i];
		}
		
		return v1;
	}
	
	public static float[] tup_sub_f(float[] v1, float value, int size)
	{
		for(int i = 0; i < size; i++)
		{
			v1[i] -= value;
		}
		
		return v1;
	}
	
	public static float[] tup_subN_f(float[] v1, float[] v2, int size)
	{
		float[] res = new float[size];
		
		for(int i = 0; i < size; i++)
		{
			res[i] = v1[i] - v2[i];
		}
		
		return res;
	}
	
	public static float[] tup_subN_f(float[] v1, float value, int size)
	{
		float[] res = new float[size];
		
		for(int i = 0; i < size; i++)
		{
			res[i] = v1[i] - value;
		}
		
		return res;
	}
	
	public static float[] tup_subT_f(float[] v1, float[] v2, @ExtractionParam float[] res, int size)
	{
		for(int i = 0; i < size; i++)
		{
			res[i] = v1[i] - v2[i];
		}
		
		return res;
	}
	
	public static float[] tup_subT_f(float[] v1, float value, @ExtractionParam float[] res, int size)
	{
		for(int i = 0; i < size; i++)
		{
			res[i] = v1[i] - value;
		}
		
		return res;
	}
	
	public static float[] tup_revSub_f(float[] v1, float[] v2, int size)
	{
		for(int i = 0; i < size; i++)
		{
			v1[i] = v2[i] - v1[i];
		}
		
		return v1;
	}
	
	public static float[] tup_revSub_f(float[] v1, float value, int size)
	{
		for(int i = 0; i < size; i++)
		{
			v1[i] = value - v1[i];
		}
		
		return v1;
	}
	
	public static float[] tup_revSubN_f(float[] v1, float[] v2, int size)
	{
		float[] res = new float[size];
		
		for(int i = 0; i < size; i++)
		{
			res[i] = v2[i] - v1[i];
		}
		
		return res;
	}
	
	public static float[] tup_revSubN_f(float[] v1, float value, int size)
	{
		float[] res = new float[size];
		
		for(int i = 0; i < size; i++)
		{
			res[i] = value - v1[i];
		}
		
		return res;
	}
	
	public static float[] tup_revSubT_f(float[] v1, float[] v2, @ExtractionParam float[] res, int size)
	{
		for(int i = 0; i < size; i++)
		{
			res[i] = v2[i] - v1[i];
		}
		
		return res;
	}
	
	public static float[] tup_revSubT_f(float[] v1, float value, @ExtractionParam float[] res, int size)
	{
		for(int i = 0; i < size; i++)
		{
			res[i] = value - v1[i];
		}
		
		return res;
	}
	
	public static float[] tup_mul_f(float[] v1, float[] v2, int size)
	{
		for(int i = 0; i < size; i++)
		{
			v1[i] *= v2[i];
		}
		
		return v1;
	}
	
	public static float[] tup_mul_f(float[] v1, float value, int size)
	{
		for(int i = 0; i < size; i++)
		{
			v1[i] *= value;
		}
		
		return v1;
	}
	
	public static float[] tup_mulN_f(float[] v1, float[] v2, int size)
	{
		float[] res = new float[size];
		
		for(int i = 0; i < size; i++)
		{
			res[i] = v1[i] * v2[i];
		}
		
		return res;
	}
	
	public static float[] tup_mulN_f(float[] v1, float value, int size)
	{
		float[] res = new float[size];
		
		for(int i = 0; i < size; i++)
		{
			res[i] = v1[i] * value;
		}
		
		return res;
	}
	
	public static float[] tup_mulT_f(float[] v1, float[] v2, @ExtractionParam float[] res, int size)
	{
		for(int i = 0; i < size; i++)
		{
			res[i] = v1[i] * v2[i];
		}
		
		return res;
	}
	
	public static float[] tup_mulT_f(float[] v1, float value, @ExtractionParam float[] res, int size)
	{
		for(int i = 0; i < size; i++)
		{
			res[i] = v1[i] * value;
		}
		
		return res;
	}
	
	public static float[] tup_div_f(float[] v1, float[] v2, int size)
	{
		for(int i = 0; i < size; i++)
		{
			v1[i] /= v2[i];
		}
		
		return v1;
	}
	
	public static float[] tup_div_f(float[] v1, float value, int size)
	{
		for(int i = 0; i < size; i++)
		{
			v1[i] /= value;
		}
		
		return v1;
	}
	
	public static float[] tup_divN_f(float[] v1, float[] v2, int size)
	{
		float[] res = new float[size];
		
		for(int i = 0; i < size; i++)
		{
			res[i] = v1[i] / v2[i];
		}
		
		return res;
	}
	
	public static float[] tup_divN_f(float[] v1, float value, int size)
	{
		float[] res = new float[size];
		
		for(int i = 0; i < size; i++)
		{
			res[i] = v1[i] / value;
		}
		
		return res;
	}
	
	public static float[] tup_divT_f(float[] v1, float[] v2, @ExtractionParam float[] res, int size)
	{
		for(int i = 0; i < size; i++)
		{
			res[i] = v1[i] / v2[i];
		}
		
		return res;
	}
	
	public static float[] tup_divT_f(float[] v1, float value, @ExtractionParam float[] res, int size)
	{
		for(int i = 0; i < size; i++)
		{
			res[i] = v1[i] / value;
		}
		
		return res;
	}
	
	public static float[] tup_revDiv_f(float[] v1, float[] v2, int size)
	{
		for(int i = 0; i < size; i++)
		{
			v1[i] = v2[i] / v1[i];
		}
		
		return v1;
	}
	
	public static float[] tup_revDiv_f(float[] v1, float value, int size)
	{
		for(int i = 0; i < size; i++)
		{
			v1[i] = value / v1[i];
		}
		
		return v1;
	}
	
	public static float[] tup_revDivN_f(float[] v1, float[] v2, int size)
	{
		float[] res = new float[size];
		
		for(int i = 0; i < size; i++)
		{
			res[i] = v2[i] / v1[i];
		}
		
		return res;
	}
	
	public static float[] tup_revDivN_f(float[] v1, float value, int size)
	{
		float[] res = new float[size];
		
		for(int i = 0; i < size; i++)
		{
			res[i] = value / v1[i];
		}
		
		return res;
	}
	
	public static float[] tup_revDivT_f(float[] v1, float[] v2, @ExtractionParam float[] res, int size)
	{
		for(int i = 0; i < size; i++)
		{
			res[i] = v2[i] / v1[i];
		}
		
		return res;
	}
	
	public static float[] tup_revDivT_f(float[] v1, float value, @ExtractionParam float[] res, int size)
	{
		for(int i = 0; i < size; i++)
		{
			res[i] = value / v1[i];
		}
		
		return res;
	}
	
}
