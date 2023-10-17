package org.barghos.nio.buffer;

import java.nio.FloatBuffer;

/**
 * This interface provides functions for buffer interactions.
 * 
 * @author picatrix1899
 */
public interface BufferableFloatR
{	
	/**
	 * Returns the amount of float values that will be stored in a {@link FloatBuffer}
	 * when the function {@link #toFloatBuffer(FloatBuffer)} is called.
	 * 
	 * @return The amount of float values that will be stored in a {@link FloatBuffer}.
	 */
	int getFloatBufferDimensions();
	
	/**
	 * Puts data into the buffer.
	 * @param buffer The buffer.
	 * 
	 * @return The buffer.
	 */
	FloatBuffer toFloatBuffer(FloatBuffer buffer);
}
