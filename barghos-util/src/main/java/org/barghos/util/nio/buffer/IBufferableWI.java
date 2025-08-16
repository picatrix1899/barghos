package org.barghos.util.nio.buffer;

import java.nio.IntBuffer;

public interface IBufferableWI
{
	IBufferableWI readFrom(IntBuffer buffer, int offset);
}
