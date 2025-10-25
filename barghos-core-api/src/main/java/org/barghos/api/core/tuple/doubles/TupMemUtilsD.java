package org.barghos.api.core.tuple.doubles;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.MemoryLayout;

public class TupMemUtilsD
{
	public static final long OFFSET_D_X = 0;
	public static final long OFFSET_D_Y = 8;
	public static final long OFFSET_D_Z = 16;
	public static final long OFFSET_D_W = 24;
	
	public static final MemoryLayout TUP2D = MemoryLayout.sequenceLayout(2, JAVA_DOUBLE);
	public static final MemoryLayout TUP2D_8 = TUP2D;
	public static final MemoryLayout TUP2D_16 = TUP2D;
	public static final MemoryLayout TUP2D_32 = MemoryLayout.structLayout(TUP2D, MemoryLayout.paddingLayout(16));
	
	public static final MemoryLayout TUP3D = MemoryLayout.sequenceLayout(3, JAVA_FLOAT);
	public static final MemoryLayout TUP3D_8 = TUP3D;
	public static final MemoryLayout TUP3D_16 = MemoryLayout.structLayout(TUP3D, MemoryLayout.paddingLayout(8));
	public static final MemoryLayout TUP3D_32 = TUP3D_16;
	
	public static final MemoryLayout TUP4D = MemoryLayout.sequenceLayout(4, JAVA_FLOAT);
	public static final MemoryLayout TUP4D_8 = TUP4D;
	public static final MemoryLayout TUP4D_16 = TUP4D;
	public static final MemoryLayout TUP4D_32 = TUP4D;
}
