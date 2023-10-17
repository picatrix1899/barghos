package org.barghos.nio.buffer;

import java.nio.DoubleBuffer;

/**
 * This interface provides functions for buffer interactions.
 * 
 * @author picatrix1899
 */
public interface BufferableDoubleR
{
	
	/**
	 * Puts data into the buffer.
	 * @param buffer The buffer.
	 * 
	 * @return The buffer.
	 */
	DoubleBuffer toDoubleBuffer(DoubleBuffer buffer);
}
