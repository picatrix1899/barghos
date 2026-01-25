package org.barghos.api.math.vector.floats;

import java.lang.foreign.MemorySegment;

import org.barghos.annotation.ExtractionParam;

import static java.lang.foreign.ValueLayout.*;

public class MemVecOpsI3F
{
	private MemVecOpsI3F() { }
	
	public static MemorySegment write(IVec3RF v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x());
		res.set(JAVA_FLOAT, resOffset+4, v1.y());
		res.set(JAVA_FLOAT, resOffset+8, v1.z());
		
		return res;
	}
	
	public static MemorySegment writeBlock8(IVec3RF v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x());
		res.set(JAVA_FLOAT, resOffset+4, v1.y());
		res.set(JAVA_FLOAT, resOffset+8, v1.z());
		res.set(JAVA_FLOAT, resOffset+12, 0);
		
		return res;
	}
	
	public static MemorySegment writeBlock16(IVec3RF v1, @ExtractionParam MemorySegment res, long resOffset)
	{
		res.set(JAVA_FLOAT, resOffset, v1.x());
		res.set(JAVA_FLOAT, resOffset+4, v1.y());
		res.set(JAVA_FLOAT, resOffset+8, v1.z());
		res.set(JAVA_FLOAT, resOffset+12, 0);
		
		return res;
	}
	
	public static <T extends IVec3WF> T read(MemorySegment mem, long memOffset, @ExtractionParam T res)
	{
		res.set(
			mem.get(JAVA_FLOAT, memOffset),
			mem.get(JAVA_FLOAT, memOffset+4),
			mem.get(JAVA_FLOAT, memOffset+8)
		);
		
		return res;
	}
	
}
