package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.math.MathUtils;

public final class ArithmeticOps4FAligned
{
	private ArithmeticOps4FAligned() { }
	
	public static float[] tup_add_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		t1[t1Offset+0] += t2[t2Offset+0];
		t1[t1Offset+1] += t2[t2Offset+1];
		t1[t1Offset+2] += t2[t2Offset+2];
		t1[t1Offset+3] += t2[t2Offset+3];
		
		return t1;
	}
	
	public static float[] tup_add_4fa(float[] t1, int t1Offset, float value)
	{
		t1[t1Offset+0] += value;
		t1[t1Offset+1] += value;
		t1[t1Offset+2] += value;
		t1[t1Offset+3] += value;
		
		return t1;
	}
	
	public static float[] tup_add_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3)
	{
		t1[t1Offset+0] += t2V0;
		t1[t1Offset+1] += t2V1;
		t1[t1Offset+2] += t2V2;
		t1[t1Offset+3] += t2V3;
		
		return t1;
	}
	
	public static float[] tup_addN_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t1[t1Offset+0] + t2[t2Offset+0],
			t1[t1Offset+1] + t2[t2Offset+1],
			t1[t1Offset+2] + t2[t2Offset+2],
			t1[t1Offset+3] + t2[t2Offset+3]
		};
	}
	
	public static float[] tup_addN_4fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			t1[t1Offset+0] + value,
			t1[t1Offset+1] + value,
			t1[t1Offset+2] + value,
			t1[t1Offset+3] + value
		};
	}
	
	public static float[] tup_addN_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3)
	{
		return new float[] {
			t1[t1Offset+0] + t2V0,
			t1[t1Offset+1] + t2V1,
			t1[t1Offset+2] + t2V2,
			t1[t1Offset+3] + t2V3
		};
	}
	
	public static float[] tup_addN_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset)
	{
		return new float[] {
			t1V0 + t2[t2Offset+0],
			t1V1 + t2[t2Offset+1],
			t1V2 + t2[t2Offset+2],
			t1V3 + t2[t2Offset+3]
		};
	}
	
	public static float[] tup_addT_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] + t2[t2Offset+0];
		res[resOffset+1] = t1[t1Offset+1] + t2[t2Offset+1];
		res[resOffset+2] = t1[t1Offset+2] + t2[t2Offset+2];
		res[resOffset+3] = t1[t1Offset+3] + t2[t2Offset+3];
		
		return res;
	}
	
	public static float[] tup_addT_4fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] + value;
		res[resOffset+1] = t1[t1Offset+1] + value;
		res[resOffset+2] = t1[t1Offset+2] + value;
		res[resOffset+3] = t1[t1Offset+3] + value;
		
		return res;
	}
	
	public static float[] tup_addT_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] + t2V0;
		res[resOffset+1] = t1[t1Offset+1] + t2V1;
		res[resOffset+2] = t1[t1Offset+2] + t2V2;
		res[resOffset+3] = t1[t1Offset+3] + t2V3;
		
		return res;
	}
	
	public static float[] tup_addT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 + t2[t2Offset+0];
		res[resOffset+1] = t1V1 + t2[t2Offset+1];
		res[resOffset+2] = t1V2 + t2[t2Offset+2];
		res[resOffset+3] = t1V3 + t2[t2Offset+3];
		
		return res;
	}
	
	public static float[] tup_addT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 + value;
		res[resOffset+1] = t1V1 + value;
		res[resOffset+2] = t1V2 + value;
		res[resOffset+3] = t1V3 + value;
		
		return res;
	}
	
	public static float[] tup_addT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float t2V0, float t2V1, float t2V2, float t2V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 + t2V0;
		res[resOffset+1] = t1V1 + t2V1;
		res[resOffset+2] = t1V2 + t2V2;
		res[resOffset+3] = t1V3 + t2V3;
		
		return res;
	}
	
	public static float[] tup_sub_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		t1[t1Offset+0] -= t2[t2Offset+0];
		t1[t1Offset+1] -= t2[t2Offset+1];
		t1[t1Offset+2] -= t2[t2Offset+2];
		t1[t1Offset+3] -= t2[t2Offset+3];
		
		return t1;
	}
	
	public static float[] tup_sub_4fa(float[] t1, int t1Offset, float value)
	{
		t1[t1Offset+0] -= value;
		t1[t1Offset+1] -= value;
		t1[t1Offset+2] -= value;
		t1[t1Offset+3] -= value;
		
		return t1;
	}
	
	public static float[] tup_sub_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3)
	{
		t1[t1Offset+0] -= t2V0;
		t1[t1Offset+1] -= t2V1;
		t1[t1Offset+2] -= t2V2;
		t1[t1Offset+3] -= t2V3;
		
		return t1;
	}
	
	public static float[] tup_subN_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t1[t1Offset+0] - t2[t2Offset+0],
			t1[t1Offset+1] - t2[t2Offset+1],
			t1[t1Offset+2] - t2[t2Offset+2],
			t1[t1Offset+3] - t2[t2Offset+3]
		};
	}
	
	public static float[] tup_subN_4fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			t1[t1Offset+0] - value,
			t1[t1Offset+1] - value,
			t1[t1Offset+2] - value,
			t1[t1Offset+3] - value
		};
	}
	
	public static float[] tup_subN_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3)
	{
		return new float[] {
			t1[t1Offset+0] - t2V0,
			t1[t1Offset+1] - t2V1,
			t1[t1Offset+2] - t2V2,
			t1[t1Offset+3] - t2V3
		};
	}
	
	public static float[] tup_subN_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset)
	{
		return new float[] {
			t1V0 - t2[t2Offset+0],
			t1V1 - t2[t2Offset+1],
			t1V2 - t2[t2Offset+2],
			t1V3 - t2[t2Offset+3]
		};
	}
	
	public static float[] tup_subT_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] - t2[t2Offset+0];
		res[resOffset+1] = t1[t1Offset+1] - t2[t2Offset+1];
		res[resOffset+2] = t1[t1Offset+2] - t2[t2Offset+2];
		res[resOffset+3] = t1[t1Offset+3] - t2[t2Offset+3];
		
		return res;
	}
	
	public static float[] tup_subT_4fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] - value;
		res[resOffset+1] = t1[t1Offset+1] - value;
		res[resOffset+2] = t1[t1Offset+2] - value;
		res[resOffset+3] = t1[t1Offset+3] - value;
		
		return res;
	}
	
	public static float[] tup_subT_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] - t2V0;
		res[resOffset+1] = t1[t1Offset+1] - t2V1;
		res[resOffset+2] = t1[t1Offset+2] - t2V2;
		res[resOffset+3] = t1[t1Offset+3] - t2V3;
		
		return res;
	}
	
	public static float[] tup_subT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 - t2[t2Offset+0];
		res[resOffset+1] = t1V1 - t2[t2Offset+1];
		res[resOffset+2] = t1V2 - t2[t2Offset+2];
		res[resOffset+3] = t1V3 - t2[t2Offset+3];
		
		return res;
	}
	
	public static float[] tup_subT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 - value;
		res[resOffset+1] = t1V1 - value;
		res[resOffset+2] = t1V2 - value;
		res[resOffset+3] = t1V3 - value;
		
		return res;
	}
	
	public static float[] tup_subT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float t2V0, float t2V1, float t2V2, float t2V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 - t2V0;
		res[resOffset+1] = t1V1 - t2V1;
		res[resOffset+2] = t1V2 - t2V2;
		res[resOffset+3] = t1V3 - t2V3;
		
		return res;
	}
	
	public static float[] tup_revSub_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = t2[t2Offset+0] - t1[t1OffsetV0];
		t1[t1OffsetV1] = t2[t2Offset+1] - t1[t1OffsetV1];
		t1[t1OffsetV2] = t2[t2Offset+2] - t1[t1OffsetV2];
		t1[t1OffsetV3] = t2[t2Offset+3] - t1[t1OffsetV3];
		
		return t1;
	}
	
	public static float[] tup_revSub_4fa(float[] t1, int t1Offset, float value)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = value - t1[t1OffsetV0];
		t1[t1OffsetV1] = value - t1[t1OffsetV1];
		t1[t1OffsetV2] = value - t1[t1OffsetV2];
		t1[t1OffsetV3] = value - t1[t1OffsetV3];
		
		return t1;
	}
	
	public static float[] tup_revSub_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = t2V0 - t1[t1OffsetV0];
		t1[t1OffsetV1] = t2V1 - t1[t1OffsetV1];
		t1[t1OffsetV2] = t2V2 - t1[t1OffsetV2];
		t1[t1OffsetV3] = t2V3 - t1[t1OffsetV3];
		
		return t1;
	}
	
	public static float[] tup_revSubN_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t2[t2Offset+0] - t1[t1Offset+0],
			t2[t2Offset+1] - t1[t1Offset+1],
			t2[t2Offset+2] - t1[t1Offset+2],
			t2[t2Offset+3] - t1[t1Offset+3]
		};
	}
	
	public static float[] tup_revSubN_4fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			value - t1[t1Offset+0],
			value - t1[t1Offset+1],
			value - t1[t1Offset+2],
			value - t1[t1Offset+3]
		};
	}
	
	public static float[] tup_revSubN_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3)
	{
		return new float[] {
			t2V0 - t1[t1Offset+0],
			t2V1 - t1[t1Offset+1],
			t2V2 - t1[t1Offset+2],
			t2V3 - t1[t1Offset+3]
		};
	}
	
	public static float[] tup_revSubN_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset)
	{
		return new float[] {
			t2[t2Offset+0] - t1V0,
			t2[t2Offset+1] - t1V1,
			t2[t2Offset+2] - t1V2,
			t2[t2Offset+3] - t1V3
		};
	}
	
	public static float[] tup_revSubT_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2[t2Offset+0] - t1[t1Offset+0];
		res[resOffset+1] = t2[t2Offset+1] - t1[t1Offset+1];
		res[resOffset+2] = t2[t2Offset+2] - t1[t1Offset+2];
		res[resOffset+3] = t2[t2Offset+3] - t1[t1Offset+3];
		
		return res;
	}
	
	public static float[] tup_revSubT_4fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = value - t1[t1Offset+0];
		res[resOffset+1] = value - t1[t1Offset+1];
		res[resOffset+2] = value - t1[t1Offset+2];
		res[resOffset+3] = value - t1[t1Offset+3];
		
		return res;
	}
	
	public static float[] tup_revSubT_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2V0 - t1[t1Offset+0];
		res[resOffset+1] = t2V1 - t1[t1Offset+1];
		res[resOffset+2] = t2V2 - t1[t1Offset+2];
		res[resOffset+3] = t2V3 - t1[t1Offset+3];
		
		return res;
	}
	
	public static float[] tup_revSubT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2[t2Offset+0] - t1V0;
		res[resOffset+1] = t2[t2Offset+1] - t1V1;
		res[resOffset+2] = t2[t2Offset+2] - t1V2;
		res[resOffset+3] = t2[t2Offset+3] - t1V3;
		
		return res;
	}
	
	public static float[] tup_revSubT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = value - t1V0;
		res[resOffset+1] = value - t1V1;
		res[resOffset+2] = value - t1V2;
		res[resOffset+3] = value - t1V3;
		
		return res;
	}
	
	public static float[] tup_revSubT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float t2V0, float t2V1, float t2V2, float t2V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2V0 - t1V0;
		res[resOffset+1] = t2V1 - t1V1;
		res[resOffset+2] = t2V2 - t1V2;
		res[resOffset+3] = t2V3 - t1V3;
		
		return res;
	}
	
	public static float[] tup_mul_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		t1[t1Offset+0] *= t2[t2Offset+0];
		t1[t1Offset+1] *= t2[t2Offset+1];
		t1[t1Offset+2] *= t2[t2Offset+2];
		t1[t1Offset+3] *= t2[t2Offset+3];
		
		return t1;
	}
	
	public static float[] tup_mul_4fa(float[] t1, int t1Offset, float value)
	{
		t1[t1Offset+0] *= value;
		t1[t1Offset+1] *= value;
		t1[t1Offset+2] *= value;
		t1[t1Offset+3] *= value;
		
		return t1;
	}
	
	public static float[] tup_mul_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3)
	{
		t1[t1Offset+0] *= t2V0;
		t1[t1Offset+1] *= t2V1;
		t1[t1Offset+2] *= t2V2;
		t1[t1Offset+3] *= t2V3;
		
		return t1;
	}
	
	public static float[] tup_mulN_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t1[t1Offset+0] * t2[t2Offset+0],
			t1[t1Offset+1] * t2[t2Offset+1],
			t1[t1Offset+2] * t2[t2Offset+2],
			t1[t1Offset+3] * t2[t2Offset+3]
		};
	}
	
	public static float[] tup_mulN_4fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			t1[t1Offset+0] * value,
			t1[t1Offset+1] * value,
			t1[t1Offset+2] * value,
			t1[t1Offset+3] * value
		};
	}
	
	public static float[] tup_mulN_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3)
	{
		return new float[] {
			t1[t1Offset+0] * t2V0,
			t1[t1Offset+1] * t2V1,
			t1[t1Offset+2] * t2V2,
			t1[t1Offset+3] * t2V3
		};
	}
	
	public static float[] tup_mulN_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset)
	{
		return new float[] {
			t1V0 * t2[t2Offset+0],
			t1V1 * t2[t2Offset+1],
			t1V2 * t2[t2Offset+2],
			t1V3 * t2[t2Offset+3]
		};
	}
	
	public static float[] tup_mulT_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] * t2[t2Offset+0];
		res[resOffset+1] = t1[t1Offset+1] * t2[t2Offset+1];
		res[resOffset+2] = t1[t1Offset+2] * t2[t2Offset+2];
		res[resOffset+3] = t1[t1Offset+3] * t2[t2Offset+3];
		
		return res;
	}
	
	public static float[] tup_mulT_4fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] * value;
		res[resOffset+1] = t1[t1Offset+1] * value;
		res[resOffset+2] = t1[t1Offset+2] * value;
		res[resOffset+3] = t1[t1Offset+3] * value;
		
		return res;
	}
	
	public static float[] tup_mulT_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] * t2V0;
		res[resOffset+1] = t1[t1Offset+1] * t2V1;
		res[resOffset+2] = t1[t1Offset+2] * t2V2;
		res[resOffset+3] = t1[t1Offset+3] * t2V3;
		
		return res;
	}
	
	public static float[] tup_mulT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 * t2[t2Offset+0];
		res[resOffset+1] = t1V1 * t2[t2Offset+1];
		res[resOffset+2] = t1V2 * t2[t2Offset+2];
		res[resOffset+3] = t1V3 * t2[t2Offset+3];
		
		return res;
	}
	
	public static float[] tup_mulT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 * value;
		res[resOffset+1] = t1V1 * value;
		res[resOffset+2] = t1V2 * value;
		res[resOffset+3] = t1V3 * value;
		
		return res;
	}
	
	public static float[] tup_mulT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float t2V0, float t2V1, float t2V2, float t2V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 * t2V0;
		res[resOffset+1] = t1V1 * t2V1;
		res[resOffset+2] = t1V2 * t2V2;
		res[resOffset+3] = t1V3 * t2V3;
		
		return res;
	}
	
	public static float[] tup_div_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		t1[t1Offset+0] /= t2[t2Offset+0];
		t1[t1Offset+1] /= t2[t2Offset+1];
		t1[t1Offset+2] /= t2[t2Offset+2];
		t1[t1Offset+3] /= t2[t2Offset+3];
		
		return t1;
	}
	
	public static float[] tup_div_4fa(float[] t1, int t1Offset, float value)
	{
		t1[t1Offset+0] /= value;
		t1[t1Offset+1] /= value;
		t1[t1Offset+2] /= value;
		t1[t1Offset+3] /= value;
		
		return t1;
	}
	
	public static float[] tup_div_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3)
	{
		t1[t1Offset+0] /= t2V0;
		t1[t1Offset+1] /= t2V1;
		t1[t1Offset+2] /= t2V2;
		t1[t1Offset+3] /= t2V3;
		
		return t1;
	}
	
	public static float[] tup_divN_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t1[t1Offset+0] / t2[t2Offset+0],
			t1[t1Offset+1] / t2[t2Offset+1],
			t1[t1Offset+2] / t2[t2Offset+2],
			t1[t1Offset+3] / t2[t2Offset+3]
		};
	}
	
	public static float[] tup_divN_4fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			t1[t1Offset+0] / value,
			t1[t1Offset+1] / value,
			t1[t1Offset+2] / value,
			t1[t1Offset+3] / value
		};
	}
	
	public static float[] tup_divN_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3)
	{
		return new float[] {
			t1[t1Offset+0] / t2V0,
			t1[t1Offset+1] / t2V1,
			t1[t1Offset+2] / t2V2,
			t1[t1Offset+3] / t2V3
		};
	}
	
	public static float[] tup_divN_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset)
	{
		return new float[] {
			t1V0 / t2[t2Offset+0],
			t1V1 / t2[t2Offset+1],
			t1V2 / t2[t2Offset+2],
			t1V3 / t2[t2Offset+3]
		};
	}
	
	public static float[] tup_divT_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] / t2[t2Offset+0];
		res[resOffset+1] = t1[t1Offset+1] / t2[t2Offset+1];
		res[resOffset+2] = t1[t1Offset+2] / t2[t2Offset+2];
		res[resOffset+3] = t1[t1Offset+3] / t2[t2Offset+3];
		
		return res;
	}
	
	public static float[] tup_divT_4fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] / value;
		res[resOffset+1] = t1[t1Offset+1] / value;
		res[resOffset+2] = t1[t1Offset+2] / value;
		res[resOffset+3] = t1[t1Offset+3] / value;
		
		return res;
	}
	
	public static float[] tup_divT_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1[t1Offset+0] / t2V0;
		res[resOffset+1] = t1[t1Offset+1] / t2V1;
		res[resOffset+2] = t1[t1Offset+2] / t2V2;
		res[resOffset+3] = t1[t1Offset+3] / t2V3;
		
		return res;
	}
	
	public static float[] tup_divT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 / t2[t2Offset+0];
		res[resOffset+1] = t1V1 / t2[t2Offset+1];
		res[resOffset+2] = t1V2 / t2[t2Offset+2];
		res[resOffset+3] = t1V3 / t2[t2Offset+3];
		
		return res;
	}
	
	public static float[] tup_divT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 / value;
		res[resOffset+1] = t1V1 / value;
		res[resOffset+2] = t1V2 / value;
		res[resOffset+3] = t1V3 / value;
		
		return res;
	}
	
	public static float[] tup_divT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float t2V0, float t2V1, float t2V2, float t2V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 / t2V0;
		res[resOffset+1] = t1V1 / t2V1;
		res[resOffset+2] = t1V2 / t2V2;
		res[resOffset+3] = t1V3 / t2V3;
		
		return res;
	}
	
	public static float[] tup_revDiv_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = t2[t2Offset+0] / t1[t1OffsetV0];
		t1[t1OffsetV1] = t2[t2Offset+1] / t1[t1OffsetV1];
		t1[t1OffsetV2] = t2[t2Offset+2] / t1[t1OffsetV2];
		t1[t1OffsetV3] = t2[t2Offset+3] / t1[t1OffsetV3];
		
		return t1;
	}
	
	public static float[] tup_revDiv_4fa(float[] t1, int t1Offset, float value)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = value / t1[t1OffsetV0];
		t1[t1OffsetV1] = value / t1[t1OffsetV1];
		t1[t1OffsetV2] = value / t1[t1OffsetV2];
		t1[t1OffsetV3] = value / t1[t1OffsetV3];
		
		return t1;
	}
	
	public static float[] tup_revDiv_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = t2V0 / t1[t1OffsetV0];
		t1[t1OffsetV1] = t2V1 / t1[t1OffsetV1];
		t1[t1OffsetV2] = t2V2 / t1[t1OffsetV2];
		t1[t1OffsetV3] = t2V2 / t1[t1OffsetV3];
		
		return t1;
	}
	
	public static float[] tup_revDivN_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			t2[t2Offset+0] / t1[t1Offset+0],
			t2[t2Offset+1] / t1[t1Offset+1],
			t2[t2Offset+2] / t1[t1Offset+2],
			t2[t2Offset+3] / t1[t1Offset+3]
		};
	}
	
	public static float[] tup_revDivN_4fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			value / t1[t1Offset+0],
			value / t1[t1Offset+1],
			value / t1[t1Offset+2],
			value / t1[t1Offset+3]
		};
	}
	
	public static float[] tup_revDivN_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3)
	{
		return new float[] {
			t2V0 / t1[t1Offset+0],
			t2V1 / t1[t1Offset+1],
			t2V2 / t1[t1Offset+2],
			t2V3 / t1[t1Offset+3]
		};
	}
	
	public static float[] tup_revDivN_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset)
	{
		return new float[] {
			t2[t2Offset+0] / t1V0,
			t2[t2Offset+1] / t1V1,
			t2[t2Offset+2] / t1V2,
			t2[t2Offset+3] / t1V3
		};
	}
	
	public static float[] tup_revDivT_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2[t2Offset+0] / t1[t1Offset+0];
		res[resOffset+1] = t2[t2Offset+1] / t1[t1Offset+1];
		res[resOffset+2] = t2[t2Offset+2] / t1[t1Offset+2];
		res[resOffset+3] = t2[t2Offset+3] / t1[t1Offset+3];
		
		return res;
	}
	
	public static float[] tup_revDivT_4fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = value / t1[t1Offset+0];
		res[resOffset+1] = value / t1[t1Offset+1];
		res[resOffset+2] = value / t1[t1Offset+2];
		res[resOffset+3] = value / t1[t1Offset+3];
		
		return res;
	}
	
	public static float[] tup_revDivT_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2V0 / t1[t1Offset+0];
		res[resOffset+1] = t2V1 / t1[t1Offset+1];
		res[resOffset+2] = t2V2 / t1[t1Offset+2];
		res[resOffset+3] = t2V3 / t1[t1Offset+3];
		
		return res;
	}
	
	public static float[] tup_revDivT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2[t2Offset+0] / t1V0;
		res[resOffset+1] = t2[t2Offset+1] / t1V1;
		res[resOffset+2] = t2[t2Offset+2] / t1V2;
		res[resOffset+3] = t2[t2Offset+3] / t1V3;
		
		return res;
	}
	
	public static float[] tup_revDivT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = value / t1V0;
		res[resOffset+1] = value / t1V1;
		res[resOffset+2] = value / t1V2;
		res[resOffset+3] = value / t1V3;
		
		return res;
	}
	
	public static float[] tup_revDivT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float t2V0, float t2V1, float t2V2, float t2V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t2V0 / t1V0;
		res[resOffset+1] = t2V1 / t1V1;
		res[resOffset+2] = t2V2 / t1V2;
		res[resOffset+3] = t2V3 / t1V3;
		
		return res;
	}
	
	public static float[] tup_pow_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = MathUtils.pow(t1[t1OffsetV0], t2[t2Offset+0]);
		t1[t1OffsetV1] = MathUtils.pow(t1[t1OffsetV1], t2[t2Offset+1]);
		t1[t1OffsetV2] = MathUtils.pow(t1[t1OffsetV2], t2[t2Offset+2]);
		t1[t1OffsetV3] = MathUtils.pow(t1[t1OffsetV3], t2[t2Offset+3]);
		
		return t1;
	}
	
	public static float[] tup_pow_4fa(float[] t1, int t1Offset, float value)
	{
		t1[t1Offset+0] = MathUtils.pow(t1[t1Offset+0], value);
		t1[t1Offset+1] = MathUtils.pow(t1[t1Offset+1], value);
		t1[t1Offset+2] = MathUtils.pow(t1[t1Offset+2], value);
		t1[t1Offset+3] = MathUtils.pow(t1[t1Offset+3], value);
		
		return t1;
	}
	
	public static float[] tup_pow_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3)
	{
		t1[t1Offset+0] = MathUtils.pow(t1[t1Offset+0], t2V0);
		t1[t1Offset+1] = MathUtils.pow(t1[t1Offset+1], t2V1);
		t1[t1Offset+2] = MathUtils.pow(t1[t1Offset+2], t2V2);
		t1[t1Offset+3] = MathUtils.pow(t1[t1Offset+3], t2V3);
		
		return t1;
	}
	
	public static float[] tup_powN_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			MathUtils.pow(t1[t1Offset+0], t2[t2Offset+0]),
			MathUtils.pow(t1[t1Offset+1], t2[t2Offset+1]),
			MathUtils.pow(t1[t1Offset+2], t2[t2Offset+2]),
			MathUtils.pow(t1[t1Offset+3], t2[t2Offset+3])
		};
	}
	
	public static float[] tup_powN_4fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			MathUtils.pow(t1[t1Offset+0], value),
			MathUtils.pow(t1[t1Offset+1], value),
			MathUtils.pow(t1[t1Offset+2], value),
			MathUtils.pow(t1[t1Offset+3], value)
		};
	}
	
	public static float[] tup_powN_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3)
	{
		return new float[] {
			MathUtils.pow(t1[t1Offset+0], t2V0),
			MathUtils.pow(t1[t1Offset+1], t2V1),
			MathUtils.pow(t1[t1Offset+2], t2V2),
			MathUtils.pow(t1[t1Offset+3], t2V3)
		};
	}
	
	public static float[] tup_powN_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset)
	{
		return new float[] {
			MathUtils.pow(t1V0, t2[t2Offset+0]),
			MathUtils.pow(t1V1, t2[t2Offset+1]),
			MathUtils.pow(t1V2, t2[t2Offset+2]),
			MathUtils.pow(t1V3, t2[t2Offset+3])
		};
	}
	
	public static float[] tup_powT_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1[t1Offset+0], t2[t2Offset+0]);
		res[resOffset+1] = MathUtils.pow(t1[t1Offset+1], t2[t2Offset+1]);
		res[resOffset+2] = MathUtils.pow(t1[t1Offset+2], t2[t2Offset+2]);
		res[resOffset+3] = MathUtils.pow(t1[t1Offset+3], t2[t2Offset+3]);
		
		return res;
	}
	
	public static float[] tup_powT_4fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1[t1Offset+0], value);
		res[resOffset+1] = MathUtils.pow(t1[t1Offset+1], value);
		res[resOffset+2] = MathUtils.pow(t1[t1Offset+2], value);
		res[resOffset+3] = MathUtils.pow(t1[t1Offset+3], value);
		
		return res;
	}
	
	public static float[] tup_powT_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1[t1Offset+0], t2V0);
		res[resOffset+1] = MathUtils.pow(t1[t1Offset+1], t2V1);
		res[resOffset+2] = MathUtils.pow(t1[t1Offset+2], t2V2);
		res[resOffset+3] = MathUtils.pow(t1[t1Offset+3], t2V3);
		
		return res;
	}
	
	public static float[] tup_powT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1V0, t2[t2Offset+0]);
		res[resOffset+1] = MathUtils.pow(t1V1, t2[t2Offset+1]);
		res[resOffset+2] = MathUtils.pow(t1V2, t2[t2Offset+2]);
		res[resOffset+3] = MathUtils.pow(t1V3, t2[t2Offset+3]);
		
		return res;
	}
	
	public static float[] tup_powT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1V0, value);
		res[resOffset+1] = MathUtils.pow(t1V1, value);
		res[resOffset+2] = MathUtils.pow(t1V2, value);
		res[resOffset+2] = MathUtils.pow(t1V3, value);
		
		return res;
	}
	
	public static float[] tup_powT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float t2V0, float t2V1, float t2V2, float t2V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t1V0, t2V0);
		res[resOffset+1] = MathUtils.pow(t1V1, t2V1);
		res[resOffset+2] = MathUtils.pow(t1V2, t2V2);
		res[resOffset+2] = MathUtils.pow(t1V3, t2V3);
		
		return res;
	}
	
	public static float[] tup_revPow_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = MathUtils.pow(t2[t2Offset+0], t1[t1OffsetV0]);
		t1[t1OffsetV1] = MathUtils.pow(t2[t2Offset+1], t1[t1OffsetV1]);
		t1[t1OffsetV2] = MathUtils.pow(t2[t2Offset+2], t1[t1OffsetV2]);
		t1[t1OffsetV3] = MathUtils.pow(t2[t2Offset+3], t1[t1OffsetV3]);
		
		return t1;
	}
	
	public static float[] tup_revPow_4fa(float[] t1, int t1Offset, float value)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = MathUtils.pow(value, t1[t1OffsetV0]);
		t1[t1OffsetV1] = MathUtils.pow(value, t1[t1OffsetV1]);
		t1[t1OffsetV2] = MathUtils.pow(value, t1[t1OffsetV2]);
		t1[t1OffsetV3] = MathUtils.pow(value, t1[t1OffsetV3]);
		
		return t1;
	}
	
	public static float[] tup_revPow_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = MathUtils.pow(t2V0, t1[t1OffsetV0]);
		t1[t1OffsetV1] = MathUtils.pow(t2V1, t1[t1OffsetV1]);
		t1[t1OffsetV2] = MathUtils.pow(t2V2, t1[t1OffsetV2]);
		t1[t1OffsetV3] = MathUtils.pow(t2V3, t1[t1OffsetV3]);
		
		return t1;
	}
	
	public static float[] tup_revPowN_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset)
	{
		return new float[] {
			MathUtils.pow(t2[t2Offset+0], t1[t1Offset+0]),
			MathUtils.pow(t2[t2Offset+1], t1[t1Offset+1]),
			MathUtils.pow(t2[t2Offset+2], t1[t1Offset+2]),
			MathUtils.pow(t2[t2Offset+3], t1[t1Offset+3])
		};
	}
	
	public static float[] tup_revPowN_4fa(float[] t1, int t1Offset, float value)
	{
		return new float[] {
			MathUtils.pow(value, t1[t1Offset+0]),
			MathUtils.pow(value, t1[t1Offset+1]),
			MathUtils.pow(value, t1[t1Offset+2]),
			MathUtils.pow(value, t1[t1Offset+3])
		};
	}
	
	public static float[] tup_revPowN_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3)
	{
		return new float[] {
			MathUtils.pow(t2V0, t1[t1Offset+0]),
			MathUtils.pow(t2V1, t1[t1Offset+1]),
			MathUtils.pow(t2V2, t1[t1Offset+2]),
			MathUtils.pow(t2V3, t1[t1Offset+3])
		};
	}
	
	public static float[] tup_revPowN_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset)
	{
		return new float[] {
			MathUtils.pow(t2[t2Offset+0], t1V0),
			MathUtils.pow(t2[t2Offset+1], t1V1),
			MathUtils.pow(t2[t2Offset+2], t1V2),
			MathUtils.pow(t2[t2Offset+3], t1V3)
		};
	}
	
	public static float[] tup_revPowT_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t2[t2Offset+0], t1[t1Offset+0]);
		res[resOffset+1] = MathUtils.pow(t2[t2Offset+1], t1[t1Offset+1]);
		res[resOffset+2] = MathUtils.pow(t2[t2Offset+2], t1[t1Offset+2]);
		res[resOffset+3] = MathUtils.pow(t2[t2Offset+3], t1[t1Offset+3]);
		
		return res;
	}
	
	public static float[] tup_revPowT_4fa(float[] t1, int t1Offset, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(value, t1[t1Offset+0]);
		res[resOffset+1] = MathUtils.pow(value, t1[t1Offset+1]);
		res[resOffset+2] = MathUtils.pow(value, t1[t1Offset+2]);
		res[resOffset+3] = MathUtils.pow(value, t1[t1Offset+3]);
		
		return res;
	}
	
	public static float[] tup_revPowT_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t2V0, t1[t1Offset+0]);
		res[resOffset+1] = MathUtils.pow(t2V1, t1[t1Offset+1]);
		res[resOffset+2] = MathUtils.pow(t2V2, t1[t1Offset+2]);
		res[resOffset+3] = MathUtils.pow(t2V3, t1[t1Offset+3]);
		
		return res;
	}
	
	public static float[] tup_revPowT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t2[t2Offset+0], t1V0);
		res[resOffset+1] = MathUtils.pow(t2[t2Offset+1], t1V1);
		res[resOffset+2] = MathUtils.pow(t2[t2Offset+2], t1V2);
		res[resOffset+3] = MathUtils.pow(t2[t2Offset+3], t1V3);
		
		return res;
	}
	
	public static float[] tup_revPowT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float value, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(value, t1V0);
		res[resOffset+1] = MathUtils.pow(value, t1V1);
		res[resOffset+2] = MathUtils.pow(value, t1V2);
		res[resOffset+3] = MathUtils.pow(value, t1V3);
		
		return res;
	}
	
	public static float[] tup_revPowT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float t2V0, float t2V1, float t2V2, float t2V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.pow(t2V0, t1V0);
		res[resOffset+1] = MathUtils.pow(t2V1, t1V1);
		res[resOffset+2] = MathUtils.pow(t2V2, t1V2);
		res[resOffset+3] = MathUtils.pow(t2V3, t1V3);
		
		return res;
	}
	
	public static float[] tup_fma_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = Math.fma(t1[t1OffsetV0], t2[t2Offset+0], t3[t3Offset+0]);
		t1[t1OffsetV1] = Math.fma(t1[t1OffsetV1], t2[t2Offset+1], t3[t3Offset+1]);
		t1[t1OffsetV2] = Math.fma(t1[t1OffsetV2], t2[t2Offset+2], t3[t3Offset+2]);
		t1[t1OffsetV3] = Math.fma(t1[t1OffsetV3], t2[t2Offset+3], t3[t3Offset+3]);
		
		return t1;
	}
	
	public static float[] tup_fma_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2, float t3V3)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = Math.fma(t1[t1OffsetV0], t2[t2Offset+0], t3V0);
		t1[t1OffsetV1] = Math.fma(t1[t1OffsetV1], t2[t2Offset+1], t3V1);
		t1[t1OffsetV2] = Math.fma(t1[t1OffsetV2], t2[t2Offset+2], t3V2);
		t1[t1OffsetV3] = Math.fma(t1[t1OffsetV3], t2[t2Offset+3], t3V3);
		
		return t1;
	}
	
	public static float[] tup_fma_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, float[] t3, int t3Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = Math.fma(t1[t1OffsetV0], t2V0, t3[t3Offset+0]);
		t1[t1OffsetV1] = Math.fma(t1[t1OffsetV1], t2V1, t3[t3Offset+1]);
		t1[t1OffsetV2] = Math.fma(t1[t1OffsetV2], t2V2, t3[t3Offset+2]);
		t1[t1OffsetV3] = Math.fma(t1[t1OffsetV3], t2V3, t3[t3Offset+3]);
		
		return t1;
	}
	
	public static float[] tup_fma_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, float t3V0, float t3V1, float t3V2, float t3V3)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = Math.fma(t1[t1OffsetV0], t2V0, t3V0);
		t1[t1OffsetV1] = Math.fma(t1[t1OffsetV1], t2V1, t3V1);
		t1[t1OffsetV2] = Math.fma(t1[t1OffsetV2], t2V2, t3V2);
		t1[t1OffsetV3] = Math.fma(t1[t1OffsetV3], t2V3, t3V3);
		
		return t1;
	}
	
	public static float[] tup_fmaN_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1[t1Offset+0], t2[t2Offset+0], t3[t3Offset+0]),
			Math.fma(t1[t1Offset+1], t2[t2Offset+1], t3[t3Offset+1]),
			Math.fma(t1[t1Offset+2], t2[t2Offset+2], t3[t3Offset+2]),
			Math.fma(t1[t1Offset+3], t2[t2Offset+3], t3[t3Offset+3])
		};
	}
	
	public static float[] tup_fmaN_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2)
	{
		return new float[] {
			Math.fma(t1[t1Offset+0], t2[t2Offset+0], t3V0),
			Math.fma(t1[t1Offset+1], t2[t2Offset+1], t3V1),
			Math.fma(t1[t1Offset+2], t2[t2Offset+2], t3V2)
		};
	}
	
	public static float[] tup_fmaN_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1[t1Offset+0], t2V0, t3[t3Offset+0]),
			Math.fma(t1[t1Offset+1], t2V1, t3[t3Offset+1]),
			Math.fma(t1[t1Offset+2], t2V2, t3[t3Offset+2]),
			Math.fma(t1[t1Offset+3], t2V3, t3[t3Offset+3])
		};
	}
	
	public static float[] tup_fmaN_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, float t3V0, float t3V1, float t3V2, float t3V3)
	{
		return new float[] {
			Math.fma(t1[t1Offset+0], t2V0, t3V0),
			Math.fma(t1[t1Offset+1], t2V1, t3V1),
			Math.fma(t1[t1Offset+2], t2V2, t3V2),
			Math.fma(t1[t1Offset+3], t2V3, t3V3)
		};
	}
	
	public static float[] tup_fmaN_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1V0, t2[t2Offset+0], t3[t3Offset+0]),
			Math.fma(t1V1, t2[t2Offset+1], t3[t3Offset+1]),
			Math.fma(t1V2, t2[t2Offset+2], t3[t3Offset+2]),
			Math.fma(t1V3, t2[t2Offset+3], t3[t3Offset+3])
		};
	}
	
	public static float[] tup_fmaN_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2, float t3V3)
	{
		return new float[] {
			Math.fma(t1V0, t2[t2Offset+0], t3V0),
			Math.fma(t1V1, t2[t2Offset+1], t3V1),
			Math.fma(t1V2, t2[t2Offset+2], t3V2),
			Math.fma(t1V3, t2[t2Offset+3], t3V3)
		};
	}
	
	public static float[] tup_fmaN_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float t2V0, float t2V1, float t2V2, float t2V3, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1V0, t2V0, t3[t3Offset+0]),
			Math.fma(t1V1, t2V1, t3[t3Offset+1]),
			Math.fma(t1V2, t2V2, t3[t3Offset+2]),
			Math.fma(t1V3, t2V3, t3[t3Offset+3])
		};
	}
	
	public static float[] tup_fmaT_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1[t1Offset+0], t2[t2Offset+0], t3[t3Offset+0]);
		res[resOffset+1] = Math.fma(t1[t1Offset+1], t2[t2Offset+1], t3[t3Offset+1]);
		res[resOffset+2] = Math.fma(t1[t1Offset+2], t2[t2Offset+2], t3[t3Offset+2]);
		res[resOffset+3] = Math.fma(t1[t1Offset+3], t2[t2Offset+3], t3[t3Offset+3]);
		
		return res;
	}
	
	public static float[] tup_fmaT_4fa(float[] t1, int t1Offset,float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2, float t3V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1[t1Offset+0], t2[t2Offset+0], t3V0);
		res[resOffset+1] = Math.fma(t1[t1Offset+1], t2[t2Offset+1], t3V1);
		res[resOffset+2] = Math.fma(t1[t1Offset+2], t2[t2Offset+2], t3V2);
		res[resOffset+3] = Math.fma(t1[t1Offset+3], t2[t2Offset+3], t3V3);
		
		return res;
	}
	
	public static float[] tup_fmaT_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1[t1Offset+0], t2V0, t3[t3Offset+0]);
		res[resOffset+1] = Math.fma(t1[t1Offset+1], t2V1, t3[t3Offset+1]);
		res[resOffset+2] = Math.fma(t1[t1Offset+2], t2V2, t3[t3Offset+2]);
		res[resOffset+3] = Math.fma(t1[t1Offset+3], t2V3, t3[t3Offset+3]);
		
		return res;
	}
	
	public static float[] tup_fmaT_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, float t3V0, float t3V1, float t3V2, float t3V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1[t1Offset+0], t2V0, t3V0);
		res[resOffset+1] = Math.fma(t1[t1Offset+1], t2V1, t3V1);
		res[resOffset+2] = Math.fma(t1[t1Offset+2], t2V2, t3V2);
		res[resOffset+3] = Math.fma(t1[t1Offset+3], t2V3, t3V3);
		
		return res;
	}
	
	public static float[] tup_fmaT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1V0, t2[t2Offset+0], t3[t3Offset+0]);
		res[resOffset+1] = Math.fma(t1V1, t2[t2Offset+1], t3[t3Offset+1]);
		res[resOffset+2] = Math.fma(t1V2, t2[t2Offset+2], t3[t3Offset+2]);
		res[resOffset+3] = Math.fma(t1V3, t2[t2Offset+3], t3[t3Offset+3]);
		
		return res;
	}
	
	public static float[] tup_fmaT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2, float t3V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1V0, t2[t2Offset+0], t3V0);
		res[resOffset+1] = Math.fma(t1V1, t2[t2Offset+1], t3V1);
		res[resOffset+2] = Math.fma(t1V2, t2[t2Offset+2], t3V2);
		res[resOffset+3] = Math.fma(t1V3, t2[t2Offset+3], t3V3);
		
		return res;
	}
	
	public static float[] tup_fmaT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float t2V0, float t2V1, float t2V2, float t2V3, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1V0, t2V0, t3[t3Offset+0]);
		res[resOffset+1] = Math.fma(t1V1, t2V1, t3[t3Offset+1]);
		res[resOffset+2] = Math.fma(t1V2, t2V2, t3[t3Offset+2]);
		res[resOffset+3] = Math.fma(t1V3, t2V3, t3[t3Offset+3]);
		
		return res;
	}
	
	public static float[] tup_fmaT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float t2V0, float t2V1, float t2V2, float t2V3, float t3V0, float t3V1, float t3V2, float t3V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t1V0, t2V0, t3V0);
		res[resOffset+1] = Math.fma(t1V1, t2V1, t3V1);
		res[resOffset+2] = Math.fma(t1V2, t2V2, t3V2);
		res[resOffset+2] = Math.fma(t1V3, t2V3, t3V3);
		
		return res;
	}
	
	public static float[] tup_fam_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = Math.fma(t2[t2Offset+0], t3[t3Offset+0], t1[t1OffsetV0]);
		t1[t1OffsetV1] = Math.fma(t2[t2Offset+1], t3[t3Offset+1], t1[t1OffsetV1]);
		t1[t1OffsetV2] = Math.fma(t2[t2Offset+2], t3[t3Offset+2], t1[t1OffsetV2]);
		t1[t1OffsetV3] = Math.fma(t2[t2Offset+3], t3[t3Offset+3], t1[t1OffsetV3]);
		
		return t1;
	}
	
	public static float[] tup_fam_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2, float t3V3)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = Math.fma(t2[t2Offset+0], t3V0, t1[t1OffsetV0]);
		t1[t1OffsetV1] = Math.fma(t2[t2Offset+1], t3V1, t1[t1OffsetV1]);
		t1[t1OffsetV2] = Math.fma(t2[t2Offset+2], t3V2, t1[t1OffsetV2]);
		t1[t1OffsetV3] = Math.fma(t2[t2Offset+3], t3V3, t1[t1OffsetV3]);
		
		return t1;
	}
	
	public static float[] tup_fam_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, float[] t3, int t3Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = Math.fma(t2V0, t3[t3Offset+0], t1[t1OffsetV0]);
		t1[t1OffsetV1] = Math.fma(t2V1, t3[t3Offset+1], t1[t1OffsetV1]);
		t1[t1OffsetV2] = Math.fma(t2V2, t3[t3Offset+2], t1[t1OffsetV2]);
		t1[t1OffsetV3] = Math.fma(t2V3, t3[t3Offset+3], t1[t1OffsetV3]);
		
		return t1;
	}
	
	public static float[] tup_fam_4fa(float[] t1, int t1Offset,float t2V0, float t2V1, float t2V2, float t2V3, float t3V0, float t3V1, float t3V2, float t3V3)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = Math.fma(t2V0, t3V0, t1[t1OffsetV0]);
		t1[t1OffsetV1] = Math.fma(t2V1, t3V1, t1[t1OffsetV1]);
		t1[t1OffsetV2] = Math.fma(t2V2, t3V2, t1[t1OffsetV2]);
		t1[t1OffsetV3] = Math.fma(t2V3, t3V3, t1[t1OffsetV3]);
		
		return t1;
	}
	
	public static float[] tup_famN_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t2[t2Offset+0], t3[t3Offset+0], t1[t1Offset+0]),
			Math.fma(t2[t2Offset+1], t3[t3Offset+1], t1[t1Offset+1]),
			Math.fma(t2[t2Offset+2], t3[t3Offset+2], t1[t1Offset+2]),
			Math.fma(t2[t2Offset+3], t3[t3Offset+3], t1[t1Offset+3])
		};
	}
	
	public static float[] tup_famN_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2, float t3V3)
	{
		return new float[] {
			Math.fma(t2[t2Offset+0], t3V0, t1[t1Offset+0]),
			Math.fma(t2[t2Offset+1], t3V1, t1[t1Offset+1]),
			Math.fma(t2[t2Offset+2], t3V2, t1[t1Offset+2]),
			Math.fma(t2[t2Offset+3], t3V3, t1[t1Offset+3])
		};
	}
	
	public static float[] tup_famN_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1[t1Offset+0], t2V0, t3[t3Offset+0]),
			Math.fma(t1[t1Offset+1], t2V1, t3[t3Offset+1]),
			Math.fma(t1[t1Offset+2], t2V2, t3[t3Offset+2]),
			Math.fma(t1[t1Offset+3], t2V3, t3[t3Offset+3])
		};
	}
	
	public static float[] tup_famN_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, float t3V0, float t3V1, float t3V2, float t3V3)
	{
		return new float[] {
			Math.fma(t2V0, t3V0, t1[t1Offset+0]),
			Math.fma(t2V1, t3V1, t1[t1Offset+1]),
			Math.fma(t2V2, t3V2, t1[t1Offset+2]),
			Math.fma(t2V3, t3V3, t1[t1Offset+3])
		};
	}
	
	public static float[] tup_famN_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t2[t2Offset+0], t3[t3Offset+0], t1V0),
			Math.fma(t2[t2Offset+1], t3[t3Offset+1], t1V1),
			Math.fma(t2[t2Offset+2], t3[t3Offset+2], t1V2),
			Math.fma(t2[t2Offset+3], t3[t3Offset+3], t1V3)
		};
	}
	
	public static float[] tup_famN_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2, float t3V3)
	{
		return new float[] {
			Math.fma(t2[t2Offset+0], t3V0, t1V0),
			Math.fma(t2[t2Offset+1], t3V1, t1V1),
			Math.fma(t2[t2Offset+2], t3V2, t1V2),
			Math.fma(t2[t2Offset+3], t3V3, t1V3)
		};
	}
	
	public static float[] tup_famN_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float t2V0, float t2V1, float t2V2, float t2V3, float[] t3, int t3Offset)
	{
		return new float[] {
			Math.fma(t1V0, t2V0, t3[t3Offset+0]),
			Math.fma(t1V1, t2V1, t3[t3Offset+1]),
			Math.fma(t1V2, t2V2, t3[t3Offset+2]),
			Math.fma(t1V3, t2V3, t3[t3Offset+3])
		};
	}
	
	public static float[] tup_famT_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2[t2Offset+0], t3[t3Offset+0], t1[t1Offset+0]);
		res[resOffset+1] = Math.fma(t2[t2Offset+1], t3[t3Offset+1], t1[t1Offset+1]);
		res[resOffset+2] = Math.fma(t2[t2Offset+2], t3[t3Offset+2], t1[t1Offset+2]);
		res[resOffset+3] = Math.fma(t2[t2Offset+3], t3[t3Offset+3], t1[t1Offset+3]);
		
		return res;
	}
	
	public static float[] tup_famT_4fa(float[] t1, int t1Offset, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2, float t3V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2[t2Offset+0], t3V0, t1[t1Offset+0]);
		res[resOffset+1] = Math.fma(t2[t2Offset+1], t3V1, t1[t1Offset+1]);
		res[resOffset+2] = Math.fma(t2[t2Offset+2], t3V2, t1[t1Offset+2]);
		res[resOffset+3] = Math.fma(t2[t2Offset+3], t3V3, t1[t1Offset+3]);
		
		return res;
	}
	
	public static float[] tup_famT_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2V0, t3[t3Offset+0], t1[t1Offset+0]);
		res[resOffset+1] = Math.fma(t2V1, t3[t3Offset+1], t1[t1Offset+1]);
		res[resOffset+2] = Math.fma(t2V2, t3[t3Offset+2], t1[t1Offset+2]);
		res[resOffset+3] = Math.fma(t2V3, t3[t3Offset+3], t1[t1Offset+3]);
		
		return res;
	}
	
	public static float[] tup_famT_4fa(float[] t1, int t1Offset, float t2V0, float t2V1, float t2V2, float t2V3, float t3V0, float t3V1, float t3V2, float t3V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2V0, t3V0, t1[t1Offset+0]);
		res[resOffset+1] = Math.fma(t2V1, t3V1, t1[t1Offset+1]);
		res[resOffset+2] = Math.fma(t2V2, t3V2, t1[t1Offset+2]);
		res[resOffset+3] = Math.fma(t2V3, t3V3, t1[t1Offset+3]);
		
		return res;
	}
	
	public static float[] tup_famT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2[t2Offset+0], t3[t3Offset+0], t1V0);
		res[resOffset+1] = Math.fma(t2[t2Offset+1], t3[t3Offset+1], t1V1);
		res[resOffset+2] = Math.fma(t2[t2Offset+2], t3[t3Offset+2], t1V2);
		res[resOffset+3] = Math.fma(t2[t2Offset+3], t3[t3Offset+3], t1V3);
		
		return res;
	}
	
	public static float[] tup_famT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float[] t2, int t2Offset, float t3V0, float t3V1, float t3V2, float t3V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2[t2Offset+0], t3V0, t1V0);
		res[resOffset+1] = Math.fma(t2[t2Offset+1], t3V1, t1V1);
		res[resOffset+2] = Math.fma(t2[t2Offset+2], t3V2, t1V2);
		res[resOffset+3] = Math.fma(t2[t2Offset+3], t3V3, t1V3);
		
		return res;
	}
	
	public static float[] tup_famT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float t2V0, float t2V1, float t2V2, float t2V3, float[] t3, int t3Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2V0, t3[t3Offset+0], t1V0);
		res[resOffset+1] = Math.fma(t2V1, t3[t3Offset+1], t1V1);
		res[resOffset+2] = Math.fma(t2V2, t3[t3Offset+2], t1V2);
		res[resOffset+3] = Math.fma(t2V3, t3[t3Offset+3], t1V3);
		
		return res;
	}
	
	public static float[] tup_famT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, float t2V0, float t2V1, float t2V2, float t2V3, float t3V0, float t3V1, float t3V2, float t3V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.fma(t2V0, t3V0, t1V0);
		res[resOffset+1] = Math.fma(t2V1, t3V1, t1V1);
		res[resOffset+2] = Math.fma(t2V2, t3V2, t1V2);
		res[resOffset+3] = Math.fma(t2V3, t3V3, t1V3);
		
		return res;
	}
	
	public static float[] tup_sqrt_4fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = MathUtils.sqrt(t1[t1OffsetV0]);
		t1[t1OffsetV1] = MathUtils.sqrt(t1[t1OffsetV1]);
		t1[t1OffsetV2] = MathUtils.sqrt(t1[t1OffsetV2]);
		t1[t1OffsetV3] = MathUtils.sqrt(t1[t1OffsetV3]);
		
		return t1;
	}
	
	public static float[] tup_sqrtN_4fa(float[] t1, int t1Offset)
	{
		return new float[] {
			MathUtils.sqrt(t1[t1Offset+0]),
			MathUtils.sqrt(t1[t1Offset+1]),
			MathUtils.sqrt(t1[t1Offset+2]),
			MathUtils.sqrt(t1[t1Offset+3])
		};
	}
	
	public static float[] tup_sqrtT_4fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.sqrt(t1[t1Offset+0]);
		res[resOffset+1] = MathUtils.sqrt(t1[t1Offset+1]);
		res[resOffset+2] = MathUtils.sqrt(t1[t1Offset+2]);
		res[resOffset+3] = MathUtils.sqrt(t1[t1Offset+3]);
		
		return res;
	}
	
	public static float[] tup_sqrtT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.sqrt(t1V0);
		res[resOffset+1] = MathUtils.sqrt(t1V1);
		res[resOffset+2] = MathUtils.sqrt(t1V2);
		res[resOffset+3] = MathUtils.sqrt(t1V3);
		
		return res;
	}
	
	public static float[] tup_cbrt_4fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = MathUtils.cbrt(t1[t1OffsetV0]);
		t1[t1OffsetV1] = MathUtils.cbrt(t1[t1OffsetV1]);
		t1[t1OffsetV2] = MathUtils.cbrt(t1[t1OffsetV2]);
		t1[t1OffsetV3] = MathUtils.cbrt(t1[t1OffsetV3]);
		
		return t1;
	}
	
	public static float[] tup_cbrtN_4fa(float[] t1, int t1Offset)
	{
		return new float[] {
			MathUtils.cbrt(t1[t1Offset+0]),
			MathUtils.cbrt(t1[t1Offset+1]),
			MathUtils.cbrt(t1[t1Offset+2]),
			MathUtils.cbrt(t1[t1Offset+3])
		};
	}
	
	public static float[] tup_cbrtT_4fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.cbrt(t1[t1Offset+0]);
		res[resOffset+1] = MathUtils.cbrt(t1[t1Offset+1]);
		res[resOffset+2] = MathUtils.cbrt(t1[t1Offset+2]);
		res[resOffset+3] = MathUtils.cbrt(t1[t1Offset+3]);
		
		return res;
	}
	
	public static float[] tup_cbrtT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = MathUtils.cbrt(t1V0);
		res[resOffset+1] = MathUtils.cbrt(t1V1);
		res[resOffset+2] = MathUtils.cbrt(t1V2);
		res[resOffset+3] = MathUtils.cbrt(t1V3);
		
		return res;
	}
	
	public static float[] tup_abs_4fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = Math.abs(t1[t1OffsetV0]);
		t1[t1OffsetV1] = Math.abs(t1[t1OffsetV1]);
		t1[t1OffsetV2] = Math.abs(t1[t1OffsetV2]);
		t1[t1OffsetV3] = Math.abs(t1[t1OffsetV3]);
		
		return t1;
	}
	
	public static float[] tup_absN_4fa(float[] t1, int t1Offset)
	{
		return new float[] {
			Math.abs(t1[t1Offset+0]),
			Math.abs(t1[t1Offset+1]),
			Math.abs(t1[t1Offset+2]),
			Math.abs(t1[t1Offset+3])
		};
	}
	
	public static float[] tup_absT_4fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.abs(t1[t1Offset+0]);
		res[resOffset+1] = Math.abs(t1[t1Offset+1]);
		res[resOffset+2] = Math.abs(t1[t1Offset+2]);
		res[resOffset+3] = Math.abs(t1[t1Offset+3]);
		
		return res;
	}
	
	public static float[] tup_absT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = Math.abs(t1V0);
		res[resOffset+1] = Math.abs(t1V1);
		res[resOffset+2] = Math.abs(t1V2);
		res[resOffset+3] = Math.abs(t1V3);
		
		return res;
	}
	
	public static float[] tup_reciprocal_4fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = 1.0f / t1[t1OffsetV0];
		t1[t1OffsetV1] = 1.0f / t1[t1OffsetV1];
		t1[t1OffsetV2] = 1.0f / t1[t1OffsetV2];
		t1[t1OffsetV3] = 1.0f / t1[t1OffsetV3];
		
		return t1;
	}
	
	public static float[] tup_reciprocalN_4fa(float[] t1, int t1Offset)
	{
		return new float[] {
			1.0f / t1[t1Offset+0],
			1.0f / t1[t1Offset+1],
			1.0f / t1[t1Offset+2],
			1.0f / t1[t1Offset+3]
		};
	}
	
	public static float[] tup_reciprocalT_4fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = 1.0f / t1[t1Offset+0];
		res[resOffset+1] = 1.0f / t1[t1Offset+1];
		res[resOffset+2] = 1.0f / t1[t1Offset+2];
		res[resOffset+3] = 1.0f / t1[t1Offset+3];
		
		return res;
	}
	
	public static float[] tup_reciprocalT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = 1.0f / t1V0;
		res[resOffset+1] = 1.0f / t1V1;
		res[resOffset+2] = 1.0f / t1V2;
		res[resOffset+3] = 1.0f / t1V3;
		
		return res;
	}
	
	public static float[] tup_negate_4fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] = -t1[t1OffsetV0];
		t1[t1OffsetV1] = -t1[t1OffsetV1];
		t1[t1OffsetV2] = -t1[t1OffsetV2];
		t1[t1OffsetV3] = -t1[t1OffsetV3];
		
		return t1;
	}
	
	public static float[] tup_negateN_4fa(float[] t1, int t1Offset)
	{
		return new float[] {
			-t1[t1Offset+0],
			-t1[t1Offset+1],
			-t1[t1Offset+2],
			-t1[t1Offset+3]
		};
	}
	
	public static float[] tup_negateT_4fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = -t1[t1Offset+0];
		res[resOffset+1] = -t1[t1Offset+1];
		res[resOffset+2] = -t1[t1Offset+2];
		res[resOffset+3] = -t1[t1Offset+3];
		
		return res;
	}
	
	public static float[] tup_negateT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = -t1V0;
		res[resOffset+1] = -t1V1;
		res[resOffset+2] = -t1V2;
		res[resOffset+3] = -t1V3;
		
		return res;
	}
	
	public static float[] tup_squared_4fa(float[] t1, int t1Offset)
	{
		int t1OffsetV0 = t1Offset;
		int t1OffsetV1 = t1Offset+1;
		int t1OffsetV2 = t1Offset+2;
		int t1OffsetV3 = t1Offset+3;
		
		t1[t1OffsetV0] *= t1[t1OffsetV0];
		t1[t1OffsetV1] *= t1[t1OffsetV1];
		t1[t1OffsetV2] *= t1[t1OffsetV2];
		t1[t1OffsetV3] *= t1[t1OffsetV3];
		
		return t1;
	}
	
	public static float[] tup_squaredN_4fa(float[] t1, int t1Offset)
	{
		float t1V0 = t1[t1Offset+0];
		float t1V1 = t1[t1Offset+1];
		float t1V2 = t1[t1Offset+2];
		float t1V3 = t1[t1Offset+3];
		
		return new float[] {
			t1V0 * t1V0,
			t1V1 * t1V1,
			t1V2 * t1V2,
			t1V3 * t1V3
		};
	}
	
	public static float[] tup_squaredT_4fa(float[] t1, int t1Offset, @ExtractionParam float[] res, int resOffset)
	{
		float t1V0 = t1[t1Offset+0];
		float t1V1 = t1[t1Offset+1];
		float t1V2 = t1[t1Offset+2];
		float t1V3 = t1[t1Offset+3];
		
		res[resOffset+0] = t1V0 * t1V0;
		res[resOffset+1] = t1V1 * t1V1;
		res[resOffset+2] = t1V2 * t1V2;
		res[resOffset+3] = t1V3 * t1V3;
		
		return res;
	}
	
	public static float[] tup_squaredT_4fa(float t1V0, float t1V1, float t1V2, float t1V3, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset+0] = t1V0 * t1V0;
		res[resOffset+1] = t1V1 * t1V1;
		res[resOffset+2] = t1V2 * t1V2;
		res[resOffset+3] = t1V3 * t1V3;
		
		return res;
	}
}
