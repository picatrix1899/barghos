package org.barghos.api.core.tuple.floats;

import java.lang.foreign.MemorySegment;
import static java.lang.foreign.ValueLayout.*;

import org.barghos.annotation.ExtractionParam;
import static org.barghos.api.core.tuple.floats.TupMemUtilsF.*;

public class ArithmeticOpsMem2F
{
	private ArithmeticOpsMem2F() { }

	public static float[] tup_add_2f(float[] v1, MemorySegment v2)
	{
		v1[0] += v2.get(JAVA_FLOAT, OFFSET_F_X);
		v1[1] += v2.get(JAVA_FLOAT, OFFSET_F_Y);
		
		return v1;
	}
	
	public static float[] tup_addN_2f(MemorySegment v1, MemorySegment v2)
	{
		return new float[] {
			v1.get(JAVA_FLOAT, OFFSET_F_X) + v2.get(JAVA_FLOAT, OFFSET_F_X),
			v1.get(JAVA_FLOAT, OFFSET_F_Y) + v2.get(JAVA_FLOAT, OFFSET_F_Y)
		};
	}
	
	public static float[] tup_addN_2f(MemorySegment v1, float[] v2)
	{
		return new float[] {
			v1.get(JAVA_FLOAT, OFFSET_F_X) + v2[0],
			v1.get(JAVA_FLOAT, OFFSET_F_Y) + v2[1]
		};
	}
	
	public static float[] tup_addN_2f(MemorySegment v1, float v2V0, float v2V1)
	{
		return new float[] {
			v1.get(JAVA_FLOAT, OFFSET_F_X) + v2V0,
			v1.get(JAVA_FLOAT, OFFSET_F_Y) + v2V1
		};
	}
	
	public static float[] tup_addN_2f(float[] v1, MemorySegment v2)
	{
		return new float[] {
			v1[0] + v2.get(JAVA_FLOAT, OFFSET_F_X),
			v1[1] + v2.get(JAVA_FLOAT, OFFSET_F_Y)
		};
	}
	
	public static float[] tup_addN_2f(float v1V0, float v1V1, MemorySegment v2)
	{
		return new float[] {
			v1V0 + v2.get(JAVA_FLOAT, OFFSET_F_X),
			v1V1 + v2.get(JAVA_FLOAT, OFFSET_F_Y)
		};
	}
	
	public static float[] tup_addT_2f(MemorySegment v1, MemorySegment v2, @ExtractionParam float[] res)
	{
		res[0] = v1.get(JAVA_FLOAT, OFFSET_F_X) + v2.get(JAVA_FLOAT, OFFSET_F_X);
		res[1] = v1.get(JAVA_FLOAT, OFFSET_F_Y) + v2.get(JAVA_FLOAT, OFFSET_F_Y);
		
		return res;
	}
	
	public static float[] tup_addT_2f(MemorySegment v1, float[] v2, @ExtractionParam float[] res)
	{
		res[0] = v1.get(JAVA_FLOAT, OFFSET_F_X) + v2[0];
		res[1] = v1.get(JAVA_FLOAT, OFFSET_F_Y) + v2[1];
		
		return res;
	}
	
	public static float[] tup_addT_2f(MemorySegment v1, float v2V0, float v2V1, @ExtractionParam float[] res)
	{
		res[0] = v1.get(JAVA_FLOAT, OFFSET_F_X) + v2V0;
		res[1] = v1.get(JAVA_FLOAT, OFFSET_F_Y) + v2V1;
		
		return res;
	}
	
	public static float[] tup_addT_2f(float[] v1, MemorySegment v2, @ExtractionParam float[] res)
	{
		res[0] = v1[0] + v2.get(JAVA_FLOAT, OFFSET_F_X);
		res[1] = v1[1] + v2.get(JAVA_FLOAT, OFFSET_F_Y);
		
		return res;
	}
	
	public static float[] tup_addT_2f(float v1V0, float v1V1, MemorySegment v2, @ExtractionParam float[] res)
	{
		res[0] = v1V0 + v2.get(JAVA_FLOAT, OFFSET_F_X);
		res[1] = v1V1 + v2.get(JAVA_FLOAT, OFFSET_F_Y);
		
		return res;
	}
	
	public static MemorySegment tup_add_mem2f(MemorySegment v1, MemorySegment v2)
	{
		v1.set(JAVA_FLOAT, OFFSET_F_X, v1.get(JAVA_FLOAT, OFFSET_F_X) + v2.get(JAVA_FLOAT, OFFSET_F_X));
		v1.set(JAVA_FLOAT, OFFSET_F_Y, v1.get(JAVA_FLOAT, OFFSET_F_Y) + v2.get(JAVA_FLOAT, OFFSET_F_Y));
		
		return v1;
	}
	
