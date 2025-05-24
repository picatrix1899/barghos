package org.barghos.util.parse;

import org.barghos.util.io.reader.ICharReader;

public interface ITextTokenizer
{
	TextToken getNextToken(ICharReader reader);
}

