package org.barghos.core.api.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/**
 * This implementation of the interface {@link NioBufferFactory} provides
 * the standard java way of creating nio buffers.
 * 
 * @author picatrix1899
 */
public class JavaNioBufferFactory implements NioBufferFactory
{
	/** 
	 * Contains the byte order used in creating buffers.
	 */
	public static final ByteOrder BYTE_ORDER = ByteOrder.nativeOrder();
	
	/** {@inheritDoc} */
	@Override
	public ByteBuffer createByteBuffer(int capacity)
	{
		return ByteBuffer.allocateDirect(capacity).order(BYTE_ORDER);
	}
	
	/** {@inheritDoc} */
	@Override
	public ShortBuffer createShortBuffer(int capacity)
	{
		return ByteBuffer.allocateDirect(capacity << 1).order(BYTE_ORDER).asShortBuffer();
	}
	
	/** {@inheritDoc} */
	@Override
	public IntBuffer createIntBuffer(int capacity)
	{
		return ByteBuffer.allocateDirect(capacity << 2).order(BYTE_ORDER).asIntBuffer();
	}
	
	/** {@inheritDoc} */
	@Override
	public LongBuffer createLongBuffer(int capacity)
	{
		return ByteBuffer.allocateDirect(capacity << 3).order(BYTE_ORDER).asLongBuffer();
	}	
	
	/** {@inheritDoc} */
	@Override
	public FloatBuffer createFloatBuffer(int capacity)
	{
		return ByteBuffer.allocateDirect(capacity << 2).order(BYTE_ORDER).asFloatBuffer();
	}		
	
	/** {@inheritDoc} */
	@Override
	public DoubleBuffer createDoubleBuffer(int capacity)
	{
		return ByteBuffer.allocateDirect(capacity << 3).order(BYTE_ORDER).asDoubleBuffer();
	}

	/** {@inheritDoc} */
	@Override
	public void destroyBuffer(ByteBuffer buffer)
	{
		// In standard java it is not possible to force destroy a buffer.
	}

	/** {@inheritDoc} */
	@Override
	public void destroyBuffer(ShortBuffer buffer)
	{
		// In standard java it is not possible to force destroy a buffer.
	}

	/** {@inheritDoc} */
	@Override
	public void destroyBuffer(IntBuffer buffer)
	{
		// In standard java it is not possible to force destroy a buffer.
	}

	/** {@inheritDoc} */
	@Override
	public void destroyBuffer(LongBuffer buffer)
	{
		// In standard java it is not possible to force destroy a buffer.
	}

	/** {@inheritDoc} */
	@Override
	public void destroyBuffer(FloatBuffer buffer)
	{
		// In standard java it is not possible to force destroy a buffer.
	}

	/** {@inheritDoc} */
	@Override
	public void destroyBuffer(DoubleBuffer buffer)
	{
		// In standard java it is not possible to force destroy a buffer.
	}

}
