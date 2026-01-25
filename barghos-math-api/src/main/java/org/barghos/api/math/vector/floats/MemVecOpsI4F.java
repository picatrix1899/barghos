package org.barghos.api.math.vector.floats;

import java.lang.foreign.MemorySegment;

import org.barghos.annotation.ExtractionParam;

import static java.lang.foreign.ValueLayout.*;

public class MemVecOpsI4F
{
	private MemVecOpsI4F() { }
	
	public static MemorySegment write(IVec4RF v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x());
		res.set(JAVA_FLOAT, resOffset+4, v1.y());
		res.set(JAVA_FLOAT, resOffset+8, v1.z());
		res.set(JAVA_FLOAT, resOffset+12, v1.w());
		
		return res;
	}
	
	public static MemorySegment writeBlock8(IVec4RF v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x());
		res.set(JAVA_FLOAT, resOffset+4, v1.y());
		res.set(JAVA_FLOAT, resOffset+8, v1.z());
		res.set(JAVA_FLOAT, resOffset+12, v1.w());
		
		return res;
	}
	
	public static MemorySegment writeBlock16(IVec4RF v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x());
		res.set(JAVA_FLOAT, resOffset+4, v1.y());
		res.set(JAVA_FLOAT, resOffset+8, v1.z());
		res.set(JAVA_FLOAT, resOffset+12, v1.w());
		
		return res;
	}
	
	public static <T extends IVec4WF> T read(MemorySegment mem, long memOffset, @ExtractionParam T res)
	{
		res.set(
			mem.get(JAVA_FLOAT, memOffset),
			mem.get(JAVA_FLOAT, memOffset+4),
			mem.get(JAVA_FLOAT, memOffset+8),
			mem.get(JAVA_FLOAT, memOffset+12)
		);
		
		return res;
	}
}
