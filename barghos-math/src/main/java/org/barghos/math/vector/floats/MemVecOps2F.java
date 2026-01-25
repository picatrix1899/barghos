package org.barghos.math.vector.floats;

import java.lang.foreign.MemorySegment;

import org.barghos.annotation.ExtractionParam;

import static java.lang.foreign.ValueLayout.*;

public class MemVecOps2F
{
	private MemVecOps2F() { }
	
	public static MemorySegment write(MemorySegment v1, long v1Offset, @ExtractionParam MemorySegment res, long resOffset)
	{
		MemorySegment.copy(v1, v1Offset, res, resOffset, 8);
		
		return res;
	}
	
	public static MemorySegment write(float[] v1, int v1Offset, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1[v1Offset]);
		res.set(JAVA_FLOAT, resOffset+4, v1[v1Offset+1]);
		
		return res;
	}
	
	public static MemorySegment write(float v1X, float v1Y, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1X);
		res.set(JAVA_FLOAT, resOffset+4, v1Y);
		
		return res;
	}
	
	public static MemorySegment writeBlock8(MemorySegment v1, long v1Offset, @ExtractionParam MemorySegment res, long resOffset)
	{
		MemorySegment.copy(v1, v1Offset, res, resOffset, 8);
		
		return res;
	}
	
	public static MemorySegment writeBlock8(float[] v1, int v1Offset, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1[v1Offset]);
		res.set(JAVA_FLOAT, resOffset+4, v1[v1Offset+1]);
		
		return res;
	}
	
	public static MemorySegment writeBlock8(float v1X, float v1Y, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1X);
		res.set(JAVA_FLOAT, resOffset+4, v1Y);
		
		return res;
	}
	
	public static MemorySegment writeBlock16(MemorySegment v1, long v1Offset, @ExtractionParam MemorySegment res, long resOffset)
	{
		MemorySegment.copy(v1, v1Offset, res, resOffset, 8);
		res.set(JAVA_FLOAT, resOffset+8, 0);
		res.set(JAVA_FLOAT, resOffset+12, 0);
		
		return res;
	}
	
	public static MemorySegment writeBlock16(float[] v1, int v1Offset, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1[v1Offset]);
		res.set(JAVA_FLOAT, resOffset+4, v1[v1Offset+1]);
		res.set(JAVA_FLOAT, resOffset+8, 0);
		res.set(JAVA_FLOAT, resOffset+12, 0);
		
		return res;
	}
	
	public static MemorySegment writeBlock16(float v1X, float v1Y, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1X);
		res.set(JAVA_FLOAT, resOffset+4, v1Y);
		res.set(JAVA_FLOAT, resOffset+8, 0);
		res.set(JAVA_FLOAT, resOffset+12, 0);
		
		return res;
	}
	
	public static MemorySegment read(MemorySegment mem, long memOffset, @ExtractionParam MemorySegment res, long resOffset)
	{
		MemorySegment.copy(mem, memOffset, res, resOffset, 8);

		return res;
	}
	
	public static float[] read(MemorySegment mem, long memOffset, @ExtractionParam float[] res, int resOffset)
	{
		res[resOffset] = mem.get(JAVA_FLOAT, memOffset);
		res[resOffset+1] = mem.get(JAVA_FLOAT, memOffset+4);
		
		return res;
	}
	
}
