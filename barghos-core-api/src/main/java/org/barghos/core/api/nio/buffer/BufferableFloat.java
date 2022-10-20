package org.barghos.core.api.nio.buffer;

import java.nio.FloatBuffer;

/**
 * This interface provides functions for buffer interactions.
 * 
 * @author picatrix1899
 */
public interface BufferableFloat extends BufferableDoubleR
{
	/**
	 * Puts data into the buffer.
	 * @param buffer The buffer.
	 * 
	 * @return The buffer.
	 */
	BufferableFloat fromBuffer(FloatBuffer buffer);
}
