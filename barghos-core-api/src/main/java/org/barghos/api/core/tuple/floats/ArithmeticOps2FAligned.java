package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.math.MathUtils;

public final class ArithmeticOps2FAligned
{
	private ArithmeticOps2FAligned() { }
	
	public static float[] add_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		t1[t1Offset+0] += t2[t2Offset+0];
		t1[t1Offset+1] += t2[t2Offset+1];
		
		return t1;
	}
	
	public static float[] add_2fa(float[] t1, int t1Offset, float value)
	{
		t1[t1Offset+0] += value;
		t1[t1Offset+1] += value;
		
		return t1;
	}
	
	public static float[] add_2fa(float[] t1, int t1Offset, float t2V0, float t2V1)
	{
		t1[t1Offset+0] += t2V0;
		t1[t1Offset+1] += t2V1;
		
		return t1;
	}
	
	public static float[] addN_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t1[t1Offset+0] + t2[t2Offset+0],
			t1[t1Offset+1] + t2[t2Offset+1]
		};
	}
	
	public static float[] addN_2fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			t1[t1Offset+0] + value,
			t1[t1Offset+1] + value
		};
	}
	
	public static float[] addN_2fa(float[] t1, int t1Offset, float t2V0, float t2V1)
	{
		return new float[] {
			t1[t1Offset+0] + t2V0,
			t1[t1Offset+1] + t2V1
		};
	}
	
	public static float[] addN_2fa(float t1V0, float t1V1, float[] t2, int t2Offset)
	{
		return new float[] {
			t1V0 + t2[t2Offset+0],
			t1V1 + t2[t2Offset+1]
		};
	}
	
	public static float[] addT_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] + t2[t2Offset+0];
		res[resOffset+1] = t1[t1Offset+1] + t2[t2Offset+1];
		
		return res;
	}
	
	public static float[] addT_2fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] + value;
		res[resOffset+1] = t1[t1Offset+1] + value;
		
		return res;
	}
	
	public static float[] addT_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] + t2V0;
		res[resOffset+1] = t1[t1Offset+1] + t2V1;
		
		return res;
	}
	
	public static float[] addT_2fa(float t1V0, float t1V1, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 + t2[t2Offset+0];
		res[resOffset+1] = t1V1 + t2[t2Offset+1];
		
		return res;
	}
	
	public static float[] addT_2fa(float t1V0, float t1V1, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 + value;
		res[resOffset+1] = t1V1 + value;
		
		return res;
	}
	
	public static float[] addT_2fa(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 + t2V0;
		res[resOffset+1] = t1V1 + t2V1;
		
		return res;
	}
	
	public static float[] sub_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		t1[t1Offset+0] -= t2[t2Offset+0];
		t1[t1Offset+1] -= t2[t2Offset+1];
		
		return t1;
	}
	
	public static float[] sub_2fa(float[] t1, int t1Offset, float value)
	{
		t1[t1Offset+0] -= value;
		t1[t1Offset+1] -= value;
		
		return t1;
	}
	
	public static float[] sub_2fa(float[] t1, int t1Offset, float t2V0, float t2V1)
	{
		t1[t1Offset+0] -= t2V0;
		t1[t1Offset+1] -= t2V1;
		
		return t1;
	}
	
	public static float[] subN_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t1[t1Offset+0] - t2[t2Offset+0],
			t1[t1Offset+1] - t2[t2Offset+1]
		};
	}
	
	public static float[] subN_2fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			t1[t1Offset+0] - value,
			t1[t1Offset+1] - value
		};
	}
	
	public static float[] subN_2fa(float[] t1, int t1Offset, float t2V0, float t2V1)
	{
		return new float[] {
			t1[t1Offset+0] - t2V0,
			t1[t1Offset+1] - t2V1
		};
	}
	
	public static float[] subN_2fa(float t1V0, float t1V1, float[] t2, int t2Offset)
	{
		return new float[] {
			t1V0 - t2[t2Offset+0],
			t1V1 - t2[t2Offset+1]
		};
	}
	
	public static float[] subT_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] - t2[t2Offset+0];
		res[resOffset+1] = t1[t1Offset+1] - t2[t2Offset+1];
		
		return res;
	}
	
	public static float[] subT_2fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] - value;
		res[resOffset+1] = t1[t1Offset+1] - value;
		
		return res;
	}
	
	public static float[] subT_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] - t2V0;
		res[resOffset+1] = t1[t1Offset+1] - t2V1;
		
		return res;
	}
	
	public static float[] subT_2fa(float t1V0, float t1V1, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 - t2[t2Offset+0];
		res[resOffset+1] = t1V1 - t2[t2Offset+1];
		
		return res;
	}
	
	public static float[] subT_2fa(float t1V0, float t1V1, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 - value;
		res[resOffset+1] = t1V1 - value;
		
		return res;
	}
	
	public static float[] subT_2fa(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 - t2V0;
		res[resOffset+1] = t1V1 - t2V1;
		
		return res;
	}
	
	public static float[] revSub_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = t2[t2Offset+0] - t1[t1OffsetV0];
		t1[t1OffsetV1] = t2[t2Offset+1] - t1[t1OffsetV1];
		
		return t1;
	}
	
	public static float[] revSub_2fa(float[] t1, int t1Offset, float value)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = value - t1[t1OffsetV0];
		t1[t1OffsetV1] = value - t1[t1OffsetV1];
		
		return t1;
	}
	
	public static float[] revSub_2fa(float[] t1, int t1Offset, float t2V0, float t2V1)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = t2V0 - t1[t1OffsetV0];
		t1[t1OffsetV1] = t2V1 - t1[t1OffsetV1];
		
		return t1;
	}
	
	public static float[] revSubN_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t2[t2Offset+0] - t1[t1Offset+0],
			t2[t2Offset+1] - t1[t1Offset+1]
		};
	}
	
	public static float[] revSubN_2fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			value - t1[t1Offset+0],
			value - t1[t1Offset+1]
		};
	}
	
	public static float[] revSubN_2fa(float[] t1, int t1Offset, float t2V0, float t2V1)
	{
		return new float[] {
			t2V0 - t1[t1Offset+0],
			t2V1 - t1[t1Offset+1]
		};
	}
	
	public static float[] revSubN_2fa(float t1V0, float t1V1, float[] t2, int t2Offset)
	{
		return new float[] {
			t2[t2Offset+0] - t1V0,
			t2[t2Offset+1] - t1V1
		};
	}
	
	public static float[] revSubT_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2[t2Offset+0] - t1[t1Offset+0];
		res[resOffset+1] = t2[t2Offset+1] - t1[t1Offset+1];
		
		return res;
	}
	
	public static float[] revSubT_2fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = value - t1[t1Offset+0];
		res[resOffset+1] = value - t1[t1Offset+1];
		
		return res;
	}
	
	public static float[] revSubT_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2V0 - t1[t1Offset+0];
		res[resOffset+1] = t2V1 - t1[t1Offset+1];
		
		return res;
	}
	
	public static float[] revSubT_2fa(float t1V0, float t1V1, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2[t2Offset+0] - t1V0;
		res[resOffset+1] = t2[t2Offset+1] - t1V1;
		
		return res;
	}
	
	public static float[] revSubT_2fa(float t1V0, float t1V1, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = value - t1V0;
		res[resOffset+1] = value - t1V1;
		
		return res;
	}
	
	public static float[] revSubT_2fa(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2V0 - t1V0;
		res[resOffset+1] = t2V1 - t1V1;
		
		return res;
	}
	
	public static float[] mul_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		t1[t1Offset+0] *= t2[t2Offset+0];
		t1[t1Offset+1] *= t2[t2Offset+1];
		
		return t1;
	}
	
	public static float[] mul_2fa(float[] t1, int t1Offset, float value)
	{
		t1[t1Offset+0] *= value;
		t1[t1Offset+1] *= value;
		
		return t1;
	}
	
	public static float[] mul_2fa(float[] t1, int t1Offset, float t2V0, float t2V1)
	{
		t1[t1Offset+0] *= t2V0;
		t1[t1Offset+1] *= t2V1;
		
		return t1;
	}
	
	public static float[] mulN_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t1[t1Offset+0] * t2[t2Offset+0],
			t1[t1Offset+1] * t2[t2Offset+1]
		};
	}
	
	public static float[] mulN_2fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			t1[t1Offset+0] * value,
			t1[t1Offset+1] * value
		};
	}
	
	public static float[] mulN_2fa(float[] t1, int t1Offset, float t2V0, float t2V1)
	{
		return new float[] {
			t1[t1Offset+0] * t2V0,
			t1[t1Offset+1] * t2V1
		};
	}
	
	public static float[] mulN_2fa(float t1V0, float t1V1, float[] t2, int t2Offset)
	{
		return new float[] {
			t1V0 * t2[t2Offset+0],
			t1V1 * t2[t2Offset+1]
		};
	}
	
	public static float[] mulT_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] * t2[t2Offset+0];
		res[resOffset+1] = t1[t1Offset+1] * t2[t2Offset+1];
		
		return res;
	}
	
	public static float[] mulT_2fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] * value;
		res[resOffset+1] = t1[t1Offset+1] * value;
		
		return res;
	}
	
	public static float[] mulT_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] * t2V0;
		res[resOffset+1] = t1[t1Offset+1] * t2V1;
		
		return res;
	}
	
	public static float[] mulT_2fa(float t1V0, float t1V1, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 * t2[t2Offset+0];
		res[resOffset+1] = t1V1 * t2[t2Offset+1];
		
		return res;
	}
	
	public static float[] mulT_2fa(float t1V0, float t1V1, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 * value;
		res[resOffset+1] = t1V1 * value;
		
		return res;
	}
	
	public static float[] mulT_2fa(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 * t2V0;
		res[resOffset+1] = t1V1 * t2V1;
		
		return res;
	}
	
	public static float[] div_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		t1[t1Offset+0] /= t2[t2Offset+0];
		t1[t1Offset+1] /= t2[t2Offset+1];
		
		return t1;
	}
	
	public static float[] div_2fa(float[] t1, int t1Offset, float value)
	{
		t1[t1Offset+0] /= value;
		t1[t1Offset+1] /= value;
		
		return t1;
	}
	
	public static float[] div_2fa(float[] t1, int t1Offset, float t2V0, float t2V1)
	{
		t1[t1Offset+0] /= t2V0;
		t1[t1Offset+1] /= t2V1;
		
		return t1;
	}
	
	public static float[] divN_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t1[t1Offset+0] / t2[t2Offset+0],
			t1[t1Offset+1] / t2[t2Offset+1]
		};
	}
	
	public static float[] divN_2fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			t1[t1Offset+0] / value,
			t1[t1Offset+1] / value
		};
	}
	
	public static float[] divN_2fa(float[] t1, int t1Offset, float t2V0, float t2V1)
	{
		return new float[] {
			t1[t1Offset+0] / t2V0,
			t1[t1Offset+1] / t2V1
		};
	}
	
	public static float[] divN_2fa(float t1V0, float t1V1, float[] t2, int t2Offset)
	{
		return new float[] {
			t1V0 / t2[t2Offset+0],
			t1V1 / t2[t2Offset+1]
		};
	}
	
	public static float[] divT_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] / t2[t2Offset+0];
		res[resOffset+1] = t1[t1Offset+1] / t2[t2Offset+1];
		
		return res;
	}
	
	public static float[] divT_2fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] / value;
		res[resOffset+1] = t1[t1Offset+1] / value;
		
		return res;
	}
	
	public static float[] divT_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] / t2V0;
		res[resOffset+1] = t1[t1Offset+1] / t2V1;
		
		return res;
	}
	
	public static float[] divT_2fa(float t1V0, float t1V1, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 / t2[t2Offset+0];
		res[resOffset+1] = t1V1 / t2[t2Offset+1];
		
		return res;
	}
	
	public static float[] divT_2fa(float t1V0, float t1V1, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 / value;
		res[resOffset+1] = t1V1 / value;
		
		return res;
	}
	
	public static float[] divT_2fa(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 / t2V0;
		res[resOffset+1] = t1V1 / t2V1;
		
		return res;
	}
	
	public static float[] revDiv_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = t2[t2Offset+0] / t1[t1OffsetV0];
		t1[t1OffsetV1] = t2[t2Offset+1] / t1[t1OffsetV1];
		
		return t1;
	}
	
	public static float[] revDiv_2fa(float[] t1, int t1Offset, float value)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = value / t1[t1OffsetV0];
		t1[t1OffsetV1] = value / t1[t1OffsetV1];
		
		return t1;
	}
	
	public static float[] revDiv_2fa(float[] t1, int t1Offset, float t2V0, float t2V1)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = t2V0 / t1[t1OffsetV0];
		t1[t1OffsetV1] = t2V1 / t1[t1OffsetV1];
		
		return t1;
	}
	
	public static float[] revDivN_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t2[t2Offset+0] / t1[t1Offset+0],
			t2[t2Offset+1] / t1[t1Offset+1]
		};
	}
	
	public static float[] revDivN_2fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			value / t1[t1Offset+0],
			value / t1[t1Offset+1]
		};
	}
	
	public static float[] revDivN_2fa(float[] t1, int t1Offset, float t2V0, float t2V1)
	{
		return new float[] {
			t2V0 / t1[t1Offset+0],
			t2V1 / t1[t1Offset+1]
		};
	}
	
	public static float[] revDivN_2fa(float t1V0, float t1V1, float[] t2, int t2Offset)
	{
		return new float[] {
			t2[t2Offset+0] / t1V0,
			t2[t2Offset+1] / t1V1
		};
	}
	
	public static float[] revDivT_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2[t2Offset+0] / t1[t1Offset+0];
		res[resOffset+1] = t2[t2Offset+1] / t1[t1Offset+1];
		
		return res;
	}
	
	public static float[] revDivT_2fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = value / t1[t1Offset+0];
		res[resOffset+1] = value / t1[t1Offset+1];
		
		return res;
	}
	
	public static float[] revDivT_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2V0 / t1[t1Offset+0];
		res[resOffset+1] = t2V1 / t1[t1Offset+1];
		
		return res;
	}
	
	public static float[] revDivT_2fa(float t1V0, float t1V1, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2[t2Offset+0] / t1V0;
		res[resOffset+1] = t2[t2Offset+1] / t1V1;
		
		return res;
	}
	
	public static float[] revDivT_2fa(float t1V0, float t1V1, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = value / t1V0;
		res[resOffset+1] = value / t1V1;
		
		return res;
	}
	
	public static float[] revDivT_2fa(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2V0 / t1V0;
		res[resOffset+1] = t2V1 / t1V1;
		
		return res;
	}
	
	public static float[] pow_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = MathUtils.pow(t1[t1OffsetV0], t2[t2Offset+0]);
		t1[t1OffsetV1] = MathUtils.pow(t1[t1OffsetV1], t2[t2Offset+1]);
		
		return t1;
	}
	
	public static float[] pow_2fa(float[] t1, int t1Offset, float value)
	{
		t1[t1Offset+0] = MathUtils.pow(t1[t1Offset+0], value);
		t1[t1Offset+1] = MathUtils.pow(t1[t1Offset+1], value);
		
		return t1;
	}
	
	public static float[] pow_2fa(float[] t1, int t1Offset, float t2V0, float t2V1)
	{
		t1[t1Offset+0] = MathUtils.pow(t1[t1Offset+0], t2V0);
		t1[t1Offset+1] = MathUtils.pow(t1[t1Offset+1], t2V1);
		
		return t1;
	}
	
	public static float[] powN_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			MathUtils.pow(t1[t1Offset+0], t2[t2Offset+0]),
			MathUtils.pow(t1[t1Offset+1], t2[t2Offset+1])
		};
	}
	
	public static float[] powN_2fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			MathUtils.pow(t1[t1Offset+0], value),
			MathUtils.pow(t1[t1Offset+1], value)
		};
	}
	
	public static float[] powN_2fa(float[] t1, int t1Offset, float t2V0, float t2V1)
	{
		return new float[] {
			MathUtils.pow(t1[t1Offset+0], t2V0),
			MathUtils.pow(t1[t1Offset+1], t2V1)
		};
	}
	
	public static float[] powN_2fa(float t1V0, float t1V1, float[] t2, int t2Offset)
	{
		return new float[] {
			MathUtils.pow(t1V0, t2[t2Offset+0]),
			MathUtils.pow(t1V1, t2[t2Offset+1])
		};
	}
	
	public static float[] powT_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1[t1Offset+0], t2[t2Offset+0]);
		res[resOffset+1] = MathUtils.pow(t1[t1Offset+1], t2[t2Offset+1]);
		
		return res;
	}
	
	public static float[] powT_2fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1[t1Offset+0], value);
		res[resOffset+1] = MathUtils.pow(t1[t1Offset+1], value);
		
		return res;
	}
	
	public static float[] powT_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1[t1Offset+0], t2V0);
		res[resOffset+1] = MathUtils.pow(t1[t1Offset+1], t2V1);
		
		return res;
	}
	
	public static float[] powT_2fa(float t1V0, float t1V1, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1V0, t2[t2Offset+0]);
		res[resOffset+1] = MathUtils.pow(t1V1, t2[t2Offset+1]);
		
		return res;
	}
	
	public static float[] powT_2fa(float t1V0, float t1V1, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1V0, value);
		res[resOffset+1] = MathUtils.pow(t1V1, value);
		
		return res;
	}
	
	public static float[] powT_2fa(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1V0, t2V0);
		res[resOffset+1] = MathUtils.pow(t1V1, t2V1);
		
		return res;
	}
	
	public static float[] revPow_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = MathUtils.pow(t2[t2Offset+0], t1[t1OffsetV0]);
		t1[t1OffsetV1] = MathUtils.pow(t2[t2Offset+1], t1[t1OffsetV1]);
		
		return t1;
	}
	
	public static float[] revPow_2fa(float[] t1, int t1Offset, float value)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = MathUtils.pow(value, t1[t1OffsetV0]);
		t1[t1OffsetV1] = MathUtils.pow(value, t1[t1OffsetV1]);
		
		return t1;
	}
	
	public static float[] revPow_2fa(float[] t1, int t1Offset, float t2V0, float t2V1)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = MathUtils.pow(t2V0, t1[t1OffsetV0]);
		t1[t1OffsetV1] = MathUtils.pow(t2V1, t1[t1OffsetV1]);
		
		return t1;
	}
	
	public static float[] revPowN_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			MathUtils.pow(t2[t2Offset+0], t1[t1Offset+0]),
			MathUtils.pow(t2[t2Offset+1], t1[t1Offset+1])
		};
	}
	
	public static float[] revPowN_2fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			MathUtils.pow(value, t1[t1Offset+0]),
			MathUtils.pow(value, t1[t1Offset+1])
		};
	}
	
	public static float[] revPowN_2fa(float[] t1, int t1Offset, float t2V0, float t2V1)
	{
		return new float[] {
			MathUtils.pow(t2V0, t1[t1Offset+0]),
			MathUtils.pow(t2V1, t1[t1Offset+1])
		};
	}
	
	public static float[] revPowN_2fa(float t1V0, float t1V1, float[] t2, int t2Offset)
	{
		return new float[] {
			MathUtils.pow(t2[t2Offset+0], t1V0),
			MathUtils.pow(t2[t2Offset+1], t1V1)
		};
	}
	
	public static float[] revPowT_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t2[t2Offset+0], t1[t1Offset+0]);
		res[resOffset+1] = MathUtils.pow(t2[t2Offset+1], t1[t1Offset+1]);
		
		return res;
	}
	
	public static float[] revPowT_2fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(value, t1[t1Offset+0]);
		res[resOffset+1] = MathUtils.pow(value, t1[t1Offset+1]);
		
		return res;
	}
	
	public static float[] revPowT_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t2V0, t1[t1Offset+0]);
		res[resOffset+1] = MathUtils.pow(t2V1, t1[t1Offset+1]);
		
		return res;
	}
	
	public static float[] revPowT_2fa(float t1V0, float t1V1, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t2[t2Offset+0], t1V0);
		res[resOffset+1] = MathUtils.pow(t2[t2Offset+1], t1V1);
		
		return res;
	}
	
	public static float[] revPowT_2fa(float t1V0, float t1V1, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(value, t1V0);
		res[resOffset+1] = MathUtils.pow(value, t1V1);
		
		return res;
	}
	
	public static float[] revPowT_2fa(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t2V0, t1V0);
		res[resOffset+1] = MathUtils.pow(t2V1, t1V1);
		
		return res;
	}
	
	public static float[] fma_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = Math.fma(t1[t1OffsetV0], t2[t2Offset+0], t3[t3Offset+0]);
		t1[t1OffsetV1] = Math.fma(t1[t1OffsetV1], t2[t2Offset+1], t3[t3Offset+1]);
		
		return t1;
	}
	
	public static float[] fma_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float t3V0, float t3V1)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = Math.fma(t1[t1OffsetV0], t2[t2Offset+0], t3V0);
		t1[t1OffsetV1] = Math.fma(t1[t1OffsetV1], t2[t2Offset+1], t3V1);
		
		return t1;
	}
	
	public static float[] fma_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, float[] t3, int t3Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = Math.fma(t1[t1OffsetV0], t2V0, t3[t3Offset+0]);
		t1[t1OffsetV1] = Math.fma(t1[t1OffsetV1], t2V1, t3[t3Offset+1]);
		
		return t1;
	}
	
	public static float[] fma_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t3V0, float t3V1)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = Math.fma(t1[t1OffsetV0], t2V0, t3V0);
		t1[t1OffsetV1] = Math.fma(t1[t1OffsetV1], t2V1, t3V1);
		
		return t1;
	}
	
	public static float[] fmaN_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1[t1Offset+0], t2[t2Offset+0], t3[t3Offset+0]),
			Math.fma(t1[t1Offset+1], t2[t2Offset+1], t3[t3Offset+1])
		};
	}
	
	public static float[] fmaN_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float t3V0, float t3V1)
	{
		return new float[] {
			Math.fma(t1[t1Offset+0], t2[t2Offset+0], t3V0),
			Math.fma(t1[t1Offset+1], t2[t2Offset+1], t3V1)
		};
	}
	
	public static float[] fmaN_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1[t1Offset+0], t2V0, t3[t3Offset+0]),
			Math.fma(t1[t1Offset+1], t2V1, t3[t3Offset+1])
		};
	}
	
	public static float[] fmaN_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t3V0, float t3V1)
	{
		return new float[] {
			Math.fma(t1[t1Offset+0], t2V0, t3V0),
			Math.fma(t1[t1Offset+1], t2V1, t3V1)
		};
	}
	
	public static float[] fmaN_2fa(float t1V0, float t1V1, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1V0, t2[t2Offset+0], t3[t3Offset+0]),
			Math.fma(t1V1, t2[t2Offset+1], t3[t3Offset+1])
		};
	}
	
	public static float[] fmaN_2fa(float t1V0, float t1V1, float[] t2, int t2Offset, float t3V0, float t3V1)
	{
		return new float[] {
			Math.fma(t1V0, t2[t2Offset+0], t3V0),
			Math.fma(t1V1, t2[t2Offset+1], t3V1)
		};
	}
	
	public static float[] fmaN_2fa(float t1V0, float t1V1, float t2V0, float t2V1, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1V0, t2V0, t3[t3Offset+0]),
			Math.fma(t1V1, t2V1, t3[t3Offset+1])
		};
	}
	
	public static float[] fmaT_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1[t1Offset+0], t2[t2Offset+0], t3[t3Offset+0]);
		res[resOffset+1] = Math.fma(t1[t1Offset+1], t2[t2Offset+1], t3[t3Offset+1]);
		
		return res;
	}
	
	public static float[] fmaT_2fa(float[] t1, int t1Offset,float[] t2, int t2Offset, float t3V0, float t3V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1[t1Offset+0], t2[t2Offset+0], t3V0);
		res[resOffset+1] = Math.fma(t1[t1Offset+1], t2[t2Offset+1], t3V1);
		
		return res;
	}
	
	public static float[] fmaT_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1[t1Offset+0], t2V0, t3[t3Offset+0]);
		res[resOffset+1] = Math.fma(t1[t1Offset+1], t2V1, t3[t3Offset+1]);
		
		return res;
	}
	
	public static float[] fmaT_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t3V0, float t3V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1[t1Offset+0], t2V0, t3V0);
		res[resOffset+1] = Math.fma(t1[t1Offset+1], t2V1, t3V1);
		
		return res;
	}
	
	public static float[] fmaT_2fa(float t1V0, float t1V1, float[] t2, int t2Offset, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1V0, t2[t2Offset+0], t3[t3Offset+0]);
		res[resOffset+1] = Math.fma(t1V1, t2[t2Offset+1], t3[t3Offset+1]);
		
		return res;
	}
	
	public static float[] fmaT_2fa(float t1V0, float t1V1, float[] t2, int t2Offset, float t3V0, float t3V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1V0, t2[t2Offset+0], t3V0);
		res[resOffset+1] = Math.fma(t1V1, t2[t2Offset+1], t3V1);
		
		return res;
	}
	
	public static float[] fmaT_2fa(float t1V0, float t1V1, float t2V0, float t2V1, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1V0, t2V0, t3[t3Offset+0]);
		res[resOffset+1] = Math.fma(t1V1, t2V1, t3[t3Offset+1]);
		
		return res;
	}
	
	public static float[] fmaT_2fa(float t1V0, float t1V1, float t2V0, float t2V1, float t3V0, float t3V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1V0, t2V0, t3V0);
		res[resOffset+1] = Math.fma(t1V1, t2V1, t3V1);
		
		return res;
	}
	
	public static float[] fam_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = Math.fma(t2[t2Offset+0], t3[t3Offset+0], t1[t1OffsetV0]);
		t1[t1OffsetV1] = Math.fma(t2[t2Offset+1], t3[t3Offset+1], t1[t1OffsetV1]);
		
		return t1;
	}
	
	public static float[] fam_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float t3V0, float t3V1)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = Math.fma(t2[t2Offset+0], t3V0, t1[t1OffsetV0]);
		t1[t1OffsetV1] = Math.fma(t2[t2Offset+1], t3V1, t1[t1OffsetV1]);
		
		return t1;
	}
	
	public static float[] fam_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, float[] t3, int t3Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = Math.fma(t2V0, t3[t3Offset+0], t1[t1OffsetV0]);
		t1[t1OffsetV1] = Math.fma(t2V1, t3[t3Offset+1], t1[t1OffsetV1]);
		
		return t1;
	}
	
	public static float[] fam_2fa(float[] t1, int t1Offset,float t2V0, float t2V1, float t3V0, float t3V1)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = Math.fma(t2V0, t3V0, t1[t1OffsetV0]);
		t1[t1OffsetV1] = Math.fma(t2V1, t3V1, t1[t1OffsetV1]);
		
		return t1;
	}
	
	public static float[] famN_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t2[t2Offset+0], t3[t3Offset+0], t1[t1Offset+0]),
			Math.fma(t2[t2Offset+1], t3[t3Offset+1], t1[t1Offset+1])
		};
	}
	
	public static float[] famN_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float t3V0, float t3V1)
	{
		return new float[] {
			Math.fma(t2[t2Offset+0], t3V0, t1[t1Offset+0]),
			Math.fma(t2[t2Offset+1], t3V1, t1[t1Offset+1])
		};
	}
	
	public static float[] famN_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1[t1Offset+0], t2V0, t3[t3Offset+0]),
			Math.fma(t1[t1Offset+1], t2V1, t3[t3Offset+1])
		};
	}
	
	public static float[] famN_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t3V0, float t3V1)
	{
		return new float[] {
			Math.fma(t2V0, t3V0, t1[t1Offset+0]),
			Math.fma(t2V1, t3V1, t1[t1Offset+1])
		};
	}
	
	public static float[] famN_2fa(float t1V0, float t1V1, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t2[t2Offset+0], t3[t3Offset+0], t1V0),
			Math.fma(t2[t2Offset+1], t3[t3Offset+1], t1V1)
		};
	}
	
	public static float[] famN_2fa(float t1V0, float t1V1, float[] t2, int t2Offset, float t3V0, float t3V1)
	{
		return new float[] {
			Math.fma(t2[t2Offset+0], t3V0, t1V0),
			Math.fma(t2[t2Offset+1], t3V1, t1V1)
		};
	}
	
	public static float[] famN_2fa(float t1V0, float t1V1, float t2V0, float t2V1, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1V0, t2V0, t3[t3Offset+0]),
			Math.fma(t1V1, t2V1, t3[t3Offset+1])
		};
	}
	
	public static float[] famT_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2[t2Offset+0], t3[t3Offset+0], t1[t1Offset+0]);
		res[resOffset+1] = Math.fma(t2[t2Offset+1], t3[t3Offset+1], t1[t1Offset+1]);
		
		return res;
	}
	
	public static float[] famT_2fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float t3V0, float t3V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2[t2Offset+0], t3V0, t1[t1Offset+0]);
		res[resOffset+1] = Math.fma(t2[t2Offset+1], t3V1, t1[t1Offset+1]);
		
		return res;
	}
	
	public static float[] famT_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2V0, t3[t3Offset+0], t1[t1Offset+0]);
		res[resOffset+1] = Math.fma(t2V1, t3[t3Offset+1], t1[t1Offset+1]);
		
		return res;
	}
	
	public static float[] famT_2fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t3V0, float t3V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2V0, t3V0, t1[t1Offset+0]);
		res[resOffset+1] = Math.fma(t2V1, t3V1, t1[t1Offset+1]);
		
		return res;
	}
	
	public static float[] famT_2fa(float t1V0, float t1V1, float[] t2, int t2Offset, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2[t2Offset+0], t3[t3Offset+0], t1V0);
		res[resOffset+1] = Math.fma(t2[t2Offset+1], t3[t3Offset+1], t1V1);
		
		return res;
	}
	
	public static float[] famT_2fa(float t1V0, float t1V1, float[] t2, int t2Offset, float t3V0, float t3V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2[t2Offset+0], t3V0, t1V0);
		res[resOffset+1] = Math.fma(t2[t2Offset+1], t3V1, t1V1);
		
		return res;
	}
	
	public static float[] famT_2fa(float t1V0, float t1V1, float t2V0, float t2V1, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2V0, t3[t3Offset+0], t1V0);
		res[resOffset+1] = Math.fma(t2V1, t3[t3Offset+1], t1V1);
		
		return res;
	}
	
	public static float[] famT_2fa(float t1V0, float t1V1, float t2V0, float t2V1, float t3V0, float t3V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2V0, t3V0, t1V0);
		res[resOffset+1] = Math.fma(t2V1, t3V1, t1V1);
		
		return res;
	}
	
	public static float[] sqrt_2fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = MathUtils.sqrt(t1[t1OffsetV0]);
		t1[t1OffsetV1] = MathUtils.sqrt(t1[t1OffsetV1]);
		
		return t1;
	}
	
	public static float[] sqrtN_2fa(float[] t1, int t1Offset)
	{
		return new float[] {
			MathUtils.sqrt(t1[t1Offset+0]),
			MathUtils.sqrt(t1[t1Offset+1])
		};
	}
	
	public static float[] sqrtT_2fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.sqrt(t1[t1Offset+0]);
		res[resOffset+1] = MathUtils.sqrt(t1[t1Offset+1]);
		
		return res;
	}
	
	public static float[] sqrtT_2fa(float t1V0, float t1V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.sqrt(t1V0);
		res[resOffset+1] = MathUtils.sqrt(t1V1);
		
		return res;
	}
	
	public static float[] cbrt_2fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = MathUtils.cbrt(t1[t1OffsetV0]);
		t1[t1OffsetV1] = MathUtils.cbrt(t1[t1OffsetV1]);
		
		return t1;
	}
	
	public static float[] cbrtN_2fa(float[] t1, int t1Offset)
	{
		return new float[] {
			MathUtils.cbrt(t1[t1Offset+0]),
			MathUtils.cbrt(t1[t1Offset+1])
		};
	}
	
	public static float[] cbrtT_2fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.cbrt(t1[t1Offset+0]);
		res[resOffset+1] = MathUtils.cbrt(t1[t1Offset+1]);
		
		return res;
	}
	
	public static float[] cbrtT_2fa(float t1V0, float t1V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.cbrt(t1V0);
		res[resOffset+1] = MathUtils.cbrt(t1V1);
		
		return res;
	}
	
	public static float[] abs_2fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = Math.abs(t1[t1OffsetV0]);
		t1[t1OffsetV1] = Math.abs(t1[t1OffsetV1]);
		
		return t1;
	}
	
	public static float[] absN_2fa(float[] t1, int t1Offset)
	{
		return new float[] {
			Math.abs(t1[t1Offset+0]),
			Math.abs(t1[t1Offset+1])
		};
	}
	
	public static float[] absT_2fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.abs(t1[t1Offset+0]);
		res[resOffset+1] = Math.abs(t1[t1Offset+1]);
		
		return res;
	}
	
	public static float[] absT_2fa(float t1V0, float t1V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.abs(t1V0);
		res[resOffset+1] = Math.abs(t1V1);
		
		return res;
	}
	
	public static float[] reciprocal_2fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = 1.0f / t1[t1OffsetV0];
		t1[t1OffsetV1] = 1.0f / t1[t1OffsetV1];
		
		return t1;
	}
	
	public static float[] reciprocalN_2fa(float[] t1, int t1Offset)
	{
		return new float[] {
			1.0f / t1[t1Offset+0],
			1.0f / t1[t1Offset+1]
		};
	}
	
	public static float[] reciprocalT_2fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = 1.0f / t1[t1Offset+0];
		res[resOffset+1] = 1.0f / t1[t1Offset+1];
		
		return res;
	}
	
	public static float[] reciprocalT_2fa(float t1V0, float t1V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = 1.0f / t1V0;
		res[resOffset+1] = 1.0f / t1V1;
		
		return res;
	}
	
	public static float[] negate_2fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] = -t1[t1OffsetV0];
		t1[t1OffsetV1] = -t1[t1OffsetV1];
		
		return t1;
	}
	
	public static float[] negateN_2fa(float[] t1, int t1Offset)
	{
		return new float[] {
			-t1[t1Offset+0],
			-t1[t1Offset+1]
		};
	}
	
	public static float[] negateT_2fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = -t1[t1Offset+0];
		res[resOffset+1] = -t1[t1Offset+1];
		
		return res;
	}
	
	public static float[] negateT_2fa(float t1V0, float t1V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = -t1V0;
		res[resOffset+1] = -t1V1;
		
		return res;
	}
	
	public static float[] squared_2fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		
		t1[t1OffsetV0] *= t1[t1OffsetV0];
		t1[t1OffsetV1] *= t1[t1OffsetV1];
		
		return t1;
	}
	
	public static float[] squaredN_2fa(float[] t1, int t1Offset)
	{
		float t1V0 = t1[t1Offset+0];
		float t1V1 = t1[t1Offset+1];
		
		return new float[] {
			t1V0 * t1V0,
			t1V1 * t1V1
		};
	}
	
	public static float[] squaredT_2fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		float t1V0 = t1[t1Offset+0];
		float t1V1 = t1[t1Offset+1];
		
		res[resOffset+0] = t1V0 * t1V0;
		res[resOffset+1] = t1V1 * t1V1;
		
		return res;
	}
	
	public static float[] squaredT_2fa(float t1V0, float t1V1, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 * t1V0;
		res[resOffset+1] = t1V1 * t1V1;
		
		return res;
	}
}
