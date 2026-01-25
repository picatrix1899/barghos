package org.barghos.impl.math.vector;

import java.lang.foreign.MemorySegment;

import org.barghos.annotation.ExtractionParam;

import static java.lang.foreign.ValueLayout.*;

public class MemVecOpsVec2F
{
	private MemVecOpsVec2F() { }
	
	public static MemorySegment write(Vec2F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		
		return res;
	}
	
	public static MemorySegment write(ConstVec2F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		
		return res;
	}
	
	public static MemorySegment writeBlock8(Vec2F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		
		return res;
	}
	
	public static MemorySegment writeBlock8(ConstVec2F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		
		return res;
	}
	
	public static MemorySegment writeBlock16(Vec2F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		res.set(JAVA_FLOAT, resOffset+8, 0);
		res.set(JAVA_FLOAT, resOffset+12, 0);
		
		return res;
	}
	
	public static MemorySegment writeBlock16(ConstVec2F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		res.set(JAVA_FLOAT, resOffset+8, 0);
		res.set(JAVA_FLOAT, resOffset+12, 0);
		
		return res;
	}
	
	public static Vec2F read(MemorySegment mem, long memOffset, @ExtractionParam Vec2F res)
	{
		res.x = mem.get(JAVA_FLOAT, memOffset);
		res.y = mem.get(JAVA_FLOAT, memOffset+4);
		
		return res;
	}
	
}
