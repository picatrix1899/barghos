package org.barghos.api.core.tuple.floats;

import org.barghos.annotation.ExtractionParam;
import org.barghos.api.core.math.MathUtils;

public final class ValueOps2F
{
	private ValueOps2F() { }
	
	public static float tup_min_2f(float[] t1)
	{
		return Math.min(t1[0], t1[1]);
	}
	
	public static float tup_min_2f(float t1V0, float t1V1)
	{
		return Math.min(t1V0, t1V1);
	}
	
	public static float[] tup_min_2f(float[] t1, float[] t2)
	{
		t1[0] = Math.min(t1[0], t2[0]);
		t1[1] = Math.min(t1[1], t2[1]);
		
		return t1;
	}
	
	public static float[] tup_min_2f(float[] t1, float t2V0, float t2V1)
	{
		t1[0] = Math.min(t1[0], t2V0);
		t1[1] = Math.min(t1[1], t2V1);
		
		return t1;
	}
	
	public static float[] tup_minN_2f(float[] t1, float[] t2)
	{
		return new float[] {
			Math.min(t1[0], t2[0]),
			Math.min(t1[1], t2[1])
		};
	}
	
	public static float[] tup_minN_2f(float[] t1, float t2V0, float t2V1)
	{
		return new float[] {
			Math.min(t1[0], t2V0),
			Math.min(t1[1], t2V1)
		};
	}
	
	public static float[] tup_minN_2f(float t1V0, float t1V1, float[] t2)
	{
		return new float[] {
			Math.min(t1V0, t2[0]),
			Math.min(t1V1, t2[1])
		};
	}
	
	public static float[] tup_minN_2f(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return new float[] {
			Math.min(t1V0, t2V0),
			Math.min(t1V1, t2V1)
		};
	}
	
