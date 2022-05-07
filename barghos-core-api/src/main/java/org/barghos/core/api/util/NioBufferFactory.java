package org.barghos.core.api.util;

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
	 * Creates and therefore allocates a new {@link ByteBuffer} with the given maximum capacity.
	 * That is the maximum amount of byte entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	ByteBuffer createByteBuffer(int capacity);
	
	/**
	 * Creates and therefore allocates a new {@link ShortBuffer} with the given maximum capacity.
	 * That is the maximum amount of short entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	ShortBuffer createShortBuffer(int capacity);
	
	/**
	 * Creates and therefore allocates a new {@link IntBuffer} with the given maximum capacity.
	 * That is the maximum amount of int entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	IntBuffer createIntBuffer(int capacity);
	
	/**
	 * Creates and therefore allocates a new {@link LongBuffer} with the given maximum capacity.
	 * That is the maximum amount of long entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	LongBuffer createLongBuffer(int capacity);
	
	/**
	 * Creates and therefore allocates a new {@link FloatBuffer} with the given maximum capacity.
	 * That is the maximum amount of float entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	FloatBuffer createFloatBuffer(int capacity);
	
	/**
	 * Creates and therefore allocates a new {@link DoubleBuffer} with the given maximum capacity.
	 * That is the maximum amount of double entries the buffer will be able to hold at any time.
	 * 
	 * @param capacity The maximum capacity of the buffer.
	 * 
	 * @return The new buffer.
	 */
	DoubleBuffer createDoubleBuffer(int capacity);
	
	/**
	 * Destroys and therefore deallocates the given {@link ByteBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	void destroyBuffer(ByteBuffer buffer);
	
	/**
	 * Destroys and therefore deallocates the given {@link ShortBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	void destroyBuffer(ShortBuffer buffer);
	
	/**
	 * Destroys and therefore deallocates the given {@link IntBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	void destroyBuffer(IntBuffer buffer);
	
	/**
	 * Destroys and therefore deallocates the given {@link LongBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	void destroyBuffer(LongBuffer buffer);
	
	/**
	 * Destroys and therefore deallocates the given {@link FloatBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	void destroyBuffer(FloatBuffer buffer);
	
	/**
	 * Destroys and therefore deallocates the given {@link DoubleBuffer}.
	 * 
	 * @param buffer The buffer to destroy.
	 */
	void destroyBuffer(DoubleBuffer buffer);
}
