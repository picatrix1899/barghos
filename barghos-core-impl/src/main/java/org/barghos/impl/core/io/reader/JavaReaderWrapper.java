package org.barghos.impl.core.io.reader;

import java.io.IOException;
import java.io.Reader;

import org.barghos.api.core.io.reader.IReader;

public class JavaReaderWrapper implements IReader
{
	private final Reader reader;
	private int lookahead = -2;
	
	public JavaReaderWrapper(Reader reader)
	{
		this.reader = reader;
	}

	@Override
	public boolean hasNext()
	{
		if(this.lookahead == -2)  lookAheadAndRethrow();
		
		return this.lookahead != -1;
	}

	@Override
	public int next()
	{
		if(this.lookahead == -2) lookAheadAndRethrow();
		
		int current = this.lookahead;
		if(current == -1) return -1;
		
		lookAheadAndRethrow();
		
		return current;
	}
	
	@Override
	public int peek()
	{
		if(this.lookahead == -2) lookAheadAndRethrow();
		
		return this.lookahead;
	}
	
	private void lookAheadAndRethrow()
	{
		try
		{
			this.lookahead = this.reader.read();
		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}
}
