package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.math.MathUtils;

public final class ArithmeticOps3F
{
	private ArithmeticOps3F() { }
	
	public static float[] tup_add_3f(float[] t1, float[] t2)
	{
		t1[0] += t2[0];
		t1[1] += t2[1];
		t1[2] += t2[2];
		
		return t1;
	}
	
	public static float[] tup_add_3f(float[] t1, float value)
	{
		t1[0] += value;
		t1[1] += value;
		t1[2] += value;
		
		return t1;
	}
	
	public static float[] tup_add_3f(float[] t1, float t2V0, float t2V1, float t2V2)
	{
		t1[0] += t2V0;
		t1[1] += t2V1;
		t1[2] += t2V2;
		
		return t1;
	}
	
	public static float[] tup_addN_3f(float[] t1, float[] t2)
	{
		return new float[] {
			t1[0] + t2[0],
			t1[1] + t2[1],
			t1[2] + t2[2]
		};
	}
	
	public static float[] tup_addN_3f(float[] t1, float value)
	{
		return new float[] {
			t1[0] + value,
			t1[1] + value,
			t1[2] + value
		};
	}
	
	public static float[] tup_addN_3f(float[] t1, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t1[0] + t2V0,
			t1[1] + t2V1,
			t1[2] + t2V2
		};
	}
	
	public static float[] tup_addN_3f(float t1V0, float t1V1, float t1V2, float[] t2)
	{
		return new float[] {
			t1V0 + t2[0],
			t1V1 + t2[1],
			t1V2 + t2[2]
		};
	}
	
	public static float[] tup_addN_3f(float t1V0, float t1V1, float t1V2, float value)
	{
		return new float[] {
			t1V0 + value,
			t1V1 + value,
			t1V2 + value
		};
	}
	
	public static float[] tup_addN_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t1V0 + t2V0,
			t1V1 + t2V1,
			t1V2 + t2V2
		};
	}
	
	public static float[] tup_addT_3f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] + t2[0];
		res[1] = t1[1] + t2[1];
		res[2] = t1[2] + t2[2];
		
		return res;
	}
	
	public static float[] tup_addT_3f(float[] t1, float value, @ExtractionParam float[] res)
	{
		res[0] = t1[0] + value;
		res[1] = t1[1] + value;
		res[2] = t1[2] + value;
		
		return res;
	}
	
	public static float[] tup_addT_3f(float[] t1, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] + t2V0;
		res[1] = t1[1] + t2V1;
		res[2] = t1[2] + t2V2;
		
		return res;
	}
	
	public static float[] tup_addT_3f(float t1V0, float t1V1, float t1V2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1V0 + t2[0];
		res[1] = t1V1 + t2[1];
		res[2] = t1V2 + t2[2];
		
		return res;
	}
	
	public static float[] tup_addT_3f(float t1V0, float t1V1, float t1V2, float value, @ExtractionParam float[] res)
	{
		res[0] = t1V0 + value;
		res[1] = t1V1 + value;
		res[2] = t1V2 + value;
		
		return res;
	}
	
	public static float[] tup_addT_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res)
	{
		res[0] = t1V0 + t2V0;
		res[1] = t1V1 + t2V1;
		res[2] = t1V2 + t2V2;
		
		return res;
	}
	
	public static float[] tup_sub_3f(float[] t1, float[] t2)
	{
		t1[0] -= t2[0];
		t1[1] -= t2[1];
		t1[2] -= t2[2];
		
		return t1;
	}
	
	public static float[] tup_sub_3f(float[] t1, float value)
	{
		t1[0] -= value;
		t1[1] -= value;
		t1[2] -= value;
		
		return t1;
	}
	
	public static float[] tup_sub_3f(float[] t1, float t2V0, float t2V1, float t2V2)
	{
		t1[0] -= t2V0;
		t1[1] -= t2V1;
		t1[2] -= t2V2;
		
		return t1;
	}
	
	public static float[] tup_subN_3f(float[] t1, float[] t2)
	{
		return new float[] {
			t1[0] - t2[0],
			t1[1] - t2[1],
			t1[2] - t2[2]
		};
	}
	
	public static float[] tup_subN_3f(float[] t1, float value)
	{
		return new float[] {
			t1[0] - value,
			t1[1] - value,
			t1[2] - value
		};
	}
	
	public static float[] tup_subN_3f(float[] t1, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t1[0] - t2V0,
			t1[1] - t2V1,
			t1[2] - t2V2
		};
	}
	
	public static float[] tup_subN_3f(float t1V0, float t1V1, float t1V2, float[] t2)
	{
		return new float[] {
			t1V0 - t2[0],
			t1V1 - t2[1],
			t1V2 - t2[2]
		};
	}
	
	public static float[] tup_subN_3f(float t1V0, float t1V1, float t1V2, float value)
	{
		return new float[] {
			t1V0 - value,
			t1V1 - value,
			t1V2 - value
		};
	}
	
	public static float[] tup_subN_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t1V0 - t2V0,
			t1V1 - t2V1,
			t1V2 - t2V2
		};
	}
	
	public static float[] tup_subT_3f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] - t2[0];
		res[1] = t1[1] - t2[1];
		res[2] = t1[2] - t2[2];
		
		return res;
	}
	
	public static float[] tup_subT_3f(float[] t1, float value, @ExtractionParam float[] res)
	{
		res[0] = t1[0] - value;
		res[1] = t1[1] - value;
		res[2] = t1[2] - value;
		
		return res;
	}
	
	public static float[] tup_subT_3f(float[] t1, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] - t2V0;
		res[1] = t1[1] - t2V1;
		res[2] = t1[2] - t2V2;
		
		return res;
	}
	
	public static float[] tup_subT_3f(float t1V0, float t1V1, float t1V2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1V0 - t2[0];
		res[1] = t1V1 - t2[1];
		res[2] = t1V2 - t2[2];
		
		return res;
	}
	
	public static float[] tup_subT_3f(float t1V0, float t1V1, float t1V2, float value, @ExtractionParam float[] res)
	{
		res[0] = t1V0 - value;
		res[1] = t1V1 - value;
		res[2] = t1V2 - value;
		
		return res;
	}
	
	public static float[] tup_subT_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res)
	{
		res[0] = t1V0 - t2V0;
		res[1] = t1V1 - t2V1;
		res[2] = t1V2 - t2V2;
		
		return res;
	}
	
	public static float[] tup_revSub_3f(float[] t1, float[] t2)
	{
		t1[0] = t2[0] - t1[0];
		t1[1] = t2[1] - t1[1];
		t1[2] = t2[2] - t1[2];
		
		return t1;
	}
	
	public static float[] tup_revSub_3f(float[] t1, float value)
	{
		t1[0] = value - t1[0];
		t1[1] = value - t1[1];
		t1[2] = value - t1[2];
		
		return t1;
	}
	
	public static float[] tup_revSub_3f(float[] t1, float t2V0, float t2V1, float t2V2)
	{
		t1[0] = t2V0 - t1[0];
		t1[1] = t2V1 - t1[1];
		t1[2] = t2V2 - t1[2];
		
		return t1;
	}
	
	public static float[] tup_revSubN_3f(float[] t1, float[] t2)
	{
		return new float[] {
			t2[0] - t1[0],
			t2[1] - t1[1],
			t2[2] - t1[2]
		};
	}
	
	public static float[] tup_revSubN_3f(float[] t1, float value)
	{
		return new float[] {
			value - t1[0],
			value - t1[1],
			value - t1[2]
		};
	}
	
	public static float[] tup_revSubN_3f(float[] t1, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t2V0 - t1[0],
			t2V1 - t1[1],
			t2V2 - t1[2]
		};
	}
	
	public static float[] tup_revSubN_3f(float t1V0, float t1V1, float t1V2, float[] t2)
	{
		return new float[] {
			t2[0] - t1V0,
			t2[1] - t1V1,
			t2[2] - t1V2
		};
	}
	
	public static float[] tup_revSubN_3f(float t1V0, float t1V1, float t1V2, float value)
	{
		return new float[] {
			value - t1V0,
			value - t1V1,
			value - t1V2
		};
	}
	
	public static float[] tup_revSubN_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t2V0 - t1V0,
			t2V1 - t1V1,
			t2V2 - t1V2
		};
	}
	
	public static float[] tup_revSubT_3f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t2[0] - t1[0];
		res[1] = t2[1] - t1[1];
		res[2] = t2[2] - t1[2];
		
		return res;
	}
	
	public static float[] tup_revSubT_3f(float[] t1, float value, @ExtractionParam float[] res)
	{
		res[0] = value - t1[0];
		res[1] = value - t1[1];
		res[2] = value - t1[2];
		
		return res;
	}
	
	public static float[] tup_revSubT_3f(float[] t1, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res)
	{
		res[0] = t2V0 - t1[0];
		res[1] = t2V1 - t1[1];
		res[2] = t2V2 - t1[2];
		
		return res;
	}
	
	public static float[] tup_revSubT_3f(float t1V0, float t1V1, float t1V2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t2[0] - t1V0;
		res[1] = t2[1] - t1V1;
		res[2] = t2[2] - t1V2;
		
		return res;
	}
	
	public static float[] tup_revSubT_3f(float t1V0, float t1V1, float t1V2, float value, @ExtractionParam float[] res)
	{
		res[0] = value - t1V0;
		res[1] = value - t1V1;
		res[2] = value - t1V2;
		
		return res;
	}
	
	public static float[] tup_revSubT_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res)
	{
		res[0] = t2V0 - t1V0;
		res[1] = t2V1 - t1V1;
		res[2] = t2V2 - t1V2;
		
		return res;
	}
	
	public static float[] tup_mul_3f(float[] t1, float[] t2)
	{
		t1[0] *= t2[0];
		t1[1] *= t2[1];
		t1[2] *= t2[2];
		
		return t1;
	}
	
	public static float[] tup_mul_3f(float[] t1, float value)
	{
		t1[0] *= value;
		t1[1] *= value;
		t1[2] *= value;
		
		return t1;
	}
	
	public static float[] tup_mul_3f(float[] t1, float t2V0, float t2V1, float t2V2)
	{
		t1[0] *= t2V0;
		t1[1] *= t2V1;
		t1[2] *= t2V2;
		
		return t1;
	}
	
	public static float[] tup_mulN_3f(float[] t1, float[] t2)
	{
		return new float[] {
			t1[0] * t2[0],
			t1[1] * t2[1],
			t1[2] * t2[2]
		};
	}
	
	public static float[] tup_mulN_3f(float[] t1, float value)
	{
		return new float[] {
			t1[0] * value,
			t1[1] * value,
			t1[2] * value
		};
	}
	
	public static float[] tup_mulN_3f(float[] t1, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t1[0] * t2V0,
			t1[1] * t2V1,
			t1[2] * t2V2
		};
	}
	
	public static float[] tup_mulN_3f(float t1V0, float t1V1, float t1V2, float[] t2)
	{
		return new float[] {
			t1V0 * t2[0],
			t1V1 * t2[1],
			t1V2 * t2[2]
		};
	}
	
	public static float[] tup_mulN_3f(float t1V0, float t1V1, float t1V2, float value)
	{
		return new float[] {
			t1V0 * value,
			t1V1 * value,
			t1V2 * value
		};
	}
	
	public static float[] tup_mulN_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t1V0 * t2V0,
			t1V1 * t2V1,
			t1V2 * t2V2
		};
	}
	
	public static float[] tup_mulT_3f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] * t2[0];
		res[1] = t1[1] * t2[1];
		res[2] = t1[2] * t2[2];
		
		return res;
	}
	
	public static float[] tup_mulT_3f(float[] t1, float value, @ExtractionParam float[] res)
	{
		res[0] = t1[0] * value;
		res[1] = t1[1] * value;
		res[2] = t1[2] * value;
		
		return res;
	}
	
	public static float[] tup_mulT_3f(float[] t1, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] * t2V0;
		res[1] = t1[1] * t2V1;
		res[2] = t1[2] * t2V2;
		
		return res;
	}
	
	public static float[] tup_mulT_3f(float t1V0, float t1V1, float t1V2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1V0 * t2[0];
		res[1] = t1V1 * t2[1];
		res[2] = t1V2 * t2[2];
		
		return res;
	}
	
	public static float[] tup_mulT_3f(float t1V0, float t1V1, float t1V2, float value, @ExtractionParam float[] res)
	{
		res[0] = t1V0 * value;
		res[1] = t1V1 * value;
		res[2] = t1V2 * value;
		
		return res;
	}
	
	public static float[] tup_mulT_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res)
	{
		res[0] = t1V0 * t2V0;
		res[1] = t1V1 * t2V1;
		res[2] = t1V2 * t2V2;
		
		return res;
	}
	
	public static float[] tup_div_3f(float[] t1, float[] t2)
	{
		t1[0] /= t2[0];
		t1[1] /= t2[1];
		t1[2] /= t2[2];
		
		return t1;
	}
	
	public static float[] tup_div_3f(float[] t1, float value)
	{
		t1[0] /= value;
		t1[1] /= value;
		t1[2] /= value;
		
		return t1;
	}
	
	public static float[] tup_div_3f(float[] t1, float t2V0, float t2V1, float t2V2)
	{
		t1[0] /= t2V0;
		t1[1] /= t2V1;
		t1[2] /= t2V2;
		
		return t1;
	}
	
	public static float[] tup_divN_3f(float[] t1, float[] t2)
	{
		return new float[] {
			t1[0] / t2[0],
			t1[1] / t2[1],
			t1[2] / t2[2]
		};
	}
	
	public static float[] tup_divN_3f(float[] t1, float value)
	{
		return new float[] {
			t1[0] / value,
			t1[1] / value,
			t1[2] / value
		};
	}
	
	public static float[] tup_divN_3f(float[] t1, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t1[0] / t2V0,
			t1[1] / t2V1,
			t1[2] / t2V2
		};
	}
	
	public static float[] tup_divN_3f(float t1V0, float t1V1, float t1V2, float[] t2)
	{
		return new float[] {
			t1V0 / t2[0],
			t1V1 / t2[1],
			t1V2 / t2[2]
		};
	}
	
	public static float[] tup_divN_3f(float t1V0, float t1V1, float t1V2, float value)
	{
		return new float[] {
			t1V0 / value,
			t1V1 / value,
			t1V2 / value
		};
	}
	
	public static float[] tup_divN_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t1V0 / t2V0,
			t1V1 / t2V1,
			t1V2 / t2V2
		};
	}
	
	public static float[] tup_divT_3f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] / t2[0];
		res[1] = t1[1] / t2[1];
		res[2] = t1[2] / t2[2];
		
		return res;
	}
	
	public static float[] tup_divT_3f(float[] t1, float value, @ExtractionParam float[] res)
	{
		res[0] = t1[0] / value;
		res[1] = t1[1] / value;
		res[2] = t1[2] / value;
		
		return res;
	}
	
	public static float[] tup_divT_3f(float[] t1, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] / t2V0;
		res[1] = t1[1] / t2V1;
		res[2] = t1[2] / t2V2;
		
		return res;
	}
	
	public static float[] tup_divT_3f(float t1V0, float t1V1, float t1V2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1V0 / t2[0];
		res[1] = t1V1 / t2[1];
		res[2] = t1V2 / t2[2];
		
		return res;
	}
	
	public static float[] tup_divT_3f(float t1V0, float t1V1, float t1V2, float value, @ExtractionParam float[] res)
	{
		res[0] = t1V0 / value;
		res[1] = t1V1 / value;
		res[2] = t1V2 / value;
		
		return res;
	}
	
	public static float[] tup_divT_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res)
	{
		res[0] = t1V0 / t2V0;
		res[1] = t1V1 / t2V1;
		res[2] = t1V2 / t2V2;
		
		return res;
	}
	
	public static float[] tup_revDiv_3f(float[] t1, float[] t2)
	{
		t1[0] = t2[0] / t1[0];
		t1[1] = t2[1] / t1[1];
		t1[2] = t2[2] / t1[2];
		
		return t1;
	}
	
	public static float[] tup_revDiv_3f(float[] t1, float value)
	{
		t1[0] = value / t1[0];
		t1[1] = value / t1[1];
		t1[2] = value / t1[2];
		
		return t1;
	}
	
	public static float[] tup_revDiv_3f(float[] t1, float t2V0, float t2V1, float t2V2)
	{
		t1[0] = t2V0 / t1[0];
		t1[1] = t2V1 / t1[1];
		t1[2] = t2V2 / t1[2];
		
		return t1;
	}
	
	public static float[] tup_revDivN_3f(float[] t1, float[] t2)
	{
		return new float[] {
			t2[0] / t1[0],
			t2[1] / t1[1],
			t2[2] / t1[2]
		};
	}
	
	public static float[] tup_revDivN_3f(float[] t1, float value)
	{
		return new float[] {
			value / t1[0],
			value / t1[1],
			value / t1[2]
		};
	}
	
	public static float[] tup_revDivN_3f(float[] t1, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t2V0 / t1[0],
			t2V1 / t1[1],
			t2V2 / t1[2]
		};
	}
	
	public static float[] tup_revDivN_3f(float t1V0, float t1V1, float t1V2, float[] t2)
	{
		return new float[] {
			t2[0] / t1V0,
			t2[1] / t1V1,
			t2[2] / t1V2
		};
	}
	
	public static float[] tup_revDivN_3f(float t1V0, float t1V1, float t1V2, float value)
	{
		return new float[] {
			value / t1V0,
			value / t1V1,
			value / t1V2
		};
	}
	
	public static float[] tup_revDivN_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t2V0 / t1V0,
			t2V1 / t1V1,
			t2V2 / t1V2
		};
	}
	
	public static float[] tup_revDivT_3f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t2[0] / t1[0];
		res[1] = t2[1] / t1[1];
		res[2] = t2[2] / t1[2];
		
		return res;
	}
	
	public static float[] tup_revDivT_3f(float[] t1, float value, @ExtractionParam float[] res)
	{
		res[0] = value / t1[0];
		res[1] = value / t1[1];
		res[2] = value / t1[2];
		
		return res;
	}
	
	public static float[] tup_revDivT_3f(float[] t1, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res)
	{
		res[0] = t2V0 / t1[0];
		res[1] = t2V1 / t1[1];
		res[2] = t2V2 / t1[2];
		
		return res;
	}
	
	public static float[] tup_revDivT_3f(float t1V0, float t1V1, float t1V2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t2[0] / t1V0;
		res[1] = t2[1] / t1V1;
		res[2] = t2[2] / t1V2;
		
		return res;
	}
	
	public static float[] tup_revDivT_3f(float t1V0, float t1V1, float t1V2, float value, @ExtractionParam float[] res)
	{
		res[0] = value / t1V0;
		res[1] = value / t1V1;
		res[2] = value / t1V2;
		
		return res;
	}
	
	public static float[] tup_revDivT_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res)
	{
		res[0] = t2V0 / t1V0;
		res[1] = t2V1 / t1V1;
		res[2] = t2V2 / t1V2;
		
		return res;
	}
	
	public static float[] tup_pow_3f(float[] t1, float[] t2)
	{
		t1[0] = MathUtils.pow(t1[0], t2[0]);
		t1[1] = MathUtils.pow(t1[1], t2[1]);
		t1[2] = MathUtils.pow(t1[2], t2[2]);
		
		return t1;
	}
	
	public static float[] tup_pow_3f(float[] t1, float value)
	{
		t1[0] = MathUtils.pow(t1[0], value);
		t1[1] = MathUtils.pow(t1[1], value);
		t1[2] = MathUtils.pow(t1[2], value);
		
		return t1;
	}
	
	public static float[] tup_pow_3f(float[] t1, float t2V0, float t2V1, float t2V2)
	{
		t1[0] = MathUtils.pow(t1[0], t2V0);
		t1[1] = MathUtils.pow(t1[1], t2V1);
		t1[2] = MathUtils.pow(t1[2], t2V2);
		
		return t1;
	}
	
	public static float[] tup_powN_3f(float[] t1, float[] t2)
	{
		return new float[] {
			MathUtils.pow(t1[0], t2[0]),
			MathUtils.pow(t1[1], t2[1]),
			MathUtils.pow(t1[2], t2[2])
		};
	}
	
	public static float[] tup_powN_3f(float[] t1, float value)
	{
		return new float[] {
			MathUtils.pow(t1[0], value),
			MathUtils.pow(t1[1], value),
			MathUtils.pow(t1[2], value)
		};
	}
	
	public static float[] tup_powN_3f(float[] t1, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			MathUtils.pow(t1[0], t2V0),
			MathUtils.pow(t1[1], t2V1),
			MathUtils.pow(t1[2], t2V2)
		};
	}
	
	public static float[] tup_powN_3f(float t1V0, float t1V1, float t1V2, float[] t2)
	{
		return new float[] {
			MathUtils.pow(t1V0, t2[0]),
			MathUtils.pow(t1V1, t2[1]),
			MathUtils.pow(t1V2, t2[2])
		};
	}
	
	public static float[] tup_powN_3f(float t1V0, float t1V1, float t1V2, float value)
	{
		return new float[] {
			MathUtils.pow(t1V0, value),
			MathUtils.pow(t1V1, value),
			MathUtils.pow(t1V2, value)
		};
	}
	
	public static float[] tup_powN_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			MathUtils.pow(t1V0, t2V0),
			MathUtils.pow(t1V1, t2V1),
			MathUtils.pow(t1V2, t2V2)
		};
	}
	
	public static float[] tup_powT_3f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t1[0], t2[0]);
		res[1] = MathUtils.pow(t1[1], t2[1]);
		res[2] = MathUtils.pow(t1[2], t2[2]);
		
		return res;
	}
	
	public static float[] tup_powT_3f(float[] t1, float value, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t1[0], value);
		res[1] = MathUtils.pow(t1[1], value);
		res[2] = MathUtils.pow(t1[2], value);
		
		return res;
	}
	
	public static float[] tup_powT_3f(float[] t1, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t1[0], t2V0);
		res[1] = MathUtils.pow(t1[1], t2V1);
		res[2] = MathUtils.pow(t1[2], t2V2);
		
		return res;
	}
	
	public static float[] tup_powT_3f(float t1V0, float t1V1, float t1V2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t1V0, t2[0]);
		res[1] = MathUtils.pow(t1V1, t2[1]);
		res[2] = MathUtils.pow(t1V2, t2[2]);
		
		return res;
	}
	
	public static float[] tup_powT_3f(float t1V0, float t1V1, float t1V2, float value, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t1V0, value);
		res[1] = MathUtils.pow(t1V1, value);
		res[2] = MathUtils.pow(t1V2, value);
		
		return res;
	}
	
	public static float[] tup_powT_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t1V0, t2V0);
		res[1] = MathUtils.pow(t1V1, t2V1);
		res[2] = MathUtils.pow(t1V2, t2V2);
		
		return res;
	}
	
	public static float[] tup_revPow_3f(float[] t1, float[] t2)
	{
		t1[0] = MathUtils.pow(t2[0], t1[0]);
		t1[1] = MathUtils.pow(t2[1], t1[1]);
		t1[2] = MathUtils.pow(t2[2], t1[2]);
		
		return t1;
	}
	
	public static float[] tup_revPow_3f(float[] t1, float value)
	{
		t1[0] = MathUtils.pow(value, t1[0]);
		t1[1] = MathUtils.pow(value, t1[1]);
		t1[2] = MathUtils.pow(value, t1[2]);
		
		return t1;
	}
	
	public static float[] tup_revPow_3f(float[] t1, float t2V0, float t2V1, float t2V2)
	{
		t1[0] = MathUtils.pow(t2V0, t1[0]);
		t1[1] = MathUtils.pow(t2V1, t1[1]);
		t1[2] = MathUtils.pow(t2V2, t1[2]);
		
		return t1;
	}
	
	public static float[] tup_revPowN_3f(float[] t1, float[] t2)
	{
		return new float[] {
			MathUtils.pow(t2[0], t1[0]),
			MathUtils.pow(t2[1], t1[1]),
			MathUtils.pow(t2[2], t1[2])
		};
	}
	
	public static float[] tup_revPowN_3f(float[] t1, float value)
	{
		return new float[] {
			MathUtils.pow(value, t1[0]),
			MathUtils.pow(value, t1[1]),
			MathUtils.pow(value, t1[2])
		};
	}
	
	public static float[] tup_revPowN_3f(float[] t1, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			MathUtils.pow(t2V0, t1[0]),
			MathUtils.pow(t2V1, t1[1]),
			MathUtils.pow(t2V2, t1[2])
		};
	}
	
	public static float[] tup_revPowN_3f(float t1V0, float t1V1, float t1V2, float[] t2)
	{
		return new float[] {
			MathUtils.pow(t2[0], t1V0),
			MathUtils.pow(t2[1], t1V1),
			MathUtils.pow(t2[2], t1V2)
		};
	}
	
	public static float[] tup_revPowN_3f(float t1V0, float t1V1, float t1V2, float value)
	{
		return new float[] {
			MathUtils.pow(value, t1V0),
			MathUtils.pow(value, t1V1),
			MathUtils.pow(value, t1V2)
		};
	}
	
	public static float[] tup_revPowN_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			MathUtils.pow(t2V0, t1V0),
			MathUtils.pow(t2V1, t1V1),
			MathUtils.pow(t2V2, t1V2)
		};
	}
	
	public static float[] tup_revPowT_3f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t2[0], t1[0]);
		res[1] = MathUtils.pow(t2[1], t1[1]);
		res[2] = MathUtils.pow(t2[2], t1[2]);
		
		return res;
	}
	
	public static float[] tup_revPowT_3f(float[] t1, float value, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(value, t1[0]);
		res[1] = MathUtils.pow(value, t1[1]);
		res[2] = MathUtils.pow(value, t1[2]);
		
		return res;
	}
	
	public static float[] tup_revPowT_3f(float[] t1, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t2V0, t1[0]);
		res[1] = MathUtils.pow(t2V1, t1[1]);
		res[2] = MathUtils.pow(t2V2, t1[2]);
		
		return res;
	}
	
	public static float[] tup_revPowT_3f(float t1V0, float t1V1, float t1V2, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t2[0], t1V0);
		res[1] = MathUtils.pow(t2[1], t1V1);
		res[2] = MathUtils.pow(t2[2], t1V2);
		
		return res;
	}
	
	public static float[] tup_revPowT_3f(float t1V0, float t1V1, float t1V2, float value, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(value, t1V0);
		res[1] = MathUtils.pow(value, t1V1);
		res[2] = MathUtils.pow(value, t1V2);
		
		return res;
	}
	
	public static float[] tup_revPowT_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t2V0, t1V0);
		res[1] = MathUtils.pow(t2V1, t1V1);
		res[2] = MathUtils.pow(t2V2, t1V2);
		
		return res;
	}
	
	public static float[] tup_fma_3f(float[] t1, float[] t2, float[] t3)
	{
		t1[0] = Math.fma(t1[0], t2[0], t3[0]);
		t1[1] = Math.fma(t1[1], t2[1], t3[1]);
		t1[2] = Math.fma(t1[2], t2[2], t3[2]);
		
		return t1;
	}
	
	public static float[] tup_fma_3f(float[] t1, float[] t2, float t3V0, float t3V1, float t3V2)
	{
		t1[0] = Math.fma(t1[0], t2[0], t3V0);
		t1[1] = Math.fma(t1[1], t2[1], t3V1);
		t1[2] = Math.fma(t1[2], t2[2], t3V2);
		
		return t1;
	}
	
	public static float[] tup_fma_3f(float[] t1, float t2V0, float t2V1, float t2V2, float[] t3)
	{
		t1[0] = Math.fma(t1[0], t2V0, t3[0]);
		t1[1] = Math.fma(t1[1], t2V1, t3[1]);
		t1[2] = Math.fma(t1[2], t2V2, t3[2]);
		
		return t1;
	}
	
	public static float[] tup_fma_3f(float[] t1, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2)
	{
		t1[0] = Math.fma(t1[0], t2V0, t3V0);
		t1[1] = Math.fma(t1[1], t2V1, t3V1);
		t1[2] = Math.fma(t1[2], t2V2, t3V2);
		
		return t1;
	}
	
	public static float[] tup_fmaN_3f(float[] t1, float[] t2, float[] t3)
	{
		return new float[] {
			Math.fma(t1[0], t2[0], t3[0]),
			Math.fma(t1[1], t2[1], t3[1]),
			Math.fma(t1[2], t2[2], t3[2])
		};
	}
	
	public static float[] tup_fmaN_3f(float[] t1, float[] t2, float t3V0, float t3V1, float t3V2)
	{
		return new float[] {
			Math.fma(t1[0], t2[0], t3V0),
			Math.fma(t1[1], t2[1], t3V1),
			Math.fma(t1[2], t2[2], t3V2)
		};
	}
	
	public static float[] tup_fmaN_3f(float[] t1, float t2V0, float t2V1, float t2V2, float[] t3)
	{
		return new float[] {
			Math.fma(t1[0], t2V0, t3[0]),
			Math.fma(t1[1], t2V1, t3[1]),
			Math.fma(t1[2], t2V2, t3[2])
		};
	}
	
	public static float[] tup_fmaN_3f(float[] t1, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2)
	{
		return new float[] {
			Math.fma(t1[0], t2V0, t3V0),
			Math.fma(t1[1], t2V1, t3V1),
			Math.fma(t1[2], t2V2, t3V2)
		};
	}
	
	public static float[] tup_fmaN_3f(float t1V0, float t1V1, float t1V2, float[] t2, float[] t3)
	{
		return new float[] {
			Math.fma(t1V0, t2[0], t3[0]),
			Math.fma(t1V1, t2[1], t3[1]),
			Math.fma(t1V2, t2[2], t3[2])
		};
	}
	
	public static float[] tup_fmaN_3f(float t1V0, float t1V1, float t1V2, float[] t2, float t3V0, float t3V1, float t3V2)
	{
		return new float[] {
			Math.fma(t1V0, t2[0], t3V0),
			Math.fma(t1V1, t2[1], t3V1),
			Math.fma(t1V2, t2[2], t3V2)
		};
	}
	
	public static float[] tup_fmaN_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, float[] t3)
	{
		return new float[] {
			Math.fma(t1V0, t2V0, t3[0]),
			Math.fma(t1V1, t2V1, t3[1]),
			Math.fma(t1V2, t2V2, t3[2])
		};
	}
	
	public static float[] tup_fmaN_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2)
	{
		return new float[] {
			Math.fma(t1V0, t2V0, t3V0),
			Math.fma(t1V1, t2V1, t3V1),
			Math.fma(t1V2, t2V2, t3V2)
		};
	}
	
	public static float[] tup_fmaT_3f(float[] t1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t1[0], t2[0], t3[0]);
		res[1] = Math.fma(t1[1], t2[1], t3[1]);
		res[2] = Math.fma(t1[2], t2[2], t3[2]);
		
		return res;
	}
	
	public static float[] tup_fmaT_3f(float[] t1, float[] t2, float t3V0, float t3V1, float t3V2, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t1[0], t2[0], t3V0);
		res[1] = Math.fma(t1[1], t2[1], t3V1);
		res[2] = Math.fma(t1[2], t2[2], t3V2);
		
		return res;
	}
	
	public static float[] tup_fmaT_3f(float[] t1, float t2V0, float t2V1, float t2V2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t1[0], t2V0, t3[0]);
		res[1] = Math.fma(t1[1], t2V1, t3[1]);
		res[2] = Math.fma(t1[2], t2V2, t3[2]);
		
		return res;
	}
	
	public static float[] tup_fmaT_3f(float[] t1, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t1[0], t2V0, t3V0);
		res[1] = Math.fma(t1[1], t2V1, t3V1);
		res[2] = Math.fma(t1[2], t2V2, t3V2);
		
		return res;
	}
	
	public static float[] tup_fmaT_3f(float t1V0, float t1V1, float t1V2, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t1V0, t2[0], t3[0]);
		res[1] = Math.fma(t1V1, t2[1], t3[1]);
		res[2] = Math.fma(t1V2, t2[2], t3[2]);
		
		return res;
	}
	
	public static float[] tup_fmaT_3f(float t1V0, float t1V1, float t1V2, float[] t2, float t3V0, float t3V1, float t3V2, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t1V0, t2[0], t3V0);
		res[1] = Math.fma(t1V1, t2[1], t3V1);
		res[2] = Math.fma(t1V2, t2[2], t3V2);
		
		return res;
	}
	
	public static float[] tup_fmaT_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t1V0, t2V0, t3[0]);
		res[1] = Math.fma(t1V1, t2V1, t3[1]);
		res[2] = Math.fma(t1V2, t2V2, t3[2]);
		
		return res;
	}
	
	public static float[] tup_fmaT_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t1V0, t2V0, t3V0);
		res[1] = Math.fma(t1V1, t2V1, t3V1);
		res[2] = Math.fma(t1V2, t2V2, t3V2);
		
		return res;
	}
	
	public static float[] tup_fam_3f(float[] t1, float[] t2, float[] t3)
	{
		t1[0] = Math.fma(t2[0], t3[0], t1[0]);
		t1[1] = Math.fma(t2[1], t3[1], t1[1]);
		t1[2] = Math.fma(t2[2], t3[2], t1[2]);
		
		return t1;
	}
	
	public static float[] tup_fam_3f(float[] t1, float[] t2, float t3V0, float t3V1, float t3V2)
	{
		t1[0] = Math.fma(t2[0], t3V0, t1[0]);
		t1[1] = Math.fma(t2[1], t3V1, t1[1]);
		t1[2] = Math.fma(t2[2], t3V2, t1[2]);
		
		return t1;
	}
	
	public static float[] tup_fam_3f(float[] t1, float t2V0, float t2V1, float t2V2, float[] t3)
	{
		t1[0] = Math.fma(t2V0, t3[0], t1[0]);
		t1[1] = Math.fma(t2V1, t3[1], t1[1]);
		t1[2] = Math.fma(t2V2, t3[2], t1[2]);
		
		return t1;
	}
	
	public static float[] tup_fam_3f(float[] t1, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2)
	{
		t1[0] = Math.fma(t2V0, t3V0, t1[0]);
		t1[1] = Math.fma(t2V1, t3V1, t1[1]);
		t1[2] = Math.fma(t2V2, t3V2, t1[2]);
		
		return t1;
	}
	
	public static float[] tup_famN_3f(float[] t1, float[] t2, float[] t3)
	{
		return new float[] {
			Math.fma(t2[0], t3[0], t1[0]),
			Math.fma(t2[1], t3[1], t1[1]),
			Math.fma(t2[2], t3[2], t1[2])
		};
	}
	
	public static float[] tup_famN_3f(float[] t1, float[] t2, float t3V0, float t3V1, float t3V2)
	{
		return new float[] {
			Math.fma(t2[0], t3V0, t1[0]),
			Math.fma(t2[1], t3V1, t1[1]),
			Math.fma(t2[2], t3V2, t1[2])
		};
	}
	
	public static float[] tup_famN_3f(float[] t1, float t2V0, float t2V1, float t2V2, float[] t3)
	{
		return new float[] {
			Math.fma(t1[0], t2V0, t3[0]),
			Math.fma(t1[1], t2V1, t3[1]),
			Math.fma(t1[2], t2V2, t3[2])
		};
	}
	
	public static float[] tup_famN_3f(float[] t1, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2)
	{
		return new float[] {
			Math.fma(t2V0, t3V0, t1[0]),
			Math.fma(t2V1, t3V1, t1[1]),
			Math.fma(t2V2, t3V2, t1[2])
		};
	}
	
	public static float[] tup_famN_3f(float t1V0, float t1V1, float t1V2, float[] t2, float[] t3)
	{
		return new float[] {
			Math.fma(t2[0], t3[0], t1V0),
			Math.fma(t2[1], t3[1], t1V1),
			Math.fma(t2[2], t3[2], t1V2)
		};
	}
	
	public static float[] tup_famN_3f(float t1V0, float t1V1, float t1V2, float[] t2, float t3V0, float t3V1, float t3V2)
	{
		return new float[] {
			Math.fma(t2[0], t3V0, t1V0),
			Math.fma(t2[1], t3V1, t1V1),
			Math.fma(t2[2], t3V2, t1V2)
		};
	}
	
	public static float[] tup_famN_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, float[] t3)
	{
		return new float[] {
			Math.fma(t1V0, t2V0, t3[0]),
			Math.fma(t1V1, t2V1, t3[1]),
			Math.fma(t1V2, t2V2, t3[2])
		};
	}
	
	public static float[] tup_famN_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2)
	{
		return new float[] {
			Math.fma(t2V0, t3V0, t1V0),
			Math.fma(t2V1, t3V1, t1V1),
			Math.fma(t2V2, t3V2, t1V2)
		};
	}
	
	public static float[] tup_famT_3f(float[] t1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t2[0], t3[0], t1[0]);
		res[1] = Math.fma(t2[1], t3[1], t1[1]);
		res[2] = Math.fma(t2[2], t3[2], t1[2]);
		
		return res;
	}
	
	public static float[] tup_famT_3f(float[] t1, float[] t2, float t3V0, float t3V1, float t3V2, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t2[0], t3V0, t1[0]);
		res[1] = Math.fma(t2[1], t3V1, t1[1]);
		res[2] = Math.fma(t2[2], t3V2, t1[2]);
		
		return res;
	}
	
	public static float[] tup_famT_3f(float[] t1, float t2V0, float t2V1, float t2V2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t2V0, t3[0], t1[0]);
		res[1] = Math.fma(t2V1, t3[1], t1[1]);
		res[2] = Math.fma(t2V2, t3[2], t1[2]);
		
		return res;
	}
	
	public static float[] tup_famT_3f(float[] t1, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t2V0, t3V0, t1[0]);
		res[1] = Math.fma(t2V1, t3V1, t1[1]);
		res[2] = Math.fma(t2V2, t3V2, t1[2]);
		
		return res;
	}
	
	public static float[] tup_famT_3f(float t1V0, float t1V1, float t1V2, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t2[0], t3[0], t1V0);
		res[1] = Math.fma(t2[1], t3[1], t1V1);
		res[2] = Math.fma(t2[2], t3[2], t1V2);
		
		return res;
	}
	
	public static float[] tup_famT_3f(float t1V0, float t1V1, float t1V2, float[] t2, float t3V0, float t3V1, float t3V2, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t2[0], t3V0, t1V0);
		res[1] = Math.fma(t2[1], t3V1, t1V1);
		res[2] = Math.fma(t2[2], t3V2, t1V2);
		
		return res;
	}
	
	public static float[] tup_famT_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t2V0, t3[0], t1V0);
		res[1] = Math.fma(t2V1, t3[1], t1V1);
		res[2] = Math.fma(t2V2, t3[2], t1V2);
		
		return res;
	}
	
	public static float[] tup_famT_3f(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t2V0, t3V0, t1V0);
		res[1] = Math.fma(t2V1, t3V1, t1V1);
		res[2] = Math.fma(t2V2, t3V2, t1V2);
		
		return res;
	}
	
	public static float[] tup_sqrt_3f(float[] t1)
	{
		t1[0] = MathUtils.sqrt(t1[0]);
		t1[1] = MathUtils.sqrt(t1[1]);
		t1[2] = MathUtils.sqrt(t1[2]);
		
		return t1;
	}
	
	public static float[] tup_sqrtN_3f(float[] t1)
	{
		return new float[] {
			MathUtils.sqrt(t1[0]),
			MathUtils.sqrt(t1[1]),
			MathUtils.sqrt(t1[2])
		};
	}
	
	public static float[] tup_sqrtN_3f(float t1V0, float t1V1, float t1V2)
	{
		return new float[] {
			MathUtils.sqrt(t1V0),
			MathUtils.sqrt(t1V1),
			MathUtils.sqrt(t1V2)
		};
	}
	
	public static float[] tup_sqrtT_3f(float[] t1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sqrt(t1[0]);
		res[1] = MathUtils.sqrt(t1[1]);
		res[2] = MathUtils.sqrt(t1[2]);
		
		return res;
	}
	
	public static float[] tup_sqrtT_3f(float t1V0, float t1V1, float t1V2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sqrt(t1V0);
		res[1] = MathUtils.sqrt(t1V1);
		res[2] = MathUtils.sqrt(t1V2);
		
		return res;
	}
	
	public static float[] tup_cbrt_3f(float[] t1)
	{
		t1[0] = MathUtils.cbrt(t1[0]);
		t1[1] = MathUtils.cbrt(t1[1]);
		t1[2] = MathUtils.cbrt(t1[2]);
		
		return t1;
	}
	
	public static float[] tup_cbrtN_3f(float[] t1)
	{
		return new float[] {
			MathUtils.cbrt(t1[0]),
			MathUtils.cbrt(t1[1]),
			MathUtils.cbrt(t1[2])
		};
	}
	
	public static float[] tup_cbrtN_3f(float t1V0, float t1V1, float t1V2)
	{
		return new float[] {
			MathUtils.cbrt(t1V0),
			MathUtils.cbrt(t1V1),
			MathUtils.cbrt(t1V2)
		};
	}
	
	public static float[] tup_cbrtT_3f(float[] t1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cbrt(t1[0]);
		res[1] = MathUtils.cbrt(t1[1]);
		res[2] = MathUtils.cbrt(t1[2]);
		
		return res;
	}
	
	public static float[] tup_cbrtT_3f(float t1V0, float t1V1, float t1V2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cbrt(t1V0);
		res[1] = MathUtils.cbrt(t1V1);
		res[2] = MathUtils.cbrt(t1V2);
		
		return res;
	}
	
	public static float[] tup_abs_3f(float[] t1)
	{
		t1[0] = Math.abs(t1[0]);
		t1[1] = Math.abs(t1[1]);
		t1[2] = Math.abs(t1[2]);
		
		return t1;
	}
	
	public static float[] tup_absN_3f(float[] t1)
	{
		return new float[] {
			Math.abs(t1[0]),
			Math.abs(t1[1]),
			Math.abs(t1[2])
		};
	}
	
	public static float[] tup_absN_3f(float t1V0, float t1V1, float t1V2)
	{
		return new float[] {
			Math.abs(t1V0),
			Math.abs(t1V1),
			Math.abs(t1V2)
		};
	}
	
	public static float[] tup_absT_3f(float[] t1, @ExtractionParam float[] res)
	{
		res[0] = Math.abs(t1[0]);
		res[1] = Math.abs(t1[1]);
		res[2] = Math.abs(t1[2]);
		
		return res;
	}
	
	public static float[] tup_absT_3f(float t1V0, float t1V1, float t1V2, @ExtractionParam float[] res)
	{
		res[0] = Math.abs(t1V0);
		res[1] = Math.abs(t1V1);
		res[2] = Math.abs(t1V2);
		
		return res;
	}
	
	public static float[] tup_reciprocal_3f(float[] t1)
	{
		t1[0] = 1.0f / t1[0];
		t1[1] = 1.0f / t1[1];
		t1[2] = 1.0f / t1[2];
		
		return t1;
	}
	
	public static float[] tup_reciprocalN_3f(float[] t1)
	{
		return new float[] {
			1.0f / t1[0],
			1.0f / t1[1],
			1.0f / t1[2]
		};
	}
	
	public static float[] tup_reciprocalN_3f(float t1V0, float t1V1, float t1V2)
	{
		return new float[] {
			1.0f / t1V0,
			1.0f / t1V1,
			1.0f / t1V2
		};
	}
	
	public static float[] tup_reciprocalT_3f(float[] t1, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / t1[0];
		res[1] = 1.0f / t1[1];
		res[2] = 1.0f / t1[2];
		
		return res;
	}
	
	public static float[] tup_reciprocalT_3f(float t1V0, float t1V1, float t1V2, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / t1V0;
		res[1] = 1.0f / t1V1;
		res[2] = 1.0f / t1V2;
		
		return res;
	}
	
	public static float[] tup_negate_3f(float[] t1)
	{
		t1[0] = -t1[0];
		t1[1] = -t1[1];
		t1[2] = -t1[2];
		
		return t1;
	}
	
	public static float[] tup_negateN_3f(float[] t1)
	{
		return new float[] {
			-t1[0],
			-t1[1],
			-t1[2]
		};
	}
	
	public static float[] tup_negateN_3f(float t1V0, float t1V1, float t1V2)
	{
		return new float[] {
			-t1V0,
			-t1V1,
			-t1V2
		};
	}
	
	public static float[] tup_negateT_3f(float[] t1, @ExtractionParam float[] res)
	{
		res[0] = -t1[0];
		res[1] = -t1[1];
		res[2] = -t1[2];
		
		return res;
	}
	
	public static float[] tup_negateT_3f(float t1V0, float t1V1, float t1V2, @ExtractionParam float[] res)
	{
		res[0] = -t1V0;
		res[1] = -t1V1;
		res[2] = -t1V2;
		
		return res;
	}
	
	public static float[] tup_squared_3f(float[] t1)
	{
		t1[0] *= t1[0];
		t1[1] *= t1[1];
		t1[2] *= t1[2];
		
		return t1;
	}
	
	public static float[] tup_squaredN_3f(float[] t1)
	{
		float t1V0 = t1[0];
		float t1V1 = t1[1];
		float t1V2 = t1[2];
		
		return new float[] {
			t1V0 * t1V0,
			t1V1 * t1V1,
			t1V2 * t1V2
		};
	}
	
	public static float[] tup_squaredN_3f(float t1V0, float t1V1, float t1V2)
	{
		return new float[] {
			t1V0 * t1V0,
			t1V1 * t1V1,
			t1V2 * t1V2
		};
	}
	
	public static float[] tup_squaredT_3f(float[] t1, @ExtractionParam float[] res)
	{
		float t1V0 = t1[0];
		float t1V1 = t1[1];
		float t1V2 = t1[2];
		
		res[0] = t1V0 * t1V0;
		res[1] = t1V1 * t1V1;
		res[2] = t1V2 * t1V2;
		
		return res;
	}
	
	public static float[] tup_squaredT_3f(float t1V0, float t1V1, float t1V2, @ExtractionParam float[] res)
	{
		res[0] = t1V0 * t1V0;
		res[1] = t1V1 * t1V1;
		res[2] = t1V2 * t1V2;
		
		return res;
	}
}
