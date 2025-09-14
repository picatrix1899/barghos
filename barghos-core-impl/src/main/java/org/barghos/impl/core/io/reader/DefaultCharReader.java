package org.barghos.impl.core.io.reader;

import org.barghos.api.core.io.reader.ICharReader;
import org.barghos.api.core.io.reader.IReader;

public class DefaultCharReader implements ICharReader
{
	private final IReader reader;
	
	public DefaultCharReader(IReader reader)
	{
		this.reader = reader;
	}
	
	@Override
	public boolean hasNext()
	{
		return this.reader.hasNext();
	}

	@Override
	public char next()
	{
		return (char) this.reader.next();
	}

	@Override
	public char peek()
	{
		return (char) this.reader.peek();
	}

}
