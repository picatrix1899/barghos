package org.barghos.math.vector.floats;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;

import java.lang.foreign.MemorySegment;

import org.barghos.annotation.ExtractionParam;

public class MemVecOps4F
{
	private MemVecOps4F() { }
	
	public static MemorySegment write(MemorySegment v1, long v1Offset, @ExtractionParam MemorySegment res, long resOffset)
	{
		MemorySegment.copy(v1, v1Offset, res, resOffset, 16);
		
		return res;
	}
	
	public static MemorySegment write(float[] v1, int v1Offset, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1[v1Offset]);
		res.set(JAVA_FLOAT, resOffset+4, v1[v1Offset+1]);
		res.set(JAVA_FLOAT, resOffset+8, v1[v1Offset+2]);
		res.set(JAVA_FLOAT, resOffset+12, v1[v1Offset+3]);
		
		return res;
	}
	
	public static MemorySegment write(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1X);
		res.set(JAVA_FLOAT, resOffset+4, v1Y);
		res.set(JAVA_FLOAT, resOffset+8, v1Z);
		res.set(JAVA_FLOAT, resOffset+12, v1W);
		
		return res;
	}
	
	public static MemorySegment writeBlock8(MemorySegment v1, long v1Offset, @ExtractionParam MemorySegment res, long resOffset)
	{
		MemorySegment.copy(v1, v1Offset, res, resOffset, 16);
		
		return res;
	}
	
	public static MemorySegment writeBlock8(float[] v1, int v1Offset, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1[v1Offset]);
		res.set(JAVA_FLOAT, resOffset+4, v1[v1Offset+1]);
		res.set(JAVA_FLOAT, resOffset+8, v1[v1Offset+2]);
		res.set(JAVA_FLOAT, resOffset+12, v1[v1Offset+3]);
		
		return res;
	}
	
	public static MemorySegment writeBlock8(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1X);
		res.set(JAVA_FLOAT, resOffset+4, v1Y);
		res.set(JAVA_FLOAT, resOffset+8, v1Z);
		res.set(JAVA_FLOAT, resOffset+12, v1W);
		
		return res;
	}
	
	public static MemorySegment writeBlock16(MemorySegment v1, long v1Offset, @ExtractionParam MemorySegment res, long resOffset)
	{
		MemorySegment.copy(v1, v1Offset, res, resOffset, 16);
		
		return res;
	}
	
	public static MemorySegment writeBlock16(float[] v1, int v1Offset, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1[v1Offset]);
		res.set(JAVA_FLOAT, resOffset+4, v1[v1Offset+1]);
		res.set(JAVA_FLOAT, resOffset+8, v1[v1Offset+2]);
		res.set(JAVA_FLOAT, resOffset+12, v1[v1Offset+3]);
		
		return res;
	}
	
	public static MemorySegment writeBlock16(float v1X, float v1Y, float v1Z, float v1W, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1X);
		res.set(JAVA_FLOAT, resOffset+4, v1Y);
		res.set(JAVA_FLOAT, resOffset+8, v1Z);
		res.set(JAVA_FLOAT, resOffset+12, v1W);
		
		return res;
	}
	
	public static MemorySegment read(MemorySegment mem, long memOffset, @ExtractionParam MemorySegment res, long resOffset)
	{
		MemorySegment.copy(mem, memOffset, res, resOffset, 16);

		return res;
	}
	
	public static float[] read(MemorySegment mem, long memOffset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset] = mem.get(JAVA_FLOAT, memOffset);
		res[resOffset+1] = mem.get(JAVA_FLOAT, memOffset+4);
		res[resOffset+2] = mem.get(JAVA_FLOAT, memOffset+8);
		res[resOffset+3] = mem.get(JAVA_FLOAT, memOffset+12);
		
		return res;
	}
	
}
