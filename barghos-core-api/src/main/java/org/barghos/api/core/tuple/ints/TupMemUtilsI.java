package org.barghos.api.core.tuple.ints;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.MemoryLayout;

public class TupMemUtilsI
{
	public static final long OFFSET_I_X = 0;
	public static final long OFFSET_I_Y = 4;
	public static final long OFFSET_I_Z = 8;
	public static final long OFFSET_I_W = 12;
	
	public static final MemoryLayout TUP2I = MemoryLayout.sequenceLayout(2, JAVA_INT);
	public static final MemoryLayout TUP2I_8 = TUP2I;
	public static final MemoryLayout TUP2I_16 = MemoryLayout.structLayout(TUP2I, MemoryLayout.paddingLayout(8));
	public static final MemoryLayout TUP2I_32 = MemoryLayout.structLayout(TUP2I, MemoryLayout.paddingLayout(24));
	
	public static final MemoryLayout TUP3I = MemoryLayout.sequenceLayout(3, JAVA_INT);
	public static final MemoryLayout TUP3I_8 = MemoryLayout.structLayout(TUP3I, MemoryLayout.paddingLayout(4));
	public static final MemoryLayout TUP3I_16 = TUP3I_8;
	public static final MemoryLayout TUP3I_32 = MemoryLayout.structLayout(TUP3I, MemoryLayout.paddingLayout(20));
	
	public static final MemoryLayout TUP4I = MemoryLayout.sequenceLayout(4, JAVA_INT);
	public static final MemoryLayout TUP4I_8 = TUP3I;
	public static final MemoryLayout TUP4I_16 = TUP3I;
	public static final MemoryLayout TUP4I_32 = MemoryLayout.structLayout(TUP3I, MemoryLayout.paddingLayout(16));
}
