package org.barghos.api.core.tuple.floats;

import java.lang.foreign.MemorySegment;

import org.barghos.annotation.ExtractionParam;

import static java.lang.foreign.ValueLayout.*;

import static org.barghos.api.core.tuple.floats.TupMemUtilsF.*;

public class ArithmeticOpsITupMem2F
{
	private ArithmeticOpsITupMem2F() { }
	
	public static float[] tup_addN_2f(MemorySegment v1, ITup2RF v2)
	{
		return new float[] {
			v1.get(JAVA_FLOAT, OFFSET_F_X) + v2.v0(),
			v1.get(JAVA_FLOAT, OFFSET_F_Y) + v2.v1()
		};
	}
	
	public static float[] tup_addN_2f(MemorySegment v1, ITupRF v2)
	{
		return new float[] {
			v1.get(JAVA_FLOAT, OFFSET_F_X) + v2.at(0),
			v1.get(JAVA_FLOAT, OFFSET_F_Y) + v2.at(0)
		};
	}
	
	public static float[] tup_addN_2f(ITup2RF v1, MemorySegment v2)
	{
		return new float[] {
			v1.v0() + v2.get(JAVA_FLOAT, OFFSET_F_X),
			v1.v1() + v2.get(JAVA_FLOAT, OFFSET_F_Y)
		};
	}
	
	public static float[] tup_addN_2f(ITupRF v1, MemorySegment v2)
	{
		return new float[] {
			v1.at(0) + v2.get(JAVA_FLOAT, OFFSET_F_X),
			v1.at(1) + v2.get(JAVA_FLOAT, OFFSET_F_Y)
		};
	}
	
	public static float[] tup_addT_2f(MemorySegment v1, ITup2RF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.get(JAVA_FLOAT, OFFSET_F_X) + v2.v0();
		res[1] = v1.get(JAVA_FLOAT, OFFSET_F_Y) + v2.v1();
		
		return res;
	}
	
	public static float[] tup_addT_2f(MemorySegment v1, ITupRF v2, @ExtractionParam float[] res)
	{
		res[0] = v1.get(JAVA_FLOAT, OFFSET_F_X) + v2.at(0);
		res[1] = v1.get(JAVA_FLOAT, OFFSET_F_Y) + v2.at(1);
		
		return res;
	}
	
	public static float[] tup_addT_2f(ITup2RF v1, MemorySegment v2, @ExtractionParam float[] res)
	{
		res[0] = v1.v0() + v2.get(JAVA_FLOAT, OFFSET_F_X);
		res[1] = v1.v1() + v2.get(JAVA_FLOAT, OFFSET_F_Y);
		
		return res;
	}
	
	public static float[] tup_addT_2f(ITupRF v1, MemorySegment v2, @ExtractionParam float[] res)
	{
		res[0] = v1.at(0) + v2.get(JAVA_FLOAT, OFFSET_F_X);
		res[1] = v1.at(1) + v2.get(JAVA_FLOAT, OFFSET_F_Y);
		
		return res;
	}
}
