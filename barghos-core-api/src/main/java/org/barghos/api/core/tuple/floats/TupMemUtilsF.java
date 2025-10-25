package org.barghos.api.core.tuple.floats;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.MemoryLayout;

public class TupMemUtilsF
{
	public static final long OFFSET_F_X = 0;
	public static final long OFFSET_F_Y = 4;
	public static final long OFFSET_F_Z = 8;
	public static final long OFFSET_F_W = 12;
	
	public static final MemoryLayout TUP2F = MemoryLayout.sequenceLayout(2, JAVA_FLOAT);
	public static final MemoryLayout TUP2F_8 = TUP2F;
	public static final MemoryLayout TUP2F_16 = MemoryLayout.structLayout(TUP2F, MemoryLayout.paddingLayout(8));
	public static final MemoryLayout TUP2F_32 = MemoryLayout.structLayout(TUP2F, MemoryLayout.paddingLayout(24));
	
	public static final MemoryLayout TUP3F = MemoryLayout.sequenceLayout(3, JAVA_FLOAT);
	public static final MemoryLayout TUP3F_8 = MemoryLayout.structLayout(TUP3F, MemoryLayout.paddingLayout(4));
	public static final MemoryLayout TUP3F_16 = TUP3F_8;
	public static final MemoryLayout TUP3F_32 = MemoryLayout.structLayout(TUP3F, MemoryLayout.paddingLayout(20));
	
	public static final MemoryLayout TUP4F = MemoryLayout.sequenceLayout(4, JAVA_FLOAT);
	public static final MemoryLayout TUP4F_8 = TUP4F;
	public static final MemoryLayout TUP4F_16 = TUP4F;
	public static final MemoryLayout TUP4F_32 = MemoryLayout.structLayout(TUP4F, MemoryLayout.paddingLayout(16));
}