	public static float[] tup_minT_2f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1[0], t2[0]);
		res[1] = Math.min(t1[1], t2[1]);
		
		return res;
	}
	
	public static float[] tup_minT_2f(float[] t1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1[0], t2V0);
		res[1] = Math.min(t1[0], t2V1);
		
		return res;
	}
	
	public static float[] tup_minT_2f(float t1V0, float t1V1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1V0, t2[0]);
		res[1] = Math.min(t1V1, t2[0]);
		
		return res;
	}
	
	public static float[] tup_minT_2f(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = Math.min(t1V0, t2V0);
		res[1] = Math.min(t1V1, t2V1);
		
		return res;
	}
	
	public static float tup_max_2f(float[] t1)
	{
		return Math.max(t1[0], t1[1]);
	}
	
	public static float tup_max_2f(float t1V0, float t1V1)
	{
		return Math.max(t1V0, t1V1);
	}
	
	public static float[] tup_max_2f(float[] t1, float[] t2)
	{
		t1[0] = Math.max(t1[0], t2[0]);
		t1[1] = Math.max(t1[1], t2[1]);
		
		return t1;
	}
	
	public static float[] tup_max_2f(float[] t1, float t2V0, float t2V1)
	{
		t1[0] = Math.max(t1[0], t2V0);
		t1[1] = Math.max(t1[1], t2V1);
		
		return t1;
	}
	
	public static float[] tup_maxN_2f(float[] t1, float[] t2)
	{
		return new float[] {
			Math.max(t1[0], t2[0]),
			Math.max(t1[1], t2[1])
		};
	}
	
	public static float[] tup_maxN_2f(float[] t1, float t2V0, float t2V1)
	{
		return new float[] {
			Math.max(t1[0], t2V0),
			Math.max(t1[1], t2V1)
		};
	}
	
	public static float[] tup_maxN_2f(float t1V0, float t1V1, float[] t2)
	{
		return new float[] {
			Math.max(t1V0, t2[0]),
			Math.max(t1V1, t2[1])
		};
	}
	
	public static float[] tup_maxN_2f(float t1V0, float t1V1, float t2V0, float t2V1)
	{
		return new float[] {
			Math.max(t1V0, t2V0),
			Math.max(t1V1, t2V1)
		};
	}
	
	public static float[] tup_maxT_2f(float[] t1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1[0], t2[0]);
		res[1] = Math.max(t1[1], t2[1]);
		
		return res;
	}
	
	public static float[] tup_maxT_2f(float[] t1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1[0], t2V0);
		res[1] = Math.max(t1[0], t2V1);
		
		return res;
	}
	
	public static float[] tup_maxT_2f(float t1V0, float t1V1, float[] t2, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1V0, t2[0]);
		res[1] = Math.max(t1V1, t2[0]);
		
		return res;
	}
	
	public static float[] tup_maxT_2f(float t1V0, float t1V1, float t2V0, float t2V1, @ExtractionParam float[] res)
	{
		res[0] = Math.max(t1V0, t2V0);
		res[1] = Math.max(t1V1, t2V1);
		
		return res;
	}
	
	public static float[] tup_signum_2f(float[] t1)
	{
		t1[0] = Math.signum(t1[0]);
		t1[1] = Math.signum(t1[1]);
		
		return t1;
	}
	
	public static float[] tup_signumN_2f(float[] t1)
	{
		return new float[] {
			Math.signum(t1[0]),
			Math.signum(t1[1])
		};
	}
	
	public static float[] tup_signumN_2f(float t1V0, float t1V1)
	{
		return new float[] {
			Math.signum(t1V0),
			Math.signum(t1V1)
		};
	}
	
	public static float[] tup_signumT_2f(float[] t1, @ExtractionParam float[] res)
	{
		res[0] = Math.signum(t1[0]);
		res[1] = Math.signum(t1[1]);
		
		return res;
	}
	
	public static float[] tup_signumT_2f(float t1V0, float t1V1, @ExtractionParam float[] res)
	{
		res[0] = Math.signum(t1V0);
		res[1] = Math.signum(t1V1);
		
		return res;
	}
	
	public static float[] tup_clampMin_2f(float[] t1, float[] min)
	{
		t1[0] = MathUtils.clampMin(t1[0], min[0]);
		t1[1] = MathUtils.clampMin(t1[1], min[1]);
		
		return t1;
	}
	
	public static float[] tup_clampMin_2f(float[] t1, float minV0, float minV1)
	{
		t1[0] = MathUtils.clampMin(t1[0], minV0);
		t1[1] = MathUtils.clampMin(t1[1], minV1);
		
		return t1;
	}
	
	public static float[] tup_clampMinN_2f(float[] t1, float[] min)
	{
		return new float[] {
			MathUtils.clampMin(t1[0], min[0]),
			MathUtils.clampMin(t1[1], min[1])
		};
	}
	
	public static float[] tup_clampMinN_2f(float[] t1, float minV0, float minV1)
	{
		return new float[] {
			MathUtils.clampMin(t1[0], minV0),
			MathUtils.clampMin(t1[1], minV1)
		};
	}
	
	public static float[] tup_clampMinN_2f(float t1V0, float t1V1, float[] min)
	{
		return new float[] {
			MathUtils.clampMin(t1V0, min[0]),
			MathUtils.clampMin(t1V1, min[1])
		};
	}
	
	public static float[] tup_clampMinN_2f(float t1V0, float t1V1, float minV0, float minV1)
	{
		return new float[] {
			MathUtils.clampMin(t1V0, minV0),
			MathUtils.clampMin(t1V1, minV1)
		};
	}
	
	public static float[] tup_clampMinT_2f(float[] t1, float[] min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(t1[0], min[0]);
		res[1] = MathUtils.clampMin(t1[1], min[1]);
		
		return res;
	}
	
	public static float[] tup_clampMinT_2f(float[] t1, float minV0, float minV1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(t1[0], minV0);
		res[1] = MathUtils.clampMin(t1[1], minV1);
		
		return res;
	}
	
	public static float[] tup_clampMinT_2f(float t1V0, float t1V1, float[] min, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(t1V0, min[0]);
		res[1] = MathUtils.clampMin(t1V1, min[1]);
		
		return res;
	}
	
	public static float[] tup_clampMinT_2f(float t1V0, float t1V1, float minV0, float minV1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMin(t1V0, minV0);
		res[1] = MathUtils.clampMin(t1V1, minV1);
		
		return res;
	}
	
	public static float[] tup_clampMax_2f(float[] t1, float[] max)
	{
		t1[0] = MathUtils.clampMax(t1[0], max[0]);
		t1[1] = MathUtils.clampMax(t1[1], max[1]);
		
		return t1;
	}
	
	public static float[] tup_clampMax_2f(float[] t1, float maxV0, float maxV1)
	{
		t1[0] = MathUtils.clampMax(t1[0], maxV0);
		t1[1] = MathUtils.clampMax(t1[1], maxV1);
		
		return t1;
	}
	
	public static float[] tup_clampMaxN_2f(float[] t1, float[] max)
	{
		return new float[] {
			MathUtils.clampMax(t1[0], max[0]),
			MathUtils.clampMax(t1[1], max[1])
		};
	}
	
	public static float[] tup_clampMaxN_2f(float[] t1, float maxV0, float maxV1)
	{
		return new float[] {
			MathUtils.clampMax(t1[0], maxV0),
			MathUtils.clampMax(t1[1], maxV1)
		};
	}
	
	public static float[] tup_clampMaxN_2f(float t1V0, float t1V1, float[] max)
	{
		return new float[] {
			MathUtils.clampMax(t1V0, max[0]),
			MathUtils.clampMax(t1V1, max[1])
		};
	}
	
	public static float[] tup_clampMaxN_2f(float t1V0, float t1V1, float maxV0, float maxV1)
	{
		return new float[] {
			MathUtils.clampMax(t1V0, maxV0),
			MathUtils.clampMax(t1V1, maxV1)
		};
	}
	
	public static float[] tup_clampMaxT_2f(float[] t1, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(t1[0], max[0]);
		res[1] = MathUtils.clampMax(t1[1], max[1]);
		
		return res;
	}
	
	public static float[] tup_clampMaxT_2f(float[] t1, float maxV0, float maxV1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(t1[0], maxV0);
		res[1] = MathUtils.clampMax(t1[1], maxV1);
		
		return res;
	}
	
	public static float[] tup_clampMaxT_2f(float t1V0, float t1V1, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(t1V0, max[0]);
		res[1] = MathUtils.clampMax(t1V1, max[1]);
		
		return res;
	}
	
	public static float[] tup_clampMaxT_2f(float t1V0, float t1V1, float maxV0, float maxV1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clampMax(t1V0, maxV0);
		res[1] = MathUtils.clampMax(t1V1, maxV1);
		
		return res;
	}
	
	public static float[] tup_clamp_2f(float[] t1, float[] min, float[] max)
	{
		t1[0] = MathUtils.clamp(t1[0], min[0], max[0]);
		t1[1] = MathUtils.clamp(t1[1], min[1], max[1]);
		
		return t1;
	}
	
	public static float[] tup_clamp_2f(float[] t1, float[] min, float maxV0, float maxV1)
	{
		t1[0] = MathUtils.clamp(t1[0], min[0], maxV0);
		t1[1] = MathUtils.clamp(t1[1], min[1], maxV1);
		
		return t1;
	}
	
	public static float[] tup_clamp_2f(float[] t1, float minV0, float minV1, float[] max)
	{
		t1[0] = MathUtils.clamp(t1[0], minV0, max[0]);
		t1[1] = MathUtils.clamp(t1[1], minV1, max[1]);
		
		return t1;
	}
	
	public static float[] tup_clamp_2f(float[] t1, float minV0, float minV1, float maxV0, float maxV1)
	{
		t1[0] = MathUtils.clamp(t1[0], minV0, maxV0);
		t1[1] = MathUtils.clamp(t1[1], minV1, maxV1);
		
		return t1;
	}
	
	public static float[] tup_clampN_2f(float[] t1, float[] min, float[] max)
	{
		return new float[] {
			MathUtils.clamp(t1[0], min[0], max[0]),
			MathUtils.clamp(t1[1], min[1], max[1])
		};
	}
	
	public static float[] tup_clampN_2f(float[] t1, float[] min, float maxV0, float maxV1)
	{
		return new float[] {
			MathUtils.clamp(t1[0], min[0], maxV0),
			MathUtils.clamp(t1[1], min[1], maxV1)
		};
	}
	
	public static float[] tup_clampN_2f(float[] t1, float minV0, float minV1, float[] max)
	{
		return new float[] {
			MathUtils.clamp(t1[0], minV0, max[0]),
			MathUtils.clamp(t1[1], minV1, max[1])
		};
	}
	
	public static float[] tup_clampN_2f(float[] t1, float minV0, float minV1, float maxV0, float maxV1)
	{
		return new float[] {
			MathUtils.clamp(t1[0], minV0, maxV0),
			MathUtils.clamp(t1[1], minV1, maxV1)
		};
	}
	
	public static float[] tup_clampN_2f(float t1V0, float t1V1, float[] min, float[] max)
	{
		return new float[] {
			MathUtils.clamp(t1V0, min[0], max[0]),
			MathUtils.clamp(t1V1, min[1], max[1])
		};
	}
	
	public static float[] tup_clampN_2f(float t1V0, float t1V1, float[] min, float maxV0, float maxV1)
	{
		return new float[] {
			MathUtils.clamp(t1V0, min[0], maxV0),
			MathUtils.clamp(t1V1, min[1], maxV1)
		};
	}
	
	public static float[] tup_clampN_2f(float t1V0, float t1V1, float minV0, float minV1, float[] max)
	{
		return new float[] {
			MathUtils.clamp(t1V0, minV0, max[0]),
			MathUtils.clamp(t1V1, minV1, max[1])
		};
	}
	
	public static float[] tup_clampN_2f(float t1V0, float t1V1, float minV0, float minV1, float maxV0, float maxV1)
	{
		return new float[] {
			MathUtils.clamp(t1V0, minV0, maxV0),
			MathUtils.clamp(t1V1, minV1, maxV1)
		};
	}
	
	public static float[] tup_clampT_2f(float[] t1, float[] min, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(t1[0], min[0], max[0]);
		res[1] = MathUtils.clamp(t1[1], min[1], max[1]);
		
		return res;
	}
	
	public static float[] tup_clampT_2f(float[] t1, float[] min, float maxV0, float maxV1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(t1[0], min[0], maxV0);
		res[1] = MathUtils.clamp(t1[1], min[1], maxV1);
		
		return res;
	}
	
	public static float[] tup_clampT_2f(float[] t1, float minV0, float minV1, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(t1[0], minV0, max[0]);
		res[1] = MathUtils.clamp(t1[1], minV1, max[1]);
		
		return res;
	}
	
	public static float[] tup_clampT_2f(float[] t1, float minV0, float minV1, float maxV0, float maxV1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(t1[0], minV0, maxV0);
		res[1] = MathUtils.clamp(t1[1], minV1, maxV1);
		
		return res;
	}
	
	public static float[] tup_clampT_2f(float t1V0, float t1V1, float[] min, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(t1V0, min[0], max[0]);
		res[1] = MathUtils.clamp(t1V1, min[1], max[1]);
		
		return res;
	}
	
	public static float[] tup_clampT_2f(float t1V0, float t1V1, float[] min, float maxV0, float maxV1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(t1V0, min[0], maxV0);
		res[1] = MathUtils.clamp(t1V1, min[1], maxV1);
		
		return res;
	}
	
	public static float[] tup_clampT_2f(float t1V0, float t1V1, float minV0, float minV1, float[] max, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(t1V0, minV0, max[0]);
		res[1] = MathUtils.clamp(t1V1, minV1, max[1]);
		
		return res;
	}
	
	public static float[] tup_clampT_2f(float t1V0, float t1V1, float minV0, float minV1, float maxV0, float maxV1, @ExtractionParam float[] res)
	{
		res[0] = MathUtils.clamp(t1V0, minV0, maxV0);
		res[1] = MathUtils.clamp(t1V1, minV1, maxV1);
		
		return res;
	}
}
