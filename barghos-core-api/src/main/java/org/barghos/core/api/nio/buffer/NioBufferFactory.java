package org.barghos.core.api.nio.buffer;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/**
 * This interface and its implementations provide functions to allocate new nio buffers.
 * 
 * @author picatrix1899
 */
public interface NioBufferFactory
{
	/**
	 * Creates and therefore allocates a new direct {@link ByteBuffer} with the given maximum capacity.
	 * That is the maximum amount of byte entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	ByteBuffer directByteBuffer(int capacity);
	
	/**
	 * Creates and therefore allocates a new direct {@link ShortBuffer} with the given maximum capacity.
	 * That is the maximum amount of short entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	ShortBuffer directShortBuffer(int capacity);
	
	/**
	 * Creates and therefore allocates a new direct {@link IntBuffer} with the given maximum capacity.
	 * That is the maximum amount of int entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	IntBuffer directIntBuffer(int capacity);
	
	/**
	 * Creates and therefore allocates a new direct {@link LongBuffer} with the given maximum capacity.
	 * That is the maximum amount of long entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	LongBuffer directLongBuffer(int capacity);
	
	/**
	 * Creates and therefore allocates a new direct {@link FloatBuffer} with the given maximum capacity.
	 * That is the maximum amount of float entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	FloatBuffer directFloatBuffer(int capacity);
	
	/**
	 * Creates and therefore allocates a new direct {@link DoubleBuffer} with the given maximum capacity.
	 * That is the maximum amount of double entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	DoubleBuffer directDoubleBuffer(int capacity);
	
	/**
	 * Destroys and therefore deallocates the given {@link ByteBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	void destroy(ByteBuffer buffer);
	
	/**
	 * Destroys and therefore deallocates the given {@link ShortBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	void destroy(ShortBuffer buffer);
	
	/**
	 * Destroys and therefore deallocates the given {@link IntBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	void destroy(IntBuffer buffer);
	
	/**
	 * Destroys and therefore deallocates the given {@link LongBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	void destroy(LongBuffer buffer);
	
	/**
	 * Destroys and therefore deallocates the given {@link FloatBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	void destroy(FloatBuffer buffer);
	
	/**
	 * Destroys and therefore deallocates the given {@link DoubleBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	void destroy(DoubleBuffer buffer);
}
