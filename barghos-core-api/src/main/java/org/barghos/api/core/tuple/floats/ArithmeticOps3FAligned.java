package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.math.MathUtils;

public final class ArithmeticOps3FAligned
{
	private ArithmeticOps3FAligned() { }
	
	public static float[] tup_add_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		t1[t1Offset+0] += t2[t2Offset+0];
		t1[t1Offset+1] += t2[t2Offset+1];
		t1[t1Offset+2] += t2[t2Offset+2];
		
		return t1;
	}
	
	public static float[] tup_add_3fa(float[] t1, int t1Offset, float value)
	{
		t1[t1Offset+0] += value;
		t1[t1Offset+1] += value;
		t1[t1Offset+2] += value;
		
		return t1;
	}
	
	public static float[] tup_add_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2)
	{
		t1[t1Offset+0] += t2V0;
		t1[t1Offset+1] += t2V1;
		t1[t1Offset+2] += t2V2;
		
		return t1;
	}
	
	public static float[] tup_addN_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t1[t1Offset+0] + t2[t2Offset+0],
			t1[t1Offset+1] + t2[t2Offset+1],
			t1[t1Offset+2] + t2[t2Offset+2]
		};
	}
	
	public static float[] tup_addN_3fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			t1[t1Offset+0] + value,
			t1[t1Offset+1] + value,
			t1[t1Offset+2] + value
		};
	}
	
	public static float[] tup_addN_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t1[t1Offset+0] + t2V0,
			t1[t1Offset+1] + t2V1,
			t1[t1Offset+2] + t2V2
		};
	}
	
	public static float[] tup_addN_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset)
	{
		return new float[] {
			t1V0 + t2[t2Offset+0],
			t1V1 + t2[t2Offset+1],
			t1V2 + t2[t2Offset+2]
		};
	}
	
	public static float[] tup_addT_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] + t2[t2Offset+0];
		res[resOffset+1] = t1[t1Offset+1] + t2[t2Offset+1];
		res[resOffset+2] = t1[t1Offset+2] + t2[t2Offset+2];
		
		return res;
	}
	
	public static float[] tup_addT_3fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] + value;
		res[resOffset+1] = t1[t1Offset+1] + value;
		res[resOffset+2] = t1[t1Offset+2] + value;
		
		return res;
	}
	
	public static float[] tup_addT_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] + t2V0;
		res[resOffset+1] = t1[t1Offset+1] + t2V1;
		res[resOffset+2] = t1[t1Offset+2] + t2V2;
		
		return res;
	}
	
	public static float[] tup_addT_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 + t2[t2Offset+0];
		res[resOffset+1] = t1V1 + t2[t2Offset+1];
		res[resOffset+2] = t1V2 + t2[t2Offset+2];
		
		return res;
	}
	
	public static float[] tup_addT_3fa(float t1V0, float t1V1, float t1V2, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 + value;
		res[resOffset+1] = t1V1 + value;
		res[resOffset+2] = t1V2 + value;
		
		return res;
	}
	
	public static float[] tup_addT_3fa(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 + t2V0;
		res[resOffset+1] = t1V1 + t2V1;
		res[resOffset+2] = t1V2 + t2V2;
		
		return res;
	}
	
	public static float[] tup_sub_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		t1[t1Offset+0] -= t2[t2Offset+0];
		t1[t1Offset+1] -= t2[t2Offset+1];
		t1[t1Offset+2] -= t2[t2Offset+2];
		
		return t1;
	}
	
	public static float[] tup_sub_3fa(float[] t1, int t1Offset, float value)
	{
		t1[t1Offset+0] -= value;
		t1[t1Offset+1] -= value;
		t1[t1Offset+2] -= value;
		
		return t1;
	}
	
	public static float[] tup_sub_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2)
	{
		t1[t1Offset+0] -= t2V0;
		t1[t1Offset+1] -= t2V1;
		t1[t1Offset+2] -= t2V2;
		
		return t1;
	}
	
	public static float[] tup_subN_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t1[t1Offset+0] - t2[t2Offset+0],
			t1[t1Offset+1] - t2[t2Offset+1],
			t1[t1Offset+2] - t2[t2Offset+2]
		};
	}
	
	public static float[] tup_subN_3fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			t1[t1Offset+0] - value,
			t1[t1Offset+1] - value,
			t1[t1Offset+2] - value
		};
	}
	
	public static float[] tup_subN_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t1[t1Offset+0] - t2V0,
			t1[t1Offset+1] - t2V1,
			t1[t1Offset+2] - t2V2
		};
	}
	
	public static float[] tup_subN_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset)
	{
		return new float[] {
			t1V0 - t2[t2Offset+0],
			t1V1 - t2[t2Offset+1],
			t1V2 - t2[t2Offset+2]
		};
	}
	
	public static float[] tup_subT_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] - t2[t2Offset+0];
		res[resOffset+1] = t1[t1Offset+1] - t2[t2Offset+1];
		res[resOffset+2] = t1[t1Offset+2] - t2[t2Offset+2];
		
		return res;
	}
	
	public static float[] tup_subT_3fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] - value;
		res[resOffset+1] = t1[t1Offset+1] - value;
		res[resOffset+2] = t1[t1Offset+2] - value;
		
		return res;
	}
	
	public static float[] tup_subT_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] - t2V0;
		res[resOffset+1] = t1[t1Offset+1] - t2V1;
		res[resOffset+2] = t1[t1Offset+2] - t2V2;
		
		return res;
	}
	
	public static float[] tup_subT_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 - t2[t2Offset+0];
		res[resOffset+1] = t1V1 - t2[t2Offset+1];
		res[resOffset+2] = t1V2 - t2[t2Offset+2];
		
		return res;
	}
	
	public static float[] tup_subT_3fa(float t1V0, float t1V1, float t1V2, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 - value;
		res[resOffset+1] = t1V1 - value;
		res[resOffset+2] = t1V2 - value;
		
		return res;
	}
	
	public static float[] tup_subT_3fa(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 - t2V0;
		res[resOffset+1] = t1V1 - t2V1;
		res[resOffset+2] = t1V2 - t2V2;
		
		return res;
	}
	
	public static float[] tup_revSub_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = t2[t2Offset+0] - t1[t1OffsetV0];
		t1[t1OffsetV1] = t2[t2Offset+1] - t1[t1OffsetV1];
		t1[t1OffsetV2] = t2[t2Offset+2] - t1[t1OffsetV2];
		
		return t1;
	}
	
	public static float[] tup_revSub_3fa(float[] t1, int t1Offset, float value)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = value - t1[t1OffsetV0];
		t1[t1OffsetV1] = value - t1[t1OffsetV1];
		t1[t1OffsetV2] = value - t1[t1OffsetV2];
		
		return t1;
	}
	
	public static float[] tup_revSub_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = t2V0 - t1[t1OffsetV0];
		t1[t1OffsetV1] = t2V1 - t1[t1OffsetV1];
		t1[t1OffsetV2] = t2V2 - t1[t1OffsetV2];
		
		return t1;
	}
	
	public static float[] tup_revSubN_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t2[t2Offset+0] - t1[t1Offset+0],
			t2[t2Offset+1] - t1[t1Offset+1],
			t2[t2Offset+2] - t1[t1Offset+2]
		};
	}
	
	public static float[] tup_revSubN_3fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			value - t1[t1Offset+0],
			value - t1[t1Offset+1],
			value - t1[t1Offset+2]
		};
	}
	
	public static float[] tup_revSubN_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t2V0 - t1[t1Offset+0],
			t2V1 - t1[t1Offset+1],
			t2V2 - t1[t1Offset+2]
		};
	}
	
	public static float[] tup_revSubN_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset)
	{
		return new float[] {
			t2[t2Offset+0] - t1V0,
			t2[t2Offset+1] - t1V1,
			t2[t2Offset+2] - t1V2
		};
	}
	
	public static float[] tup_revSubT_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2[t2Offset+0] - t1[t1Offset+0];
		res[resOffset+1] = t2[t2Offset+1] - t1[t1Offset+1];
		res[resOffset+2] = t2[t2Offset+2] - t1[t1Offset+2];
		
		return res;
	}
	
	public static float[] tup_revSubT_3fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = value - t1[t1Offset+0];
		res[resOffset+1] = value - t1[t1Offset+1];
		res[resOffset+2] = value - t1[t1Offset+2];
		
		return res;
	}
	
	public static float[] tup_revSubT_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2V0 - t1[t1Offset+0];
		res[resOffset+1] = t2V1 - t1[t1Offset+1];
		res[resOffset+2] = t2V2 - t1[t1Offset+2];
		
		return res;
	}
	
	public static float[] tup_revSubT_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2[t2Offset+0] - t1V0;
		res[resOffset+1] = t2[t2Offset+1] - t1V1;
		res[resOffset+2] = t2[t2Offset+2] - t1V2;
		
		return res;
	}
	
	public static float[] tup_revSubT_3fa(float t1V0, float t1V1, float t1V2, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = value - t1V0;
		res[resOffset+1] = value - t1V1;
		res[resOffset+2] = value - t1V2;
		
		return res;
	}
	
	public static float[] tup_revSubT_3fa(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2V0 - t1V0;
		res[resOffset+1] = t2V1 - t1V1;
		res[resOffset+2] = t2V2 - t1V2;
		
		return res;
	}
	
	public static float[] tup_mul_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		t1[t1Offset+0] *= t2[t2Offset+0];
		t1[t1Offset+1] *= t2[t2Offset+1];
		t1[t1Offset+2] *= t2[t2Offset+2];
		
		return t1;
	}
	
	public static float[] tup_mul_3fa(float[] t1, int t1Offset, float value)
	{
		t1[t1Offset+0] *= value;
		t1[t1Offset+1] *= value;
		t1[t1Offset+2] *= value;
		
		return t1;
	}
	
	public static float[] tup_mul_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2)
	{
		t1[t1Offset+0] *= t2V0;
		t1[t1Offset+1] *= t2V1;
		t1[t1Offset+2] *= t2V2;
		
		return t1;
	}
	
	public static float[] tup_mulN_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t1[t1Offset+0] * t2[t2Offset+0],
			t1[t1Offset+1] * t2[t2Offset+1],
			t1[t1Offset+2] * t2[t2Offset+2]
		};
	}
	
	public static float[] tup_mulN_3fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			t1[t1Offset+0] * value,
			t1[t1Offset+1] * value,
			t1[t1Offset+2] * value
		};
	}
	
	public static float[] tup_mulN_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t1[t1Offset+0] * t2V0,
			t1[t1Offset+1] * t2V1,
			t1[t1Offset+2] * t2V2
		};
	}
	
	public static float[] tup_mulN_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset)
	{
		return new float[] {
			t1V0 * t2[t2Offset+0],
			t1V1 * t2[t2Offset+1],
			t1V2 * t2[t2Offset+2]
		};
	}
	
	public static float[] tup_mulT_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] * t2[t2Offset+0];
		res[resOffset+1] = t1[t1Offset+1] * t2[t2Offset+1];
		res[resOffset+2] = t1[t1Offset+2] * t2[t2Offset+2];
		
		return res;
	}
	
	public static float[] tup_mulT_3fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] * value;
		res[resOffset+1] = t1[t1Offset+1] * value;
		res[resOffset+2] = t1[t1Offset+2] * value;
		
		return res;
	}
	
	public static float[] tup_mulT_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] * t2V0;
		res[resOffset+1] = t1[t1Offset+1] * t2V1;
		res[resOffset+2] = t1[t1Offset+2] * t2V2;
		
		return res;
	}
	
	public static float[] tup_mulT_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 * t2[t2Offset+0];
		res[resOffset+1] = t1V1 * t2[t2Offset+1];
		res[resOffset+2] = t1V2 * t2[t2Offset+2];
		
		return res;
	}
	
	public static float[] tup_mulT_3fa(float t1V0, float t1V1, float t1V2, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 * value;
		res[resOffset+1] = t1V1 * value;
		res[resOffset+2] = t1V2 * value;
		
		return res;
	}
	
	public static float[] tup_mulT_3fa(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 * t2V0;
		res[resOffset+1] = t1V1 * t2V1;
		res[resOffset+2] = t1V2 * t2V2;
		
		return res;
	}
	
	public static float[] tup_div_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		t1[t1Offset+0] /= t2[t2Offset+0];
		t1[t1Offset+1] /= t2[t2Offset+1];
		t1[t1Offset+2] /= t2[t2Offset+2];
		
		return t1;
	}
	
	public static float[] tup_div_3fa(float[] t1, int t1Offset, float value)
	{
		t1[t1Offset+0] /= value;
		t1[t1Offset+1] /= value;
		t1[t1Offset+2] /= value;
		
		return t1;
	}
	
	public static float[] tup_div_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2)
	{
		t1[t1Offset+0] /= t2V0;
		t1[t1Offset+1] /= t2V1;
		t1[t1Offset+2] /= t2V2;
		
		return t1;
	}
	
	public static float[] tup_divN_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t1[t1Offset+0] / t2[t2Offset+0],
			t1[t1Offset+1] / t2[t2Offset+1],
			t1[t1Offset+2] / t2[t2Offset+2]
		};
	}
	
	public static float[] tup_divN_3fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			t1[t1Offset+0] / value,
			t1[t1Offset+1] / value,
			t1[t1Offset+2] / value
		};
	}
	
	public static float[] tup_divN_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t1[t1Offset+0] / t2V0,
			t1[t1Offset+1] / t2V1,
			t1[t1Offset+2] / t2V2
		};
	}
	
	public static float[] tup_divN_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset)
	{
		return new float[] {
			t1V0 / t2[t2Offset+0],
			t1V1 / t2[t2Offset+1],
			t1V2 / t2[t2Offset+2]
		};
	}
	
	public static float[] tup_divT_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] / t2[t2Offset+0];
		res[resOffset+1] = t1[t1Offset+1] / t2[t2Offset+1];
		res[resOffset+2] = t1[t1Offset+2] / t2[t2Offset+2];
		
		return res;
	}
	
	public static float[] tup_divT_3fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] / value;
		res[resOffset+1] = t1[t1Offset+1] / value;
		res[resOffset+2] = t1[t1Offset+2] / value;
		
		return res;
	}
	
	public static float[] tup_divT_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] / t2V0;
		res[resOffset+1] = t1[t1Offset+1] / t2V1;
		res[resOffset+2] = t1[t1Offset+2] / t2V2;
		
		return res;
	}
	
	public static float[] tup_divT_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 / t2[t2Offset+0];
		res[resOffset+1] = t1V1 / t2[t2Offset+1];
		res[resOffset+2] = t1V2 / t2[t2Offset+2];
		
		return res;
	}
	
	public static float[] tup_divT_3fa(float t1V0, float t1V1, float t1V2, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 / value;
		res[resOffset+1] = t1V1 / value;
		res[resOffset+2] = t1V2 / value;
		
		return res;
	}
	
	public static float[] tup_divT_3fa(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 / t2V0;
		res[resOffset+1] = t1V1 / t2V1;
		res[resOffset+2] = t1V2 / t2V2;
		
		return res;
	}
	
	public static float[] tup_revDiv_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = t2[t2Offset+0] / t1[t1OffsetV0];
		t1[t1OffsetV1] = t2[t2Offset+1] / t1[t1OffsetV1];
		t1[t1OffsetV2] = t2[t2Offset+2] / t1[t1OffsetV2];
		
		return t1;
	}
	
	public static float[] tup_revDiv_3fa(float[] t1, int t1Offset, float value)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = value / t1[t1OffsetV0];
		t1[t1OffsetV1] = value / t1[t1OffsetV1];
		t1[t1OffsetV2] = value / t1[t1OffsetV2];
		
		return t1;
	}
	
	public static float[] tup_revDiv_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = t2V0 / t1[t1OffsetV0];
		t1[t1OffsetV1] = t2V1 / t1[t1OffsetV1];
		t1[t1OffsetV2] = t2V2 / t1[t1OffsetV2];
		
		return t1;
	}
	
	public static float[] tup_revDivN_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t2[t2Offset+0] / t1[t1Offset+0],
			t2[t2Offset+1] / t1[t1Offset+1],
			t2[t2Offset+2] / t1[t1Offset+2]
		};
	}
	
	public static float[] tup_revDivN_3fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			value / t1[t1Offset+0],
			value / t1[t1Offset+1],
			value / t1[t1Offset+2]
		};
	}
	
	public static float[] tup_revDivN_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			t2V0 / t1[t1Offset+0],
			t2V1 / t1[t1Offset+1],
			t2V2 / t1[t1Offset+2]
		};
	}
	
	public static float[] tup_revDivN_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset)
	{
		return new float[] {
			t2[t2Offset+0] / t1V0,
			t2[t2Offset+1] / t1V1,
			t2[t2Offset+2] / t1V2
		};
	}
	
	public static float[] tup_revDivT_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2[t2Offset+0] / t1[t1Offset+0];
		res[resOffset+1] = t2[t2Offset+1] / t1[t1Offset+1];
		res[resOffset+2] = t2[t2Offset+2] / t1[t1Offset+2];
		
		return res;
	}
	
	public static float[] tup_revDivT_3fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = value / t1[t1Offset+0];
		res[resOffset+1] = value / t1[t1Offset+1];
		res[resOffset+2] = value / t1[t1Offset+2];
		
		return res;
	}
	
	public static float[] tup_revDivT_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2V0 / t1[t1Offset+0];
		res[resOffset+1] = t2V1 / t1[t1Offset+1];
		res[resOffset+2] = t2V2 / t1[t1Offset+2];
		
		return res;
	}
	
	public static float[] tup_revDivT_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2[t2Offset+0] / t1V0;
		res[resOffset+1] = t2[t2Offset+1] / t1V1;
		res[resOffset+2] = t2[t2Offset+2] / t1V2;
		
		return res;
	}
	
	public static float[] tup_revDivT_3fa(float t1V0, float t1V1, float t1V2, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = value / t1V0;
		res[resOffset+1] = value / t1V1;
		res[resOffset+2] = value / t1V2;
		
		return res;
	}
	
	public static float[] tup_revDivT_3fa(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2V0 / t1V0;
		res[resOffset+1] = t2V1 / t1V1;
		res[resOffset+2] = t2V2 / t1V2;
		
		return res;
	}
	
	public static float[] tup_pow_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = MathUtils.pow(t1[t1OffsetV0], t2[t2Offset+0]);
		t1[t1OffsetV1] = MathUtils.pow(t1[t1OffsetV1], t2[t2Offset+1]);
		t1[t1OffsetV2] = MathUtils.pow(t1[t1OffsetV2], t2[t2Offset+2]);
		
		return t1;
	}
	
	public static float[] tup_pow_3fa(float[] t1, int t1Offset, float value)
	{
		t1[t1Offset+0] = MathUtils.pow(t1[t1Offset+0], value);
		t1[t1Offset+1] = MathUtils.pow(t1[t1Offset+1], value);
		t1[t1Offset+2] = MathUtils.pow(t1[t1Offset+2], value);
		
		return t1;
	}
	
	public static float[] tup_pow_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2)
	{
		t1[t1Offset+0] = MathUtils.pow(t1[t1Offset+0], t2V0);
		t1[t1Offset+1] = MathUtils.pow(t1[t1Offset+1], t2V1);
		t1[t1Offset+2] = MathUtils.pow(t1[t1Offset+2], t2V2);
		
		return t1;
	}
	
	public static float[] tup_powN_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			MathUtils.pow(t1[t1Offset+0], t2[t2Offset+0]),
			MathUtils.pow(t1[t1Offset+1], t2[t2Offset+1]),
			MathUtils.pow(t1[t1Offset+2], t2[t2Offset+2])
		};
	}
	
	public static float[] tup_powN_3fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			MathUtils.pow(t1[t1Offset+0], value),
			MathUtils.pow(t1[t1Offset+1], value),
			MathUtils.pow(t1[t1Offset+2], value)
		};
	}
	
	public static float[] tup_powN_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			MathUtils.pow(t1[t1Offset+0], t2V0),
			MathUtils.pow(t1[t1Offset+1], t2V1),
			MathUtils.pow(t1[t1Offset+2], t2V2)
		};
	}
	
	public static float[] tup_powN_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset)
	{
		return new float[] {
			MathUtils.pow(t1V0, t2[t2Offset+0]),
			MathUtils.pow(t1V1, t2[t2Offset+1]),
			MathUtils.pow(t1V2, t2[t2Offset+2])
		};
	}
	
	public static float[] tup_powT_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1[t1Offset+0], t2[t2Offset+0]);
		res[resOffset+1] = MathUtils.pow(t1[t1Offset+1], t2[t2Offset+1]);
		res[resOffset+2] = MathUtils.pow(t1[t1Offset+2], t2[t2Offset+2]);
		
		return res;
	}
	
	public static float[] tup_powT_3fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1[t1Offset+0], value);
		res[resOffset+1] = MathUtils.pow(t1[t1Offset+1], value);
		res[resOffset+2] = MathUtils.pow(t1[t1Offset+2], value);
		
		return res;
	}
	
	public static float[] tup_powT_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1[t1Offset+0], t2V0);
		res[resOffset+1] = MathUtils.pow(t1[t1Offset+1], t2V1);
		res[resOffset+2] = MathUtils.pow(t1[t1Offset+2], t2V2);
		
		return res;
	}
	
	public static float[] tup_powT_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1V0, t2[t2Offset+0]);
		res[resOffset+1] = MathUtils.pow(t1V1, t2[t2Offset+1]);
		res[resOffset+2] = MathUtils.pow(t1V2, t2[t2Offset+2]);
		
		return res;
	}
	
	public static float[] tup_powT_3fa(float t1V0, float t1V1, float t1V2, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1V0, value);
		res[resOffset+1] = MathUtils.pow(t1V1, value);
		res[resOffset+2] = MathUtils.pow(t1V2, value);
		
		return res;
	}
	
	public static float[] tup_powT_3fa(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1V0, t2V0);
		res[resOffset+1] = MathUtils.pow(t1V1, t2V1);
		res[resOffset+2] = MathUtils.pow(t1V2, t2V2);
		
		return res;
	}
	
	public static float[] tup_revPow_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = MathUtils.pow(t2[t2Offset+0], t1[t1OffsetV0]);
		t1[t1OffsetV1] = MathUtils.pow(t2[t2Offset+1], t1[t1OffsetV1]);
		t1[t1OffsetV2] = MathUtils.pow(t2[t2Offset+2], t1[t1OffsetV2]);
		
		return t1;
	}
	
	public static float[] tup_revPow_3fa(float[] t1, int t1Offset, float value)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = MathUtils.pow(value, t1[t1OffsetV0]);
		t1[t1OffsetV1] = MathUtils.pow(value, t1[t1OffsetV1]);
		t1[t1OffsetV2] = MathUtils.pow(value, t1[t1OffsetV2]);
		
		return t1;
	}
	
	public static float[] tup_revPow_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = MathUtils.pow(t2V0, t1[t1OffsetV0]);
		t1[t1OffsetV1] = MathUtils.pow(t2V1, t1[t1OffsetV1]);
		t1[t1OffsetV2] = MathUtils.pow(t2V2, t1[t1OffsetV2]);
		
		return t1;
	}
	
	public static float[] tup_revPowN_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			MathUtils.pow(t2[t2Offset+0], t1[t1Offset+0]),
			MathUtils.pow(t2[t2Offset+1], t1[t1Offset+1]),
			MathUtils.pow(t2[t2Offset+2], t1[t1Offset+2])
		};
	}
	
	public static float[] tup_revPowN_3fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			MathUtils.pow(value, t1[t1Offset+0]),
			MathUtils.pow(value, t1[t1Offset+1]),
			MathUtils.pow(value, t1[t1Offset+2])
		};
	}
	
	public static float[] tup_revPowN_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2)
	{
		return new float[] {
			MathUtils.pow(t2V0, t1[t1Offset+0]),
			MathUtils.pow(t2V1, t1[t1Offset+1]),
			MathUtils.pow(t2V2, t1[t1Offset+2])
		};
	}
	
	public static float[] tup_revPowN_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset)
	{
		return new float[] {
			MathUtils.pow(t2[t2Offset+0], t1V0),
			MathUtils.pow(t2[t2Offset+1], t1V1),
			MathUtils.pow(t2[t2Offset+2], t1V2)
		};
	}
	
	public static float[] tup_revPowT_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t2[t2Offset+0], t1[t1Offset+0]);
		res[resOffset+1] = MathUtils.pow(t2[t2Offset+1], t1[t1Offset+1]);
		res[resOffset+2] = MathUtils.pow(t2[t2Offset+2], t1[t1Offset+2]);
		
		return res;
	}
	
	public static float[] tup_revPowT_3fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(value, t1[t1Offset+0]);
		res[resOffset+1] = MathUtils.pow(value, t1[t1Offset+1]);
		res[resOffset+2] = MathUtils.pow(value, t1[t1Offset+2]);
		
		return res;
	}
	
	public static float[] tup_revPowT_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t2V0, t1[t1Offset+0]);
		res[resOffset+1] = MathUtils.pow(t2V1, t1[t1Offset+1]);
		res[resOffset+2] = MathUtils.pow(t2V2, t1[t1Offset+2]);
		
		return res;
	}
	
	public static float[] tup_revPowT_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t2[t2Offset+0], t1V0);
		res[resOffset+1] = MathUtils.pow(t2[t2Offset+1], t1V1);
		res[resOffset+2] = MathUtils.pow(t2[t2Offset+2], t1V2);
		
		return res;
	}
	
	public static float[] tup_revPowT_3fa(float t1V0, float t1V1, float t1V2, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(value, t1V0);
		res[resOffset+1] = MathUtils.pow(value, t1V1);
		res[resOffset+2] = MathUtils.pow(value, t1V2);
		
		return res;
	}
	
	public static float[] tup_revPowT_3fa(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t2V0, t1V0);
		res[resOffset+1] = MathUtils.pow(t2V1, t1V1);
		res[resOffset+2] = MathUtils.pow(t2V2, t1V2);
		
		return res;
	}
	
	public static float[] tup_fma_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = Math.fma(t1[t1OffsetV0], t2[t2Offset+0], t3[t3Offset+0]);
		t1[t1OffsetV1] = Math.fma(t1[t1OffsetV1], t2[t2Offset+1], t3[t3Offset+1]);
		t1[t1OffsetV2] = Math.fma(t1[t1OffsetV2], t2[t2Offset+2], t3[t3Offset+2]);
		
		return t1;
	}
	
	public static float[] tup_fma_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = Math.fma(t1[t1OffsetV0], t2[t2Offset+0], t3V0);
		t1[t1OffsetV1] = Math.fma(t1[t1OffsetV1], t2[t2Offset+1], t3V1);
		t1[t1OffsetV2] = Math.fma(t1[t1OffsetV2], t2[t2Offset+2], t3V2);
		
		return t1;
	}
	
	public static float[] tup_fma_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float[] t3, int t3Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = Math.fma(t1[t1OffsetV0], t2V0, t3[t3Offset+0]);
		t1[t1OffsetV1] = Math.fma(t1[t1OffsetV1], t2V1, t3[t3Offset+1]);
		t1[t1OffsetV2] = Math.fma(t1[t1OffsetV2], t2V2, t3[t3Offset+2]);
		
		return t1;
	}
	
	public static float[] tup_fma_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = Math.fma(t1[t1OffsetV0], t2V0, t3V0);
		t1[t1OffsetV1] = Math.fma(t1[t1OffsetV1], t2V1, t3V1);
		t1[t1OffsetV2] = Math.fma(t1[t1OffsetV2], t2V2, t3V2);
		
		return t1;
	}
	
	public static float[] tup_fmaN_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1[t1Offset+0], t2[t2Offset+0], t3[t3Offset+0]),
			Math.fma(t1[t1Offset+1], t2[t2Offset+1], t3[t3Offset+1]),
			Math.fma(t1[t1Offset+2], t2[t2Offset+2], t3[t3Offset+2])
		};
	}
	
	public static float[] tup_fmaN_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2)
	{
		return new float[] {
			Math.fma(t1[t1Offset+0], t2[t2Offset+0], t3V0),
			Math.fma(t1[t1Offset+1], t2[t2Offset+1], t3V1),
			Math.fma(t1[t1Offset+2], t2[t2Offset+2], t3V2)
		};
	}
	
	public static float[] tup_fmaN_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1[t1Offset+0], t2V0, t3[t3Offset+0]),
			Math.fma(t1[t1Offset+1], t2V1, t3[t3Offset+1]),
			Math.fma(t1[t1Offset+2], t2V2, t3[t3Offset+2])
		};
	}
	
	public static float[] tup_fmaN_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2)
	{
		return new float[] {
			Math.fma(t1[t1Offset+0], t2V0, t3V0),
			Math.fma(t1[t1Offset+1], t2V1, t3V1),
			Math.fma(t1[t1Offset+2], t2V2, t3V2)
		};
	}
	
	public static float[] tup_fmaN_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1V0, t2[t2Offset+0], t3[t3Offset+0]),
			Math.fma(t1V1, t2[t2Offset+1], t3[t3Offset+1]),
			Math.fma(t1V2, t2[t2Offset+2], t3[t3Offset+2])
		};
	}
	
	public static float[] tup_fmaN_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2)
	{
		return new float[] {
			Math.fma(t1V0, t2[t2Offset+0], t3V0),
			Math.fma(t1V1, t2[t2Offset+1], t3V1),
			Math.fma(t1V2, t2[t2Offset+2], t3V2)
		};
	}
	
	public static float[] tup_fmaN_3fa(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1V0, t2V0, t3[t3Offset+0]),
			Math.fma(t1V1, t2V1, t3[t3Offset+1]),
			Math.fma(t1V2, t2V2, t3[t3Offset+2])
		};
	}
	
	public static float[] tup_fmaT_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1[t1Offset+0], t2[t2Offset+0], t3[t3Offset+0]);
		res[resOffset+1] = Math.fma(t1[t1Offset+1], t2[t2Offset+1], t3[t3Offset+1]);
		res[resOffset+2] = Math.fma(t1[t1Offset+2], t2[t2Offset+2], t3[t3Offset+2]);
		
		return res;
	}
	
	public static float[] tup_fmaT_3fa(float[] t1, int t1Offset,float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1[t1Offset+0], t2[t2Offset+0], t3V0);
		res[resOffset+1] = Math.fma(t1[t1Offset+1], t2[t2Offset+1], t3V1);
		res[resOffset+2] = Math.fma(t1[t1Offset+2], t2[t2Offset+2], t3V2);
		
		return res;
	}
	
	public static float[] tup_fmaT_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1[t1Offset+0], t2V0, t3[t3Offset+0]);
		res[resOffset+1] = Math.fma(t1[t1Offset+1], t2V1, t3[t3Offset+1]);
		res[resOffset+2] = Math.fma(t1[t1Offset+2], t2V2, t3[t3Offset+2]);
		
		return res;
	}
	
	public static float[] tup_fmaT_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1[t1Offset+0], t2V0, t3V0);
		res[resOffset+1] = Math.fma(t1[t1Offset+1], t2V1, t3V1);
		res[resOffset+2] = Math.fma(t1[t1Offset+2], t2V2, t3V2);
		
		return res;
	}
	
	public static float[] tup_fmaT_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1V0, t2[t2Offset+0], t3[t3Offset+0]);
		res[resOffset+1] = Math.fma(t1V1, t2[t2Offset+1], t3[t3Offset+1]);
		res[resOffset+2] = Math.fma(t1V2, t2[t2Offset+2], t3[t3Offset+2]);
		
		return res;
	}
	
	public static float[] tup_fmaT_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1V0, t2[t2Offset+0], t3V0);
		res[resOffset+1] = Math.fma(t1V1, t2[t2Offset+1], t3V1);
		res[resOffset+2] = Math.fma(t1V2, t2[t2Offset+2], t3V2);
		
		return res;
	}
	
	public static float[] tup_fmaT_3fa(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1V0, t2V0, t3[t3Offset+0]);
		res[resOffset+1] = Math.fma(t1V1, t2V1, t3[t3Offset+1]);
		res[resOffset+2] = Math.fma(t1V2, t2V2, t3[t3Offset+2]);
		
		return res;
	}
	
	public static float[] tup_fmaT_3fa(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1V0, t2V0, t3V0);
		res[resOffset+1] = Math.fma(t1V1, t2V1, t3V1);
		res[resOffset+2] = Math.fma(t1V2, t2V2, t3V2);
		
		return res;
	}
	
	public static float[] tup_fam_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = Math.fma(t2[t2Offset+0], t3[t3Offset+0], t1[t1OffsetV0]);
		t1[t1OffsetV1] = Math.fma(t2[t2Offset+1], t3[t3Offset+1], t1[t1OffsetV1]);
		t1[t1OffsetV2] = Math.fma(t2[t2Offset+2], t3[t3Offset+2], t1[t1OffsetV2]);
		
		return t1;
	}
	
	public static float[] tup_fam_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = Math.fma(t2[t2Offset+0], t3V0, t1[t1OffsetV0]);
		t1[t1OffsetV1] = Math.fma(t2[t2Offset+1], t3V1, t1[t1OffsetV1]);
		t1[t1OffsetV2] = Math.fma(t2[t2Offset+2], t3V2, t1[t1OffsetV2]);
		
		return t1;
	}
	
	public static float[] tup_fam_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float[] t3, int t3Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = Math.fma(t2V0, t3[t3Offset+0], t1[t1OffsetV0]);
		t1[t1OffsetV1] = Math.fma(t2V1, t3[t3Offset+1], t1[t1OffsetV1]);
		t1[t1OffsetV2] = Math.fma(t2V2, t3[t3Offset+2], t1[t1OffsetV2]);
		
		return t1;
	}
	
	public static float[] tup_fam_3fa(float[] t1, int t1Offset,float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = Math.fma(t2V0, t3V0, t1[t1OffsetV0]);
		t1[t1OffsetV1] = Math.fma(t2V1, t3V1, t1[t1OffsetV1]);
		t1[t1OffsetV2] = Math.fma(t2V2, t3V2, t1[t1OffsetV2]);
		
		return t1;
	}
	
	public static float[] tup_famN_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t2[t2Offset+0], t3[t3Offset+0], t1[t1Offset+0]),
			Math.fma(t2[t2Offset+1], t3[t3Offset+1], t1[t1Offset+1]),
			Math.fma(t2[t2Offset+2], t3[t3Offset+2], t1[t1Offset+2])
		};
	}
	
	public static float[] tup_famN_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2)
	{
		return new float[] {
			Math.fma(t2[t2Offset+0], t3V0, t1[t1Offset+0]),
			Math.fma(t2[t2Offset+1], t3V1, t1[t1Offset+1]),
			Math.fma(t2[t2Offset+2], t3V2, t1[t1Offset+2])
		};
	}
	
	public static float[] tup_famN_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1[t1Offset+0], t2V0, t3[t3Offset+0]),
			Math.fma(t1[t1Offset+1], t2V1, t3[t3Offset+1]),
			Math.fma(t1[t1Offset+2], t2V2, t3[t3Offset+2])
		};
	}
	
	public static float[] tup_famN_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2)
	{
		return new float[] {
			Math.fma(t2V0, t3V0, t1[t1Offset+0]),
			Math.fma(t2V1, t3V1, t1[t1Offset+1]),
			Math.fma(t2V2, t3V2, t1[t1Offset+2])
		};
	}
	
	public static float[] tup_famN_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t2[t2Offset+0], t3[t3Offset+0], t1V0),
			Math.fma(t2[t2Offset+1], t3[t3Offset+1], t1V1),
			Math.fma(t2[t2Offset+2], t3[t3Offset+2], t1V2)
		};
	}
	
	public static float[] tup_famN_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2)
	{
		return new float[] {
			Math.fma(t2[t2Offset+0], t3V0, t1V0),
			Math.fma(t2[t2Offset+1], t3V1, t1V1),
			Math.fma(t2[t2Offset+2], t3V2, t1V2)
		};
	}
	
	public static float[] tup_famN_3fa(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1V0, t2V0, t3[t3Offset+0]),
			Math.fma(t1V1, t2V1, t3[t3Offset+1]),
			Math.fma(t1V2, t2V2, t3[t3Offset+2])
		};
	}
	
	public static float[] tup_famT_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2[t2Offset+0], t3[t3Offset+0], t1[t1Offset+0]);
		res[resOffset+1] = Math.fma(t2[t2Offset+1], t3[t3Offset+1], t1[t1Offset+1]);
		res[resOffset+2] = Math.fma(t2[t2Offset+2], t3[t3Offset+2], t1[t1Offset+2]);
		
		return res;
	}
	
	public static float[] tup_famT_3fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2[t2Offset+0], t3V0, t1[t1Offset+0]);
		res[resOffset+1] = Math.fma(t2[t2Offset+1], t3V1, t1[t1Offset+1]);
		res[resOffset+2] = Math.fma(t2[t2Offset+2], t3V2, t1[t1Offset+2]);
		
		return res;
	}
	
	public static float[] tup_famT_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2V0, t3[t3Offset+0], t1[t1Offset+0]);
		res[resOffset+1] = Math.fma(t2V1, t3[t3Offset+1], t1[t1Offset+1]);
		res[resOffset+2] = Math.fma(t2V2, t3[t3Offset+2], t1[t1Offset+2]);
		
		return res;
	}
	
	public static float[] tup_famT_3fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2V0, t3V0, t1[t1Offset+0]);
		res[resOffset+1] = Math.fma(t2V1, t3V1, t1[t1Offset+1]);
		res[resOffset+2] = Math.fma(t2V2, t3V2, t1[t1Offset+2]);
		
		return res;
	}
	
	public static float[] tup_famT_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2[t2Offset+0], t3[t3Offset+0], t1V0);
		res[resOffset+1] = Math.fma(t2[t2Offset+1], t3[t3Offset+1], t1V1);
		res[resOffset+2] = Math.fma(t2[t2Offset+2], t3[t3Offset+2], t1V2);
		
		return res;
	}
	
	public static float[] tup_famT_3fa(float t1V0, float t1V1, float t1V2, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2[t2Offset+0], t3V0, t1V0);
		res[resOffset+1] = Math.fma(t2[t2Offset+1], t3V1, t1V1);
		res[resOffset+2] = Math.fma(t2[t2Offset+2], t3V2, t1V2);
		
		return res;
	}
	
	public static float[] tup_famT_3fa(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2V0, t3[t3Offset+0], t1V0);
		res[resOffset+1] = Math.fma(t2V1, t3[t3Offset+1], t1V1);
		res[resOffset+2] = Math.fma(t2V2, t3[t3Offset+2], t1V2);
		
		return res;
	}
	
	public static float[] tup_famT_3fa(float t1V0, float t1V1, float t1V2, float t2V0, float t2V1, float t2V2, float t3V0, float t3V1, float t3V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2V0, t3V0, t1V0);
		res[resOffset+1] = Math.fma(t2V1, t3V1, t1V1);
		res[resOffset+2] = Math.fma(t2V2, t3V2, t1V2);
		
		return res;
	}
	
	public static float[] tup_sqrt_3fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = MathUtils.sqrt(t1[t1OffsetV0]);
		t1[t1OffsetV1] = MathUtils.sqrt(t1[t1OffsetV1]);
		t1[t1OffsetV2] = MathUtils.sqrt(t1[t1OffsetV2]);
		
		return t1;
	}
	
	public static float[] tup_sqrtN_3fa(float[] t1, int t1Offset)
	{
		return new float[] {
			MathUtils.sqrt(t1[t1Offset+0]),
			MathUtils.sqrt(t1[t1Offset+1]),
			MathUtils.sqrt(t1[t1Offset+2])
		};
	}
	
	public static float[] tup_sqrtT_3fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.sqrt(t1[t1Offset+0]);
		res[resOffset+1] = MathUtils.sqrt(t1[t1Offset+1]);
		res[resOffset+2] = MathUtils.sqrt(t1[t1Offset+2]);
		
		return res;
	}
	
	public static float[] tup_sqrtT_3fa(float t1V0, float t1V1, float t1V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.sqrt(t1V0);
		res[resOffset+1] = MathUtils.sqrt(t1V1);
		res[resOffset+2] = MathUtils.sqrt(t1V2);
		
		return res;
	}
	
	public static float[] tup_cbrt_3fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = MathUtils.cbrt(t1[t1OffsetV0]);
		t1[t1OffsetV1] = MathUtils.cbrt(t1[t1OffsetV1]);
		t1[t1OffsetV2] = MathUtils.cbrt(t1[t1OffsetV2]);
		
		return t1;
	}
	
	public static float[] tup_cbrtN_3fa(float[] t1, int t1Offset)
	{
		return new float[] {
			MathUtils.cbrt(t1[t1Offset+0]),
			MathUtils.cbrt(t1[t1Offset+1]),
			MathUtils.cbrt(t1[t1Offset+2])
		};
	}
	
	public static float[] tup_cbrtT_3fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.cbrt(t1[t1Offset+0]);
		res[resOffset+1] = MathUtils.cbrt(t1[t1Offset+1]);
		res[resOffset+2] = MathUtils.cbrt(t1[t1Offset+2]);
		
		return res;
	}
	
	public static float[] tup_cbrtT_3fa(float t1V0, float t1V1, float t1V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.cbrt(t1V0);
		res[resOffset+1] = MathUtils.cbrt(t1V1);
		res[resOffset+2] = MathUtils.cbrt(t1V2);
		
		return res;
	}
	
	public static float[] tup_abs_3fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = Math.abs(t1[t1OffsetV0]);
		t1[t1OffsetV1] = Math.abs(t1[t1OffsetV1]);
		t1[t1OffsetV2] = Math.abs(t1[t1OffsetV2]);
		
		return t1;
	}
	
	public static float[] tup_absN_3fa(float[] t1, int t1Offset)
	{
		return new float[] {
			Math.abs(t1[t1Offset+0]),
			Math.abs(t1[t1Offset+1]),
			Math.abs(t1[t1Offset+2])
		};
	}
	
	public static float[] tup_absT_3fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.abs(t1[t1Offset+0]);
		res[resOffset+1] = Math.abs(t1[t1Offset+1]);
		res[resOffset+2] = Math.abs(t1[t1Offset+2]);
		
		return res;
	}
	
	public static float[] tup_absT_3fa(float t1V0, float t1V1, float t1V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.abs(t1V0);
		res[resOffset+1] = Math.abs(t1V1);
		res[resOffset+2] = Math.abs(t1V2);
		
		return res;
	}
	
	public static float[] tup_reciprocal_3fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = 1.0f / t1[t1OffsetV0];
		t1[t1OffsetV1] = 1.0f / t1[t1OffsetV1];
		t1[t1OffsetV2] = 1.0f / t1[t1OffsetV2];
		
		return t1;
	}
	
	public static float[] tup_reciprocalN_3fa(float[] t1, int t1Offset)
	{
		return new float[] {
			1.0f / t1[t1Offset+0],
			1.0f / t1[t1Offset+1],
			1.0f / t1[t1Offset+2]
		};
	}
	
	public static float[] tup_reciprocalT_3fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = 1.0f / t1[t1Offset+0];
		res[resOffset+1] = 1.0f / t1[t1Offset+1];
		res[resOffset+2] = 1.0f / t1[t1Offset+2];
		
		return res;
	}
	
	public static float[] tup_reciprocalT_3fa(float t1V0, float t1V1, float t1V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = 1.0f / t1V0;
		res[resOffset+1] = 1.0f / t1V1;
		res[resOffset+2] = 1.0f / t1V2;
		
		return res;
	}
	
	public static float[] tup_negate_3fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] = -t1[t1OffsetV0];
		t1[t1OffsetV1] = -t1[t1OffsetV1];
		t1[t1OffsetV2] = -t1[t1OffsetV2];
		
		return t1;
	}
	
	public static float[] tup_negateN_3fa(float[] t1, int t1Offset)
	{
		return new float[] {
			-t1[t1Offset+0],
			-t1[t1Offset+1],
			-t1[t1Offset+2]
		};
	}
	
	public static float[] tup_negateT_3fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = -t1[t1Offset+0];
		res[resOffset+1] = -t1[t1Offset+1];
		res[resOffset+2] = -t1[t1Offset+2];
		
		return res;
	}
	
	public static float[] tup_negateT_3fa(float t1V0, float t1V1, float t1V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = -t1V0;
		res[resOffset+1] = -t1V1;
		res[resOffset+2] = -t1V2;
		
		return res;
	}
	
	public static float[] tup_squared_3fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		
		t1[t1OffsetV0] *= t1[t1OffsetV0];
		t1[t1OffsetV1] *= t1[t1OffsetV1];
		t1[t1OffsetV2] *= t1[t1OffsetV2];
		
		return t1;
	}
	
	public static float[] tup_squaredN_3fa(float[] t1, int t1Offset)
	{
		float t1V0 = t1[t1Offset+0];
		float t1V1 = t1[t1Offset+1];
		float t1V2 = t1[t1Offset+2];
		
		return new float[] {
			t1V0 * t1V0,
			t1V1 * t1V1,
			t1V2 * t1V2
		};
	}
	
	public static float[] tup_squaredT_3fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		float t1V0 = t1[t1Offset+0];
		float t1V1 = t1[t1Offset+1];
		float t1V2 = t1[t1Offset+2];
		
		res[resOffset+0] = t1V0 * t1V0;
		res[resOffset+1] = t1V1 * t1V1;
		res[resOffset+2] = t1V2 * t1V2;
		
		return res;
	}
	
	public static float[] tup_squaredT_3fa(float t1V0, float t1V1, float t1V2, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 * t1V0;
		res[resOffset+1] = t1V1 * t1V1;
		res[resOffset+2] = t1V2 * t1V2;
		
		return res;
	}
}
