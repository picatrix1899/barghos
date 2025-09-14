package org.barghos.api.core.io.reader;

public interface IReader
{
	boolean hasNext();
	int next();
	int peek();
}
