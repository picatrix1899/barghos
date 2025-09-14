package org.barghos.impl.core.nio.buffer;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

import org.barghos.annotation.AllowNull;

/**
 * Provides functions for creating and filling nio buffers more easiely.
 */
public class BufferUtils
{	
	/**
	 * Contains the factory that should be used for creating and destroying buffers.
	 */
	public static NioBufferFactory BUFFER_FACTORY = new JavaNioBufferFactory();
	
	/**
	 * This class contains only static functions. Therefore it should not be instanciated.
	 */
	private BufferUtils() { }
	
	/**
	 * Creates and therefore allocates a new direct {@link ByteBuffer} with the given maximum capacity.
	 * That is the maximum amount of byte entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ByteBuffer directByteBuffer(int capacity)
	{
		return BUFFER_FACTORY.directByteBuffer(capacity);
	}
	
	/**
	 * Creates and therefore allocates a new direct {@link ShortBuffer} with the given maximum capacity.
	 * That is the maximum amount of short entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static ShortBuffer directShortBuffer(int capacity)
	{
		return BUFFER_FACTORY.directShortBuffer(capacity);
	}
	
	/**
	 * Creates and therefore allocates a new direct {@link IntBuffer} with the given maximum capacity.
	 * That is the maximum amount of int entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static IntBuffer directIntBuffer(int capacity)
	{
		return BUFFER_FACTORY.directIntBuffer(capacity);
	}
	
	/**
	 * Creates and therefore allocates a new direct {@link LongBuffer} with the given maximum capacity.
	 * That is the maximum amount of long entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static LongBuffer directLongBuffer(int capacity)
	{
		return BUFFER_FACTORY.directLongBuffer(capacity);
	}	
	
	/**
	 * Creates and therefore allocates a new direct {@link FloatBuffer} with the given maximum capacity.
	 * That is the maximum amount of float entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static FloatBuffer directFloatBuffer(int capacity)
	{
		return BUFFER_FACTORY.directFloatBuffer(capacity);
	}		
	
	/**
	 * Creates and therefore allocates a new direct {@link DoubleBuffer} with the given maximum capacity.
	 * That is the maximum amount of double entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	public static DoubleBuffer directDoubleBuffer(int capacity)
	{
		return BUFFER_FACTORY.directDoubleBuffer(capacity);
	}
	
	/**
	 * Destroys and therefore deallocates the given {@link ByteBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	public static void destroyBuffer(@AllowNull ByteBuffer buffer)
	{
		if(buffer == null) return;
		
		BUFFER_FACTORY.destroy(buffer);
	}
	
	/**
	 * Destroys and therefore deallocates the given {@link ShortBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	public static void destroyBuffer(@AllowNull ShortBuffer buffer)
	{
		if(buffer == null) return;
		
		BUFFER_FACTORY.destroy(buffer);
	}
	
	/**
	 * Destroys and therefore deallocates the given {@link IntBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	public static void destroyBuffer(@AllowNull IntBuffer buffer)
	{
		if(buffer == null) return;
		
		BUFFER_FACTORY.destroy(buffer);
	}
	
	/**
	 * Destroys and therefore deallocates the given {@link LongBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	public static void destroyBuffer(@AllowNull LongBuffer buffer)
	{
		if(buffer == null) return;
		
		BUFFER_FACTORY.destroy(buffer);
	}
	
	/**
	 * Destroys and therefore deallocates the given {@link FloatBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	public static void destroyBuffer(@AllowNull FloatBuffer buffer)
	{
		if(buffer == null) return;
		
		BUFFER_FACTORY.destroy(buffer);
	}
	
	/**
	 * Destroys and therefore deallocates the given {@link DoubleBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	public static void destroyBuffer(@AllowNull DoubleBuffer buffer)
	{
		if(buffer == null) return;
		
		BUFFER_FACTORY.destroy(buffer);
	}
}