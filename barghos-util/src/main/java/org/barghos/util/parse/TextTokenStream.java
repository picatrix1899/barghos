package org.barghos.util.parse;

import org.barghos.util.io.reader.ICharReader;

public class TextTokenStream
{
	private final ICharReader reader;
	private final ITextTokenizer tokenizer;
	
	private TextToken lookahead;
	private boolean initialized;
	
	public TextTokenStream(ITextTokenizer tokenizer, ICharReader reader)
	{
		this.tokenizer = tokenizer;
		this.reader = reader;
	}
	
	public boolean hasNext()
	{
		if(!this.initialized)
		{
			this.lookahead = tokenizer.getNextToken(this.reader);
			this.initialized = true;
		}
		
		return this.lookahead != null;
	}
	
	public TextToken next()
	{
		if(!this.initialized)
		{
			this.lookahead = tokenizer.getNextToken(this.reader);
			this.initialized = true;
		}
		
		TextToken current = this.lookahead;
		if(current == null) return null;
		
		this.lookahead = tokenizer.getNextToken(this.reader);
	
		return current;
	}
	
	public TextToken peek()
	{
		if(!this.initialized)
		{
			this.lookahead = tokenizer.getNextToken(this.reader);
			this.initialized = true;
		}
		
		return this.lookahead;
	}
}
