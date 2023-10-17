package org.barghos.lwjgl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

import org.barghos.core.nio.buffer.NioBufferFactory;
import org.lwjgl.system.MemoryUtil;

public class LWJGLNioBufferFactory implements NioBufferFactory
{
	public ByteBuffer directByteBuffer(int capacity)
	{
		return MemoryUtil.memAlloc(capacity);
	}

	public ShortBuffer directShortBuffer(int capacity)
	{
		return MemoryUtil.memAllocShort(capacity);
	}

	public IntBuffer directIntBuffer(int capacity)
	{
		return MemoryUtil.memAllocInt(capacity);
	}

	public LongBuffer directLongBuffer(int capacity)
	{
		return MemoryUtil.memAllocLong(capacity);
	}

	public FloatBuffer directFloatBuffer(int capacity)
	{
		return MemoryUtil.memAllocFloat(capacity);
	}

	public DoubleBuffer directDoubleBuffer(int capacity)
	{
		return MemoryUtil.memAllocDouble(capacity);
	}

	public void destroy(ByteBuffer buffer)
	{
		MemoryUtil.memFree(buffer);
	}

	public void destroy(ShortBuffer buffer)
	{
		MemoryUtil.memFree(buffer);
	}

	public void destroy(IntBuffer buffer)
	{
		MemoryUtil.memFree(buffer);
	}

	public void destroy(LongBuffer buffer)
	{
		MemoryUtil.memFree(buffer);
	}

	public void destroy(FloatBuffer buffer)
	{
		MemoryUtil.memFree(buffer);
	}

	public void destroy(DoubleBuffer buffer)
	{
		MemoryUtil.memFree(buffer);
	}

}
