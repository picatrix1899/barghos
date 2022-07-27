package org.barghos.core.api.util.buffer;

import java.nio.FloatBuffer;

/**
 * This interface provides functions for buffer interactions.
 * 
 * @author picatrix1899
 */
public interface BufferableFloatR
{
	
	/**
	 * Puts data into the buffer.
	 * @param buffer The buffer.
	 * 
	 * @return The buffer.
	 */
	FloatBuffer toBuffer(FloatBuffer buffer);
}
