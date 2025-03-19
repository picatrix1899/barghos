package org.barghos.util.memory;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

public class PointerI
{
	private final MemorySegment segment;
	private final long size;
	
	public PointerI(Arena arena)
	{
		this.segment = arena.allocate(ValueLayout.JAVA_INT);
		this.size = 1;
	}
	
	public PointerI(Arena arena, long size)
	{
		this.segment = arena.allocate(ValueLayout.JAVA_INT, size);
		this.size = size;
	}
	
	public PointerI(MemorySegment segment, long size)
	{
		this.segment = segment;
		this.size = size;
	}
	
	public int get()
	{
		return this.segment.get(ValueLayout.JAVA_INT, 0);
	}
	
	public int get(long index)
	{
		return this.segment.get(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT.byteSize() * index);
	}
	
	public void set(int value)
	{
		this.segment.set(ValueLayout.JAVA_INT, 0, value);
	}
	
	public void set(long index, int value)
	{
		this.segment.set(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT.byteSize() * index, value);
	}
	
	public MemorySegment segment()
	{
		return this.segment;
	}
	
	public IntBuffer asIntBuffer()
	{
		return this.segment.asByteBuffer().order(ByteOrder.nativeOrder()).asIntBuffer();
	}
	
	public long address()
	{
		return this.segment.address();
	}
	
	public long size()
	{
		return this.size;
	}
	
	public long byteSize()
	{
		return ValueLayout.JAVA_INT.byteSize() * this.size;
	}
	
	public static PointerI from(Arena arena, int value)
	{
		MemorySegment seg = arena.allocateFrom(ValueLayout.JAVA_INT, value);
		
		return new PointerI(seg, 1);
	}
	
	public static PointerI from(Arena arena, int... values)
	{
		MemorySegment seg = arena.allocateFrom(ValueLayout.JAVA_INT, values);
		
		return new PointerI(seg, values.length);
	}
}
