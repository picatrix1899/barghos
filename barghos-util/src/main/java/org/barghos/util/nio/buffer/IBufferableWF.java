package org.barghos.util.nio.buffer;

import java.nio.FloatBuffer;

public interface IBufferableWF
{
	IBufferableWF readFrom(FloatBuffer buffer, int offset);
}
