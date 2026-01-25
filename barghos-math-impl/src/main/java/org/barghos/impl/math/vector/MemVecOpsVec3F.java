package org.barghos.impl.math.vector;

import java.lang.foreign.MemorySegment;

import org.barghos.annotation.ExtractionParam;

import static java.lang.foreign.ValueLayout.*;

public class MemVecOpsVec3F
{
	private MemVecOpsVec3F() { }
	
	public static MemorySegment write(Vec3F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		res.set(JAVA_FLOAT, resOffset+8, v1.z);
		
		return res;
	}
	
	public static MemorySegment write(ConstVec3F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		res.set(JAVA_FLOAT, resOffset+8, v1.z);
		
		return res;
	}
	
	public static MemorySegment writeBlock8(Vec3F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		res.set(JAVA_FLOAT, resOffset+8, v1.z);
		res.set(JAVA_FLOAT, resOffset+12, 0);
		
		return res;
	}
	
	public static MemorySegment writeBlock8(ConstVec3F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		res.set(JAVA_FLOAT, resOffset+8, v1.z);
		res.set(JAVA_FLOAT, resOffset+12, 0);
		
		return res;
	}
	
	public static MemorySegment writeBlock16(Vec3F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x);
		res.set(JAVA_FLOAT, resOffset+4, v1.y);
		res.set(JAVA_FLOAT, resOffset+8, v1.z);
		res.set(JAVA_FLOAT, resOffset+12, 0);
		
		return res;
	}
	
	public static MemorySegment writeBlock16(ConstVec3F v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x());
		res.set(JAVA_FLOAT, resOffset+4, v1.y());
		res.set(JAVA_FLOAT, resOffset+8, v1.z());
		res.set(JAVA_FLOAT, resOffset+12, 0);
		
		return res;
	}
	
	public static Vec3F read(MemorySegment mem, long memOffset, @ExtractionParam Vec3F res)
	{
		res.x = mem.get(JAVA_FLOAT, memOffset);
		res.y = mem.get(JAVA_FLOAT, memOffset+4);
		res.z = mem.get(JAVA_FLOAT, memOffset+8);
		
		return res;
	}
	
}
