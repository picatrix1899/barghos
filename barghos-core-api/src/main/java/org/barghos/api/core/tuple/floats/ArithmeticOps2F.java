package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.math.MathUtils;

public final class ArithmeticOps2F
{
	private ArithmeticOps2F() { }
	
	public static float[] tup_add_2f(float[] t1, float[] t2)
	{
		t1[0] += t2[0];
		t1[1] += t2[1];
		
		return t1;
	}
	
	public static float[] tup_add_2f(float[] t1, float value)
	{
		t1[0] += value;
		t1[1] += value;
		
		return t1;
	}
	
	public static float[] tup_add_2f(float[] t1, float t2V0, float t2V1)
	{
		t1[0] += t2V0;
		t1[1] += t2V1;
		
		return t1;
	}
	
	public static float[] tup_addN_2f(float[] t1, float[] t2)
	{
		return new float[] {
			t1[0] + t2[0],
			t1[1] + t2[1]
		};
	}
	
	public static float[] tup_addN_2f(float[] t1, float value)
	{
		return new float[] {
			t1[0] + value,
			t1[1] + value
		};
	}
	
	public static float[] tup_addN_2f(float[] t1, float t2V0, float t2V1)
	{
		return new float[] {
			t1[0] + t2V0,
			t1[1] + t2V1
		};
	}
	
	public static float[] tup_addN_2f(float t1V0, float t1V1, float[] t2)
	{
		return new float[] {
			t1V0 + t2[0],
			t1V1 + t2[1]
		};
	}
	
	public static float[] tup_addN_2f(float t1V0, float t1V1, float value)
	{
		return new float[] {
			t1V0 + value,
			t1V1 + value
		};
	}
	
	public static float[] tup_addN_2f(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return new float[] {
			t1V0 + t2V0,
			t1V1 + t2V1
		};
	}
	
