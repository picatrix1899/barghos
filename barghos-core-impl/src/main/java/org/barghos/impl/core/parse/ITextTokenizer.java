package org.barghos.impl.core.parse;

import org.barghos.api.core.io.reader.ICharReader;

public interface ITextTokenizer
{
	TextToken getNextToken(ICharReader reader);
}

