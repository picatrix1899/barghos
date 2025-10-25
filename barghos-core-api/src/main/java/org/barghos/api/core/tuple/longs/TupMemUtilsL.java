package org.barghos.api.core.tuple.longs;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.MemoryLayout;

public class TupMemUtilsL
{
	public static final long OFFSET_L_X = 0;
	public static final long OFFSET_L_Y = 8;
	public static final long OFFSET_L_Z = 16;
	public static final long OFFSET_L_W = 24;
	
	public static final MemoryLayout TUP2L = MemoryLayout.sequenceLayout(2, JAVA_LONG);
	public static final MemoryLayout TUP2L_8 = TUP2L;
	public static final MemoryLayout TUP2L_16 = TUP2L;
	public static final MemoryLayout TUP2L_32 = MemoryLayout.structLayout(TUP2L, MemoryLayout.paddingLayout(16));
	
	public static final MemoryLayout TUP3L = MemoryLayout.sequenceLayout(3, JAVA_LONG);
	public static final MemoryLayout TUP3L_8 = TUP3L;
	public static final MemoryLayout TUP3L_16 = MemoryLayout.structLayout(TUP3L, MemoryLayout.paddingLayout(8));
	public static final MemoryLayout TUP3L_32 = TUP3L_16;
	
	public static final MemoryLayout TUP4L = MemoryLayout.sequenceLayout(4, JAVA_LONG);
	public static final MemoryLayout TUP4L_8 = TUP4L;
	public static final MemoryLayout TUP4L_16 = TUP4L;
	public static final MemoryLayout TUP4L_32 = TUP4L;
}
