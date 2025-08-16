package org.barghos.util.nio.buffer;

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
	public ByteBuffer directByteBuffer(int capacity)
	{
		return ByteBuffer.allocateDirect(capacity).order(BYTE_ORDER);
	}
	
	/** {@inheritDoc} */
	@Override
	public ShortBuffer directShortBuffer(int capacity)
	{
		return ByteBuffer.allocateDirect(capacity << 1).order(BYTE_ORDER).asShortBuffer();
	}
	
	/** {@inheritDoc} */
	@Override
	public IntBuffer directIntBuffer(int capacity)
	{
		return ByteBuffer.allocateDirect(capacity << 2).order(BYTE_ORDER).asIntBuffer();
	}
	
	/** {@inheritDoc} */
	@Override
	public LongBuffer directLongBuffer(int capacity)
	{
		return ByteBuffer.allocateDirect(capacity << 3).order(BYTE_ORDER).asLongBuffer();
	}	
	
	/** {@inheritDoc} */
	@Override
	public FloatBuffer directFloatBuffer(int capacity)
	{
		return ByteBuffer.allocateDirect(capacity << 2).order(BYTE_ORDER).asFloatBuffer();
	}		
	
	/** {@inheritDoc} */
	@Override
	public DoubleBuffer directDoubleBuffer(int capacity)
	{
		return ByteBuffer.allocateDirect(capacity << 3).order(BYTE_ORDER).asDoubleBuffer();
	}

	/** {@inheritDoc} */
	@Override
	public void destroy(ByteBuffer buffer)
	{
		// In standard java it is not possible to force destroy a buffer.
	}

	/** {@inheritDoc} */
	@Override
	public void destroy(ShortBuffer buffer)
	{
		// In standard java it is not possible to force destroy a buffer.
	}

	/** {@inheritDoc} */
	@Override
	public void destroy(IntBuffer buffer)
	{
		// In standard java it is not possible to force destroy a buffer.
	}

	/** {@inheritDoc} */
	@Override
	public void destroy(LongBuffer buffer)
	{
		// In standard java it is not possible to force destroy a buffer.
	}

	/** {@inheritDoc} */
	@Override
	public void destroy(FloatBuffer buffer)
	{
		// In standard java it is not possible to force destroy a buffer.
	}

	/** {@inheritDoc} */
	@Override
	public void destroy(DoubleBuffer buffer)
	{
		// In standard java it is not possible to force destroy a buffer.
	}

}