	public static MemorySegment tup_add_mem2f(MemorySegment v1, float[] v2)
	{
		v1.set(JAVA_FLOAT, OFFSET_F_X, v1.get(JAVA_FLOAT, OFFSET_F_X) + v2[0]);
		v1.set(JAVA_FLOAT, OFFSET_F_Y, v1.get(JAVA_FLOAT, OFFSET_F_Y) + v2[1]);
		
		return v1;
	}
	
	public static MemorySegment tup_add_mem2f(MemorySegment v1, float v2V0, float v2V1)
	{
		v1.set(JAVA_FLOAT, OFFSET_F_X, v1.get(JAVA_FLOAT, OFFSET_F_X) + v2V0);
		v1.set(JAVA_FLOAT, OFFSET_F_Y, v1.get(JAVA_FLOAT, OFFSET_F_Y) + v2V1);
		
		return v1;
	}
	
	public static MemorySegment tup_addT_mem2f(MemorySegment v1, MemorySegment v2, @ExtractionParam MemorySegment res)
	{
		res.set(JAVA_FLOAT, OFFSET_F_X, v1.get(JAVA_FLOAT, OFFSET_F_X) + v2.get(JAVA_FLOAT, OFFSET_F_X));
		res.set(JAVA_FLOAT, OFFSET_F_Y, v1.get(JAVA_FLOAT, OFFSET_F_Y) + v2.get(JAVA_FLOAT, OFFSET_F_Y));
		
		return res;
	}
	
	public static MemorySegment tup_addT_mem2f(MemorySegment v1, float[] v2, @ExtractionParam MemorySegment res)
	{
		res.set(JAVA_FLOAT, OFFSET_F_X, v1.get(JAVA_FLOAT, OFFSET_F_X) + v2[0]);
		res.set(JAVA_FLOAT, OFFSET_F_Y, v1.get(JAVA_FLOAT, OFFSET_F_Y) + v2[1]);
		
		return res;
	}
	
	public static MemorySegment tup_addT_mem2f(MemorySegment v1, float v2V0, float v2V1, @ExtractionParam MemorySegment res)
	{
		res.set(JAVA_FLOAT, OFFSET_F_X, v1.get(JAVA_FLOAT, OFFSET_F_X) + v2V0);
		res.set(JAVA_FLOAT, OFFSET_F_Y, v1.get(JAVA_FLOAT, OFFSET_F_Y) + v2V1);
		
		return res;
	}
	
	public static MemorySegment tup_addT_mem2f(float[] v1, MemorySegment v2, @ExtractionParam MemorySegment res)
	{
		res.set(JAVA_FLOAT, OFFSET_F_X, v1[0] + v2.get(JAVA_FLOAT, OFFSET_F_X));
		res.set(JAVA_FLOAT, OFFSET_F_Y, v1[1] + v2.get(JAVA_FLOAT, OFFSET_F_Y));
		
		return res;
	}
	
	public static MemorySegment tup_addT_mem2f(float[] v1, float[] v2, @ExtractionParam MemorySegment res)
	{
		res.set(JAVA_FLOAT, OFFSET_F_X, v1[0] + v2[0]);
		res.set(JAVA_FLOAT, OFFSET_F_Y, v1[1] + v2[1]);
		
		return res;
	}
	
	public static MemorySegment tup_addT_mem2f(float[] v1, float v2V0, float v2V1, @ExtractionParam MemorySegment res)
	{
		res.set(JAVA_FLOAT, OFFSET_F_X, v1[0] + v2V0);
		res.set(JAVA_FLOAT, OFFSET_F_Y, v1[1] + v2V1);
		
		return res;
	}
	
	public static MemorySegment tup_addT_mem2f(float v1V0, float v1V1, MemorySegment v2, @ExtractionParam MemorySegment res)
	{
		res.set(JAVA_FLOAT, OFFSET_F_X, v1V0 + v2.get(JAVA_FLOAT, OFFSET_F_X));
		res.set(JAVA_FLOAT, OFFSET_F_Y, v1V1 + v2.get(JAVA_FLOAT, OFFSET_F_Y));
		
		return res;
	}
	
	public static MemorySegment tup_addT_mem2f(float v1V0, float v1V1, float[] v2, @ExtractionParam MemorySegment res)
	{
		res.set(JAVA_FLOAT, OFFSET_F_X, v1V0 + v2[0]);
		res.set(JAVA_FLOAT, OFFSET_F_Y, v1V1 + v2[1]);
		
		return res;
	}
	
	public static MemorySegment tup_addT_mem2f(float v1V0, float v1V1, float v2V0, float v2V1, @ExtractionParam MemorySegment res)
	{
		res.set(JAVA_FLOAT, OFFSET_F_X, v1V0 + v2V0);
		res.set(JAVA_FLOAT, OFFSET_F_Y, v1V1 + v2V1);
		
		return res;
	}
}
