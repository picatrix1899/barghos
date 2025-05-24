package org.barghostest.util.math;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.barghos.util.io.reader.JavaReaderWrapper;
import org.barghos.util.parse.ClassAwareTextTokenizer;
import org.barghos.util.parse.ITextTokenizer;
import org.barghos.util.parse.TextToken;
import org.barghos.util.parse.TextTokenStream;
import org.barghos.util.io.reader.IReader;
import org.barghos.util.io.reader.ICharReader;
import org.barghos.util.io.reader.DefaultCharReader;
import org.junit.jupiter.api.Test;

public class TokenizerTest
{
	@Test
	void test()
	{
		String text = "public class Tokenizer12Test {";
		StringReader stringreader = new StringReader(text);
		IReader reader = new JavaReaderWrapper(stringreader);
		ICharReader charReader = new DefaultCharReader(reader);
		
		ITextTokenizer tokenizer = new ClassAwareTextTokenizer();
		
		TextTokenStream tokenStream = new TextTokenStream(tokenizer, charReader);
		
		List<TextToken> tokens = new ArrayList<>();
		
		while(tokenStream.hasNext())
		{
			tokens.add(tokenStream.next());
		}
		
		for(TextToken t : tokens)
		{
			System.out.println("Text=" + t.text + "|>> Class=" + t.classification);
		}
	}

}
