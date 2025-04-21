package org.barghos.util.nullable.chars;

import org.barghos.util.nullable.NullableR;

public interface NullableRC extends NullableR<Character>
{
	
	char valueC();
	
	char valueOrDefaultC(char def);
	
	char valueOrDefaultC();
	
	@Override
	Character value();
	
	@Override
	Character valueOrDefault(Character def);
	
	@Override
	Character valueOrDefault();
	
	boolean equals(NullableRC obj);
	
	boolean equalsValueC(char obj);
	
	boolean equalsValue(Character obj);
	
}
