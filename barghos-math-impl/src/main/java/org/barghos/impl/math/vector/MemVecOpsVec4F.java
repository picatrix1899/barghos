package org.barghos.impl.math.vector;

import java.lang.foreign.MemorySegment;

import org.barghos.annotation.ExtractionParam;

import static java.lang.foreign.ValueLayout.*;

public class MemVecOpsVec4F
{
	private MemVecOpsVec4F() { }
	
	public static MemorySegment write(Vec4F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		res.set(JAVA_FLOAT, resOffset+8, v1.z);
		res.set(JAVA_FLOAT, resOffset+12, v1.w);
		
		return res;
	}
	
	public static MemorySegment write(ConstVec4F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		res.set(JAVA_FLOAT, resOffset+8, v1.z);
		res.set(JAVA_FLOAT, resOffset+12, v1.w);
		
		return res;
	}
	
	public static MemorySegment writeBlock8(Vec4F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		res.set(JAVA_FLOAT, resOffset+8, v1.z);
		res.set(JAVA_FLOAT, resOffset+12, v1.w);
		
		return res;
	}
	
	public static MemorySegment writeBlock8(ConstVec4F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		res.set(JAVA_FLOAT, resOffset+8, v1.z);
		res.set(JAVA_FLOAT, resOffset+12, v1.w);
		
		return res;
	}
	
	public static MemorySegment writeBlock16(Vec4F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		res.set(JAVA_FLOAT, resOffset+8, v1.z);
		res.set(JAVA_FLOAT, resOffset+12, v1.w);
		
		return res;
	}
	
	public static MemorySegment writeBlock16(ConstVec4F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		res.set(JAVA_FLOAT, resOffset+8, v1.z);
		res.set(JAVA_FLOAT, resOffset+12, v1.w);
		
		return res;
	}
	
	public static Vec4F read(MemorySegment mem, long memOffset, @ExtractionParam Vec4F res)
	{
		res.x = mem.get(JAVA_FLOAT, memOffset);
		res.y = mem.get(JAVA_FLOAT, memOffset+4);
		res.z = mem.get(JAVA_FLOAT, memOffset+8);
		res.w = mem.get(JAVA_FLOAT, memOffset+12);
		
		return res;
	}
}
