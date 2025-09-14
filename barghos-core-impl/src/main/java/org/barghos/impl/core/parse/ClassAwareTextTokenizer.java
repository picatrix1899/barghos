package org.barghos.impl.core.parse;

import org.barghos.api.core.io.reader.ICharReader;

public class ClassAwareTextTokenizer implements ITextTokenizer
{
	private final ICharClassifier classifier;
	
	public ClassAwareTextTokenizer()
	{
		this.classifier = new DefaultCharClassifier();
	}
	
	public ClassAwareTextTokenizer(ICharClassifier classifier)
	{
		this.classifier = classifier;
	}
	
	public TextToken getNextToken(ICharReader reader)
	{
		if(!reader.hasNext()) return null;
		
		TextToken token = new TextToken();
		
		StringBuilder builder = new StringBuilder();
		char currentChar;
		int classification;
		
		boolean first = true;
		
		while(reader.hasNext())
		{
			currentChar = reader.peek();
			classification = this.classifier.classify(currentChar);
			
			if(first)
			{
				token.classification = classification;
				first = false;
			}
			
			if(classification != token.classification) break;
			
			builder.append(currentChar);
			
			reader.next();
		}
		
		token.text = builder.toString();
		
		return token;
	}
	
	@FunctionalInterface
	public static interface ICharClassifier
	{
		int classify(char c);
	}
	
	public static class DefaultCharClassifier implements ICharClassifier
	{
		public static final int CLASS_ALPHABETICAL = 1;
		public static final int CLASS_NUMERAL = 2;
		public static final int CLASS_SPECIAL = 3;
		public static final int CLASS_PADDING = 4;
		
		private static final String CHARSET_ALPHABETICAL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		private static final String CHARSET_NUMERAL = "0123456789";
		private static final String CHARSET_SPECIAL = ",;.:-_+*~#'!\"²§³$%&/{([)]=}?\\`´^°<>|@€µ";
		private static final String CHARSET_PADDING = " \n\t";
		
		@Override
		public int classify(char c)
		{
			if(CHARSET_ALPHABETICAL.indexOf(c) > -1) return CLASS_ALPHABETICAL;
			if(CHARSET_NUMERAL.indexOf(c) > -1) return CLASS_NUMERAL;
			if(CHARSET_SPECIAL.indexOf(c) > -1) return CLASS_SPECIAL;
			if(CHARSET_PADDING.indexOf(c) > -1) return CLASS_PADDING;
			
			return 0;
		}

	}
}