	public static float[] tup_addT_2f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] + t2[0];
		res[1] = t1[1] + t2[1];
		
		return res;
	}
	
	public static float[] tup_addT_2f(float[] t1, float value, @ExtractionParam float[] res)
	{
		res[0] = t1[0] + value;
		res[1] = t1[1] + value;
		
		return res;
	}
	
	public static float[] tup_addT_2f(float[] t1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = t1[0] + t2V0;
		res[1] = t1[1] + t2V1;
		
		return res;
	}
	
	public static float[] tup_addT_2f(float t1V0, float t1V1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1V0 + t2[0];
		res[1] = t1V1 + t2[1];
		
		return res;
	}
	
	public static float[] tup_addT_2f(float t1V0, float t1V1, float value, @ExtractionParam float[] res)
	{
		res[0] = t1V0 + value;
		res[1] = t1V1 + value;
		
		return res;
	}
	
	public static float[] tup_addT_2f(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = t1V0 + t2V0;
		res[1] = t1V1 + t2V1;
		
		return res;
	}
	
	public static float[] tup_sub_2f(float[] t1, float[] t2)
	{
		t1[0] -= t2[0];
		t1[1] -= t2[1];
		
		return t1;
	}
	
	public static float[] tup_sub_2f(float[] t1, float value)
	{
		t1[0] -= value;
		t1[1] -= value;
		
		return t1;
	}
	
	public static float[] tup_sub_2f(float[] t1, float t2V0, float t2V1)
	{
		t1[0] -= t2V0;
		t1[1] -= t2V1;
		
		return t1;
	}
	
	public static float[] tup_subN_2f(float[] t1, float[] t2)
	{
		return new float[] {
			t1[0] - t2[0],
			t1[1] - t2[1]
		};
	}
	
	public static float[] tup_subN_2f(float[] t1, float value)
	{
		return new float[] {
			t1[0] - value,
			t1[1] - value
		};
	}
	
	public static float[] tup_subN_2f(float[] t1, float t2V0, float t2V1)
	{
		return new float[] {
			t1[0] - t2V0,
			t1[1] - t2V1
		};
	}
	
	public static float[] tup_subN_2f(float t1V0, float t1V1, float[] t2)
	{
		return new float[] {
			t1V0 - t2[0],
			t1V1 - t2[1]
		};
	}
	
	public static float[] tup_subN_2f(float t1V0, float t1V1, float value)
	{
		return new float[] {
			t1V0 - value,
			t1V1 - value
		};
	}
	
	public static float[] tup_subN_2f(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return new float[] {
			t1V0 - t2V0,
			t1V1 - t2V1
		};
	}
	
	public static float[] tup_subT_2f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] - t2[0];
		res[1] = t1[1] - t2[1];
		
		return res;
	}
	
	public static float[] tup_subT_2f(float[] t1, float value, @ExtractionParam float[] res)
	{
		res[0] = t1[0] - value;
		res[1] = t1[1] - value;
		
		return res;
	}
	
	public static float[] tup_subT_2f(float[] t1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = t1[0] - t2V0;
		res[1] = t1[1] - t2V1;
		
		return res;
	}
	
	public static float[] tup_subT_2f(float t1V0, float t1V1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1V0 - t2[0];
		res[1] = t1V1 - t2[1];
		
		return res;
	}
	
	public static float[] tup_subT_2f(float t1V0, float t1V1, float value, @ExtractionParam float[] res)
	{
		res[0] = t1V0 - value;
		res[1] = t1V1 - value;
		
		return res;
	}
	
	public static float[] tup_subT_2f(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = t1V0 - t2V0;
		res[1] = t1V1 - t2V1;
		
		return res;
	}
	
	public static float[] tup_revSub_2f(float[] t1, float[] t2)
	{
		t1[0] = t2[0] - t1[0];
		t1[1] = t2[1] - t1[1];
		
		return t1;
	}
	
	public static float[] tup_revSub_2f(float[] t1, float value)
	{
		t1[0] = value - t1[0];
		t1[1] = value - t1[1];
		
		return t1;
	}
	
	public static float[] tup_revSub_2f(float[] t1, float t2V0, float t2V1)
	{
		t1[0] = t2V0 - t1[0];
		t1[1] = t2V1 - t1[1];
		
		return t1;
	}
	
	public static float[] tup_revSubN_2f(float[] t1, float[] t2)
	{
		return new float[] {
			t2[0] - t1[0],
			t2[1] - t1[1]
		};
	}
	
	public static float[] tup_revSubN_2f(float[] t1, float value)
	{
		return new float[] {
			value - t1[0],
			value - t1[1]
		};
	}
	
	public static float[] tup_revSubN_2f(float[] t1, float t2V0, float t2V1)
	{
		return new float[] {
			t2V0 - t1[0],
			t2V1 - t1[1]
		};
	}
	
	public static float[] tup_revSubN_2f(float t1V0, float t1V1, float[] t2)
	{
		return new float[] {
			t2[0] - t1V0,
			t2[1] - t1V1
		};
	}
	
	public static float[] tup_revSubN_2f(float t1V0, float t1V1, float value)
	{
		return new float[] {
			value - t1V0,
			value - t1V1
		};
	}
	
	public static float[] tup_revSubN_2f(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return new float[] {
			t2V0 - t1V0,
			t2V1 - t1V1
		};
	}
	
	public static float[] tup_revSubT_2f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t2[0] - t1[0];
		res[1] = t2[1] - t1[1];
		
		return res;
	}
	
	public static float[] tup_revSubT_2f(float[] t1, float value, @ExtractionParam float[] res)
	{
		res[0] = value - t1[0];
		res[1] = value - t1[1];
		
		return res;
	}
	
	public static float[] tup_revSubT_2f(float[] t1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = t2V0 - t1[0];
		res[1] = t2V1 - t1[1];
		
		return res;
	}
	
	public static float[] tup_revSubT_2f(float t1V0, float t1V1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t2[0] - t1V0;
		res[1] = t2[1] - t1V1;
		
		return res;
	}
	
	public static float[] tup_revSubT_2f(float t1V0, float t1V1, float value, @ExtractionParam float[] res)
	{
		res[0] = value - t1V0;
		res[1] = value - t1V1;
		
		return res;
	}
	
	public static float[] tup_revSubT_2f(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = t2V0 - t1V0;
		res[1] = t2V1 - t1V1;
		
		return res;
	}
	
	public static float[] tup_mul_2f(float[] t1, float[] t2)
	{
		t1[0] *= t2[0];
		t1[1] *= t2[1];
		
		return t1;
	}
	
	public static float[] tup_mul_2f(float[] t1, float value)
	{
		t1[0] *= value;
		t1[1] *= value;
		
		return t1;
	}
	
	public static float[] tup_mul_2f(float[] t1, float t2V0, float t2V1)
	{
		t1[0] *= t2V0;
		t1[1] *= t2V1;
		
		return t1;
	}
	
	public static float[] tup_mulN_2f(float[] t1, float[] t2)
	{
		return new float[] {
			t1[0] * t2[0],
			t1[1] * t2[1]
		};
	}
	
	public static float[] tup_mulN_2f(float[] t1, float value)
	{
		return new float[] {
			t1[0] * value,
			t1[1] * value
		};
	}
	
	public static float[] tup_mulN_2f(float[] t1, float t2V0, float t2V1)
	{
		return new float[] {
			t1[0] * t2V0,
			t1[1] * t2V1
		};
	}
	
	public static float[] tup_mulN_2f(float t1V0, float t1V1, float[] t2)
	{
		return new float[] {
			t1V0 * t2[0],
			t1V1 * t2[1]
		};
	}
	
	public static float[] tup_mulN_2f(float t1V0, float t1V1, float value)
	{
		return new float[] {
			t1V0 * value,
			t1V1 * value
		};
	}
	
	public static float[] tup_mulN_2f(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return new float[] {
			t1V0 * t2V0,
			t1V1 * t2V1
		};
	}
	
	public static float[] tup_mulT_2f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] * t2[0];
		res[1] = t1[1] * t2[1];
		
		return res;
	}
	
	public static float[] tup_mulT_2f(float[] t1, float value, @ExtractionParam float[] res)
	{
		res[0] = t1[0] * value;
		res[1] = t1[1] * value;
		
		return res;
	}
	
	public static float[] tup_mulT_2f(float[] t1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = t1[0] * t2V0;
		res[1] = t1[1] * t2V1;
		
		return res;
	}
	
	public static float[] tup_mulT_2f(float t1V0, float t1V1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1V0 * t2[0];
		res[1] = t1V1 * t2[1];
		
		return res;
	}
	
	public static float[] tup_mulT_2f(float t1V0, float t1V1, float value, @ExtractionParam float[] res)
	{
		res[0] = t1V0 * value;
		res[1] = t1V1 * value;
		
		return res;
	}
	
	public static float[] tup_mulT_2f(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = t1V0 * t2V0;
		res[1] = t1V1 * t2V1;
		
		return res;
	}
	
	public static float[] tup_div_2f(float[] t1, float[] t2)
	{
		t1[0] /= t2[0];
		t1[1] /= t2[1];
		
		return t1;
	}
	
	public static float[] tup_div_2f(float[] t1, float value)
	{
		t1[0] /= value;
		t1[1] /= value;
		
		return t1;
	}
	
	public static float[] tup_div_2f(float[] t1, float t2V0, float t2V1)
	{
		t1[0] /= t2V0;
		t1[1] /= t2V1;
		
		return t1;
	}
	
	public static float[] tup_divN_2f(float[] t1, float[] t2)
	{
		return new float[] {
			t1[0] / t2[0],
			t1[1] / t2[1]
		};
	}
	
	public static float[] tup_divN_2f(float[] t1, float value)
	{
		return new float[] {
			t1[0] / value,
			t1[1] / value
		};
	}
	
	public static float[] tup_divN_2f(float[] t1, float t2V0, float t2V1)
	{
		return new float[] {
			t1[0] / t2V0,
			t1[1] / t2V1
		};
	}
	
	public static float[] tup_divN_2f(float t1V0, float t1V1, float[] t2)
	{
		return new float[] {
			t1V0 / t2[0],
			t1V1 / t2[1]
		};
	}
	
	public static float[] tup_divN_2f(float t1V0, float t1V1, float value)
	{
		return new float[] {
			t1V0 / value,
			t1V1 / value
		};
	}
	
	public static float[] tup_divN_2f(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return new float[] {
			t1V0 / t2V0,
			t1V1 / t2V1
		};
	}
	
	public static float[] tup_divT_2f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1[0] / t2[0];
		res[1] = t1[1] / t2[1];
		
		return res;
	}
	
	public static float[] tup_divT_2f(float[] t1, float value, @ExtractionParam float[] res)
	{
		res[0] = t1[0] / value;
		res[1] = t1[1] / value;
		
		return res;
	}
	
	public static float[] tup_divT_2f(float[] t1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = t1[0] / t2V0;
		res[1] = t1[1] / t2V1;
		
		return res;
	}
	
	public static float[] tup_divT_2f(float t1V0, float t1V1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t1V0 / t2[0];
		res[1] = t1V1 / t2[1];
		
		return res;
	}
	
	public static float[] tup_divT_2f(float t1V0, float t1V1, float value, @ExtractionParam float[] res)
	{
		res[0] = t1V0 / value;
		res[1] = t1V1 / value;
		
		return res;
	}
	
	public static float[] tup_divT_2f(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = t1V0 / t2V0;
		res[1] = t1V1 / t2V1;
		
		return res;
	}
	
	public static float[] tup_revDiv_2f(float[] t1, float[] t2)
	{
		t1[0] = t2[0] / t1[0];
		t1[1] = t2[1] / t1[1];
		
		return t1;
	}
	
	public static float[] tup_revDiv_2f(float[] t1, float value)
	{
		t1[0] = value / t1[0];
		t1[1] = value / t1[1];
		
		return t1;
	}
	
	public static float[] tup_revDiv_2f(float[] t1, float t2V0, float t2V1)
	{
		t1[0] = t2V0 / t1[0];
		t1[1] = t2V1 / t1[1];
		
		return t1;
	}
	
	public static float[] tup_revDivN_2f(float[] t1, float[] t2)
	{
		return new float[] {
			t2[0] / t1[0],
			t2[1] / t1[1]
		};
	}
	
	public static float[] tup_revDivN_2f(float[] t1, float value)
	{
		return new float[] {
			value / t1[0],
			value / t1[1]
		};
	}
	
	public static float[] tup_revDivN_2f(float[] t1, float t2V0, float t2V1)
	{
		return new float[] {
			t2V0 / t1[0],
			t2V1 / t1[1]
		};
	}
	
	public static float[] tup_revDivN_2f(float t1V0, float t1V1, float[] t2)
	{
		return new float[] {
			t2[0] / t1V0,
			t2[1] / t1V1
		};
	}
	
	public static float[] tup_revDivN_2f(float t1V0, float t1V1, float value)
	{
		return new float[] {
			value / t1V0,
			value / t1V1
		};
	}
	
	public static float[] tup_revDivN_2f(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return new float[] {
			t2V0 / t1V0,
			t2V1 / t1V1
		};
	}
	
	public static float[] tup_revDivT_2f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t2[0] / t1[0];
		res[1] = t2[1] / t1[1];
		
		return res;
	}
	
	public static float[] tup_revDivT_2f(float[] t1, float value, @ExtractionParam float[] res)
	{
		res[0] = value / t1[0];
		res[1] = value / t1[1];
		
		return res;
	}
	
	public static float[] tup_revDivT_2f(float[] t1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = t2V0 / t1[0];
		res[1] = t2V1 / t1[1];
		
		return res;
	}
	
	public static float[] tup_revDivT_2f(float t1V0, float t1V1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = t2[0] / t1V0;
		res[1] = t2[1] / t1V1;
		
		return res;
	}
	
	public static float[] tup_revDivT_2f(float t1V0, float t1V1, float value, @ExtractionParam float[] res)
	{
		res[0] = value / t1V0;
		res[1] = value / t1V1;
		
		return res;
	}
	
	public static float[] tup_revDivT_2f(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = t2V0 / t1V0;
		res[1] = t2V1 / t1V1;
		
		return res;
	}
	
	public static float[] tup_pow_2f(float[] t1, float[] t2)
	{
		t1[0] = MathUtils.pow(t1[0], t2[0]);
		t1[1] = MathUtils.pow(t1[1], t2[1]);
		
		return t1;
	}
	
	public static float[] tup_pow_2f(float[] t1, float value)
	{
		t1[0] = MathUtils.pow(t1[0], value);
		t1[1] = MathUtils.pow(t1[1], value);
		
		return t1;
	}
	
	public static float[] tup_pow_2f(float[] t1, float t2V0, float t2V1)
	{
		t1[0] = MathUtils.pow(t1[0], t2V0);
		t1[1] = MathUtils.pow(t1[1], t2V1);
		
		return t1;
	}
	
	public static float[] tup_powN_2f(float[] t1, float[] t2)
	{
		return new float[] {
			MathUtils.pow(t1[0], t2[0]),
			MathUtils.pow(t1[1], t2[1])
		};
	}
	
	public static float[] tup_powN_2f(float[] t1, float value)
	{
		return new float[] {
			MathUtils.pow(t1[0], value),
			MathUtils.pow(t1[1], value)
		};
	}
	
	public static float[] tup_powN_2f(float[] t1, float t2V0, float t2V1)
	{
		return new float[] {
			MathUtils.pow(t1[0], t2V0),
			MathUtils.pow(t1[1], t2V1)
		};
	}
	
	public static float[] tup_powN_2f(float t1V0, float t1V1, float[] t2)
	{
		return new float[] {
			MathUtils.pow(t1V0, t2[0]),
			MathUtils.pow(t1V1, t2[1])
		};
	}
	
	public static float[] tup_powN_2f(float t1V0, float t1V1, float value)
	{
		return new float[] {
			MathUtils.pow(t1V0, value),
			MathUtils.pow(t1V1, value)
		};
	}
	
	public static float[] tup_powN_2f(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return new float[] {
			MathUtils.pow(t1V0, t2V0),
			MathUtils.pow(t1V1, t2V1)
		};
	}
	
	public static float[] tup_powT_2f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t1[0], t2[0]);
		res[1] = MathUtils.pow(t1[1], t2[1]);
		
		return res;
	}
	
	public static float[] tup_powT_2f(float[] t1, float value, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t1[0], value);
		res[1] = MathUtils.pow(t1[0], value);
		
		return res;
	}
	
	public static float[] tup_powT_2f(float[] t1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t1[0], t2V0);
		res[1] = MathUtils.pow(t1[0], t2V1);
		
		return res;
	}
	
	public static float[] tup_powT_2f(float t1V0, float t1V1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t1V0, t2[0]);
		res[1] = MathUtils.pow(t1V1, t2[1]);
		
		return res;
	}
	
	public static float[] tup_powT_2f(float t1V0, float t1V1, float value, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t1V0, value);
		res[1] = MathUtils.pow(t1V1, value);
		
		return res;
	}
	
	public static float[] tup_powT_2f(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t1V0, t2V0);
		res[1] = MathUtils.pow(t1V1, t2V1);
		
		return res;
	}
	
	public static float[] tup_revPow_2f(float[] t1, float[] t2)
	{
		t1[0] = MathUtils.pow(t2[0], t1[0]);
		t1[1] = MathUtils.pow(t2[1], t1[1]);
		
		return t1;
	}
	
	public static float[] tup_revPow_2f(float[] t1, float value)
	{
		t1[0] = MathUtils.pow(value, t1[0]);
		t1[1] = MathUtils.pow(value, t1[1]);
		
		return t1;
	}
	
	public static float[] tup_revPow_2f(float[] t1, float t2V0, float t2V1)
	{
		t1[0] = MathUtils.pow(t2V0, t1[0]);
		t1[1] = MathUtils.pow(t2V1, t1[1]);
		
		return t1;
	}
	
	public static float[] tup_revPowN_2f(float[] t1, float[] t2)
	{
		return new float[] {
			MathUtils.pow(t2[0], t1[0]),
			MathUtils.pow(t2[1], t1[1])
		};
	}
	
	public static float[] tup_revPowN_2f(float[] t1, float value)
	{
		return new float[] {
			MathUtils.pow(value, t1[0]),
			MathUtils.pow(value, t1[1])
		};
	}
	
	public static float[] tup_revPowN_2f(float[] t1, float t2V0, float t2V1)
	{
		return new float[] {
			MathUtils.pow(t2V0, t1[0]),
			MathUtils.pow(t2V1, t1[1])
		};
	}
	
	public static float[] tup_revPowN_2f(float t1V0, float t1V1, float[] t2)
	{
		return new float[] {
			MathUtils.pow(t2[0], t1V0),
			MathUtils.pow(t2[1], t1V1)
		};
	}
	
	public static float[] tup_revPowN_2f(float t1V0, float t1V1, float value)
	{
		return new float[] {
			MathUtils.pow(value, t1V0),
			MathUtils.pow(value, t1V1)
		};
	}
	
	public static float[] tup_revPowN_2f(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return new float[] {
			MathUtils.pow(t2V0, t1V0),
			MathUtils.pow(t2V1, t1V1)
		};
	}
	
	public static float[] tup_revPowT_2f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t2[0], t1[0]);
		res[1] = MathUtils.pow(t2[1], t1[1]);
		
		return res;
	}
	
	public static float[] tup_revPowT_2f(float[] t1, float value, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(value, t1[0]);
		res[1] = MathUtils.pow(value, t1[1]);
		
		return res;
	}
	
	public static float[] tup_revPowT_2f(float[] t1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t2V0, t1[0]);
		res[1] = MathUtils.pow(t2V1, t1[1]);
		
		return res;
	}
	
	public static float[] tup_revPowT_2f(float t1V0, float t1V1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t2[0], t1V0);
		res[1] = MathUtils.pow(t2[1], t1V1);
		
		return res;
	}
	
	public static float[] tup_revPowT_2f(float t1V0, float t1V1, float value, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(value, t1V0);
		res[1] = MathUtils.pow(value, t1V1);
		
		return res;
	}
	
	public static float[] tup_revPowT_2f(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.pow(t2V0, t1V0);
		res[1] = MathUtils.pow(t2V1, t1V1);
		
		return res;
	}
	
	public static float[] tup_fma_2f(float[] t1, float[] t2, float[] t3)
	{
		t1[0] = Math.fma(t1[0], t2[0], t3[0]);
		t1[1] = Math.fma(t1[1], t2[1], t3[1]);
		
		return t1;
	}
	
	public static float[] tup_fma_2f(float[] t1, float[] t2, float t3V0, float t3V1)
	{
		t1[0] = Math.fma(t1[0], t2[0], t3V0);
		t1[1] = Math.fma(t1[1], t2[1], t3V1);
		
		return t1;
	}
	
	public static float[] tup_fma_2f(float[] t1, float t2V0, float t2V1, float[] t3)
	{
		t1[0] = Math.fma(t1[0], t2V0, t3[0]);
		t1[1] = Math.fma(t1[1], t2V1, t3[1]);
		
		return t1;
	}
	
	public static float[] tup_fma_2f(float[] t1, float t2V0, float t2V1, float t3V0, float t3V1)
	{
		t1[0] = Math.fma(t1[0], t2V0, t3V0);
		t1[1] = Math.fma(t1[1], t2V1, t3V1);
		
		return t1;
	}
	
	public static float[] tup_fmaN_2f(float[] t1, float[] t2, float[] t3)
	{
		return new float[] {
			Math.fma(t1[0], t2[0], t3[0]),
			Math.fma(t1[1], t2[1], t3[1])
		};
	}
	
	public static float[] tup_fmaN_2f(float[] t1, float[] t2, float t3V0, float t3V1)
	{
		return new float[] {
			Math.fma(t1[0], t2[0], t3V0),
			Math.fma(t1[1], t2[1], t3V1)
		};
	}
	
	public static float[] tup_fmaN_2f(float[] t1, float t2V0, float t2V1, float[] t3)
	{
		return new float[] {
			Math.fma(t1[0], t2V0, t3[0]),
			Math.fma(t1[1], t2V1, t3[1])
		};
	}
	
	public static float[] tup_fmaN_2f(float[] t1, float t2V0, float t2V1, float t3V0, float t3V1)
	{
		return new float[] {
			Math.fma(t1[0], t2V0, t3V0),
			Math.fma(t1[1], t2V1, t3V1)
		};
	}
	
	public static float[] tup_fmaN_2f(float t1V0, float t1V1, float[] t2, float[] t3)
	{
		return new float[] {
			Math.fma(t1V0, t2[0], t3[0]),
			Math.fma(t1V1, t2[1], t3[1])
		};
	}
	
	public static float[] tup_fmaN_2f(float t1V0, float t1V1, float[] t2, float t3V0, float t3V1)
	{
		return new float[] {
			Math.fma(t1V0, t2[0], t3V0),
			Math.fma(t1V1, t2[1], t3V1)
		};
	}
	
	public static float[] tup_fmaN_2f(float t1V0, float t1V1, float t2V0, float t2V1, float[] t3)
	{
		return new float[] {
			Math.fma(t1V0, t2V0, t3[0]),
			Math.fma(t1V1, t2V1, t3[1])
		};
	}
	
	public static float[] tup_fmaN_2f(float t1V0, float t1V1, float t2V0, float t2V1, float t3V0, float t3V1)
	{
		return new float[] {
			Math.fma(t1V0, t2V0, t3V0),
			Math.fma(t1V1, t2V1, t3V1)
		};
	}
	
	public static float[] tup_fmaT_2f(float[] t1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t1[0], t2[0], t3[0]);
		res[1] = Math.fma(t1[1], t2[1], t3[1]);
		
		return res;
	}
	
	public static float[] tup_fmaT_2f(float[] t1, float[] t2, float t3V0, float t3V1, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t1[0], t2[0], t3V0);
		res[1] = Math.fma(t1[1], t2[1], t3V1);
		
		return res;
	}
	
	public static float[] tup_fmaT_2f(float[] t1, float t2V0, float t2V1, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t1[0], t2V0, t3[0]);
		res[1] = Math.fma(t1[1], t2V1, t3[1]);
		
		return res;
	}
	
	public static float[] tup_fmaT_2f(float[] t1, float t2V0, float t2V1, float t3V0, float t3V1, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t1[0], t2V0, t3V0);
		res[1] = Math.fma(t1[1], t2V1, t3V1);
		
		return res;
	}
	
	public static float[] tup_fmaT_2f(float t1V0, float t1V1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t1V0, t2[0], t3[0]);
		res[1] = Math.fma(t1V1, t2[1], t3[1]);
		
		return res;
	}
	
	public static float[] tup_fmaT_2f(float t1V0, float t1V1, float[] t2, float t3V0, float t3V1, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t1V0, t2[0], t3V0);
		res[1] = Math.fma(t1V1, t2[1], t3V1);
		
		return res;
	}
	
	public static float[] tup_fmaT_2f(float t1V0, float t1V1, float t2V0, float t2V1, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t1V0, t2V0, t3[0]);
		res[1] = Math.fma(t1V1, t2V1, t3[1]);
		
		return res;
	}
	
	public static float[] tup_fmaT_2f(float t1V0, float t1V1, float t2V0, float t2V1, float t3V0, float t3V1, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t1V0, t2V0, t3V0);
		res[1] = Math.fma(t1V1, t2V1, t3V1);
		
		return res;
	}
	
	public static float[] tup_fam_2f(float[] t1, float[] t2, float[] t3)
	{
		t1[0] = Math.fma(t2[0], t3[0], t1[0]);
		t1[1] = Math.fma(t2[1], t3[1], t1[1]);
		
		return t1;
	}
	
	public static float[] tup_fam_2f(float[] t1, float[] t2, float t3V0, float t3V1)
	{
		t1[0] = Math.fma(t2[0], t3V0, t1[0]);
		t1[1] = Math.fma(t2[1], t3V1, t1[1]);
		
		return t1;
	}
	
	public static float[] tup_fam_2f(float[] t1, float t2V0, float t2V1, float[] t3)
	{
		t1[0] = Math.fma(t2V0, t3[0], t1[0]);
		t1[1] = Math.fma(t2V1, t3[1], t1[1]);
		
		return t1;
	}
	
	public static float[] tup_fam_2f(float[] t1, float t2V0, float t2V1, float t3V0, float t3V1)
	{
		t1[0] = Math.fma(t2V0, t3V0, t1[0]);
		t1[1] = Math.fma(t2V1, t3V1, t1[1]);
		
		return t1;
	}
	
	public static float[] tup_famN_2f(float[] t1, float[] t2, float[] t3)
	{
		return new float[] {
			Math.fma(t2[0], t3[0], t1[0]),
			Math.fma(t2[1], t3[1], t1[1])
		};
	}
	
	public static float[] tup_famN_2f(float[] t1, float[] t2, float t3V0, float t3V1)
	{
		return new float[] {
			Math.fma(t2[0], t3V0, t1[0]),
			Math.fma(t2[1], t3V1, t1[1])
		};
	}
	
	public static float[] tup_famN_2f(float[] t1, float t2V0, float t2V1, float[] t3)
	{
		return new float[] {
			Math.fma(t1[0], t2V0, t3[0]),
			Math.fma(t1[1], t2V1, t3[1])
		};
	}
	
	public static float[] tup_famN_2f(float[] t1, float t2V0, float t2V1, float t3V0, float t3V1)
	{
		return new float[] {
			Math.fma(t2V0, t3V0, t1[0]),
			Math.fma(t2V1, t3V1, t1[1])
		};
	}
	
	public static float[] tup_famN_2f(float t1V0, float t1V1, float[] t2, float[] t3)
	{
		return new float[] {
			Math.fma(t2[0], t3[0], t1V0),
			Math.fma(t2[1], t3[1], t1V1)
		};
	}
	
	public static float[] tup_famN_2f(float t1V0, float t1V1, float[] t2, float t3V0, float t3V1)
	{
		return new float[] {
			Math.fma(t2[0], t3V0, t1V0),
			Math.fma(t2[1], t3V1, t1V1)
		};
	}
	
	public static float[] tup_famN_2f(float t1V0, float t1V1, float t2V0, float t2V1, float[] t3)
	{
		return new float[] {
			Math.fma(t1V0, t2V0, t3[0]),
			Math.fma(t1V1, t2V1, t3[1])
		};
	}
	
	public static float[] tup_famN_2f(float t1V0, float t1V1, float t2V0, float t2V1, float t3V0, float t3V1)
	{
		return new float[] {
			Math.fma(t2V0, t3V0, t1V0),
			Math.fma(t2V1, t3V1, t1V1)
		};
	}
	
	public static float[] tup_famT_2f(float[] t1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t2[0], t3[0], t1[0]);
		res[1] = Math.fma(t2[1], t3[1], t1[1]);
		
		return res;
	}
	
	public static float[] tup_famT_2f(float[] t1, float[] t2, float t3V0, float t3V1, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t2[0], t3V0, t1[0]);
		res[1] = Math.fma(t2[1], t3V1, t1[1]);
		
		return res;
	}
	
	public static float[] tup_famT_2f(float[] t1, float t2V0, float t2V1, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t2V0, t3[0], t1[0]);
		res[1] = Math.fma(t2V1, t3[1], t1[1]);
		
		return res;
	}
	
	public static float[] tup_famT_2f(float[] t1, float t2V0, float t2V1, float t3V0, float t3V1, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t2V0, t3V0, t1[0]);
		res[1] = Math.fma(t2V1, t3V1, t1[1]);
		
		return res;
	}
	
	public static float[] tup_famT_2f(float t1V0, float t1V1, float[] t2, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t2[0], t3[0], t1V0);
		res[1] = Math.fma(t2[1], t3[1], t1V1);
		
		return res;
	}
	
	public static float[] tup_famT_2f(float t1V0, float t1V1, float[] t2, float t3V0, float t3V1, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t2[0], t3V0, t1V0);
		res[1] = Math.fma(t2[1], t3V1, t1V1);
		
		return res;
	}
	
	public static float[] tup_famT_2f(float t1V0, float t1V1, float t2V0, float t2V1, float[] t3, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t2V0, t3[0], t1V0);
		res[1] = Math.fma(t2V1, t3[1], t1V1);
		
		return res;
	}
	
	public static float[] tup_famT_2f(float t1V0, float t1V1, float t2V0, float t2V1, float t3V0, float t3V1, @ExtractionParam float[] res)
	{
		res[0] = Math.fma(t2V0, t3V0, t1V0);
		res[1] = Math.fma(t2V1, t3V1, t1V1);
		
		return res;
	}
	
	public static float[] tup_sqrt_2f(float[] t1)
	{
		t1[0] = MathUtils.sqrt(t1[0]);
		t1[1] = MathUtils.sqrt(t1[1]);
		
		return t1;
	}
	
	public static float[] tup_sqrtN_2f(float[] t1)
	{
		return new float[] {
			MathUtils.sqrt(t1[0]),
			MathUtils.sqrt(t1[1])
		};
	}
	
	public static float[] tup_sqrtN_2f(float t1V0, float t1V1)
	{
		return new float[] {
			MathUtils.sqrt(t1V0),
			MathUtils.sqrt(t1V1)
		};
	}
	
	public static float[] tup_sqrtT_2f(float[] t1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sqrt(t1[0]);
		res[1] = MathUtils.sqrt(t1[1]);
		
		return res;
	}
	
	public static float[] tup_sqrtT_2f(float t1V0, float t1V1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.sqrt(t1V0);
		res[1] = MathUtils.sqrt(t1V1);
		
		return res;
	}
	
	public static float[] tup_cbrt_2f(float[] t1)
	{
		t1[0] = MathUtils.cbrt(t1[0]);
		t1[1] = MathUtils.cbrt(t1[1]);
		
		return t1;
	}
	
	public static float[] tup_cbrtN_2f(float[] t1)
	{
		return new float[] {
			MathUtils.cbrt(t1[0]),
			MathUtils.cbrt(t1[1])
		};
	}
	
	public static float[] tup_cbrtN_2f(float t1V0, float t1V1)
	{
		return new float[] {
			MathUtils.cbrt(t1V0),
			MathUtils.cbrt(t1V1)
		};
	}
	
	public static float[] tup_cbrtT_2f(float[] t1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cbrt(t1[0]);
		res[1] = MathUtils.cbrt(t1[1]);
		
		return res;
	}
	
	public static float[] tup_cbrtT_2f(float t1V0, float t1V1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.cbrt(t1V0);
		res[1] = MathUtils.cbrt(t1V1);
		
		return res;
	}
	
	public static float[] tup_abs_2f(float[] t1)
	{
		t1[0] = Math.abs(t1[0]);
		t1[1] = Math.abs(t1[1]);
		
		return t1;
	}
	
	public static float[] tup_absN_2f(float[] t1)
	{
		return new float[] {
			Math.abs(t1[0]),
			Math.abs(t1[1])
		};
	}
	
	public static float[] tup_absN_2f(float t1V0, float t1V1)
	{
		return new float[] {
			Math.abs(t1V0),
			Math.abs(t1V1)
		};
	}
	
	public static float[] tup_absT_2f(float[] t1, @ExtractionParam float[] res)
	{
		res[0] = Math.abs(t1[0]);
		res[1] = Math.abs(t1[1]);
		
		return res;
	}
	
	public static float[] tup_absT_2f(float t1V0, float t1V1, @ExtractionParam float[] res)
	{
		res[0] = Math.abs(t1V0);
		res[1] = Math.abs(t1V1);
		
		return res;
	}
	
	public static float[] tup_reciprocal_2f(float[] t1)
	{
		t1[0] = 1.0f / t1[0];
		t1[1] = 1.0f / t1[1];
		
		return t1;
	}
	
	public static float[] tup_reciprocalN_2f(float[] t1)
	{
		return new float[] {
			1.0f / t1[0],
			1.0f / t1[1]
		};
	}
	
	public static float[] tup_reciprocalN_2f(float t1V0, float t1V1)
	{
		return new float[] {
			1.0f / t1V0,
			1.0f / t1V1
		};
	}
	
	public static float[] tup_reciprocalT_2f(float[] t1, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / t1[0];
		res[1] = 1.0f / t1[1];
		
		return res;
	}
	
	public static float[] tup_reciprocalT_2f(float t1V0, float t1V1, @ExtractionParam float[] res)
	{
		res[0] = 1.0f / t1V0;
		res[1] = 1.0f / t1V1;
		
		return res;
	}
	
	public static float[] tup_negate_2f(float[] t1)
	{
		t1[0] = -t1[0];
		t1[1] = -t1[1];
		
		return t1;
	}
	
	public static float[] tup_negateN_2f(float[] t1)
	{
		return new float[] {
			-t1[0],
			-t1[1]
		};
	}
	
	public static float[] tup_negateN_2f(float t1V0, float t1V1)
	{
		return new float[] {
			-t1V0,
			-t1V1
		};
	}
	
	public static float[] tup_negateT_2f(float[] t1, @ExtractionParam float[] res)
	{
		res[0] = -t1[0];
		res[1] = -t1[1];
		
		return res;
	}
	
	public static float[] tup_negateT_2f(float t1V0, float t1V1, @ExtractionParam float[] res)
	{
		res[0] = -t1V0;
		res[1] = -t1V1;
		
		return res;
	}
	
	public static float[] tup_squared_2f(float[] t1)
	{
		t1[0] *= t1[0];
		t1[1] *= t1[1];
		
		return t1;
	}
	
	public static float[] tup_squaredN_2f(float[] t1)
	{
		float t1V0 = t1[0];
		float t1V1 = t1[1];
		
		return new float[] {
			t1V0 * t1V0,
			t1V1 * t1V1
		};
	}
	
	public static float[] tup_squaredN_2f(float t1V0, float t1V1)
	{
		return new float[] {
			t1V0 * t1V0,
			t1V1 * t1V1
		};
	}
	
	public static float[] tup_squaredT_2f(float[] t1, @ExtractionParam float[] res)
	{
		float t1V0 = t1[0];
		float t1V1 = t1[1];
		
		res[0] = t1V0 * t1V0;
		res[1] = t1V1 * t1V1;
		
		return res;
	}
	
	public static float[] tup_squaredT_2f(float t1V0, float t1V1, @ExtractionParam float[] res)
	{
		res[0] = t1V0 * t1V0;
		res[1] = t1V1 * t1V1;
		
		return res;
	}
}
