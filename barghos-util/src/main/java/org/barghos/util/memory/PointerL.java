package org.barghos.util.memory;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.ByteOrder;
import java.nio.LongBuffer;

public class PointerL
{
	private final MemorySegment segment;
	private final long size;
	
	public PointerL(Arena arena)
	{
		this.segment = arena.allocate(ValueLayout.JAVA_INT);
		this.size = 1;
	}
	
	public PointerL(Arena arena, long size)
	{
		this.segment = arena.allocate(ValueLayout.JAVA_INT, size);
		this.size = size;
	}
	
	public PointerL(MemorySegment segment, long size)
	{
		this.segment = segment;
		this.size = size;
	}
	
	public long get()
	{
		return this.segment.get(ValueLayout.JAVA_LONG, 0);
	}
	
	public long get(long index)
	{
		return this.segment.get(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG.byteSize() * index);
	}
	
	public void set(long value)
	{
		this.segment.set(ValueLayout.JAVA_LONG, 0, value);
	}
	
	public void set(long index, long value)
	{
		this.segment.set(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG.byteSize() * index, value);
	}
	
	public MemorySegment segment()
	{
		return this.segment;
	}
	
	public LongBuffer asLongBuffer()
	{
		return this.segment.asByteBuffer().order(ByteOrder.nativeOrder()).asLongBuffer();
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
		return ValueLayout.JAVA_LONG.byteSize() * this.size;
	}
	
	public static PointerL from(Arena arena, long value)
	{
		MemorySegment seg = arena.allocateFrom(ValueLayout.JAVA_LONG, value);
		
		return new PointerL(seg, 1);
	}
	
	public static PointerL from(Arena arena, long... values)
	{
		MemorySegment seg = arena.allocateFrom(ValueLayout.JAVA_LONG, values);
		
		return new PointerL(seg, values.length);
	}
}
