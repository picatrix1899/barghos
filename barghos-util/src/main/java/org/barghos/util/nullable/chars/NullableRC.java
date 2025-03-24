package org.barghos.util.nullable.chars;

import org.barghos.util.nullable.NullableR;

public interface NullableRC extends NullableR<Character>
{
	
	char valueC();
	
	Character value();
	
	boolean equals(NullableRC obj);
	
	boolean equalsValueC(char obj);
	
	boolean equalsValue(Character obj);
	
}
