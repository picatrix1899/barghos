package org.barghos.core.api.nio.buffer;

import java.nio.DoubleBuffer;

/**
 * This interface provides functions for buffer interactions.
 * 
 * @author picatrix1899
 */
public interface BufferableDouble extends BufferableDoubleR
{
	/**
	 * Puts data into the buffer.
	 * @param buffer The buffer.
	 * 
	 * @return The buffer.
	 */
	BufferableDouble fromBuffer(DoubleBuffer buffer);
}
